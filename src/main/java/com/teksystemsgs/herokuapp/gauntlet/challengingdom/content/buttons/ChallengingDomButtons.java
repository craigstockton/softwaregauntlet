package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.buttons;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;

public class ChallengingDomButtons extends UiRegion implements ChallengingDomButtonsValidatable {
    private static final String DESCRIPTION = "'Challenging DOM' buttons";
    private static final String locatorType = UiElement.LocatorType.CLASS;
    private static final String LOCATOR_VALUE = "large-2";

    private ChallengingDomButtons(UiElement parent) {
        super(UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE, parent));
    }

    public static ChallengingDomButtons getInstance(UiElement parent) {
        return new ChallengingDomButtons(parent);
    }

    @Override
    public Boolean isButtonOneExistent() {
        return UiElement.getInstance("Button 1", UiElement.LocatorType.CLASS, "button", this.getElement()).waitUntilVisible();
    }

    @Override
    public Boolean isButtonTwoExistent() {
        return UiElement.getInstance("Button 2", UiElement.LocatorType.CLASS, "alert", this.getElement()).waitUntilVisible();
    }

    @Override
    public Boolean isButtonThreeExistent() {
        return UiElement.getInstance("Button 3", UiElement.LocatorType.CLASS, "success", this.getElement()).waitUntilVisible();
    }
}
