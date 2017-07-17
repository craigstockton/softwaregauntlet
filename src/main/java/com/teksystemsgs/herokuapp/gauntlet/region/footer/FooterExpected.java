package com.teksystemsgs.herokuapp.gauntlet.region.footer;

public class FooterExpected implements FooterValidatable {
    public static FooterExpected getInstance() {
        return new FooterExpected();
    }

    @Override
    public String getMessage() {
        return String.format("%s%s", "Powered by ", getLinkText());
    }

    @Override
    public String getLinkText() {
        return "Elemental Selenium";
    }

    @Override
    public String getLinkHref() {
        return "http://elementalselenium.com/";
    }
}
