package com.teksystemsgs.herokuapp.gauntlet.checkboxes;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiView;
import com.teksystemsgs.herokuapp.gauntlet.checkboxes.content.CheckboxesContent;
import com.teksystemsgs.herokuapp.gauntlet.environment.Environment;
import com.teksystemsgs.herokuapp.gauntlet.region.footer.Footer;
import com.teksystemsgs.herokuapp.gauntlet.region.header.ForkHeader;

public class Checkboxes extends UiView implements CheckboxesValidatable {
    private static final String RELATIVE_URI = "checkboxes";
    private static final String VIEW_URI = String.format("%s/%s", Environment.getInstance().getDomainUri(), RELATIVE_URI);
    private static final String DESCRIPTION = "'Checkboxes' view";
    private static final String locatorType = UiElement.LocatorType.TAG;
    private static final String LOCATOR_VALUE = "body";

    private Checkboxes() {
        super(VIEW_URI, UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE));
    }

    public static Checkboxes directNav() {
        new Checkboxes().load();
        return Checkboxes.expected();
    }

    private static Checkboxes expected() {
        Checkboxes view = new Checkboxes();
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
        return UiElement.getInstance("Heading", UiElement.LocatorType.TAG, "h3", this.getElement()).getText();
    }

    @Override
    public ForkHeader inHeader() {
        return ForkHeader.getInstance(this.getElement());
    }

    @Override
    public Footer inFooter() {
        return Footer.getInstance(this.getElement());
    }

    @Override
    public CheckboxesContent inContent() {
        return CheckboxesContent.getInstance(this.getElement());
    }
}
