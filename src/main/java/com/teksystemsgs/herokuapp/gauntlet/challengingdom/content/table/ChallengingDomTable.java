package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.header.ChallengingDomTableHeader;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.row.ChallengingDomTableRow;
import com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.row.ChallengingDomTableRowValidatable;

import java.util.ArrayList;
import java.util.List;

public class ChallengingDomTable extends UiRegion implements ChallengingDomTableValidatable {
    private static final String DESCRIPTION = "'Challenging DOM' table";
    private static final String locatorType = UiElement.LocatorType.TAG;
    private static final String LOCATOR_VALUE = "table";

    private ChallengingDomTable(UiElement parent) {
        super(UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE, parent));
    }

    public static ChallengingDomTable getInstance(UiElement parent) {
        return new ChallengingDomTable(parent);
    }

    @Override
    public ChallengingDomTableHeader inHeader() {
        return ChallengingDomTableHeader.getInstance(this.getElement());
    }

    @Override
    public List<ChallengingDomTableRowValidatable> getTableRows() {
        List<ChallengingDomTableRowValidatable> tableRows = new ArrayList<>();
        List<UiElement> rowElements = UiElement.getList("'Table' row", UiElement.LocatorType.TAG, "tr", getTableBodyElement());
        for (UiElement element : rowElements) {
            tableRows.add(ChallengingDomTableRow.getInstance(element));
        }
        return tableRows;
    }

    private UiElement getTableBodyElement() {
        return UiElement.getInstance("Table Body", UiElement.LocatorType.TAG, "tbody", this.getElement());
    }
}
