package com.database.mongo_shop.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "orders")
public class Orders {

    @Id
    private String id;

    @Field("country")
    private String country;

    @Field("comment")
    private String comment;

    @Field("order_email")
    private String orderEmail;

    @Field("tracking_number")
    private Integer trackingNumber;

    @Field("create_date")
    private String createDate;

    @Field("order_firstname")
    private String orderFirstname;

    @Field("user_email")
    private String userEmail;

    @Field("order_lastname")
    private String orderLastname;

    @Field("order_phone")
    private Integer orderPhone;

    @Field("order_status")
    private String orderStatus;

    @Field("order_streetname")
    private String orderStreetname;

    @Field("order_streetnumber")
    private String orderStreetnumber;

    @Field("order_town")
    private String orderTown;

    @Field("order_zip")
    private String orderZip;

    @Field("credit_card")
    private CreditCards creditCard;

    @Field("items")
    private List<Items> items;
}
