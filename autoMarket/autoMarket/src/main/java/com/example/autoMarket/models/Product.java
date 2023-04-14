package com.example.autoMarket.models;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Product {
    long id;
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;
}
