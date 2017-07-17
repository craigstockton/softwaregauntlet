package com.teksystemsgs.herokuapp.gauntlet.landing.content;

import com.softwareonpurpose.uinavigator.UiElement;
import com.softwareonpurpose.uinavigator.UiRegion;
import com.teksystemsgs.herokuapp.gauntlet.landing.content.listitem.ListItem;

public class LandingContent extends UiRegion implements LandingContentValidatable {
    private static final String DESCRIPTION = "'Landing Content' region";
    private static final String locatorType = UiElement.LocatorType.ID;
    private static final String LOCATOR_VALUE = "content";
    private ListItem abTesting;
    private ListItem basicAuth;
    private ListItem brokenImages;
    private ListItem challengingDom;
    private ListItem checkboxes;
    private ListItem contextMenu;
    private ListItem disappearingElements;
    private ListItem dragAndDrop;
    private ListItem dropdown;
    private ListItem dynamicContent;
    private ListItem dynamicLoading;
    private ListItem exitIntent;
    private ListItem fileDownload;
    private ListItem fileUpload;
    private ListItem floatingMenu;
    private ListItem forgotPassword;
    private ListItem formAuthentication;
    private ListItem frames;
    private ListItem horizontalSlider;
    private ListItem hovers;
    private ListItem infiniteScroll;
    private ListItem jqueryUiMenus;
    private ListItem javascriptAlerts;
    private ListItem javascriptOnLoadEventError;
    private ListItem keyPresses;
    private ListItem largeAndDeepDom;
    private ListItem multipleWindows;
    private ListItem nestedFrames;
    private ListItem notificationMessages;
    private ListItem redirectLink;
    private ListItem secureFileDownload;
    private ListItem shiftingContent;
    private ListItem slowResources;
    private ListItem sortableDataTables;
    private ListItem statusCodes;
    private ListItem typos;
    private ListItem wysiwygEditor;
    private ListItem dynamicControls;
    private ListItem geolocation;

    private LandingContent(UiElement parent) {
        super(UiElement.getInstance(DESCRIPTION, locatorType, LOCATOR_VALUE, parent));
    }

    public static LandingContent getInstance(UiElement parent) {
        return new LandingContent(parent);
    }

    @Override
    public String getHeading() {
        return UiElement.getInstance("Heading", UiElement.LocatorType.CLASS, "heading", this.getElement()).getText();
    }

    @Override
    public String getSubHeading() {
        return UiElement.getInstance("Sub-heading", UiElement.LocatorType.TAG, "h2", this.getElement()).getText();
    }

    @Override
    public String getAbTestingText() {
        return getAbTestingListItem().getText();
    }

    @Override
    public String getAbTestingHref() {
        return getAbTestingListItem().getHref();
    }

    private ListItem getAbTestingListItem() {
        if (abTesting == null) {
            abTesting = ListItem.getInstance("A/B Testing", 1, this.getElement());
        }
        return abTesting;
    }

    @Override
    public String getBasicAuthText() {
        return getBasicAuthListItem().getText();
    }

    @Override
    public String getBasicAuthHref() {
        return getBasicAuthListItem().getHref();
    }

    private ListItem getBasicAuthListItem() {
        if (basicAuth == null) {
            basicAuth = ListItem.getInstance("Basic Auth", 2, this.getElement());
        }
        return basicAuth;
    }

    @Override
    public String getBrokenImagesText() {
        return getBrokenImagesListItem().getText();
    }

    @Override
    public String getBrokenImagesHref() {
        return getBrokenImagesListItem().getHref();
    }

    private ListItem getBrokenImagesListItem() {
        if (brokenImages == null) {
            brokenImages = ListItem.getInstance("Broken Images", 3, this.getElement());
        }
        return brokenImages;
    }

    @Override
    public String getChallengingDomText() {
        return getChallengingDomListItem().getText();
    }

    @Override
    public String getChallengingDomHref() {
        return getChallengingDomListItem().getHref();
    }

    private ListItem getChallengingDomListItem() {
        if (challengingDom == null) {
            challengingDom = ListItem.getInstance("Challenging Dom", 4, this.getElement());
        }
        return challengingDom;
    }

    @Override
    public String getCheckboxesText() {
        return getCheckboxesListItem().getText();
    }

    @Override
    public String getCheckboxesHref() {
        return getCheckboxesListItem().getHref();
    }

    private ListItem getCheckboxesListItem() {
        if (checkboxes == null) {
            checkboxes = ListItem.getInstance("Checkboxes", 5, this.getElement());
        }
        return checkboxes;
    }

    @Override
    public String getContextMenuText() {
        return getContextMenuListItem().getText();
    }

    @Override
    public String getContextMenuHref() {
        return getContextMenuListItem().getHref();
    }

