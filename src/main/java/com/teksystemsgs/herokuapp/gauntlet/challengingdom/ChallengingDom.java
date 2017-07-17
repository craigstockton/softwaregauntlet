package com.teksystemsgs.herokuapp.gauntlet.challengingdom;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiView;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.ChallengingDomContent;
import com.teksystemsgs.herokuapp.gauntlet.environment.Environment;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.Footer;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeader;

public class ChallengingDom extends UiView implements ChallengingDomValidatable {
    private static final String RELATIVE_URI = "challenging_dom";
    private static final String VIEW_URI = String.format("%s/%s", Environment.getInstance().getDomainUri(), RELATIVE_URI);
    private static final String DESCRIPTION = "'Challenging DOM' view";
    private static final String locatorType = UiElement.LocatorType.TAG;
    private static final String LOCATOR_VALUE = "body";

    private ChallengingDom() {
        super(VIEW_URI, UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE));
    }

    static ChallengingDom directNav() {
        new ChallengingDom().load();
        return ChallengingDom.expect();
    }

    private static ChallengingDom expect() {
        ChallengingDom view = new ChallengingDom();
        view.confirmElementStates();
        return view;
    }

    @Override
    protected boolean confirmElementStates() {
        boolean confirmed = this.getElement().waitUntilVisible();
        return confirmed;
    }

    @Override
    public String getHeading() {
        return UiElement.getInstance("Heading", UiElement.LocatorType.TAG, "h3").getText();
    }

    @Override
    public String getContentDescription() {
        return UiElement.getInstance("Description", UiElement.LocatorType.TAG, "p").getText();
    }

    @Override
    public ForkHeader inHeader() {
        return ForkHeader.getInstance(this.getElement());
    }

    @Override
    public ChallengingDomContent inContent() {
        return ChallengingDomContent.getInstance(this.getElement());
    }

    @Override
    public Footer inFooter() {
        return Footer.getInstance(this.getElement());
    }
}
