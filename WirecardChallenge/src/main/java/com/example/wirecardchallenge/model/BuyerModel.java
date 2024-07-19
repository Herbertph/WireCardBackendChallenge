package com.example.wirecardchallenge.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "buyers")
public class BuyerModel {
    @Id
    private String id;
    public String name;
    public String email;
    public String cpf;

}