    private ListItem getContextMenuListItem() {
        if (contextMenu == null) {
            contextMenu = ListItem.getInstance("Context Menu", 6, this.getElement());
        }
        return contextMenu;
    }

    @Override
    public String getDisappearingElementsText() {
        return getDisappearingElementsListItem().getText();
    }

    @Override
    public String getDisappearingElementsHref() {
        return getDisappearingElementsListItem().getHref();
    }

    private ListItem getDisappearingElementsListItem() {
        if (disappearingElements == null) {
            disappearingElements = ListItem.getInstance("Disappearing Elements", 7, this.getElement());
        }
        return disappearingElements;
    }

    @Override
    public String getDragAndDropText() {
        return getDragAndDropListItem().getText();
    }

    @Override
    public String getDragAndDropHref() {
        return getDragAndDropListItem().getHref();
    }

    private ListItem getDragAndDropListItem() {
        if (dragAndDrop == null) {
            dragAndDrop = ListItem.getInstance("Drag and Drop", 8, this.getElement());
        }
        return dragAndDrop;
    }

    @Override
    public String getDropdownText() {
        return getDropdownListItem().getText();
    }

    @Override
    public String getDropdownHref() {
        return getDropdownListItem().getHref();
    }

    private ListItem getDropdownListItem() {
        if (dropdown == null) {
            dropdown = ListItem.getInstance("Dropdown", 9, this.getElement());
        }
        return dropdown;
    }

    @Override
    public String getDynamicContentText() {
        return getDynamicContentListItem().getText();
    }

    @Override
    public String getDynamicContentHref() {
        return getDynamicContentListItem().getHref();
    }

    private ListItem getDynamicContentListItem() {
        if (dynamicContent == null) {
            dynamicContent = ListItem.getInstance("Dynamic Content", 10, this.getElement());
        }
        return dynamicContent;
    }

    @Override
    public String getDynamicLoadingText() {
        return getDynamicLoadingListItem().getText();
    }

    @Override
    public String getDynamicLoadingHref() {
        return getDynamicLoadingListItem().getHref();
    }

    private ListItem getDynamicLoadingListItem() {
        if (dynamicLoading == null) {
            dynamicLoading = ListItem.getInstance("Dynamic Loading", 12, this.getElement());
        }
        return dynamicLoading;
    }

    @Override
    public String getExitIntentText() {
        return getExitIntentListItem().getText();
    }

    @Override
    public String getExitIntentHref() {
        return getExitIntentListItem().getHref();
    }

    private ListItem getExitIntentListItem() {
        if (exitIntent == null) {
            exitIntent = ListItem.getInstance("Exit Intent", 13, this.getElement());
        }
        return exitIntent;
    }

    @Override
    public String getFileDownloadText() {
        return getFileDownloadListItem().getText();
    }

    @Override
    public String getFileDownloadHref() {
        return getFileDownloadListItem().getHref();
    }

    private ListItem getFileDownloadListItem() {
        if (fileDownload == null) {
            fileDownload = ListItem.getInstance("File Download", 14, this.getElement());
        }
        return fileDownload;
    }

    @Override
    public String getFileUploadText() {
        return getFileUploadListItem().getText();
    }

    @Override
    public String getFileUploadHref() {
        return getFileUploadListItem().getHref();
    }


    private ListItem getFileUploadListItem() {
        if (fileUpload == null) {
            fileUpload = ListItem.getInstance("File Upload", 15, this.getElement());
        }
        return fileUpload;
    }

    @Override
    public String getFloatingMenuText() {
        return getFloatingMenuListItem().getText();
    }

    @Override
    public String getFloatingMenuHref() {
        return getFloatingMenuListItem().getHref();
    }

    private ListItem getFloatingMenuListItem() {
        if (floatingMenu == null) {
            floatingMenu = ListItem.getInstance("Floating Menu", 16, this.getElement());
        }
        return floatingMenu;
    }

    @Override
    public String getForgotPasswordText() {
        return getForgotPasswordListItem().getText();
    }

    @Override
    public String getForgotPasswordHref() {
        return getForgotPasswordListItem().getHref();
    }

    private ListItem getForgotPasswordListItem() {
        if (forgotPassword == null) {
            forgotPassword = ListItem.getInstance("Forgot Password", 17, this.getElement());
        }
        return forgotPassword;
    }

    @Override
    public String getFormAuthenticationText() {
        return getFormAuthenticationListItem().getText();
    }

    @Override
    public String getFormAuthenticationHref() {
        return getFormAuthenticationListItem().getHref();
    }

    private ListItem getFormAuthenticationListItem() {
        if (formAuthentication == null) {
            formAuthentication = ListItem.getInstance("Form Authentication", 18, this.getElement());
        }
        return formAuthentication;
    }

