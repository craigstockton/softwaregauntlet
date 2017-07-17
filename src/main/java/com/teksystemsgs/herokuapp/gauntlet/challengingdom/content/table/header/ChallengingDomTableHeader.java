package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.header;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;

public class ChallengingDomTableHeader extends UiRegion implements ChallengingDomTableHeaderValidatable {
    private static final String DESCRIPTION = "'Challenging DOM Table' header";
    private static final String locatorType = UiElement.LocatorType.TAG;
    private static final String LOCATOR_VALUE = "thead";

    private ChallengingDomTableHeader(UiElement parent) {
        super(UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE, parent));
    }

    public static ChallengingDomTableHeader getInstance(UiElement parent) {
        return new ChallengingDomTableHeader(parent);
    }

    @Override
    public String getLorem() {
        return getRowElement("Lorem", 1).getText();
    }

    @Override
    public String getIpsum() {
        return getRowElement("Ipsum", 2).getText();
    }

    @Override
    public String getDolor() {
        return getRowElement("Dolor", 3).getText();
    }

    @Override
    public String getSit() {
        return getRowElement("Sit", 4).getText();
    }

    @Override
    public String getAmet() {
        return getRowElement("Amet", 5).getText();
    }

    @Override
    public String getDiceret() {
        return getRowElement("Diceret", 6).getText();
    }

    @Override
    public String getAction() {
        return getRowElement("Action", 7).getText();
    }

    private UiElement getRowElement(String description, int ordinal) {
        return UiElement.getInstance(description, UiElement.LocatorType.TAG, "th", ordinal, this.getElement());
    }
}
