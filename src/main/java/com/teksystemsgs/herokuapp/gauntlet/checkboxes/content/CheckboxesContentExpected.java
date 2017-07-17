package com.teksystemsgs.herokuapp.gauntlet.checkboxes.content;

public class CheckboxesContentExpected implements CheckboxesContentValidatable {
    private static final String checkboxLabel = "checkbox %d";
    public static CheckboxesContentExpected getInstance() {
        return new CheckboxesContentExpected();
    }

    @Override
    public String getHeading() {
        return "Checkboxes";
    }

    @Override
    public String getCheckboxOneLabel() {
        return String.format(checkboxLabel, 1);
    }

    @Override
    public Boolean isCheckboxOneSelected() {
        return false;
    }

    @Override
    public String getCheckboxTwoLabel() {
        return String.format(checkboxLabel, 2);
    }

    @Override
    public Boolean isCheckboxTwoSelected() {
        return true;
    }
}
