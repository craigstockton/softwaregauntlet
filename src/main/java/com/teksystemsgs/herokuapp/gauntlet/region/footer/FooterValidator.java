package com.teksystemsgs.herokuapp.gauntlet.region.footer;

import com.softwareonpurpose.validator4test.Validator;

public class FooterValidator extends Validator {
    private static final String DESCRIPTION = "'Footer' region";
    private final FooterExpected expected;
    private final Footer actual;

    private FooterValidator(FooterExpected expected, Footer actual, Validator parent) {
        super(DESCRIPTION, expected, actual, parent);
        this.expected = expected;
        this.actual = actual;
    }

    public static FooterValidator getInstance(FooterExpected expected, Footer actual, Validator parent) {
        return new FooterValidator(expected, actual, parent);
    }

    @Override
    protected void executeVerifications() {
        verify("Message", expected.getMessage(), actual.getMessage());
        verify("'Link' text", expected.getLinkText(), actual.getLinkText());
        verify("'Link' href", expected.getLinkHref(), actual.getLinkHref());
    }
}
