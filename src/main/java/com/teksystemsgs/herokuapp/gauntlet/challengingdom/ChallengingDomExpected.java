package com.teksystemsgs.herokuapp.gauntlet.challengingdom;

import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.ChallengingDomContentExpected;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterExpected;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderExpected;

public class ChallengingDomExpected implements ChallengingDomValidatable {
    public static ChallengingDomExpected getInstance() {
        return new ChallengingDomExpected();
    }

    @Override
    public String getHeading() {
        return "Challenging DOM";
    }

    @Override
    public String getContentDescription() {
        return "The hardest part in automated web testing is finding the best locators (e.g., ones that well named, unique, and unlikely to change). It's more often than not that the application you're testing was not built with this concept in mind. This example demonstrates that with unique IDs, a table with no helpful locators, and a canvas element.";
    }

    @Override
    public ForkHeaderExpected inHeader() {
        return ForkHeaderExpected.getInstance();
    }

    @Override
    public ChallengingDomContentExpected inContent() {
        return ChallengingDomContentExpected.getInstance();
    }

    @Override
    public FooterExpected inFooter() {
        return FooterExpected.getInstance();
    }
}
