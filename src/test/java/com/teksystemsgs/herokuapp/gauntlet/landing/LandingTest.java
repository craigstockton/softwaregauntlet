package com.teksystemsgs.herokuapp.gauntlet.landing;

import com.teksystemsgs.herokuapp.gauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test
public class LandingTest extends GauntletTest {
    @Test(groups = {TestType.EVT})
    public void smoke() {
        LandingViewExpected expected = LandingViewExpected.getInstance();
        LandingView actual = LandingView.directNav();
        confirm(LandingViewValidator.getInstance(expected, actual).validate());
    }
}
