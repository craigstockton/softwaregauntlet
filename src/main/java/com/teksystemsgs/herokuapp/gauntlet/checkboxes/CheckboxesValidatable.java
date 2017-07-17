package com.teksystemsgs.herokuapp.gauntlet.checkboxes;

import com.teksystemsgs.herokuapp.gauntlet.checkboxes.content.CheckboxesContentValidatable;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterValidatable;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderValidatable;

public interface CheckboxesValidatable {
    String getHeading();

    ForkHeaderValidatable inHeader();

    FooterValidatable inFooter();

    CheckboxesContentValidatable inContent();
}
