package com.example.onlinepreorderingsystem.entity;


import jakarta.persistence.*;

@Entity
public class ProductDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_productDetails")
    @SequenceGenerator(name="seq_productDetails")    
    long id;
    long idProduct;
    long rate;
    String rating;

    public ProductDetails() {
    }

    public ProductDetails(long id, long idProduct, long rate, String rating) {
        this.id = id;
        this.idProduct = idProduct;
        this.rate = rate;
        this.rating = rating;
    }

    public long getIdProductDetails() {
        return id;
    }

    public void setIdProductDetails(long id) {
        this.id = id;
    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public long getRate() {
        return rate;
    }

    public void setRate(long rate) {
        this.rate = rate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "id=" + id +
                ", idProduct=" + idProduct +
                ", rate=" + rate +
                ", rating='" + rating + '\'' +
                '}';
    }
}
