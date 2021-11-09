package com.example.orderservice.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Customer {
  private String id;

  public Customer() {
  }

  public Customer(String id) {
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
    return "Customer{" + "id='" + id + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer that = (Customer) o;
        return java.util.Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id);
  }

  public static com.example.orderservice.generated.types.Customer.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    public Customer build() {
      com.example.orderservice.generated.types.Customer result = new com.example.orderservice.generated.types.Customer();
          result.id = this.id;
          return result;
    }

    public com.example.orderservice.generated.types.Customer.Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
