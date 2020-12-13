package com.database.mongo_shop.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Items {
    private String name;
    private double price;
    private Integer quantity;
}
