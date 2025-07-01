package Ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/products")
    public String productsPage() {
        return "products"; // → This should match products.html in templates
    }

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/cart")
    public String cartPage() {
        return "cart";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }

    @GetMapping("/checkout")
    public String checkoutPage() {
        return "checkout";
    }

}
