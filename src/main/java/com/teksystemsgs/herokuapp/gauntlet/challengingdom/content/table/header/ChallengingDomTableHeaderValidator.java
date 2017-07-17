package com.teksystemsgs.herokuapp.gauntlet.challengingdom.content.table.header;

import com.softwareonpurpose.validator4test.Validator;

public class ChallengingDomTableHeaderValidator extends Validator {
    private static final String DESCRIPTION = "'Challenging DOM Table' header";
    private final ChallengingDomTableHeaderExpected expected;
    private final ChallengingDomTableHeader actual;

    private ChallengingDomTableHeaderValidator(ChallengingDomTableHeaderExpected expected, ChallengingDomTableHeader actual, Validator parent) {
        super(DESCRIPTION, expected, actual, parent);
        this.expected = expected;
        this.actual = actual;
    }

    public static ChallengingDomTableHeaderValidator getInstance(ChallengingDomTableHeaderExpected expected, ChallengingDomTableHeader actual, Validator parent) {
        return new ChallengingDomTableHeaderValidator(expected, actual, parent);
    }

    @Override
    protected void executeVerifications() {
        verify("Lorem", expected.getLorem(), actual.getLorem());
        verify("Ipsum", expected.getIpsum(), actual.getIpsum());
        verify("Dolor", expected.getDolor(), actual.getDolor());
        verify("Sit", expected.getSit(), actual.getSit());
        verify("Amet", expected.getAmet(), actual.getAmet());
        verify("Diceret", expected.getDiceret(), actual.getDiceret());
        verify("Action", expected.getAction(), actual.getAction());
    }
}
