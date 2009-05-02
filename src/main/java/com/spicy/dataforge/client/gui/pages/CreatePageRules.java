package com.spicy.dataforge.client.gui.pages;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.spicy.dataforge.client.domain.Source;
import com.spicy.dataforge.client.rpc.SourcesService;
import com.spicy.dataforge.client.rpc.SourcesServiceAsync;
import com.spicy.dataforge.client.utils.WidgetUtils;

public class CreatePageRules extends Composite {

	private SourcesServiceAsync sourcesSvc = GWT.create(SourcesService.class);
	private Label errorMsgLabel = new Label();
	private TextBox nameInput;
	private TextBox typeInput;
	
	public CreatePageRules() {
		VerticalPanel mainMainPanel = new VerticalPanel();
		mainMainPanel.add(errorMsgLabel);
		
		HorizontalPanel mainPanel = new HorizontalPanel();
		VerticalPanel leftPanel = new VerticalPanel();
		VerticalPanel rightPanel = new VerticalPanel();

		nameInput = WidgetUtils.addLabelAndTextBox(leftPanel, "Name:");
		typeInput = WidgetUtils.addLabelAndTextBox(rightPanel, "Type:");
		
	    Button saveButton = new Button("Save");
	    rightPanel.add(saveButton);
	    
	    saveButton.addClickHandler(new ClickHandler() {
	      public void onClick(ClickEvent event) {
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

				      public void onSuccess(List<Source> result) {
				      }
				    };

				    Source source = new Source();
				    source.setName(nameInput.getText());

				    // Make the call to the stock price service.
				    sourcesSvc.addSource(source, callback);
	      }
	    });

		mainPanel.add(leftPanel);
	    mainPanel.add(rightPanel);
	    mainMainPanel.add(mainPanel);

	    initWidget(mainMainPanel);
	}
}
