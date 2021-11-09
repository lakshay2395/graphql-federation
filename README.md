# graphql-federation
Complete end-to-end example of graphql federation using netflix DGS framework 

It consists of three components - 
- Product Inventory Service
- Customer Service
- Order Service 

## System Overview
![Complete System Flow](https://i.ibb.co/RQHWfn7/Screenshot-2021-11-09-at-5-34-21-PM.png) 

## Start the services
- Start the service(s)
```
mvn spring-boot:run
```
- Start the federated gateway
```
nodemon start
```

## Major Queries 
- Add Product(s)
```
mutation AddProduct($productInput0: ProductInput, $productInput1: ProductInput, $productInput2: ProductInput) {
    add0: addProduct(product: $productInput0) {
        id
        name
        type
        cost
    }
    add1: addProduct(product: $productInput1) {
        id
        name
        type
        cost
    }
    add2: addProduct(product: $productInput2) {
        id
        name
        type
        cost
    }
}
```

- Add Customer
```
mutation AddCustomer($customer: CustomerInput){
    addCustomer(customer: $customer){
        id
        firstName
        lastName
        emailId
        profilePicURL
    }
}
```

- Add Order
```
mutation AddOrder($order: OrderInput){
    addOrder(order: $order){
        customer {
            emailId
            firstName
            id
            lastName
            profilePicURL
        }
        id
        products {
            cost
            id
            name
            type
        }
        status
    }
}
```
