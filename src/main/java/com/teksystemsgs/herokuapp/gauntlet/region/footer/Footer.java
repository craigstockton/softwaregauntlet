package com.teksystemsgs.herokuapp.gauntlet.region.footer;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;

public class Footer extends UiRegion implements FooterValidatable {
    private static final String DESCRIPTION = "'Footer' region";
    private static final String locatorType = UiElement.LocatorType.ID;
    private static final String LOCATOR_VALUE = "page-footer";

    private Footer(UiElement parent) {
        super(UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE, parent));
    }

    public static Footer getInstance(UiElement parent) {
        return new Footer(parent);
    }

    @Override
    public String getMessage() {
        return UiElement.getInstance("Message", UiElement.LocatorType.TAG, "div", 2, this.getElement()).getText();
    }

    @Override
    public String getLinkText() {
        return getLinkElement().getText();
    }

    private UiElement getLinkElement() {
        return UiElement.getInstance("'Link' text", UiElement.LocatorType.TAG, "a", this.getElement());
    }

    @Override
    public String getLinkHref() {
        return getLinkElement().getHref();
    }
}
