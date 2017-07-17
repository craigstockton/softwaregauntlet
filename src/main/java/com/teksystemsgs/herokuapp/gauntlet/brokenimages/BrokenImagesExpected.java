package com.teksystemsgs.herokuapp.gauntlet.brokenimages;

import com.teksystemsgs.herokuapp.gauntlet.brokenimages.content.BrokenImagesContentExpected;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterExpected;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderExpected;

public class BrokenImagesExpected implements BrokenImagesValidatable{
    @Override
    public ForkHeaderExpected inHeader() {
        return ForkHeaderExpected.getInstance();
    }

    @Override
    public BrokenImagesContentExpected inContent() {
        return BrokenImagesContentExpected.getInstance();
    }

    @Override
    public FooterExpected inFooter() {
        return FooterExpected.getInstance();
    }

    public static BrokenImagesExpected getInstance() {
        return new BrokenImagesExpected();
    }
}
