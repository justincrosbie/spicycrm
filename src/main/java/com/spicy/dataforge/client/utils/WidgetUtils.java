package com.spicy.dataforge.client.utils;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.TextBox;

public class WidgetUtils {
	
	public static TextBox addLabelAndTextBox(Panel p, String labelText) {
		Label label = new Label(labelText);
		TextBox textBox = new TextBox();
		p.add(label);
		p.add(textBox);
		
		return textBox;
	}

}
