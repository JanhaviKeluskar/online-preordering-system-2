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

    public Product() {

    }

    public Product(long id, long idCategory, String name) {
        this.id = id;
        this.idCategory = idCategory;
        this.name = name;
    }

    public long getIdProduct() {
        return id;
    }

    public void setIdProduct(long id) {
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", idCategory=" + idCategory +
                ", name='" + name + '\'' +
                '}';
    }
}
