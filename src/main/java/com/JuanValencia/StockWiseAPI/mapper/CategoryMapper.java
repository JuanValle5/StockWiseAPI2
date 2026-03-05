package com.JuanValencia.StockWiseAPI.mapper;

import com.JuanValencia.StockWiseAPI.dto.category.CategoryRequestDTO;
import com.JuanValencia.StockWiseAPI.dto.category.CategoryResponseDTO;
import com.JuanValencia.StockWiseAPI.model.Category;

public class CategoryMapper {

    public static Category toEntity(CategoryRequestDTO dto) {
        return Category.builder()
                .name(dto.getName())
                .description(dto.getDescription())
                .build();
    }

    public static CategoryResponseDTO toDTO(Category category) {
        return CategoryResponseDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .description(category.getDescription())
                .build();
    }
}
