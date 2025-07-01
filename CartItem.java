/*
 * package com.Ecommerce.model;
 * 
 * public class CartItem { private Long productId; private double name; private
 * double price; private int quantity;
 * 
 * // Constructor public CartItem(Long productId, double d, double price) {
 * this.productId = productId; this.name = d; this.price = price; this.quantity
 * = 1; // default quantity }
 * 
 * // Getter methods public Long getProductId() { return productId; }
 * 
 * public double getName() { return name; }
 * 
 * public double getPrice() { return price; }
 * 
 * public int getQuantity() { return quantity; }
 * 
 * // Setter methods public void setQuantity(int quantity) { this.quantity =
 * quantity; }
 * 
 * public void setPrice(double price) { this.price = price; } }
 */



package com.Ecommerce.model;

public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getSubtotal() {
        return this.product.getPrice() * this.quantity;
    }
}
