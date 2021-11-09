package com.example.customerservice.generated;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static class CUSTOMER {
    public static final String TYPE_NAME = "Customer";

    public static final String Id = "id";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String EmailId = "emailId";

    public static final String ProfilePicURL = "profilePicURL";
  }

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String GetCustomerById = "getCustomerById";
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String AddCustomer = "addCustomer";

    public static final String UpdateCustomer = "updateCustomer";
  }

  public static class CUSTOMERINPUT {
    public static final String TYPE_NAME = "CustomerInput";

    public static final String FirstName = "firstName";

    public static final String LastName = "lastName";

    public static final String EmailId = "emailId";

    public static final String ProfilePicURL = "profilePicURL";
  }
}
