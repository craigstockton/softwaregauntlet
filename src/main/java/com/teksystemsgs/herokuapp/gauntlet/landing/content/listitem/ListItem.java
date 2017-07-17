package com.teksystemsgs.herokuapp.gauntlet.landing.content.listitem;

import com.softwareonpurpose.uinavigator.UiElement;

public class ListItem {
    private final UiElement element;
    private final String description;

    private ListItem(String description, int ordinal, UiElement parent) {
        this.description = description;
        this.element = UiElement.getInstance(description, UiElement.LocatorType.TAG, "li", ordinal, parent);
    }

    public static ListItem getInstance(String description, int ordinal, UiElement parent) {
        return new ListItem(description, ordinal, parent);
    }

    public String getText() {
        return element.getText();
    }

    public String getHref() {
        return UiElement.getInstance(String.format("'%s' link", description), UiElement.LocatorType.TAG, "a", element).getHref();
    }
}
