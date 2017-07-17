package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.row;

import com.softwareonpurpose.validator4test.Validator;

public class ChallengingDomTableRowValidator extends Validator {
    private static final String DESCRIPTION = "Table Row";
    private final ChallengingDomTableRowValidatable expected;
    private final ChallengingDomTableRowValidatable actual;

    private ChallengingDomTableRowValidator(ChallengingDomTableRowValidatable expected, ChallengingDomTableRowValidatable actual, Validator parentValidator) {
        super(DESCRIPTION, expected, actual, parentValidator);
        this.expected = expected;
        this.actual = actual;
    }

    @Override
    protected void executeVerifications() {
        verify("Lorem", expected.getLorem(), actual.getLorem());
        verify("Ipsum", expected.getIpsum(), actual.getIpsum());
        verify("Dolor", expected.getDolor(), actual.getDolor());
        verify("Sit", expected.getSit(), actual.getSit());
        verify("Amet", expected.getAmet(), actual.getAmet());
        verify("Diceret", expected.getDiceret(), actual.getDiceret());
        verify("'Edit link' label", expected.getEditLinkLabel(), actual.getEditLinkLabel());
        verify("'Delete link' label", expected.getDeleteLinkLabel(), actual.getDeleteLinkLabel());
    }

    public static ChallengingDomTableRowValidator getInstance(ChallengingDomTableRowValidatable expected, ChallengingDomTableRowValidatable actual, Validator parent) {
        return new ChallengingDomTableRowValidator(expected, actual, parent);
    }
}
