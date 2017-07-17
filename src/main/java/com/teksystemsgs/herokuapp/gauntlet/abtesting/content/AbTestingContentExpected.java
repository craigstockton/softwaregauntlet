package com.teksystemsgs.herokuapp.gauntlet.abtesting.content;

public class AbTestingContentExpected implements AbTestingContentValidatable {

    private String variation = "Control";

    public static AbTestingContentExpected getInstance() {
        return new AbTestingContentExpected();
    }

    @Override
    public String getHeading() {
        return String.format("A/B Test %s", variation);
    }

    @Override
    public String getParagraph() {
        return "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
    }

    public void setHeadingVariation(@SuppressWarnings("SameParameterValue") boolean setVariation) {
        variation = setVariation ? "Variation 1" : "Control";
    }
}
