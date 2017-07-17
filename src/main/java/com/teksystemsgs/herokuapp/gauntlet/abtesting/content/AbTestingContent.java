package com.teksystemsgs.herokuapp.gauntlet.abtesting.content;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;

public class AbTestingContent extends UiRegion implements AbTestingContentValidatable {
    private static final String DESCRIPTION = "'Ab Testing' content";
    private static final String locatorType = UiElement.LocatorType.ID;
    private static final String LOCATOR_VALUE = "content";
    private static final String HEADING_CLASS = "example";

    private AbTestingContent(UiElement parent) {
        super(UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE, parent));
    }

    public static AbTestingContent getInstance(UiElement parent) {
        return new AbTestingContent(parent);
    }

    @Override
    public String getHeading() {
        return UiElement.getInstance("Heading", UiElement.LocatorType.TAG, "h3", getContentElement()).getText();
    }

    private UiElement getContentElement() {
        return UiElement.getInstance("Content", UiElement.LocatorType.CLASS, HEADING_CLASS, this.getElement());
    }

    @Override
    public String getParagraph() {
        return UiElement.getInstance("Paragraph", UiElement.LocatorType.TAG, "p", getContentElement()).getText();
    }
}
