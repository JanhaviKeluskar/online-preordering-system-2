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
    long idCustomer;
    long idProduct;
    int qty;

    public OrderDetails()
    {

    }

    public OrderDetails(long idCustomer, long idProduct, int qty) {
        this.idOrder = -1;
        this.idCustomer = idCustomer;
        this.idProduct = idProduct;
        this.qty = qty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id=" + id +
                ", idOrder=" + idOrder +
                ", idCustomer=" + idCustomer +
                ", idProduct=" + idProduct +
                ", qty='" + qty + '\'' +
                '}';
    }
}
