package com.teksystemsgs.herokuapp.gauntlet.abtesting.content;

import com.softwareonpurpose.validator4test.Validator;

public class AbTestingContentValidator extends Validator{
    private static final String DESCRIPTION = "'Ab Testing' content";
    private final AbTestingContentExpected expected;
    private final AbTestingContent actual;

    private AbTestingContentValidator(AbTestingContentExpected expected, AbTestingContent actual, Validator parent) {
        super(DESCRIPTION, expected, actual, parent);
        this.expected = expected;
        this.actual = actual;
    }

    @Override
    protected void executeVerifications() {
        verify("Heading", expected.getHeading(), actual.getHeading());
        verify("Description", expected.getParagraph(), actual.getParagraph());
    }

    public static AbTestingContentValidator getInstance(AbTestingContentExpected expected, AbTestingContent actual, Validator parent) {
        return new AbTestingContentValidator(expected, actual, parent);
    }
}
