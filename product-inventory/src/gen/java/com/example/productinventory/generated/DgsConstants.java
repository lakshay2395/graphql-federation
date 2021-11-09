package com.example.productinventory.generated;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static class PRODUCT {
    public static final String TYPE_NAME = "Product";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Cost = "cost";

    public static final String Type = "type";
  }

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String GetProductById = "getProductById";

    public static final String GetProductByType = "getProductByType";
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String AddProduct = "addProduct";

    public static final String UpdateProduct = "updateProduct";
  }

  public static class PRODUCTINPUT {
    public static final String TYPE_NAME = "ProductInput";

    public static final String Name = "name";

    public static final String Cost = "cost";

    public static final String Type = "type";
  }
}
