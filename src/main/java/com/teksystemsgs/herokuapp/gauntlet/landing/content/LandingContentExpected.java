package com.teksystemsgs.herokuapp.gauntlet.landing.content;

import com.teksystemsgs.herokuapp.gauntlet.environment.Environment;
import com.teksystemsgs.herokuapp.gauntlet.environment.EnvironmentDefinition;

public class LandingContentExpected implements LandingContentValidatable {
    private final EnvironmentDefinition environment = Environment.getInstance();

    public static LandingContentExpected getInstance() {
        return new LandingContentExpected();
    }

    @Override
    public String getHeading() {
        return "Welcome to the-internet";
    }

    @Override
    public String getSubHeading() {
        return "Available Examples";
    }

    @Override
    public String getAbTestingText() {
        return "A/B Testing";
    }

    @Override
    public String getAbTestingHref() {
        return environment.getAbTestUri();
    }

    @Override
    public String getBasicAuthText() {
        return "Basic Auth (user and pass: admin)";
    }

    @Override
    public String getBasicAuthHref() {
        return environment.getBasicAuthUri();
    }

    @Override
    public String getBrokenImagesText() {
        return "Broken Images";
    }

    @Override
    public String getBrokenImagesHref() {
        return environment.getBrokenImagesUri();
    }

    @Override
    public String getChallengingDomText() {
        return "Challenging DOM";
    }

    @Override
    public String getChallengingDomHref() {
        return environment.getChallengingDomUri();
    }

    @Override
    public String getCheckboxesText() {
        return "Checkboxes";
    }

    @Override
    public String getCheckboxesHref() {
        return environment.getCheckboxesUri();
    }

    @Override
    public String getContextMenuText() {
        return "Context Menu";
    }

    @Override
    public String getContextMenuHref() {
        return environment.getContextMenuUri();
    }

    @Override
    public String getDisappearingElementsText() {
        return "Disappearing Elements";
    }

    @Override
    public String getDisappearingElementsHref() {
        return environment.getDisappearingElementsUri();
    }

    @Override
    public String getDragAndDropText() {
        return "Drag and Drop";
    }

    @Override
    public String getDragAndDropHref() {
        return environment.getDragAndDropUri();
    }

    @Override
    public String getDropdownText() {
        return "Dropdown";
    }

    @Override
    public String getDropdownHref() {
        return environment.getDropdownUri();
    }

    @Override
    public String getDynamicContentText() {
        return "Dynamic Content";
    }

    @Override
    public String getDynamicContentHref() {
        return environment.getDynamicContentUri();
    }

    @Override
    public String getDynamicControlsText() {
        return "Dynamic Controls";
    }

    @Override
    public String getDynamicControlsHref() {
        return environment.getDynamicControlsUri();
    }

    @Override
    public String getDynamicLoadingText() {
        return "Dynamic Loading";
    }

    @Override
    public String getDynamicLoadingHref() {
        return environment.getDynamicLoadingUri();
    }

    @Override
    public String getExitIntentText() {
        return "Exit Intent";
    }

    @Override
    public String getExitIntentHref() {
        return environment.getExitIntentUri();
    }

    @Override
    public String getFileDownloadText() {
        return "File Download";
    }

    @Override
    public String getFileDownloadHref() {
        return environment.getFileDownloadUri();
    }

    @Override
    public String getFileUploadText() {
        return "File Upload";
    }

    @Override
    public String getFileUploadHref() {
        return environment.getFileUploadUri();
    }

    @Override
    public String getFloatingMenuText() {
        return "Floating Menu";
    }

    @Override
    public String getFloatingMenuHref() {
        return environment.getFloatingMenuUri();
    }

    @Override
    public String getForgotPasswordText() {
        return "Forgot Password";
    }

    @Override
    public String getForgotPasswordHref() {
        return environment.getForgotPasswordUri();
    }

    @Override
    public String getFormAuthenticationText() {
        return "Form Authentication";
    }

    @Override
    public String getFormAuthenticationHref() {
        return environment.getFormAuthenticationUri();
    }

