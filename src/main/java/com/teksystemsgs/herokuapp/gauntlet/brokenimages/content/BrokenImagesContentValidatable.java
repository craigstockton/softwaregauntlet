package com.teksystemsgs.herokuapp.gauntlet.brokenimages.content;

import com.teksystemsgs.herokuapp.gauntlet.region.image.SiteImageValidatable;

public interface BrokenImagesContentValidatable {
    String getHeading();

    SiteImageValidatable inImageOne();

    SiteImageValidatable inImageTwo();

    SiteImageValidatable inImageThree();
}
