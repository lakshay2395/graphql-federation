package com.example.orderservice.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class Order {
  private String id;

  private Customer customer;

  private OrderStatus status;

  private List<Product> products;

  public Order() {
  }

  public Order(String id, Customer customer, OrderStatus status, List<Product> products) {
    this.id = id;
    this.customer = customer;
    this.status = status;
    this.products = products;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  @Override
  public String toString() {
    return "Order{" + "id='" + id + "'," +"customer='" + customer + "'," +"status='" + status + "'," +"products='" + products + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order that = (Order) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(customer, that.customer) &&
                            java.util.Objects.equals(status, that.status) &&
                            java.util.Objects.equals(products, that.products);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, customer, status, products);
  }

  public static com.example.orderservice.generated.types.Order.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private Customer customer;

    private OrderStatus status;

    private List<Product> products;

    public Order build() {
                  com.example.orderservice.generated.types.Order result = new com.example.orderservice.generated.types.Order();
                      result.id = this.id;
          result.customer = this.customer;
          result.status = this.status;
          result.products = this.products;
                      return result;
    }

    public com.example.orderservice.generated.types.Order.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.example.orderservice.generated.types.Order.Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    public com.example.orderservice.generated.types.Order.Builder status(OrderStatus status) {
      this.status = status;
      return this;
    }

    public com.example.orderservice.generated.types.Order.Builder products(List<Product> products) {
      this.products = products;
      return this;
    }
  }
}
