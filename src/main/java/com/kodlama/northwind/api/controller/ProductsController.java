package com.kodlama.northwind.api.controller;

import com.kodlama.northwind.bussines.abstractss.ProductService;
import com.kodlama.northwind.core.utilities.results.DataResult;
import com.kodlama.northwind.core.utilities.results.Result;
import com.kodlama.northwind.entities.concretes.Product;
import com.kodlama.northwind.entities.dtos.ProductWithCategoryDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
@CrossOrigin
public class ProductsController {

    private ProductService productService;

    @GetMapping("/getAll")
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return this.productService.add(product);
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName){
        return this.productService.getByProductName(productName);
    }

    @GetMapping("/getByProductNameAndCategory")
    public DataResult <Product> getByProductNameAndCategory_CategoryId(@RequestParam("productName") String productName, @RequestParam("categoryId") int categoryId){
        return this.productService.getByProductNameAndCategory_CategoryId(productName, categoryId);
    }

    @GetMapping("/getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
        return this.productService.getByProductNameContains(productName);
    }

    @GetMapping("/getAllPage")
    public DataResult<List<Product>> getAll(int pageNo, int pageSize){
        return this.productService.getAll(pageNo,pageSize);
    }

    @GetMapping("/getAllDesc")
    public DataResult<List<Product>> getAllSorted(){
        return this.productService.getAllSorted();
    }

    @GetMapping("/getProductWithCategoryDetails")
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails(){
        return this.productService.getProductWithCategoryDetails();
    }
}
