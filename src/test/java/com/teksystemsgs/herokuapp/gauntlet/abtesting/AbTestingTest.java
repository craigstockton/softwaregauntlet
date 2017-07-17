package com.teksystemsgs.herokuapp.gauntlet.abtesting;

import com.teksystemsgs.herokuapp.gauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test
public class AbTestingTest extends GauntletTest{
    @Test(groups={TestType.EVT})
    public void smoke(){
        AbTestingExpected expected = AbTestingExpected.getInstance();
        AbTesting actual = AbTesting.directNav();
        if(actual.inContent().getHeading().contains("Variation")){
            expected.inContent().setHeadingVariation(true);
        }
        confirm(AbTestingValidator.getInstance(expected, actual).validate());
    }
}
