package com.teksystemsgs.herokuapp.gauntlet.checkboxes;

import com.teksystemsgs.herokuapp.gauntlet.GauntletTest;
import org.testng.annotations.Test;

@Test
public class CheckboxesTest extends GauntletTest{
    @Test(groups={TestType.EVT})
    public void smoke(){
        CheckboxesExpected expected = CheckboxesExpected.getInstance();
        Checkboxes actual = Checkboxes.directNav();
        confirm(CheckboxesValidator.getInstance(expected, actual).validate());
    }
}
