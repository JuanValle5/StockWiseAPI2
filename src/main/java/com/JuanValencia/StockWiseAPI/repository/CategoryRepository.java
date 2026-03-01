package com.JuanValencia.StockWiseAPI.repository;

import com.JuanValencia.StockWiseAPI.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//No se necesita la anotacion @Reposiyory
public interface CategoryRepository extends JpaRepository<Category,Long> {

    //Encontrar categoria por nombre, validó al tener un index unique
    Optional<Category> findByName(String name);
}
