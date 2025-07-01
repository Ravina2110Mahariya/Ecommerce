# Ecommerce
# 🛍️ E-commerce Spring Boot Project

This is a simple eCommerce web application built with **Spring Boot**, **Spring MVC**, **Thymeleaf**, **Bootstrap**, and **MySQL**.  
It supports product listing, add to cart functionality, and a basic order flow.

---

## 🚀 Features

- 🛒 Display products with image, price, and description
- ➕ Add to cart functionality
- 🛍️ View cart items
- ✅ Place order (basic implementation)
- 🔐 Admin panel to add/manage products (CRUD operations)
- 📂 Category-wise product view (optional)
- 🌐 Responsive frontend using Bootstrap
- 🔒 Spring Security for admin login (optional)

---

## 🛠 Tech Stack

- Java 17+ / 21  
- Spring Boot  
- Spring MVC  
- Thymeleaf  
- MySQL  
- Bootstrap 5 (for frontend design)

---
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=root
spring.datasource.password=2110@
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=1001

src/main/java
 └── com.ecommerce
      ├── controller
      ├── model
      ├── repository
      ├── service
      └── EcommerceApplication.java
src/main/resources
 ├── static/ (CSS, JS, images)
 ├── templates/ (Thymeleaf templates)
 └── application.properties


