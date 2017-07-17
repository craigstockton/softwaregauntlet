package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table;

import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.header.ChallengingDomTableHeaderValidatable;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.row.ChallengingDomTableRowValidatable;

import java.util.List;

public interface ChallengingDomTableValidatable {
    ChallengingDomTableHeaderValidatable inHeader();

    List<ChallengingDomTableRowValidatable> getTableRows();
}
