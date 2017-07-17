package com.teksystemsgs.herokuapp.gauntlet.brokenimages;

import com.teksystemsgs.herokuapp.gauntlet.brokenimages.content.BrokenImagesContentValidatable;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterValidatable;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderValidatable;

public interface BrokenImagesValidatable {
    ForkHeaderValidatable inHeader();

    BrokenImagesContentValidatable inContent();

    FooterValidatable inFooter();
}
