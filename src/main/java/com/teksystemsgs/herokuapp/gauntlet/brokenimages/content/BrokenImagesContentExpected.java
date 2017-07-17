package com.teksystemsgs.herokuapp.gauntlet.brokenimages.content;

import com.teksystemsgs.herokuapp.gauntlet.environment.Environment;
import com.teksystemsgs.herokuapp.gauntlet.region.image.SiteImageExpected;

public class BrokenImagesContentExpected implements BrokenImagesContentValidatable {
    public static BrokenImagesContentExpected getInstance() {
        return new BrokenImagesContentExpected();
    }

    @Override
    public String getHeading() {
        return "Broken Images";
    }

    @Override
    public SiteImageExpected inImageOne() {
        String source = String.format("%s/%s", Environment.getInstance().getDomainUri(), "asdf.jpg");
        return SiteImageExpected.getInstance(source, false);
    }

    @Override
    public SiteImageExpected inImageTwo() {
        String source = String.format("%s/%s", Environment.getInstance().getDomainUri(), "hjkl.jpg");
        return SiteImageExpected.getInstance(source, false);
    }

    @Override
    public SiteImageExpected inImageThree() {
        String source = String.format("%s/%s", Environment.getInstance().getDomainUri(), "img/avatar-blank.jpg");
        return SiteImageExpected.getInstance(source, true);
    }
}
