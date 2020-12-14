package com.database.mongo_shop.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "reviews")
public class Reviews {

    @Id
    private String id;
    private String content;

    @Field("create_date")
    private String createDate;

    private String productId;

    private String userId;

    private Integer rating;
}
