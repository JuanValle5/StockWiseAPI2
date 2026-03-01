package com.JuanValencia.StockWiseAPI.repository;

import com.JuanValencia.StockWiseAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