    @Override
    public String getFramesText() {
        return "Frames";
    }

    @Override
    public String getFramesHref() {
        return environment.getFramesUri();
    }

    @Override
    public String getGeolocationText() {
        return "Geolocation";
    }

    @Override
    public String getGeolocationHref() {
        return environment.getGeolocationUri();
    }

    @Override
    public String getHorizontalSliderText() {
        return "Horizontal Slider";
    }

    @Override
    public String getHorizontalSliderHref() {
        return environment.getHorizontalSliderUri();
    }

    @Override
    public String getHoversText() {
        return "Hovers";
    }

    @Override
    public String getHoversHref() {
        return environment.getHoversUri();
    }

    @Override
    public String getInfiniteScrollText() {
        return "Infinite Scroll";
    }

    @Override
    public String getInfiniteScrollHref() {
        return environment.getInfiniteScrollUri();
    }

    @Override
    public String getJqueryUiMenusText() {
        return "JQuery UI Menus";
    }

    @Override
    public String getJqueryUiMenusHref() {
        return environment.getJqueryUiMenusUri();
    }

    @Override
    public String getJavaScriptAlertsText() {
        return "JavaScript Alerts";
    }

    @Override
    public String getJavaScriptAlertsHref() {
        return environment.getJavaScriptAlertsUri();
    }

    @Override
    public String getJavaScriptOnLoadEventErrorText() {
        return "JavaScript onload event error";
    }

    @Override
    public String getJavaScriptOnLoadEventErrorHref() {
        return environment.getJavaScriptOnLoadEventErrorUri();
    }

    @Override
    public String getKeyPressesText() {
        return "Key Presses";
    }

    @Override
    public String getKeyPressesHref() {
        return environment.getKeyPressesUri();
    }

    @Override
    public String getLargeAndDeepDomText() {
        return "Large & Deep DOM";
    }

    @Override
    public String getLargeAndDeepDomHref() {
        return environment.getLargeAndDeepDomUri();
    }

    @Override
    public String getMultipleWindowsText() {
        return "Multiple Windows";
    }

    @Override
    public String getMultipleWindowsHref() {
        return environment.getMultipleWindowsUri();
    }

    @Override
    public String getNestedFramesText() {
        return "Nested Frames";
    }

    @Override
    public String getNestedFramesHref() {
        return environment.getNestedFramesUri();
    }

    @Override
    public String getNotificationMessagesText() {
        return "Notification Messages";
    }

    @Override
    public String getNotificationMessagesHref() {
        return environment.getNotificationMessagesUri();
    }

    @Override
    public String getRedirectLinkText() {
        return "Redirect Link";
    }

    @Override
    public String getRedirectLinkHref() {
        return environment.getRedirectLinkUri();
    }

    @Override
    public String getSecureFileDownloadText() {
        return "Secure File Download";
    }

    @Override
    public String getSecureFileDownloadHref() {
        return environment.getSecureFileDownloadUri();
    }

    @Override
    public String getShiftingContentText() {
        return "Shifting Content";
    }

    @Override
    public String getShiftingContentHref() {
        return environment.getShiftingContentUri();
    }

    @Override
    public String getSlowResourcesText() {
        return "Slow Resources";
    }

    @Override
    public String getSlowResourcesHref() {
        return environment.getSlowResourcesUri();
    }

    @Override
    public String getSortableDataTablesText() {
        return "Sortable Data Tables";
    }

    @Override
    public String getSortableDataTablesHref() {
        return environment.getSortableDataTablesUri();
    }

    @Override
    public String getStatusCodesText() {
        return "Status Codes";
    }

    @Override
    public String getStatusCodesHref() {
        return environment.getStatusCodesUri();
    }

    @Override
    public String getTyposText() {
        return "Typos";
    }

    @Override
    public String getTyposHref() {
        return environment.getTyposUri();
    }

    @Override
    public String getWysiwygEditorText() {
        return "WYSIWYG Editor";
    }

    @Override
    public String getWysiwygEditorHref() {
        return environment.getWysiwygEditorUri();
    }
}