    @Override
    public String getFramesText() {
        return getFramesListItem().getText();
    }

    @Override
    public String getFramesHref() {
        return getFramesListItem().getHref();
    }

    private ListItem getFramesListItem() {
        if (frames == null) {
            frames = ListItem.getInstance("Frames", 19, this.getElement());
        }
        return frames;
    }

    @Override
    public String getHorizontalSliderText() {
        return getHorizontalSliderListItem().getText();
    }

    @Override
    public String getHorizontalSliderHref() {
        return getHorizontalSliderListItem().getHref();
    }

    private ListItem getHorizontalSliderListItem() {
        if (horizontalSlider == null) {
            horizontalSlider = ListItem.getInstance("Horizontal Slider", 21, this.getElement());
        }
        return horizontalSlider;
    }

    @Override
    public String getHoversText() {
        return getHoversListItem().getText();
    }

    @Override
    public String getHoversHref() {
        return getHoversListItem().getHref();
    }

    private ListItem getHoversListItem() {
        if (hovers == null) {
            hovers = ListItem.getInstance("Hovers", 22, this.getElement());
        }
        return hovers;
    }

    @Override
    public String getInfiniteScrollText() {
        return getInfiniteScrollListItem().getText();
    }

    @Override
    public String getInfiniteScrollHref() {
        return getInfiniteScrollListItem().getHref();
    }

    private ListItem getInfiniteScrollListItem() {
        if (infiniteScroll == null) {
            infiniteScroll = ListItem.getInstance("Infinite Scroll", 23, this.getElement());
        }
        return infiniteScroll;
    }

    @Override
    public String getJqueryUiMenusText() {
        return getJqueryUiMenusListItem().getText();
    }

    @Override
    public String getJqueryUiMenusHref() {
        return getJqueryUiMenusListItem().getHref();
    }

    private ListItem getJqueryUiMenusListItem() {
        if (jqueryUiMenus == null) {
            jqueryUiMenus = ListItem.getInstance("JQuery Ui Menus", 24, this.getElement());
        }
        return jqueryUiMenus;
    }

    @Override
    public String getJavaScriptAlertsText() {
        return getJavaScriptAlertsListItem().getText();
    }

    @Override
    public String getJavaScriptAlertsHref() {
        return getJavaScriptAlertsListItem().getHref();
    }

    private ListItem getJavaScriptAlertsListItem() {
        if (javascriptAlerts == null) {
            javascriptAlerts = ListItem.getInstance("JavaScript Alerts", 25, this.getElement());
        }
        return javascriptAlerts;
    }

    @Override
    public String getJavaScriptOnLoadEventErrorText() {
        return getJavaScriptOnLoadEventErrorListItem().getText();
    }

    @Override
    public String getJavaScriptOnLoadEventErrorHref() {
        return getJavaScriptOnLoadEventErrorListItem().getHref();
    }

    private ListItem getJavaScriptOnLoadEventErrorListItem() {
        if (javascriptOnLoadEventError == null) {
            javascriptOnLoadEventError = ListItem.getInstance("JavaScript On Load Event Error", 26, this.getElement());
        }
        return javascriptOnLoadEventError;
    }

    @Override
    public String getKeyPressesText() {
        return getKeyPressesListItem().getText();
    }

    @Override
    public String getKeyPressesHref() {
        return getKeyPressesListItem().getHref();
    }

    private ListItem getKeyPressesListItem() {
        if (keyPresses == null) {
            keyPresses = ListItem.getInstance("Key Presses", 27, this.getElement());
        }
        return keyPresses;
    }

    @Override
    public String getLargeAndDeepDomText() {
        return getLargeAndDeepDomListItem().getText();
    }

    @Override
    public String getLargeAndDeepDomHref() {
        return getLargeAndDeepDomListItem().getHref();
    }

    private ListItem getLargeAndDeepDomListItem() {
        if (largeAndDeepDom == null) {
            largeAndDeepDom = ListItem.getInstance("Large And Deep Dom", 28, this.getElement());
        }
        return largeAndDeepDom;
    }

    @Override
    public String getMultipleWindowsText() {
        return getMultipleWindowsListItem().getText();
    }

    @Override
    public String getMultipleWindowsHref() {
        return getMultipleWindowsListItem().getHref();
    }

    private ListItem getMultipleWindowsListItem() {
        if (multipleWindows == null) {
            multipleWindows = ListItem.getInstance("Multiple Windows", 29, this.getElement());
        }
        return multipleWindows;
    }

    @Override
    public String getNestedFramesText() {
        return getNestedFramesListItem().getText();
    }

    @Override
    public String getNestedFramesHref() {
        return getNestedFramesListItem().getHref();
    }

