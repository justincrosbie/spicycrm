package com.spicy.dataforge.client.utils;

import java.util.HashMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * GWTUtils is a set of helper classes to make it easier to work with GWT
 *
 * @author Nazmul Idris
 * @version 1.0
 * @since Jan 9, 2008, 1:04:17 PM
 */
public final class GWTUtils {

//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// native js helpers
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
public static native String getParamString() /*-{
        return $wnd.location.search;
}-*/;

public static HashMap<String, String> parseParamString(String string) {
  String[] ray = string.substring(1, string.length()).split("&");
  HashMap<String, String> map = new HashMap<String, String>();

  for (int i = 0; i < ray.length; i++) {
    GWT.log("ray[" + i + "]=" + ray[i], null);
    String[] substrRay = ray[i].split("=");
    map.put(substrRay[0], substrRay[1]);
  }

  return map;
}

//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// DOM and RootPanel helpers
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

/** This method removes the element identified by s from the browser's DOM, if the element exists */
public static void removeElementFromDOM(String elementName) {
  notempty(elementName);
  com.google.gwt.user.client.Element loading = DOM.getElementById(elementName);
  try {
    DOM.removeChild(RootPanel.getBodyElement(), loading);
  }
  catch (Exception e) {
    // do nothing
  }
}

/**
 * This method tries to add the widget to the element in the DOM. If the element doesn't exist, then
 * it just adds it to the bottom of the DOM.
 */
public static void addWidgetToDOM(String elementName, Widget widget) {
  notempty(elementName, "elementName can not be empty or null");
  notnull(widget, "Widget can not be null");

  try {
    RootPanel.get(elementName).add(widget);
  }
  catch (Exception e) {
    RootPanel.get().add(widget);
  }
}

/**
 * This method tries to add the widget to the element in the DOM. If the element doesn't exist, then
 * it just adds it to the bottom of the DOM.
 */
public static void replaceWidgetAtDOM(String elementName, Widget widget) {
  notempty(elementName, "elementName can not be empty or null");
  notnull(widget, "Widget can not be null");

  try {
    RootPanel target = RootPanel.get(elementName);
    int count = target.getWidgetCount();
    for (int i = 0; i < count; i++) target.remove(i);
    target.add(widget);
  }
  catch (Exception e) {
    RootPanel.get().add(widget);
  }
}

public static void addWidgetToDOM(Widget widget) {
  notnull(widget, "Widget can not be empty");

  RootPanel.get().add(widget);
}

//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// html builders
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
public static String getLinkHTMLText(String name, String link) throws IllegalArgumentException {
  notempty(name);
  notempty(link);

  return
      "<a href=\"" + link + "\">" +
      name +
      "</a>";
}

public static String getLinkHTMLText(String name, String link, String target) throws IllegalArgumentException {
  notempty(name);
  notempty(link);

  return
      "<a href=" + surroundWithQuotes(link) +
      " target=" + surroundWithQuotes(target) +
      ">" +
      name +
      "</a>";
}

public static String surroundWithQuotes(String msg) {
  return "\"" + msg + "\"";
}

//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// assertions, validations
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

/** checks to see if the given string is empty or null */
private static final boolean isnotempty(String s) {
  if (s == null) return false;
  if (s.trim().equals("")) return false;
  return true;
}

/** asserts that the given string is not null or empty */
private static final void notempty(String s) throws IllegalArgumentException {
  if (s == null) throw new IllegalArgumentException("String is null");
  if (s.trim().equals("")) throw new IllegalArgumentException("String is empty");
}

/** asserts that the given string is not null or empty */
private static final void notempty(String s, String msg) throws IllegalArgumentException {
  if (isnotempty(s)) {
    return;
  }
  else {
    // check validity of the error msg
    if (isnotempty(msg)) {
      throw new IllegalArgumentException(msg);
    }
    else {
      throw new IllegalArgumentException("String is empty or null");
    }
  }
}

/** asserts that the given widget is not null */
private static void notnull(Object object) throws IllegalArgumentException {
  if (object == null) throw new IllegalArgumentException("Object can not be null");
}

/** asserts that the given widget is not null */
private static void notnull(Object object, String msg) throws IllegalArgumentException {
  if (object == null) {
    // check the validity of the error msg
    if (isnotempty(msg)) {
      throw new IllegalArgumentException(msg);
    }
    else {
      throw new IllegalArgumentException("String is empty or null");
    }
  }
}

//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
// application loading message/splash screen management
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

public static void addLoadingMessage(String image, String msg, String div) {
  String imageUrl = GWT.getModuleBaseURL() + image;
  GWTUtils.addWidgetToDOM(div,
                          new HTML("<center>"+msg+" <img align=\"middle\" src=\"" +
                                   imageUrl +
                                   "\"></center>"));
}


public static void replaceLoadingMessageWith(String div, Widget widget) {
  GWTUtils.replaceWidgetAtDOM(div, widget);

}
}//end class GWTUtils