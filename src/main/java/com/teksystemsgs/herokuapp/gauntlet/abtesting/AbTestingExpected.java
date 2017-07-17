package com.teksystemsgs.herokuapp.gauntlet.abtesting;

import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterExpected;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderExpected;

public class AbTestingExpected implements AbTestingValidatable {
    public static AbTestingExpected getInstance() {
        return new AbTestingExpected();
    }

    @Override
    public String getHeading() {
        return "A/B Test Control";
    }

    @Override
    public String getDescription() {
        return "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
    }

    @Override
    public ForkHeaderExpected inHeader() {
        return ForkHeaderExpected.getInstance();
    }

    @Override
    public FooterExpected inFooter() {
        return FooterExpected.getInstance();
    }
}
