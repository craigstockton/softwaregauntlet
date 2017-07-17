package com.teksystemsgs.herokuapp.gauntlet.brokenimages;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiView;
import com.teksystemsgs.herokuapp.gauntlet.brokenimages.content.BrokenImagesContent;
import com.teksystemsgs.herokuapp.gauntlet.environment.Environment;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.Footer;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeader;

public class BrokenImages extends UiView implements BrokenImagesValidatable {
    private static final String RELATIVE_URI = "broken_images";
    private static final String VIEW_URI = String.format("%s/%s", Environment.getInstance().getDomainUri(), RELATIVE_URI);
    private static final String DESCRIPTION = "'Broken Images' view";
    private static final String locatorType = UiElement.LocatorType.TAG;
    private static final String LOCATOR_VALUE = "body";

    private BrokenImages() {
        super(VIEW_URI, UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE));
    }

    static BrokenImages directNav() {
        new BrokenImages().load();
        return BrokenImages.expect();
    }

    private static BrokenImages expect() {
        BrokenImages view = new BrokenImages();
        view.confirmElementStates();
        return view;
    }

    @Override
    protected boolean confirmElementStates() {
        boolean confirmed = this.getElement().waitUntilVisible();
        return confirmed;
    }

    @Override
    public ForkHeader inHeader() {
        return ForkHeader.getInstance(this.getElement());
    }

    @Override
    public BrokenImagesContent inContent() {
        return BrokenImagesContent.getInstance(this.getElement());
    }

    @Override
    public Footer inFooter() {
        return Footer.getInstance(this.getElement());
    }
}
