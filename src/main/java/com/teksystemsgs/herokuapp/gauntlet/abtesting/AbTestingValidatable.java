package com.teksystemsgs.herokuapp.gauntlet.abtesting;

import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterValidatable;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderValidatable;

public interface AbTestingValidatable {
    String getHeading();

    String getDescription();

    ForkHeaderValidatable inHeader();

    FooterValidatable inFooter();
}
