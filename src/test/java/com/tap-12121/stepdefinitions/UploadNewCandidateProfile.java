package com.tap-12121.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap-12121.pages.UploadNewCandidateProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class UploadNewCandidateProfile extends DriverFactory {
UploadNewCandidateProfilePage uploadNewCandidateProfilePage = new UploadNewCandidateProfilePage(driver);
@Given("the user is on the Profile section")
public void the_user_is_on_the_profile_section() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
@When("the user clicks on the upload (cloud) icon")
public void the_user_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user browses and selects a valid candidate profile file {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file(String valid_candidate_profile_file) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(valid_candidate_profile_file);
}
@When("the user clicks on the Upload button")
public void the_user_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the user waits for the upload process to complete")
public void the_user_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@Then("the user should see a success confirmation message")
public void the_user_should_see_a_success_confirmation_message() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@Then("the uploaded profile should appear in the candidate list")
public void the_uploaded_profile_should_appear_in_the_candidate_list() {
uploadNewCandidateProfilePage.isProfileDisplayedInCandidateList();
}
@When("the recruiter clicks on the upload icon")
public void the_recruiter_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the recruiter browses and selects the {string}")
public void the_recruiter_browses_and_selects_the_candidate_profile_file(String candidate_profile_file) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidate_profile_file);
}
@When("the recruiter waits for the upload to complete and confirms success")
public void the_recruiter_waits_for_the_upload_to_complete_and_confirms_success() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@Then("{string} profile should be uploaded successfully with a confirmation message")
public void profile_should_be_uploaded_successfully_with_a_confirmation_message(String profile_number) {
uploadNewCandidateProfilePage.isProfileUploadedSuccessfully(profile_number);
}
@When("the user browses and selects a candidate profile file with a long filename {string}")
public void the_user_browses_and_selects_a_candidate_profile_file_with_a_long_filename(String long_filename) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(long_filename);
}
@When("the user browses and selects a valid candidate profile file in {string} format")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_in_format(String file_format) {
uploadNewCandidateProfilePage.selectCandidateProfileFile("valid_candidate_profile." + file_format.toLowerCase());
}
@When("the user browses and selects the candidate profile file {string} with spaces")
public void the_user_browses_and_selects_the_candidate_profile_file_with_spaces(String file_name) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(file_name);
}
@When("the user browses and selects a candidate profile file with underscores in the filename {string}")
public void the_user_browses_and_selects_a_candidate_profile_file_with_underscores_in_the_filename(String filename) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(filename);
}
@When("the user browses and selects the candidate profile file {string} with dashes")
public void the_user_browses_and_selects_the_candidate_profile_file_with_dashes(String file_name) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(file_name);
}

@Then("both profiles should appear in the candidate list")
public void both_profiles_should_appear_in_the_candidate_list() {
uploadNewCandidateProfilePage.areBothProfilesDisplayed();
}
@When("the user browses selects a valid candidate profile file")
public void the_user_browses_selects_a_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFile();
}
@When("the user browses selects a valid candidate profile file in pdf format")
public void the_user_browses_selects_a_valid_candidate_profile_file_in_pdf_format() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileInPdf();
}
@When("the user browses selects the candidate profile file {string}")
public void the_user_browses_selects_the_candidate_profile_file(String fileName) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(fileName);
}
@When("the user browses selects a valid candidate profile file in docx format")
public void the_user_browses_selects_a_valid_candidate_profile_file_in_docx_format() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileInDocx();
}
@When("the recruiter clicks on the upload button")
public void the_recruiter_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the user browses selects a candidate profile file with a long filename")
public void the_user_browses_selects_a_candidate_profile_file_with_a_long_filename() {
uploadNewCandidateProfilePage.selectCandidateProfileFileWithLongFilename();
}
@Then("a success confirmation message is displayed")
public void a_success_confirmation_message_is_displayed() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@Then("the {string} profile should be uploaded successfully with a confirmation message")
public void the_profile_should_be_uploaded_successfully_with_a_confirmation_message(String profileName) {
uploadNewCandidateProfilePage.isProfileUploadedSuccessfully(profileName);
}
@When("the user browses selects a candidate profile file with underscores in the filename")
public void the_user_browses_selects_a_candidate_profile_file_with_underscores_in_the_filename() {
uploadNewCandidateProfilePage.selectCandidateProfileFileWithUnderscores();
}
@Then("the uploaded profile appears in the candidate list")
public void the_uploaded_profile_appears_in_the_candidate_list() {
uploadNewCandidateProfilePage.isUploadedProfileDisplayed();
}
}