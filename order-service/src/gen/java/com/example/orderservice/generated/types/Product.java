package com.example.orderservice.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Product {
  private String id;

  public Product() {
  }

  public Product(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Product{" + "id='" + id + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return java.util.Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id);
  }

  public static com.example.orderservice.generated.types.Product.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    public Product build() {
      com.example.orderservice.generated.types.Product result = new com.example.orderservice.generated.types.Product();
          result.id = this.id;
          return result;
    }

    public com.example.orderservice.generated.types.Product.Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
