
@feature_upload_new_candidate_profile
Feature: UploadNewCandidateProfile

  Background: 
    Given the user is on the Profile section

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid candidate profile file
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user should see a success confirmation message
    And the uploaded profile should appear in the candidate list

  Examples:
    | valid_candidate_profile_file |
    | valid_candidate_profile.pdf   |
    | valid_candidate_profile.docx  |

@multiple-valid-uploads
Scenario Outline: Upload New Candidate Profile
  When the recruiter clicks on the upload icon
  And the recruiter browses and selects the <candidate_profile_file>
  And the recruiter clicks on the Upload button
  And the recruiter waits for the upload to complete and confirms success
  Then the <profile_number> profile should be uploaded successfully with a confirmation message

Examples:
  | candidate_profile_file               | profile_number |
  | first valid candidate profile file   | first          |
  | second valid candidate profile file   | second         |

Then both profiles should appear in the candidate list

@valid-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects a valid candidate profile file in PDF format
  And the user clicks on the Upload button
  And the user waits for the upload process to complete
  Then a success confirmation message is displayed
  And the uploaded profile appears in the candidate list

Examples:
  | file_format |
  | PDF         |

@verify_long_filename_upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects a candidate profile file with a long filename
  And the user clicks on the Upload button
  Then a success confirmation message is displayed
  And the uploaded profile appears in the candidate list

Examples:
  | long_filename                                           |
  | This_is_a_very_long_filename_for_a_candidate_profile_document.pdf |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid candidate profile file in DOCX format
    And the user clicks on the Upload button
    Then a success confirmation message is displayed
    And the uploaded profile appears in the candidate list

  Examples:
    | file_format |
    | DOCX        |

  @upload-profile-with-spaces
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects the candidate profile file "<file_name>"
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user should see a success confirmation message
    And the uploaded profile should appear in the candidate list

    Examples:
      | file_name                  |
      | John Doe Resume.pdf        |

  @upload-candidate-profile
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file with underscores in the filename
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed
    And the uploaded profile appears in the candidate list

  Examples:
    | filename                     |
    | John_Doe_Resume.pdf         |

  @upload_success
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects the candidate profile file "<file_name>"
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user should see a success confirmation message
    And the uploaded profile should appear in the candidate list

    Examples:
      | file_name                  |
      | John-Doe-Resume.pdf       |
