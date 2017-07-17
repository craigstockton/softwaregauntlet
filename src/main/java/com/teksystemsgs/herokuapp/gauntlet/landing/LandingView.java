package com.teksystemsgs.herokuapp.gauntlet.landing;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiView;
import com.teksystemsgs.herokuapp.gauntlet.environment.Environment;
import com.teksystemsgs.herokuapp.gauntlet.landing.content.LandingContent;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.Footer;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeader;

public class LandingView extends UiView implements LandingViewValidatable {
    private static final String VIEW_URI = Environment.getInstance().getDomainUri();

    private LandingView() {
        super(VIEW_URI, UiElement.getInstance("'Landing' view", UiElement.LocatorType.TAG, "body"));
    }

    static LandingView directNav() {
        new LandingView().load();
        return LandingView.expect();
    }

    private static LandingView expect() {
        LandingView view = new LandingView();
        view.confirmElementStates();
        return view;
    }

    @Override
    public ForkHeader inHeader() {
        return ForkHeader.getInstance(this.getElement());
    }

    @Override
    public LandingContent inContent() {
        return LandingContent.getInstance(this.getElement());
    }

    @Override
    public Footer inFooter() {
        return Footer.getInstance(this.getElement());
    }

    @Override
    protected boolean confirmElementStates() {
        return this.getElement().waitUntilVisible();
    }
}
