package com.teksystemsgs.herokuapp.gauntlet.brokenimages.content;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;
import com.teksystemsgs.herokuapp.gauntlet.region.image.SiteImage;

public class BrokenImagesContent extends UiRegion implements BrokenImagesContentValidatable {
    private static final String DESCRIPTION = "'Broken Images' view";
    private static final String locatorType = UiElement.LocatorType.ID;
    private static final String LOCATOR_VALUE = "content";

    private BrokenImagesContent(UiElement parent) {
        super(UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE, parent));
    }

    public static BrokenImagesContent getInstance(UiElement parent) {
        return new BrokenImagesContent(parent);
    }

    @Override
    public String getHeading() {
        return UiElement.getInstance("Heading", UiElement.LocatorType.TAG, "h3", this.getElement()).getText();
    }

    @Override
    public SiteImage inImageOne() {
        return SiteImage.getInstance(1, this.getElement());
    }

    @Override
    public SiteImage inImageTwo() {
        return SiteImage.getInstance(2, this.getElement());
    }

    @Override
    public SiteImage inImageThree() {
        return SiteImage.getInstance(3, this.getElement());
    }
}
