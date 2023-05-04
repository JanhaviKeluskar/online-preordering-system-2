package com.example.onlinepreorderingsystem.entity;

import jakarta.persistence.*;

@Entity
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_product")
    @SequenceGenerator(name="seq_product")   
    long id;
    long idCategory;
    String name;
    String description;
    double price;
    double discount;
    String img;

    public Product(){}

    public Product(long idCategory, String name, String description, double price, double discount, String img) {
        this.idCategory = idCategory;
        this.name = name;
        this.description = description;
        this.price = price;
        this.discount = discount;
        this.img = img;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(long idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
