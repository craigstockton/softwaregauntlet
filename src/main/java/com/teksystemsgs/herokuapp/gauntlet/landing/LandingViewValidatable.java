package com.teksystemsgs.herokuapp.gauntlet.landing;

import com.teksystemsgs.herokuapp.gauntlet.landing.content.LandingContentValidatable;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterValidatable;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderValidatable;

public interface LandingViewValidatable {
    ForkHeaderValidatable inHeader();

    LandingContentValidatable inContent();

    FooterValidatable inFooter();
}
