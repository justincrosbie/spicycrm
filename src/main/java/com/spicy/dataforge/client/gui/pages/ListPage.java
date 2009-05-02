package com.spicy.dataforge.client.gui.pages;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.spicy.dataforge.client.Refreshable;
import com.spicy.dataforge.client.domain.Source;
import com.spicy.dataforge.client.rpc.SourcesService;
import com.spicy.dataforge.client.rpc.SourcesServiceAsync;

public class ListPage extends Composite implements Refreshable {

	private SourcesServiceAsync sourcesSvc = GWT.create(SourcesService.class);
	private VerticalPanel mainPanel = new VerticalPanel();
	private FlexTable sourcesFlexTable = new FlexTable();
	private Label errorMsgLabel = new Label();
	private int listIndex = 0;
	
	public ListPage() {

		mainPanel.setHeight("1000");
		
		sourcesFlexTable.setText(0, 0, "Source");
		sourcesFlexTable.setText(0, 1, "Size");
		sourcesFlexTable.setText(0, 2, "Change");
		sourcesFlexTable.setText(0, 3, "Remove");

		
	    mainPanel.add(sourcesFlexTable);

	    initWidget(mainPanel);
	    
	    refresh();
	}

	public void refresh() {
	    if (sourcesSvc == null) {
	    	sourcesSvc = GWT.create(SourcesService.class);
		    }

		    // Set up the callback object.
		    AsyncCallback<List<Source>> callback = new AsyncCallback<List<Source>>() {
		      public void onFailure(Throwable caught) {
		          // If the stock code is in the list of delisted codes, display an error message.
		          String details = caught.getMessage();

		          errorMsgLabel.setText("Error: " + details);
		          errorMsgLabel.setVisible(true);
		      }

		      public void onSuccess(List<Source> sources) {
		  		if ( sources != null ) {
					for ( listIndex=0; listIndex<sources.size(); listIndex++ ) {
						Source source = (Source)sources.get(listIndex);
						// row 0 in flexTable is the header 
					    sourcesFlexTable.setText(listIndex+1, 0, source.getName());

					    Button removeSourceButton = new Button("x");
					    
					    removeSourceButton.addClickHandler(new ClickHandler() {
					    	int remIndex = listIndex;
					    	public void onClick(ClickEvent event) {
							    AsyncCallback<List<Source>> callback2 = new AsyncCallback<List<Source>>() {
								      public void onFailure(Throwable caught) {
								          // If the stock code is in the list of delisted codes, display an error message.
								          String details = caught.getMessage();

								          errorMsgLabel.setText("Error: " + details);
								          errorMsgLabel.setVisible(true);
								      }
								      public void onSuccess(List<Source> sources2) {
								      }
							    };
					    	sourcesSvc.deleteSource(new Integer(remIndex), callback2);
					        sourcesFlexTable.removeRow(remIndex + 1);
					      }
					    });
					    sourcesFlexTable.setWidget(listIndex+1, 4, removeSourceButton);
					}
				}
		      }
		    };

		    // Make the call to the stock price service.
		    sourcesSvc.getSources(callback);
	}
}
