package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.row;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;

public class ChallengingDomTableRow extends UiRegion implements ChallengingDomTableRowValidatable {
    private ChallengingDomTableRow(UiElement rowElement) {
        super(rowElement);
    }

    public static ChallengingDomTableRow getInstance(UiElement parent) {
        return new ChallengingDomTableRow(parent);
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
    public String getEditLinkLabel() {
        return getActionLinkElement("'Edit link' label", 1).getText();
    }

    private UiElement getActionLinkElement(String description, int ordinal) {
        return UiElement.getInstance(description, UiElement.LocatorType.TAG, "a", ordinal, getRowElement("Action", 7));
    }

    @Override
    public String getDeleteLinkLabel() {
        return getActionLinkElement("'Delete link' label", 2).getText();
    }

    private UiElement getRowElement(String description, int ordinal) {
        return UiElement.getInstance(description, UiElement.LocatorType.TAG, "td", ordinal, this.getElement());
    }
}
