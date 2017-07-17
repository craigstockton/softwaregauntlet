package com.teksystemsgs.herokuapp.gauntlet.landing;

import com.teksystemsgs.herokuapp.gauntlet.landing.content.LandingContentExpected;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterExpected;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderExpected;

public class LandingViewExpected implements LandingViewValidatable {
    static LandingViewExpected getInstance() {
        return new LandingViewExpected();
    }

    @Override
    public ForkHeaderExpected inHeader() {
        return ForkHeaderExpected.getInstance();
    }

    @Override
    public LandingContentExpected inContent() {
        return LandingContentExpected.getInstance();
    }

    @Override
    public FooterExpected inFooter() {
        return FooterExpected.getInstance();
    }
}
