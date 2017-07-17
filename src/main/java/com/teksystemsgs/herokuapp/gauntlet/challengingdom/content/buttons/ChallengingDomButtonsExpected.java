package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.buttons;

public class ChallengingDomButtonsExpected implements ChallengingDomButtonsValidatable{
    @Override
    public Boolean isButtonOneExistent() {
        return true;
    }

    @Override
    public Boolean isButtonTwoExistent() {
        return true;
    }

    @Override
    public Boolean isButtonThreeExistent() {
        return true;
    }

    public static ChallengingDomButtonsExpected getInstance() {
        return new ChallengingDomButtonsExpected();
    }
}
