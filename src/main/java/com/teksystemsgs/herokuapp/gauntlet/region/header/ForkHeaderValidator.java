package com.teksystemsgs.herokuapp.gauntlet.region.header;

import com.softwareonpurpose.validator4test.Validator;

public class ForkHeaderValidator extends Validator {
    private static final String DESCRIPTION = "'Fork Header' region";
    private final ForkHeaderExpected expected;
    private final ForkHeader actual;

    private ForkHeaderValidator(ForkHeaderExpected expected, ForkHeader actual, Validator parent) {
        super(DESCRIPTION, expected, actual, parent);
        this.expected = expected;
        this.actual = actual;
    }

    public static ForkHeaderValidator getInstance(ForkHeaderExpected expected, ForkHeader actual, Validator parent) {
        return new ForkHeaderValidator(expected, actual, parent);
    }

    @Override
    protected void executeVerifications() {
        verify("'Fork me' image", expected.getForkMeSource(), actual.getForkMeSource());
        verify("'Fork me' href", expected.getForkMeHref(), actual.getForkMeHref());
    }
}
