package com.teksystemsgs.herokuapp.gauntlet.region.header;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;

public class ForkHeader extends UiRegion implements ForkHeaderValidatable {
    private static final String DESCRIPTION = "'Fork Header' region";
    private static final String locatorType = UiElement.LocatorType.CLASS;
    private static final String LOCATOR_VALUE = "row";
    private static final int ORDINAL = 2;

    private ForkHeader(UiElement parent) {
        super(UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE, ORDINAL, parent));
    }

    public static ForkHeader getInstance(UiElement parent) {
        return new ForkHeader(parent);
    }

    @Override
    public String getForkMeSource() {
        return getForkMeImageElement().getSrc();
    }

    private UiElement getForkMeImageElement() {
        return UiElement.getInstance("'Fork me' image", UiElement.LocatorType.TAG, "img");
    }

    @Override
    public String getForkMeHref() {
        return getForkMeLinkElement().getHref();
    }

    private UiElement getForkMeLinkElement() {
        return UiElement.getInstance("'Fork me' href", UiElement.LocatorType.TAG, "a");
    }
}
