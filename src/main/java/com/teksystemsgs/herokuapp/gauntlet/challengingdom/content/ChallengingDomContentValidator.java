package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content;

import com.softwareonpurpose.validator4test.Validator;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.buttons.ChallengingDomButtonsValidator;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.ChallengingDomTableValidator;

public class ChallengingDomContentValidator extends Validator {
    private static final String DESCRIPTION = "Content";

    private ChallengingDomContentValidator(ChallengingDomContentExpected expected, ChallengingDomContent actual, Validator parent) {
        super(DESCRIPTION, expected, actual, parent);
        addChildValidator(ChallengingDomButtonsValidator.getInstance(expected.inButtons(), actual.inButtons(), this));
        addChildValidator(ChallengingDomTableValidator.getInstance(expected.inTable(), actual.inTable(), this));
    }

    public static ChallengingDomContentValidator getInstance(ChallengingDomContentExpected expected, ChallengingDomContent actual, Validator parent) {
        return new ChallengingDomContentValidator(expected, actual, parent);
    }

    @Override
    protected void executeVerifications() {

    }
}
