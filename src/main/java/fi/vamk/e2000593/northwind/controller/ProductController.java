package fi.vamk.e2000593.northwind.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fi.vamk.e2000593.northwind.entity.Products;
import fi.vamk.e2000593.northwind.service.ProductService;

public class ProductController {
    @Autowired
    public ProductService productService;

    @GetMapping("")
    public ResponseEntity<List<Products>> getAllProducts(){
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Products> getProductById(@PathVariable(value = "id") Integer id){
        return productService.getProductById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Products> updateProductById(@PathVariable(value = "id") Integer id, @RequestBody Products product){
        return productService.updateProductById(id,product);
    }

    @PostMapping("")
    public ResponseEntity<Products> createProduct(@RequestBody Products product){
        return productService.createProduct(product);
    }
}
