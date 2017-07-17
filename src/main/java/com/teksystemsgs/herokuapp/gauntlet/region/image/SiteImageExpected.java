package com.teksystemsgs.herokuapp.gauntlet.region.image;

public class SiteImageExpected implements SiteImageValidatable{
    private final String source;
    private final Boolean exists;

    private SiteImageExpected(String source, boolean exists) {
        this.source = source;
        this.exists = exists;
    }

    public static SiteImageExpected getInstance(String source, boolean exists) {
        return new SiteImageExpected(source, exists);
    }

    @Override
    public String getSource() {
        return source;
    }

    @Override
    public Boolean exists() {
        return exists;
    }

    public static SiteImageExpected getInstance(String source) {
        return new SiteImageExpected(source, true);
    }
}
