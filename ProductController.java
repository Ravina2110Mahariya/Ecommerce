package Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ecommerce.model.Product;
import Ecommerce.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {
	
  @Autowired private ProductRepository repo;

  
  @GetMapping 
  public List<Product> getAll() { 
	  return repo.findAll(); 
	  }

  @PostMapping
  public Product add(@RequestBody Product p) { 
	  return repo.save(p); 
	  }

  @DeleteMapping("/{id}") 
  public void delete(@PathVariable Long id) { 
	  repo.deleteById(id); 
	  }
}


