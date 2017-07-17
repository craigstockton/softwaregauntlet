package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content;

import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.buttons.ChallengingDomButtonsValidatable;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.ChallengingDomTableValidatable;

public interface ChallengingDomContentValidatable {
    ChallengingDomButtonsValidatable inButtons();

    ChallengingDomTableValidatable inTable();
}
