package com.example.customerservice.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Customer {
  private String id;

  private String firstName;

  private String lastName;

  private String emailId;

  private String profilePicURL;

  public Customer() {
  }

  public Customer(String id, String firstName, String lastName, String emailId,
      String profilePicURL) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailId = emailId;
    this.profilePicURL = profilePicURL;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  @Override
  public String toString() {
    return "Customer{" + "id='" + id + "'," +"firstName='" + firstName + "'," +"lastName='" + lastName + "'," +"emailId='" + emailId + "'," +"profilePicURL='" + profilePicURL + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer that = (Customer) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(firstName, that.firstName) &&
                            java.util.Objects.equals(lastName, that.lastName) &&
                            java.util.Objects.equals(emailId, that.emailId) &&
                            java.util.Objects.equals(profilePicURL, that.profilePicURL);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, firstName, lastName, emailId, profilePicURL);
  }

  public static com.example.customerservice.generated.types.Customer.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String firstName;

    private String lastName;

    private String emailId;

    private String profilePicURL;

    public Customer build() {
                  com.example.customerservice.generated.types.Customer result = new com.example.customerservice.generated.types.Customer();
                      result.id = this.id;
          result.firstName = this.firstName;
          result.lastName = this.lastName;
          result.emailId = this.emailId;
          result.profilePicURL = this.profilePicURL;
                      return result;
    }

    public com.example.customerservice.generated.types.Customer.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.example.customerservice.generated.types.Customer.Builder firstName(
        String firstName) {
      this.firstName = firstName;
      return this;
    }

    public com.example.customerservice.generated.types.Customer.Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public com.example.customerservice.generated.types.Customer.Builder emailId(String emailId) {
      this.emailId = emailId;
      return this;
    }

    public com.example.customerservice.generated.types.Customer.Builder profilePicURL(
        String profilePicURL) {
      this.profilePicURL = profilePicURL;
      return this;
    }
  }
}
