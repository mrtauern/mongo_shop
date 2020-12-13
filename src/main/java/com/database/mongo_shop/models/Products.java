package com.database.mongo_shop.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")
public class Products {

    @Id
    private String id;

    @Field("create_date")
    private String createDate;

    private String name;
    private String picture;
    private Integer weight;
    private String description;
    private Integer price;
    private Integer stock;
    private String thumbnail;
}
