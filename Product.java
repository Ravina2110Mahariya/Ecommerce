/*
 * package com.Ecommerce.model;
 * 
 * import jakarta.persistence.*;
 * 
 * @Entity public class Product {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 * 
 * private String name; private String description; private double price;
 * private String imageUrl; public Long getId() { // TODO Auto-generated method
 * stub return null; } public double getPrice() { // TODO Auto-generated method
 * stub return 0; }
 * 
 * }
 * 
 */


/*
 * package com.Ecommerce.model;
 * 
 * import jakarta.persistence.*;
 * 
 * @Entity public class Product {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 * 
 * private String name; private String description; private double price;
 * private String imageUrl;
 * 
 * // ✅ Default constructor (Hibernate के लिए ज़रूरी) public Product() { }
 * 
 * // ✅ Parameterized constructor (MainController में static products बनाने के
 * लिए) public Product(Long id, String name, String description, double price,
 * String imageUrl) { this.id = id; this.name = name; this.description =
 * description; this.price = price; this.imageUrl = imageUrl; }
 * 
 * // ✅ Getters public Long getId() { return id; }
 * 
 * public String getName() { return name; }
 * 
 * public String getDescription() { return description; }
 * 
 * public double getPrice() { return price; }
 * 
 * public String getImageUrl() { return imageUrl; }
 * 
 * // ✅ Setters (अगर ज़रूरत हो) public void setId(Long id) { this.id = id; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public void setDescription(String description) { this.description =
 * description; }
 * 
 * public void setPrice(double price) { this.price = price; }
 * 
 * public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; } }
 */

package com.Ecommerce.model;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;
    private String imageUrl;

    public Product() {}

    public Product(Long id, String name, String description, double price, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}







