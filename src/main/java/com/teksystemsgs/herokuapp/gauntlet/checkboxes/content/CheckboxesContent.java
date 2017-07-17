package com.teksystemsgs.herokuapp.gauntlet.checkboxes.content;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;

public class CheckboxesContent extends UiRegion implements CheckboxesContentValidatable {
    private static final String DESCRIPTION = "Checkboxes Content";
    private static final String locatorType = UiElement.LocatorType.ID;
    private static final String LOCATOR_VALUE = "content";

    private CheckboxesContent(UiElement parent) {
        super(UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE, parent));
    }

    public static CheckboxesContent getInstance(UiElement parent) {
        return new CheckboxesContent(parent);
    }

    @Override
    public String getHeading() {
        return UiElement.getInstance("Heading", UiElement.LocatorType.TAG, "h3", this.getElement()).getText();
    }

    @Override
    public String getCheckboxOneLabel() {
        return getCheckboxLabel(1);
    }

    @Override
    public Boolean isCheckboxOneSelected() {
        return isCheckboxSelected(1);
    }

    @Override
    public String getCheckboxTwoLabel() {
        return getCheckboxLabel(2);
    }

    @Override
    public Boolean isCheckboxTwoSelected() {
        return isCheckboxSelected(2);
    }

    private Boolean isCheckboxSelected(int ordinal) {
        String checked = getCheckboxElement(ordinal).getAttribute("checked");
        return checked != null && checked.equals("true");
    }

    private UiElement getCheckboxElement(int ordinal) {
        String description = String.format("Checkbox %d", ordinal);
        return UiElement.getInstance(description, UiElement.LocatorType.TAG, "input", ordinal, getCheckboxesElement());
    }

    private String getCheckboxLabel(int ordinal) {
        String labels = getCheckboxesElement().getText();
        String[] strings = labels.split("\n");
        int index = ordinal - 1;
        return strings[index];
    }

    private UiElement getCheckboxesElement() {
        return UiElement.getInstance("'Checkboxes' labels", UiElement.LocatorType.ID, "checkboxes", this.getElement());
    }
}
