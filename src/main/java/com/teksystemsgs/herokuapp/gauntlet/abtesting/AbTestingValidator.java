package com.teksystemsgs.herokuapp.gauntlet.abtesting;

import com.softwareonpurpose.uinavigator.UiRegion;
import com.softwareonpurpose.validator4test.Validator;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterValidator;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderValidator;

public class AbTestingValidator extends Validator {
    private static final String DESCRIPTION = "'A/B Testing' view";
    private final AbTestingExpected expected;
    private final AbTesting actual;

    private AbTestingValidator(AbTestingExpected expected, AbTesting actual) {
        super(DESCRIPTION, expected, actual);
        this.expected = expected;
        this.actual = actual;
        UiRegion.suppressConstructionLogging(true);
        addChildValidator(ForkHeaderValidator.getInstance(expected.inHeader(), actual.inHeader(), this));
        addChildValidator(FooterValidator.getInstance(expected.inFooter(), actual.inFooter(), this));
        UiRegion.suppressConstructionLogging(false);
    }

    public static AbTestingValidator getInstance(AbTestingExpected expected, AbTesting actual) {
        return new AbTestingValidator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
        verify("Header", expected.getHeading(), actual.getHeading());
        verify("Description", expected.getDescription(), actual.getDescription());
    }
}
