package com.spicy.dataforge.client.gui.tabs;

import com.google.gwt.event.logical.shared.BeforeSelectionEvent;
import com.google.gwt.event.logical.shared.BeforeSelectionHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.Widget;
import com.spicy.dataforge.client.Refreshable;
import com.spicy.dataforge.client.gui.pages.CreatePageDetails;
import com.spicy.dataforge.client.gui.pages.ListPage;

public class ImportsTab extends Composite implements SelectionHandler<Integer>, BeforeSelectionHandler<Integer> {

	TabPanel tPanel = new TabPanel();

	public ImportsTab() {
		tPanel.add(new ListPage(), "My Sources");
		tPanel.add(new CreateSourceTab(), "New Source");
		tPanel.add(new HTML("View"), "Transform");

		tPanel.addSelectionHandler(this);
		tPanel.addBeforeSelectionHandler(this);
		
        initWidget(tPanel);
	}

    public void onSelection(SelectionEvent<Integer> event) {
    	Integer selected = event.getSelectedItem();
    	Widget w = tPanel.getWidget(selected);
    	if ( w instanceof Refreshable ) {
	        // Let the user know what they just did.
	  		Refreshable rlp = (Refreshable)w;
	  		rlp.refresh();
    	}
      }

    public void onBeforeSelection(BeforeSelectionEvent<Integer> event) {
    	int i=0;
    	i++;
    }
}
