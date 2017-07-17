package com.teksystemsgs.herokuapp.gauntlet.region.image;

import com.softwareonpurpose.validator4test.Validator;

public class SiteImageValidator extends Validator {
    private static final String DESCRIPTION = "'Site Image' region";
    private final SiteImageExpected expected;
    private final SiteImage actual;

    private SiteImageValidator(SiteImageExpected expected, SiteImage actual, Validator parent) {
        super(DESCRIPTION, expected, actual, parent);
        this.expected = expected;
        this.actual = actual;
    }

    public static SiteImageValidator getInstance(SiteImageExpected expected, SiteImage actual, Validator parent) {
        return new SiteImageValidator(expected, actual, parent);
    }

    @Override
    protected void executeVerifications() {
        verify("Source", expected.getSource(), actual.getSource());
        verify("Exists", expected.exists(), actual.exists());
    }
}
