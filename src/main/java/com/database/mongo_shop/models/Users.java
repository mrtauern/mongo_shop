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
@Document(collection = "users")
public class Users {

    @Id
    private String id;
    private String country;

    @Field("create_date")
    private String createDate;

    private String email;

    @Field("last_login")
    private String lastLogin;

    private String password;

    @Field("street_name")
    private String streetName;

    private String town;

    @Field("user_type")
    private Integer userType;

    private String zip;
    private String firstname;
    private String lastname;
    private Integer phone;

    @Field("street_number")
    private String streetNumber;
}
