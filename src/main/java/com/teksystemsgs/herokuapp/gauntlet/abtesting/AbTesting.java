package com.teksystemsgs.herokuapp.gauntlet.abtesting;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiView;
import com.teksystemsgs.herokuapp.gauntlet.environment.Environment;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.Footer;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeader;

public class AbTesting extends UiView implements AbTestingValidatable {
    private static final String VIEW_URI = Environment.getInstance().getAbTestUri();
    private static final String DESCRIPTION = "'A/B Testing' view";
    private static final String locatorType = UiElement.LocatorType.TAG;
    private static final String LOCATOR_VALUE = "body";

    private AbTesting() {
        super(VIEW_URI, UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE));
    }

    @Override
    protected boolean confirmElementStates() {
        boolean confirmed = this.getElement().waitUntilVisible();
        return confirmed;
    }

    @Override
    public String getHeading() {
        return UiElement.getInstance("Heading", UiElement.LocatorType.TAG, "h3", this.getElement()).getText();
    }

    @Override
    public String getDescription() {
        return UiElement.getInstance("Description", UiElement.LocatorType.TAG, "p", this.getElement()).getText();
    }

    @Override
    public ForkHeader inHeader() {
        return ForkHeader.getInstance(this.getElement());
    }

    @Override
    public Footer inFooter() {
        return Footer.getInstance(this.getElement());
    }

    static AbTesting directNav() {
        new AbTesting().load();
        return AbTesting.expect();
    }

    private static AbTesting expect() {
        AbTesting view = new AbTesting();
        view.confirmElementStates();
        return view;
    }
}
