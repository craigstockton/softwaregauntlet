package com.teksystemsgs.herokuapp.gauntlet.region.header;

import com.teksystemsgs.herokuapp.gauntlet.environment.Environment;
import com.teksystemsgs.herokuapp.gauntlet.region.image.SiteImageExpected;

public class ForkHeaderExpected implements ForkHeaderValidatable {
    private static final String FORK_ME_IMAGE_SRC = "img/forkme_right_green_007200.png";

    public static ForkHeaderExpected getInstance() {
        return new ForkHeaderExpected();
    }

    @Override
    public String getForkMeSource() {
        return String.format("%s/%s", Environment.getInstance().getDomainUri(), FORK_ME_IMAGE_SRC);
    }

    @Override
    public String getForkMeHref() {
        return "https://github.com/tourdedave/the-internet";
    }

    @Override
    public SiteImageExpected inImage() {
        String source = String.format("%s/%s", Environment.getInstance().getDomainUri(), FORK_ME_IMAGE_SRC);
        return SiteImageExpected.getInstance(source);
    }
}
