package com.spicy.dataforge.client.widgets;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormHandler;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormSubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormSubmitEvent;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class FileUploader  extends Composite {

	public FileUploader() {
		final FormPanel form = new FormPanel();
		form.setEncoding(FormPanel.ENCODING_MULTIPART);
		form.setMethod(FormPanel.METHOD_POST);
		form.addStyleName("table-center");
		form.addStyleName("demo-panel-padded");
		form.setWidth("275px");
	
		VerticalPanel holder = new VerticalPanel();
	
		FileUpload upload = new FileUpload();
		upload.setName("upload");
		holder.add(upload);
	
		holder.add(new HTML("<hr />"));
	
		holder.setHorizontalAlignment(HasAlignment.ALIGN_RIGHT);
		holder.add(new Button("Submit", new ClickListener()
		{
			public void onClick(Widget sender)
			{
				int x = 0;
				x++;
				form.submit();
			}
		}));
	
		form.add(holder);
	
		// form.setAction("url");
	
		form.addFormHandler(new FormHandler()
		{
			public void onSubmit(FormSubmitEvent event)
			{
				int x = 0;
				x++;
				// if (something_is_wrong)
				// {
				// Take some action
				// event.setCancelled(true);
				// }
			}
	
			public void onSubmitComplete(FormSubmitCompleteEvent event)
			{
				Window.alert(event.getResults());
			}
		});
		
        initWidget(form);
	}
}
