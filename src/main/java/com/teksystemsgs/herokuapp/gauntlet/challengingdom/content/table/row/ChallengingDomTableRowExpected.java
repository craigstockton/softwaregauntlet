package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.row;

public class ChallengingDomTableRowExpected implements ChallengingDomTableRowValidatable{
    private final String column_1;
    private final String column_2;
    private final String column_3;
    private final String column_4;
    private final String column_5;
    private final String column_6;

    private ChallengingDomTableRowExpected(String column_1, String column_2, String column_3, String column_4, String column_5, String column_6) {
        this.column_1 = column_1;
        this.column_2 = column_2;
        this.column_3 = column_3;
        this.column_4 = column_4;
        this.column_5 = column_5;
        this.column_6 = column_6;
    }

    public static ChallengingDomTableRowExpected getInstance(String column_1, String column_2, String column_3, String column_4, String column_5, String column_6) {
        return new ChallengingDomTableRowExpected(column_1, column_2, column_3, column_4, column_5, column_6);
    }

    @Override
    public String getLorem() {
        return column_1;
    }

    @Override
    public String getIpsum() {
        return column_2;
    }

    @Override
    public String getDolor() {
        return column_3;
    }

    @Override
    public String getSit() {
        return column_4;
    }

    @Override
    public String getAmet() {
        return column_5;
    }

    @Override
    public String getDiceret() {
        return column_6;
    }

    @Override
    public String getEditLinkLabel() {
        return "edit";
    }

    @Override
    public String getDeleteLinkLabel() {
        return "delete";
    }
}
