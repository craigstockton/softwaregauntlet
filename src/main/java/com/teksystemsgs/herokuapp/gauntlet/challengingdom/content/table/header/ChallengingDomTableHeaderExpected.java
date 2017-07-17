package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.header;

public class ChallengingDomTableHeaderExpected implements ChallengingDomTableHeaderValidatable {
    public static ChallengingDomTableHeaderExpected getInstance() {
        return new ChallengingDomTableHeaderExpected();
    }

    @Override
    public String getLorem() {
        return "Lorem";
    }

    @Override
    public String getIpsum() {
        return "Ipsum";
    }

    @Override
    public String getDolor() {
        return "Dolor";
    }

    @Override
    public String getSit() {
        return "Sit";
    }

    @Override
    public String getAmet() {
        return "Amet";
    }

    @Override
    public String getDiceret() {
        return "Diceret";
    }

    @Override
    public String getAction() {
        return "Action";
    }
}
