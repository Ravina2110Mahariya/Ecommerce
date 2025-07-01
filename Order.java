package com.Ecommerce.model;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String address;
    private String phone;
    private double totalAmount;

    // 🟢 Default constructor (Hibernate ke liye zaroori hota hai)
    public Order() {}

    // 🟢 Custom constructor (jo aap controller me use kar rahe ho)
    public Order(String customerName, String address, String phone, double totalAmount) {
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
        this.totalAmount = totalAmount;
    }

    // ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
