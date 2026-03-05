package com.JuanValencia.StockWiseAPI.service;

import com.JuanValencia.StockWiseAPI.dto.category.CategoryRequestDTO;
import com.JuanValencia.StockWiseAPI.dto.category.CategoryResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ICategoryService {

    List<CategoryResponseDTO> findAll();

    CategoryResponseDTO findById(Long id);

    CategoryResponseDTO create(CategoryRequestDTO requestDTO);

    CategoryResponseDTO update(Long id, CategoryRequestDTO requestDTO);

    void delete(Long id);
}
