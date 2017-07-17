package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.buttons.ChallengingDomButtons;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.ChallengingDomTable;

public class ChallengingDomContent extends UiRegion implements ChallengingDomContentValidatable {
    private static final String DESCRIPTION = "Content";
    private static final String locatorType = UiElement.LocatorType.ID;
    private static final String LOCATOR_VALUE = "content";

    private ChallengingDomContent(UiElement parent) {
        super(UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE, parent));
    }

    public static ChallengingDomContent getInstance(UiElement parent) {
        return new ChallengingDomContent(parent);
    }

    @Override
    public ChallengingDomButtons inButtons() {
        return ChallengingDomButtons.getInstance(this.getElement());
    }

    @Override
    public ChallengingDomTable inTable() {
        return ChallengingDomTable.getInstance(this.getElement());
    }
}
