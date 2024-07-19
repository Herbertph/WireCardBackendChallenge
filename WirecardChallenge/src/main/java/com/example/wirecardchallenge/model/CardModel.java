package com.example.wirecardchallenge.model;

import lombok.Data;

@Data
public class CardModel {

        private String cardHolderName;
        private String cardNumber;
        private String cardExpirationDate;
        private String cardCvv;

}
