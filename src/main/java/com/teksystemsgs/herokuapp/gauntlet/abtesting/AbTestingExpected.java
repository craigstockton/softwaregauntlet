package com.teksystemsgs.herokuapp.gauntlet.abtesting;

import com.teksystemsgs.herokuapp.gauntlet.abtesting.content.AbTestingContentExpected;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterExpected;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderExpected;

public class AbTestingExpected implements AbTestingValidatable {
    private AbTestingContentExpected content;

    public static AbTestingExpected getInstance() {
        return new AbTestingExpected();
    }

    @Override
    public ForkHeaderExpected inHeader() {
        return ForkHeaderExpected.getInstance();
    }

    @Override
    public FooterExpected inFooter() {
        return FooterExpected.getInstance();
    }

    @Override
    public AbTestingContentExpected inContent() {
        if (content == null) {
            content = AbTestingContentExpected.getInstance();
        }
        return content;
    }
}
