package com.teksystemsgs.herokuapp.gauntlet.brokenimages;

import com.teksystemsgs.herokuapp.gauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test
public class BrokenImagesTest extends GauntletTest {
    @Test(groups = {TestType.EVT})
    public void smoke() {
        BrokenImagesExpected expected = BrokenImagesExpected.getInstance();
        BrokenImages actual = BrokenImages.directNav();
        confirm(BrokenImagesValidator.getInstance(expected, actual).validate());
    }
}
