package com.teksystemsgs.herokuapp.gauntlet.brokenimages.content;

import com.softwareonpurpose.validator4test.Validator;
import com.teksystemsgs.herokuapp.gauntlet.region.image.SiteImageValidator;

public class BrokenImagesContentValidator extends Validator {
    private static final String DESCRIPTION = "'Content' region";
    private final BrokenImagesContentExpected expected;
    private final BrokenImagesContent actual;

    private BrokenImagesContentValidator(BrokenImagesContentExpected expected, BrokenImagesContent actual, Validator parent) {
        super(DESCRIPTION, expected, actual, parent);
        this.expected = expected;
        this.actual = actual;
        addChildValidator(SiteImageValidator.getInstance(expected.inImageOne(), actual.inImageOne(), this));
        addChildValidator(SiteImageValidator.getInstance(expected.inImageTwo(), actual.inImageTwo(), this));
        addChildValidator(SiteImageValidator.getInstance(expected.inImageThree(), actual.inImageThree(), this));
    }

    public static BrokenImagesContentValidator getInstance(BrokenImagesContentExpected expected, BrokenImagesContent actual, Validator parent) {
        return new BrokenImagesContentValidator(expected, actual, parent);
    }

    @Override
    protected void executeVerifications() {
        verify("Heading", expected.getHeading(), actual.getHeading());
    }
}
