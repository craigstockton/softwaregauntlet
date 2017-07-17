package com.teksystemsgs.herokuapp.gauntlet.environment;

public abstract class EnvironmentDefinition {
    String DOMAIN_URI;

    public String getDomainUri() {
        return DOMAIN_URI;
    }

    private String getPageUri(String relativeUri) {
        return String.format("%s/%s", getDomainUri(), relativeUri);
    }

    public String getAbTestUri() {
        return getPageUri("abtest");
    }

    public String getBasicAuthUri() {
        return getPageUri("basic_auth");
    }

    public String getBrokenImagesUri() {
        return getPageUri("broken_images");
    }

    public String getChallengingDomUri() {
        return getPageUri("challenging_dom");
    }

    public String getCheckboxesUri() {
        return getPageUri("checkboxes");
    }

    public String getContextMenuUri() {
        return getPageUri("context_menu");
    }

    public String getDisappearingElementsUri() {
        return getPageUri("disappearing_elements");
    }

    public String getDragAndDropUri() {
        return getPageUri("drag_and_drop");
    }

    public String getDropdownUri() {
        return getPageUri("dropdown");
    }

    public String getDynamicContentUri() {
        return getPageUri("dynamic_content");
    }

    public String getDynamicControlsUri() {
        return getPageUri("dynamic_controls");
    }

    public String getDynamicLoadingUri() {
        return getPageUri("dynamic_loading");
    }

    public String getExitIntentUri() {
        return getPageUri("exit_intent");
    }

    public String getFileDownloadUri() {
        return getPageUri("download");
    }

    public String getFileUploadUri() {
        return getPageUri("upload");
    }

    public String getFloatingMenuUri() {
        return getPageUri("floating_menu");
    }

    public String getForgotPasswordUri() {
        return getPageUri("forgot_password");
    }

    public String getFormAuthenticationUri() {
        return getPageUri("login");
    }

    public String getFramesUri() {
        return getPageUri("frames");
    }

    public String getHorizontalSliderUri() {
        return getPageUri("horizontal_slider");
    }

    public String getGeolocationUri() {
        return getPageUri("geolocation");
    }

    public String getHoversUri() {
        return getPageUri("hovers");
    }

    public String getInfiniteScrollUri() {
        return getPageUri("infinite_scroll");
    }

    public String getJqueryUiMenusUri() {
        return getPageUri("jqueryui/menu");
    }

    public String getJavaScriptAlertsUri() {
        return getPageUri("javascript_alerts");
    }

    public String getJavaScriptOnLoadEventErrorUri() {
        return getPageUri("javascript_error");
    }

    public String getKeyPressesUri() {
        return getPageUri("key_presses");
    }

    public String getLargeAndDeepDomUri() {
        return getPageUri("large");
    }

    public String getMultipleWindowsUri() {
        return getPageUri("windows");
    }

    public String getNestedFramesUri() {
        return getPageUri("nested_frames");
    }

    public String getNotificationMessagesUri() {
        return getPageUri("notification_message");
    }

    public String getRedirectLinkUri() {
        return getPageUri("redirector");
    }

    public String getSecureFileDownloadUri() {
        return getPageUri("download_secure");
    }

    public String getShiftingContentUri() {
        return getPageUri("shifting_content");
    }

    public String getSlowResourcesUri() {
        return getPageUri("slow");
    }

    public String getSortableDataTablesUri() {
        return getPageUri("tables");
    }

    public String getStatusCodesUri() {
        return getPageUri("status_codes");
    }

    public String getTyposUri() {
        return getPageUri("typos");
    }

    public String getWysiwygEditorUri() {
        return getPageUri("tinymce");
    }
}
