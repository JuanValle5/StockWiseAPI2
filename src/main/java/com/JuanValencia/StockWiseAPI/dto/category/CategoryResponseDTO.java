package com.JuanValencia.StockWiseAPI.dto.category;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryResponseDTO {

    private Long id;
    private String name;
    private String description;

}