    private ListItem getNestedFramesListItem() {
        if (nestedFrames == null) {
            nestedFrames = ListItem.getInstance("Nested Frames", 30, this.getElement());
        }
        return nestedFrames;
    }

    @Override
    public String getNotificationMessagesText() {
        return getNotificationMessagesListItem().getText();
    }

    @Override
    public String getNotificationMessagesHref() {
        return getNotificationMessagesListItem().getHref();
    }

    private ListItem getNotificationMessagesListItem() {
        if (notificationMessages == null) {
            notificationMessages = ListItem.getInstance("Notification Messages", 31, this.getElement());
        }
        return notificationMessages;
    }

    @Override
    public String getRedirectLinkText() {
        return getRedirectLinkListItem().getText();
    }

    @Override
    public String getRedirectLinkHref() {
        return getRedirectLinkListItem().getHref();
    }

    private ListItem getRedirectLinkListItem() {
        if (redirectLink == null) {
            redirectLink = ListItem.getInstance("Redirect Link", 32, this.getElement());
        }
        return redirectLink;
    }

    @Override
    public String getSecureFileDownloadText() {
        return getSecureFileDownloadListItem().getText();
    }

    @Override
    public String getSecureFileDownloadHref() {
        return getSecureFileDownloadListItem().getHref();
    }

    private ListItem getSecureFileDownloadListItem() {
        if (secureFileDownload == null) {
            secureFileDownload = ListItem.getInstance("Secure File Download", 33, this.getElement());
        }
        return secureFileDownload;
    }

    @Override
    public String getShiftingContentText() {
        return getShiftingContentListItem().getText();
    }

    @Override
    public String getShiftingContentHref() {
        return getShiftingContentListItem().getHref();
    }

    private ListItem getShiftingContentListItem() {
        if (shiftingContent == null) {
            shiftingContent = ListItem.getInstance("Shifting Content", 34, this.getElement());
        }
        return shiftingContent;
    }

    @Override
    public String getSlowResourcesText() {
        return getSlowResourcesListItem().getText();
    }

    @Override
    public String getSlowResourcesHref() {
        return getSlowResourcesListItem().getHref();
    }

    private ListItem getSlowResourcesListItem() {
        if (slowResources == null) {
            slowResources = ListItem.getInstance("Slow Resources", 35, this.getElement());
        }
        return slowResources;
    }

    @Override
    public String getSortableDataTablesText() {
        return getSortableDataTablesListItem().getText();
    }

    @Override
    public String getSortableDataTablesHref() {
        return getSortableDataTablesListItem().getHref();
    }

    private ListItem getSortableDataTablesListItem() {
        if (sortableDataTables == null) {
            sortableDataTables = ListItem.getInstance("Sortable Data Tables", 36, this.getElement());
        }
        return sortableDataTables;
    }

    @Override
    public String getStatusCodesText() {
        return getStatusCodesListItem().getText();
    }

    @Override
    public String getStatusCodesHref() {
        return getStatusCodesListItem().getHref();
    }

    private ListItem getStatusCodesListItem() {
        if (statusCodes == null) {
            statusCodes = ListItem.getInstance("Status Codes", 37, this.getElement());
        }
        return statusCodes;
    }

    @Override
    public String getTyposText() {
        return getTyposListItem().getText();
    }

    @Override
    public String getTyposHref() {
        return getTyposListItem().getHref();
    }

    private ListItem getTyposListItem() {
        if (typos == null) {
            typos = ListItem.getInstance("Typos", 38, this.getElement());
        }
        return typos;
    }

    @Override
    public String getWysiwygEditorText() {
        return getWysiwygEditorListItem().getText();
    }

    @Override
    public String getWysiwygEditorHref() {
        return getWysiwygEditorListItem().getHref();
    }

    private ListItem getWysiwygEditorListItem() {
        if (wysiwygEditor == null) {
            wysiwygEditor = ListItem.getInstance("Wysiwyg Editor", 39, this.getElement());
        }
        return wysiwygEditor;
    }

    @Override
    public String getDynamicControlsText() {
        return getDynamicControlsListItem().getText();
    }

    @Override
    public String getDynamicControlsHref() {
        return getDynamicControlsListItem().getHref();
    }

    private ListItem getDynamicControlsListItem() {
        if (dynamicControls == null) {
            dynamicControls = ListItem.getInstance("Dynamic Controls", 11, this.getElement());
        }
        return dynamicControls;
    }

    @Override
    public String getGeolocationText() {
        return getGeolocationListItem().getText();
    }

    @Override
    public String getGeolocationHref() {
        return getGeolocationListItem().getHref();
    }

    private ListItem getGeolocationListItem() {
        if (geolocation == null) {
            geolocation = ListItem.getInstance("Geolocation", 20, this.getElement());
        }
        return geolocation;
    }
}
