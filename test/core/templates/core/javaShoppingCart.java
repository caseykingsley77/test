package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product;
import java.util.Arrays;

public class Order {
    private static int nextOrderID = 1;
    private int orderID;
    private Customer customer;
    private Product[] products;
    private double total;
    
    public Order(Customer customer, Product[] products, double total) {
        this.orderID = nextOrderID++;
        this.customer = customer;
        this.products = products;
        this.total = total;
    }
    
    public String generateOrderSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderID).append("\n");
        sb.append("Customer: ").append(customer.getName()).append("\n");
        sb.append("Products:\n");
        for (Product product : products) {
            sb.append("- ").append(product.getName()).append(": $").append(product.getPrice()).append("\n");
        }
        sb.append("Total: $").append(total);
        return sb.toString();
    }
}
