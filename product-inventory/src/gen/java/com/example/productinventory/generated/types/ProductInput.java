package com.example.productinventory.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class ProductInput {
  private String name;

  private double cost;

  private ProductType type;

  public ProductInput() {
  }

  public ProductInput(String name, double cost, ProductType type) {
    this.name = name;
    this.cost = cost;
    this.type = type;
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

  public String toString() {
    return "{" + "name:" + (name != null?"\"":"") + name + (name != null?"\"":"") + "," +"cost:" + cost + "," +"type:" + type + "" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductInput that = (ProductInput) o;
        return java.util.Objects.equals(name, that.name) &&
                            cost == that.cost &&
                            java.util.Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, cost, type);
  }

  public static com.example.productinventory.generated.types.ProductInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String name;

    private double cost;

    private ProductType type;

    public ProductInput build() {
                  com.example.productinventory.generated.types.ProductInput result = new com.example.productinventory.generated.types.ProductInput();
                      result.name = this.name;
          result.cost = this.cost;
          result.type = this.type;
                      return result;
    }

    public com.example.productinventory.generated.types.ProductInput.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.example.productinventory.generated.types.ProductInput.Builder cost(double cost) {
      this.cost = cost;
      return this;
    }

    public com.example.productinventory.generated.types.ProductInput.Builder type(
        ProductType type) {
      this.type = type;
      return this;
    }
  }
}
