package com.teksystemsgs.herokuapp.gauntlet.region.image;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class SiteImage extends UiRegion implements SiteImageValidatable {
    private static final String DESCRIPTION = "'Site Image' region";
    private static final String locatorType = UiElement.LocatorType.TAG;
    private static final String LOCATOR_VALUE = "img";

    private SiteImage(Integer ordinal, UiElement parent) {
        super(UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE, ordinal, parent));
    }

    public static SiteImage getInstance(int ordinal, UiElement parent) {
        return new SiteImage(ordinal, parent);
    }

    @Override
    public String getSource() {
        return this.getElement().getSrc();
    }

    @Override
    public Boolean exists() {
        Integer status = 999;
        try {
            Response response = ClientBuilder.newBuilder().build().target(getSource()).request().get();
            status = response.getStatus();
            response.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return status.equals(200);
    }
}
