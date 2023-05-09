package com.kodlama.northwind.bussines.abstractss;

import com.kodlama.northwind.core.utilities.results.DataResult;
import com.kodlama.northwind.core.utilities.results.Result;
import com.kodlama.northwind.entities.concretes.Product;
import com.kodlama.northwind.entities.dtos.ProductWithCategoryDto;

import java.util.List;

public interface ProductService {

    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAll(int pageNo, int pageSize);
    DataResult<List<Product>> getAllSorted();
    Result add(Product product);

    DataResult<Product> getByProductName(String productName);

    DataResult<Product> getByProductNameAndCategory_CategoryId(String productName, int categoryId);

    DataResult<List<Product>> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

    DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);

    DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}
