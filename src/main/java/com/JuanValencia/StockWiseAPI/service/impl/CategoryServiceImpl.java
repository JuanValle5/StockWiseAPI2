package com.JuanValencia.StockWiseAPI.service.impl;


import com.JuanValencia.StockWiseAPI.dto.category.CategoryRequestDTO;
import com.JuanValencia.StockWiseAPI.dto.category.CategoryResponseDTO;
import com.JuanValencia.StockWiseAPI.exception.ResourceNotFoundException;
import com.JuanValencia.StockWiseAPI.mapper.CategoryMapper;
import com.JuanValencia.StockWiseAPI.model.Category;
import com.JuanValencia.StockWiseAPI.repository.CategoryRepository;
import com.JuanValencia.StockWiseAPI.service.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements ICategoryService {

    private final CategoryRepository categoryRepository;


    @Override
    public List<CategoryResponseDTO> findAll() {
        return categoryRepository.findAll()
                .stream()
                .map(CategoryMapper::toDTO)
                .toList();
    }

    @Override
    public CategoryResponseDTO findById(Long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Category not found with id: " + id));

        return CategoryMapper.toDTO(category);
    }

    @Override
    public CategoryResponseDTO create(CategoryRequestDTO requestDTO) {
        Category category = CategoryMapper.toEntity(requestDTO);

        Category savedCategory = categoryRepository.save(category);

        return CategoryMapper.toDTO(savedCategory);
    }

    @Override
    public CategoryResponseDTO update(Long id, CategoryRequestDTO requestDTO) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Category not found with id: " + id));

        category.setName(requestDTO.getName());
        category.setDescription(requestDTO.getDescription());

        Category updatedCategory = categoryRepository.save(category);

        return CategoryMapper.toDTO(updatedCategory);
    }

    @Override
    public void delete(Long id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Category not found with id: " + id));

        categoryRepository.delete(category);
    }
}
