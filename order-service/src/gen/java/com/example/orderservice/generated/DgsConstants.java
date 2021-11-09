package com.example.orderservice.generated;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static class PRODUCT {
    public static final String TYPE_NAME = "Product";

    public static final String Id = "id";
  }

  public static class CUSTOMER {
    public static final String TYPE_NAME = "Customer";

    public static final String Id = "id";
  }

  public static class ORDER {
    public static final String TYPE_NAME = "Order";

    public static final String Id = "id";

    public static final String Customer = "customer";

    public static final String Status = "status";

    public static final String Products = "products";
  }

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String GetOrderById = "getOrderById";
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String AddOrder = "addOrder";
  }

  public static class ORDERINPUT {
    public static final String TYPE_NAME = "OrderInput";

    public static final String CustomerId = "customerId";

    public static final String Status = "status";

    public static final String ProductIds = "productIds";
  }
}
