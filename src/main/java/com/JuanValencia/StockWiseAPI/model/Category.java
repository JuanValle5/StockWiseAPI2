package com.JuanValencia.StockWiseAPI.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(
        name = "categories",
        indexes = {
                @Index(
                        name = "idx_category_name",
                        columnList = "name",
                        unique = true
                )
        }
)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_category", nullable = false, length = 100)
    private String name; //Nombre de la categoria

    @Column(name = "description_category", nullable = false, length = 255)
    private String description; // Descripcion de la categoria

}
