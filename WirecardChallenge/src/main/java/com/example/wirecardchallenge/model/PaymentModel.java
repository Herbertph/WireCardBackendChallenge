package com.example.wirecardchallenge.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "payments")
public class PaymentModel {

    @Id
    private String id;
    private String clientId;
    private BuyerModel buyer;
    private double amount;
    private String type;
    private CardModel card;
    private String status;

}
