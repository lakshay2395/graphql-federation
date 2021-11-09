package com.example.customerservice.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class CustomerInput {
  private String firstName;

  private String lastName;

  private String emailId;

  private String profilePicURL;

  public CustomerInput() {
  }

  public CustomerInput(String firstName, String lastName, String emailId, String profilePicURL) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailId = emailId;
    this.profilePicURL = profilePicURL;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public String getProfilePicURL() {
    return profilePicURL;
  }

  public void setProfilePicURL(String profilePicURL) {
    this.profilePicURL = profilePicURL;
  }

  public String toString() {
    return "{" + "firstName:" + (firstName != null?"\"":"") + firstName + (firstName != null?"\"":"") + "," +"lastName:" + (lastName != null?"\"":"") + lastName + (lastName != null?"\"":"") + "," +"emailId:" + (emailId != null?"\"":"") + emailId + (emailId != null?"\"":"") + "," +"profilePicURL:" + (profilePicURL != null?"\"":"") + profilePicURL + (profilePicURL != null?"\"":"") + "" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerInput that = (CustomerInput) o;
        return java.util.Objects.equals(firstName, that.firstName) &&
                            java.util.Objects.equals(lastName, that.lastName) &&
                            java.util.Objects.equals(emailId, that.emailId) &&
                            java.util.Objects.equals(profilePicURL, that.profilePicURL);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(firstName, lastName, emailId, profilePicURL);
  }

  public static com.example.customerservice.generated.types.CustomerInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String firstName;

    private String lastName;

    private String emailId;

    private String profilePicURL;

    public CustomerInput build() {
                  com.example.customerservice.generated.types.CustomerInput result = new com.example.customerservice.generated.types.CustomerInput();
                      result.firstName = this.firstName;
          result.lastName = this.lastName;
          result.emailId = this.emailId;
          result.profilePicURL = this.profilePicURL;
                      return result;
    }

    public com.example.customerservice.generated.types.CustomerInput.Builder firstName(
        String firstName) {
      this.firstName = firstName;
      return this;
    }

    public com.example.customerservice.generated.types.CustomerInput.Builder lastName(
        String lastName) {
      this.lastName = lastName;
      return this;
    }

    public com.example.customerservice.generated.types.CustomerInput.Builder emailId(
        String emailId) {
      this.emailId = emailId;
      return this;
    }

    public com.example.customerservice.generated.types.CustomerInput.Builder profilePicURL(
        String profilePicURL) {
      this.profilePicURL = profilePicURL;
      return this;
    }
  }
}
