package com.teksystemsgs.herokuapp.gauntlet.checkboxes;

import com.softwareonpurpose.uinavigator.UiRegion;
import com.softwareonpurpose.validator4test.Validator;
import com.teksystemsgs.herokuapp.gauntlet.checkboxes.content.CheckboxesContentValidator;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterValidator;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderValidator;

public class CheckboxesValidator extends Validator {
    private static final String DESCRIPTION = "Checkboxes";
    private final CheckboxesExpected expected;
    private final Checkboxes actual;

    private CheckboxesValidator(CheckboxesExpected expected, Checkboxes actual) {
        super(DESCRIPTION, expected, actual);
        this.expected = expected;
        this.actual = actual;
        UiRegion.suppressConstructionLogging(true);
        addChildValidator(ForkHeaderValidator.getInstance(expected.inHeader(), actual.inHeader(), this));
        addChildValidator(CheckboxesContentValidator.getInstance(expected.inContent(), actual.inContent(), this));
        addChildValidator(FooterValidator.getInstance(expected.inFooter(), actual.inFooter(), this));
        UiRegion.suppressConstructionLogging(false);
    }

    @Override
    protected void executeVerifications() {
    }

    public static CheckboxesValidator getInstance(CheckboxesExpected expected, Checkboxes actual) {
        return new CheckboxesValidator(expected, actual);
    }
}
