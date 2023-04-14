package com.example.onlinepreorderingsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OrderDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    long idOrder;
    long idProductDetails;
    String quantity;
    Boolean available;

    public OrderDetails() {
    }

    public OrderDetails(long id, long idOrder, long idProductDetails, String quantity, Boolean available) {
        this.id = id;
        this.idOrder = idOrder;
        this.idProductDetails = idProductDetails;
        this.quantity = quantity;
        this.available = available;
    }

    public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
    }

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public long getIdProductDetails() {
        return idProductDetails;
    }

    public void setIdProductDetails(long idProductDetails) {
        this.idProductDetails = idProductDetails;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id=" + id +
                ", idOrder=" + idOrder +
                ", idProductDetails=" + idProductDetails +
                ", quantity='" + quantity + '\'' +
                ", available=" + available +
                '}';
    }
}
