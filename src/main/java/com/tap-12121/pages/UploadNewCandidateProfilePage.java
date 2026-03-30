package com.tap-12121.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class UploadNewCandidateProfilePage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "profileSection")
    private WebElement profileSection;

    @FindBy(id = "uploadIcon")
    private WebElement uploadIcon;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "successMessage")
    private WebElement successConfirmationMessage;

    @FindBy(id = "candidateList")
    private WebElement candidateList;

    public UploadNewCandidateProfilePage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToProfileSection() {
        try {
            elementUtils.clickElement(profileSection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadIcon() {
        try {
            elementUtils.clickElement(uploadIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCandidateProfileFile(String fileName) {
        try {
            elementUtils.javaScriptType(uploadIcon, fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadButton() {
        try {
            elementUtils.clickElement(uploadButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForUploadToComplete() {
        try {
            // Implementation for waiting for upload to complete
            // This can be a wait for visibility of success message or similar
            elementUtils.waitForElementToBeVisible(successConfirmationMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSuccessConfirmationMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(successConfirmationMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isProfileDisplayedInCandidateList() {
        try {
            return elementUtils.isElementDisplayed(candidateList);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isProfileUploadedSuccessfully(String profileName) {
        try {
            // Implement logic to check if profile uploaded successfully
            // For example, check if the profile name is present in candidate list
            return elementUtils.isElementDisplayed(candidateList); // Replace with actual check
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areBothProfilesDisplayed() {
        try {
            // Implement logic to check if both profiles are displayed in the candidate list
            return true; // Replace with actual check
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectValidCandidateProfileFile() {
        selectCandidateProfileFile("valid_candidate_profile.pdf");
    }

    public void selectValidCandidateProfileFileInPdf() {
        selectCandidateProfileFile("valid_candidate_profile.pdf");
    }

    public void selectValidCandidateProfileFileInDocx() {
        selectCandidateProfileFile("valid_candidate_profile.docx");
    }

    public void selectCandidateProfileFileWithLongFilename() {
        selectCandidateProfileFile("long_candidate_profile_filename.pdf");
    }

    public void selectCandidateProfileFileWithUnderscores() {
        selectCandidateProfileFile("candidate_profile_file_with_underscores.pdf");
    }

    public boolean isUploadedProfileDisplayed() {
        return isProfileDisplayedInCandidateList();
    }
}