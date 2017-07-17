package com.teksystemsgs.herokuapp.gauntlet.checkboxes.content;

import com.softwareonpurpose.validator4test.Validator;

public class CheckboxesContentValidator extends Validator{
    private static final String DESCRIPTION = "Checkboxes Content";
    private final CheckboxesContentExpected expected;
    private final CheckboxesContent actual;

    private CheckboxesContentValidator(CheckboxesContentExpected expected, CheckboxesContent actual, Validator parent) {
        super(DESCRIPTION, expected, actual, parent);
        this.expected = expected;
        this.actual = actual;
    }

    @Override
    protected void executeVerifications() {
        verify("Heading", expected.getHeading(), actual.getHeading());
        verify("'Checkbox 1' label", expected.getCheckboxOneLabel(), actual.getCheckboxOneLabel());
        verify("'Checkbox 1' is selected", expected.isCheckboxOneSelected(), actual.isCheckboxOneSelected());
        verify("'Checkbox 2' label", expected.getCheckboxTwoLabel(), actual.getCheckboxTwoLabel());
        verify("'Checkbox 2' is selected", expected.isCheckboxTwoSelected(), actual.isCheckboxTwoSelected());
    }

    public static CheckboxesContentValidator getInstance(CheckboxesContentExpected expected, CheckboxesContent actual, Validator parent ) {
        return new CheckboxesContentValidator(expected, actual, parent);
    }
}
