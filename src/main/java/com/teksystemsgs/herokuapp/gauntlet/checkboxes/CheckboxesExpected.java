package com.teksystemsgs.herokuapp.gauntlet.checkboxes;

import com.teksystemsgs.herokuapp.gauntlet.checkboxes.content.CheckboxesContentExpected;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.FooterExpected;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeaderExpected;

public class CheckboxesExpected implements CheckboxesValidatable {

    public static CheckboxesExpected getInstance() {
        return new CheckboxesExpected();
    }

    @Override
    public String getHeading() {
        return "Checkboxes";
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
    public CheckboxesContentExpected inContent() {
        return CheckboxesContentExpected.getInstance();
    }
}
