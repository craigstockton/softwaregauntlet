package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.buttons;

import com.softwareonpurpose.validator4test.Validator;

public class ChallengingDomButtonsValidator extends Validator{
    private static final String DESCRIPTION = "'Challenging DOM' buttons";
    private final ChallengingDomButtonsExpected expected;
    private final ChallengingDomButtons actual;

    private ChallengingDomButtonsValidator(ChallengingDomButtonsExpected expected, ChallengingDomButtons actual, Validator parent) {
        super(DESCRIPTION, expected, actual, parent);
        this.expected = expected;
        this.actual = actual;
    }

    @Override
    protected void executeVerifications() {
        verify("'Button one' exists", expected.isButtonOneExistent(), actual.isButtonOneExistent());
        verify("'Button two' exists", expected.isButtonTwoExistent(), actual.isButtonTwoExistent());
        verify("'Button three' exists", expected.isButtonThreeExistent(), actual.isButtonThreeExistent());
    }

    public static ChallengingDomButtonsValidator getInstance(ChallengingDomButtonsExpected expected, ChallengingDomButtons actual, Validator parent) {
        return new ChallengingDomButtonsValidator(expected, actual, parent);
    }
}
