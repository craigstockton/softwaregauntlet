package com.teksystemsgs.herokuapp.gauntlet.landing;

import com.softwareonpurpose.uinavigator.UiRegion;
import com.softwareonpurpose.validator4test.Validator;
import com.teksystemsgs.herokuapp.gauntlet.landing.content.LandingContentValidator;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterValidator;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderValidator;

public class LandingViewValidator extends Validator {
    private static final String DESCRIPTION = "'Landing' view";
    private final LandingViewExpected expected;
    private final LandingView actual;

    private LandingViewValidator(LandingViewExpected expected, LandingView actual) {
        super(DESCRIPTION, expected, actual);
        this.expected = expected;
        this.actual = actual;
        UiRegion.suppressConstructionLogging(true);
        addChildValidator(ForkHeaderValidator.getInstance(expected.inHeader(), actual.inHeader(), this));
        addChildValidator(LandingContentValidator.getInstance(expected.inContent(), actual.inContent(), this));
        addChildValidator(FooterValidator.getInstance(expected.inFooter(), actual.inFooter(), this));
        UiRegion.suppressConstructionLogging(false);
    }

    static LandingViewValidator getInstance(LandingViewExpected expected, LandingView actual) {
        return new LandingViewValidator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
    }
}
