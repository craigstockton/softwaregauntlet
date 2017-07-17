package com.teksystemsgs.herokuapp.gauntlet.challengingdom;

import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.ChallengingDomContentValidatable;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterValidatable;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderValidatable;

public interface ChallengingDomValidatable {
    String getHeading();

    String getContentDescription();

    ForkHeaderValidatable inHeader();

    ChallengingDomContentValidatable inContent();

    FooterValidatable inFooter();
}
