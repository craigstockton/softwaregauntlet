package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table;

import com.softwareonpurpose.validator4test.Validator;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.header.ChallengingDomTableHeaderValidator;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.row.ChallengingDomTableRowValidatable;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.row.ChallengingDomTableRowValidator;

import java.util.List;

public class ChallengingDomTableValidator extends Validator{
    private static final String DESCRIPTION = "'Challenging DOM' table";

    private ChallengingDomTableValidator(ChallengingDomTableExpected expected, ChallengingDomTable actual, Validator parent) {
        super(DESCRIPTION, expected, actual, parent);
        addChildValidator(ChallengingDomTableHeaderValidator.getInstance(expected.inHeader(), actual.inHeader(), this));
        List<ChallengingDomTableRowValidatable> expectedRows = expected.getTableRows();
        List<ChallengingDomTableRowValidatable> actualRows = actual.getTableRows();
        for(int index = 0;index < expectedRows.size();index++){
            addChildValidator(ChallengingDomTableRowValidator.getInstance(expectedRows.get(index), actualRows.get(index), this));
        }
    }

    public static ChallengingDomTableValidator getInstance(ChallengingDomTableExpected expected, ChallengingDomTable actual, Validator parent) {
        return new ChallengingDomTableValidator(expected, actual, parent);
    }

    @Override
    protected void executeVerifications() {

    }
}
