package com.teksystemsgs.herokuapp.gauntlet.challengingdom;

import com.softwareonpurpose.uinavigator.UiRegion;
import com.softwareonpurpose.validator4test.Validator;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.ChallengingDomContentValidator;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterValidator;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderValidator;

public class ChallengingDomValidator extends Validator {
    private static final String DESCRIPTION = "Challenging DOM";
    private final ChallengingDomExpected expected;
    private final ChallengingDom actual;

    private ChallengingDomValidator(ChallengingDomExpected expected, ChallengingDom actual) {
        super(DESCRIPTION, expected, actual);
        this.expected = expected;
        this.actual = actual;
        UiRegion.suppressConstructionLogging(true);
        addChildValidator(ForkHeaderValidator.getInstance(expected.inHeader(), actual.inHeader(), this));
        addChildValidator(ChallengingDomContentValidator.getInstance(expected.inContent(), actual.inContent(), this));
        addChildValidator(FooterValidator.getInstance(expected.inFooter(), actual.inFooter(), this));
        UiRegion.suppressConstructionLogging(false);
    }

    public static ChallengingDomValidator getInstance(ChallengingDomExpected expected, ChallengingDom actual) {
        return new ChallengingDomValidator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
        verify("Heading", expected.getHeading(), actual.getHeading());
        verify("Content Description", expected.getContentDescription(), actual.getContentDescription());
    }
}
