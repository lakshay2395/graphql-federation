package com.example.orderservice.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class OrderInput {
  private String customerId;

  private OrderStatus status;

  private List<String> productIds;

  public OrderInput() {
  }

  public OrderInput(String customerId, OrderStatus status, List<String> productIds) {
    this.customerId = customerId;
    this.status = status;
    this.productIds = productIds;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }

  private String serializeListOfString(List<String> inputList) {
    if (inputList == null) {
            return null;
        }
        StringBuilder builder = new java.lang.StringBuilder();
        builder.append("[");

        if (! inputList.isEmpty()) {
            String result = inputList.stream()
                    .map( iter -> iter.toString() )
                    .collect(java.util.stream.Collectors.joining("\", \"", "\"", "\""));
            builder.append(result);
        }
        builder.append("]");
        return  builder.toString();
  }

  public String toString() {
    return "{" + "customerId:" + (customerId != null?"\"":"") + customerId + (customerId != null?"\"":"") + "," +"status:" + status + "," +"productIds:" + serializeListOfString(productIds) + "" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderInput that = (OrderInput) o;
        return java.util.Objects.equals(customerId, that.customerId) &&
                            java.util.Objects.equals(status, that.status) &&
                            java.util.Objects.equals(productIds, that.productIds);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(customerId, status, productIds);
  }

  public static com.example.orderservice.generated.types.OrderInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String customerId;

    private OrderStatus status;

    private List<String> productIds;

    public OrderInput build() {
                  com.example.orderservice.generated.types.OrderInput result = new com.example.orderservice.generated.types.OrderInput();
                      result.customerId = this.customerId;
          result.status = this.status;
          result.productIds = this.productIds;
                      return result;
    }

    public com.example.orderservice.generated.types.OrderInput.Builder customerId(
        String customerId) {
      this.customerId = customerId;
      return this;
    }

    public com.example.orderservice.generated.types.OrderInput.Builder status(OrderStatus status) {
      this.status = status;
      return this;
    }

    public com.example.orderservice.generated.types.OrderInput.Builder productIds(
        List<String> productIds) {
      this.productIds = productIds;
      return this;
    }
  }
}
