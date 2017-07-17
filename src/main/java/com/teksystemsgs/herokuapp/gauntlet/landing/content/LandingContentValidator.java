package com.teksystemsgs.herokuapp.gauntlet.landing.content;

import com.softwareonpurpose.validator4test.Validator;

public class LandingContentValidator extends Validator{
    private static final String DESCRIPTION = "'Landing Content' region";
    private final LandingContentExpected expected;
    private final LandingContent actual;

    private LandingContentValidator(LandingContentExpected expected, LandingContent actual, Validator parent) {
        super(DESCRIPTION, expected, actual, parent);
        this.expected = expected;
        this.actual = actual;
    }

    public static LandingContentValidator getInstance(LandingContentExpected expected, LandingContent actual, Validator parent) {
        return new LandingContentValidator(expected, actual, parent);
    }

    @Override
    protected void executeVerifications() {
        verify("Heading", expected.getHeading(), actual.getHeading());
        verify("Sub-heading", expected.getSubHeading(), actual.getSubHeading());
        verify("'A/B Testing' text", expected.getAbTestingText(), actual.getAbTestingText());
        verify("'A/B Testing' href", expected.getAbTestingHref(), actual.getAbTestingHref());
        verify("'Basic Auth' text", expected.getBasicAuthText(), actual.getBasicAuthText());
        verify("'Basic Auth' text", expected.getBasicAuthHref(), actual.getBasicAuthHref());
        verify("'Broken Images' text", expected.getBrokenImagesText(), actual.getBrokenImagesText());
        verify("'Broken Images' text", expected.getBrokenImagesHref(), actual.getBrokenImagesHref());
        verify("'Challenging Dom' text", expected.getChallengingDomText(), actual.getChallengingDomText());
        verify("'Challenging Dom' text", expected.getChallengingDomHref(), actual.getChallengingDomHref());
        verify("'Checkboxes' text", expected.getCheckboxesText(), actual.getCheckboxesText());
        verify("'Checkboxes' text", expected.getCheckboxesHref(), actual.getCheckboxesHref());
        verify("'Context Menu' text", expected.getContextMenuText(), actual.getContextMenuText());
        verify("'Context Menu' text", expected.getContextMenuHref(), actual.getContextMenuHref());
        verify("'Disappearing Elements' text", expected.getDisappearingElementsText(), actual.getDisappearingElementsText());
        verify("'Disappearing Elements' text", expected.getDisappearingElementsHref(), actual.getDisappearingElementsHref());
        verify("'Drag and Drop' text", expected.getDragAndDropText(), actual.getDragAndDropText());
        verify("'Drag and Drop' text", expected.getDragAndDropHref(), actual.getDragAndDropHref());
        verify("'Dropdown' text", expected.getDropdownText(), actual.getDropdownText());
        verify("'Dropdown' text", expected.getDropdownHref(), actual.getDropdownHref());
        verify("'Dynamic Content' text", expected.getDynamicContentText(), actual.getDynamicContentText());
        verify("'Dynamic Content' text", expected.getDynamicContentHref(), actual.getDynamicContentHref());
        verify("'Dynamic Controls' text", expected.getDynamicControlsText(), actual.getDynamicControlsText());
        verify("'Dynamic Controls' text", expected.getDynamicControlsHref(), actual.getDynamicControlsHref());
        verify("'Dynamic Loading' text", expected.getDynamicLoadingText(), actual.getDynamicLoadingText());
        verify("'Dynamic Loading' text", expected.getDynamicLoadingHref(), actual.getDynamicLoadingHref());
        verify("'Exit Intent' text", expected.getExitIntentText(), actual.getExitIntentText());
        verify("'Exit Intent' text", expected.getExitIntentHref(), actual.getExitIntentHref());
        verify("'File Download' text", expected.getFileDownloadText(), actual.getFileDownloadText());
        verify("'File Download' text", expected.getFileDownloadHref(), actual.getFileDownloadHref());
        verify("'File Upload' text", expected.getFileUploadText(), actual.getFileUploadText());
        verify("'File Upload' text", expected.getFileUploadHref(), actual.getFileUploadHref());
        verify("'Floating Menu' text", expected.getFloatingMenuText(), actual.getFloatingMenuText());
        verify("'Floating Menu' text", expected.getFloatingMenuHref(), actual.getFloatingMenuHref());
        verify("'Forgot Password' text", expected.getForgotPasswordText(), actual.getForgotPasswordText());
        verify("'Forgot Password' text", expected.getForgotPasswordHref(), actual.getForgotPasswordHref());
        verify("'Form Authentication' text", expected.getFormAuthenticationText(), actual.getFormAuthenticationText());
        verify("'Form Authentication' text", expected.getFormAuthenticationHref(), actual.getFormAuthenticationHref());
        verify("'Frames' text", expected.getFramesText(), actual.getFramesText());
        verify("'Frames' text", expected.getFramesHref(), actual.getFramesHref());
        verify("'Geolocation' text", expected.getGeolocationText(), actual.getGeolocationText());
        verify("'Geolocation' text", expected.getGeolocationHref(), actual.getGeolocationHref());
        verify("'Horizontal Slider' text", expected.getHorizontalSliderText(), actual.getHorizontalSliderText());
        verify("'Horizontal Slider' text", expected.getHorizontalSliderHref(), actual.getHorizontalSliderHref());
        verify("'Hovers' text", expected.getHoversText(), actual.getHoversText());
        verify("'Hovers' text", expected.getHoversHref(), actual.getHoversHref());
        verify("'Infinite Scroll' text", expected.getInfiniteScrollText(), actual.getInfiniteScrollText());
        verify("'Infinite Scroll' text", expected.getInfiniteScrollHref(), actual.getInfiniteScrollHref());
        verify("'Jquery Ui Menus' text", expected.getJqueryUiMenusText(), actual.getJqueryUiMenusText());
        verify("'Jquery Ui Menus' text", expected.getJqueryUiMenusHref(), actual.getJqueryUiMenusHref());
        verify("'JavaScript Alerts' text", expected.getJavaScriptAlertsText(), actual.getJavaScriptAlertsText());
        verify("'JavaScript Alerts' text", expected.getJavaScriptAlertsHref(), actual.getJavaScriptAlertsHref());
        verify("'JavaScript Onload Event Error' text", expected.getJavaScriptOnLoadEventErrorText(), actual.getJavaScriptOnLoadEventErrorText());
        verify("'JavaScript Onload Event Error' text", expected.getJavaScriptOnLoadEventErrorHref(), actual.getJavaScriptOnLoadEventErrorHref());
        verify("'Key Presses' text", expected.getKeyPressesText(), actual.getKeyPressesText());
        verify("'Key Presses' text", expected.getKeyPressesHref(), actual.getKeyPressesHref());
        verify("'Large And Deep Dom' text", expected.getLargeAndDeepDomText(), actual.getLargeAndDeepDomText());
        verify("'Large And Deep Dom' text", expected.getLargeAndDeepDomHref(), actual.getLargeAndDeepDomHref());
        verify("'Multiple Windows' text", expected.getMultipleWindowsText(), actual.getMultipleWindowsText());
        verify("'Multiple Windows' text", expected.getMultipleWindowsHref(), actual.getMultipleWindowsHref());
        verify("'Nested Frames' text", expected.getNestedFramesText(), actual.getNestedFramesText());
        verify("'Nested Frames' text", expected.getNestedFramesHref(), actual.getNestedFramesHref());
        verify("'Notification Messages' text", expected.getNotificationMessagesText(), actual.getNotificationMessagesText());
        verify("'Notification Messages' text", expected.getNotificationMessagesHref(), actual.getNotificationMessagesHref());
        verify("'Redirect Link' text", expected.getRedirectLinkText(), actual.getRedirectLinkText());
        verify("'Redirect Link' text", expected.getRedirectLinkHref(), actual.getRedirectLinkHref());
        verify("'Secure File Download' text", expected.getSecureFileDownloadText(), actual.getSecureFileDownloadText());
        verify("'Secure File Download' text", expected.getSecureFileDownloadHref(), actual.getSecureFileDownloadHref());
        verify("'Shifting Content' text", expected.getShiftingContentText(), actual.getShiftingContentText());
        verify("'Shifting Content' text", expected.getShiftingContentHref(), actual.getShiftingContentHref());
        verify("'Slow Resources' text", expected.getSlowResourcesText(), actual.getSlowResourcesText());
        verify("'Slow Resources' text", expected.getSlowResourcesHref(), actual.getSlowResourcesHref());
        verify("'Sortable Data Tables' text", expected.getSortableDataTablesText(), actual.getSortableDataTablesText());
        verify("'Sortable Data Tables' text", expected.getSortableDataTablesHref(), actual.getSortableDataTablesHref());
        verify("'Status Codes' text", expected.getStatusCodesText(), actual.getStatusCodesText());
        verify("'Status Codes' text", expected.getStatusCodesHref(), actual.getStatusCodesHref());
        verify("'Typos' text", expected.getTyposText(), actual.getTyposText());
        verify("'Typos' text", expected.getTyposHref(), actual.getTyposHref());
        verify("'Wysiwyg Editor' text", expected.getWysiwygEditorText(), actual.getWysiwygEditorText());
        verify("'Wysiwyg Editor' text", expected.getWysiwygEditorHref(), actual.getWysiwygEditorHref());
    }
}
