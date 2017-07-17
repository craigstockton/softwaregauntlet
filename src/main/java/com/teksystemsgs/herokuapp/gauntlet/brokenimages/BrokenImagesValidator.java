package com.teksystemsgs.herokuapp.gauntlet.brokenimages;

import com.softwareonpurpose.uinavigator.UiRegion;
import com.softwareonpurpose.validator4test.Validator;
import com.teksystemsgs.herokuapp.gauntlet.brokenimages.content.BrokenImagesContentValidator;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterValidator;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderValidator;

public class BrokenImagesValidator extends Validator {
    private static final String DESCRIPTION = "'Broken Images' view";

    private BrokenImagesValidator(BrokenImagesExpected expected, BrokenImages actual) {
        super(DESCRIPTION, expected, actual);
        UiRegion.suppressConstructionLogging(true);
        addChildValidator(ForkHeaderValidator.getInstance(expected.inHeader(), actual.inHeader(), this));
        addChildValidator(BrokenImagesContentValidator.getInstance(expected.inContent(), actual.inContent(), this));
        addChildValidator(FooterValidator.getInstance(expected.inFooter(), actual.inFooter(), this));
        UiRegion.suppressConstructionLogging(false);
    }

    public static BrokenImagesValidator getInstance(BrokenImagesExpected expected, BrokenImages actual) {
        return new BrokenImagesValidator(expected, actual);
    }

    @Override
    protected void executeVerifications() {
    }
}
