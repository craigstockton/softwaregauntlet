package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content;

import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.buttons.ChallengingDomButtonsExpected;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.ChallengingDomTableExpected;

public class ChallengingDomContentExpected implements ChallengingDomContentValidatable{
    public static ChallengingDomContentExpected getInstance() {
        return new ChallengingDomContentExpected();
    }

    @Override
    public ChallengingDomButtonsExpected inButtons() {
        return ChallengingDomButtonsExpected.getInstance();
    }

    @Override
    public ChallengingDomTableExpected inTable() {
        return ChallengingDomTableExpected.getInstance();
    }
}
