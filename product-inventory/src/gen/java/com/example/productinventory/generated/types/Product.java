package com.example.productinventory.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Product {
  private String id;

  private String name;

  private double cost;

  private ProductType type;

  public Product() {
  }

  public Product(String id, String name, double cost, ProductType type) {
    this.id = id;
    this.name = name;
    this.cost = cost;
    this.type = type;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public ProductType getType() {
    return type;
  }

  public void setType(ProductType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Product{" + "id='" + id + "'," +"name='" + name + "'," +"cost='" + cost + "'," +"type='" + type + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(name, that.name) &&
                            cost == that.cost &&
                            java.util.Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, cost, type);
  }

  public static com.example.productinventory.generated.types.Product.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String name;

    private double cost;

    private ProductType type;

    public Product build() {
                  com.example.productinventory.generated.types.Product result = new com.example.productinventory.generated.types.Product();
                      result.id = this.id;
          result.name = this.name;
          result.cost = this.cost;
          result.type = this.type;
                      return result;
    }

    public com.example.productinventory.generated.types.Product.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.example.productinventory.generated.types.Product.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.example.productinventory.generated.types.Product.Builder cost(double cost) {
      this.cost = cost;
      return this;
    }

    public com.example.productinventory.generated.types.Product.Builder type(ProductType type) {
      this.type = type;
      return this;
    }
  }
}
