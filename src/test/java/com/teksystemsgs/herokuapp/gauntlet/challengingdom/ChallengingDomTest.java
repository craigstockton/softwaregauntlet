package com.teksystemsgs.herokuapp.gauntlet.challengingdom;

import com.teksystemsgs.herokuapp.gauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test
public class ChallengingDomTest extends GauntletTest{
    @Test(groups={TestType.EVT})
    public void smoke(){
        ChallengingDomExpected expected = ChallengingDomExpected.getInstance();
        ChallengingDom actual = ChallengingDom.directNav();
        confirm(ChallengingDomValidator.getInstance(expected, actual).validate());
    }
}
