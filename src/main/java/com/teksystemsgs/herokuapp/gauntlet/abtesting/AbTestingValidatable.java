package com.teksystemsgs.herokuapp.gauntlet.abtesting;

import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterValidatable;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderValidatable;

public interface AbTestingValidatable {
    ForkHeaderValidatable inHeader();

    FooterValidatable inFooter();

    com.teksystemsgs.herokuapp.gauntlet.abtesting.content.AbTestingContentValidatable inContent();
}
