package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table;

import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.header.ChallengingDomTableHeaderExpected;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.row.ChallengingDomTableRowExpected;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.row.ChallengingDomTableRowValidatable;

import java.util.ArrayList;
import java.util.List;

public class ChallengingDomTableExpected implements ChallengingDomTableValidatable {
    private static final String IUVARET = "Iuvaret";
    private static final String APEIRIAN = "Apeirian";
    private static final String ADIPISCI = "Adipisci";
    private static final String DEFINIEBAS = "Definiebas";
    private static final String CONSEQUUNTUR = "Consequuntur";
    private static final String PHAEDRUM = "Phaedrum";

    public static ChallengingDomTableExpected getInstance() {
        return new ChallengingDomTableExpected();
    }

    @Override
    public ChallengingDomTableHeaderExpected inHeader() {
        return ChallengingDomTableHeaderExpected.getInstance();
    }

    @Override
    public List<ChallengingDomTableRowValidatable> getTableRows() {
        List<ChallengingDomTableRowValidatable> tableRows = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            String column_1 = String.format("%s%d", IUVARET, index);
            String column_2 = String.format("%s%d", APEIRIAN, index);
            String column_3 = String.format("%s%d", ADIPISCI, index);
            String column_4 = String.format("%s%d", DEFINIEBAS, index);
            String column_5 = String.format("%s%d", CONSEQUUNTUR, index);
            String column_6 = String.format("%s%d", PHAEDRUM, index);
            tableRows.add(ChallengingDomTableRowExpected.getInstance(column_1, column_2, column_3, column_4, column_5, column_6));
        }
        return tableRows;
    }
}
