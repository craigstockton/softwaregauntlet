package com.teksystemsgs.herokuapp.gauntlet.region.header;

import com.teksystemsgs.herokuapp.gauntlet.region.image.SiteImageValidatable;

public interface ForkHeaderValidatable {
    String getForkMeSource();

    String getForkMeHref();

    SiteImageValidatable inImage();
}
