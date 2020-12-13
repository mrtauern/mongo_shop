package com.database.mongo_shop.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CreditCards {
    @Field("cardholder")
    private String cardholder;

    @Field("cardnumber")
    private double cardnumber;

    @Field("exp_year")
    private Integer expYear;

    @Field("exp_month")
    private Integer expMonth;

    @Field("CVV")
    private Integer cvv;
}
