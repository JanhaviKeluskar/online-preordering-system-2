package com.example.onlinepreorderingsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idOrder;
    long idCost;
    long idHotel;
    String DateTime;
    String VisitingDateTime;
    Double paid;
    Boolean cancle;

    public Orders()
    {

    }

    public Orders(long idOrder, long idCost, long idHotel, String dateTime, String visitingDateTime, Double paid, Boolean cancle) {
        this.idOrder = idOrder;
        this.idCost = idCost;
        this.idHotel = idHotel;
        DateTime = dateTime;
        VisitingDateTime = visitingDateTime;
        this.paid = paid;
        this.cancle = cancle;
    }

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public long getIdCost() {
        return idCost;
    }

    public void setIdCost(long idCost) {
        this.idCost = idCost;
    }

    public long getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(long idHotel) {
        this.idHotel = idHotel;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public String getVisitingDateTime() {
        return VisitingDateTime;
    }

    public void setVisitingDateTime(String visitingDateTime) {
        VisitingDateTime = visitingDateTime;
    }

    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public Boolean getCancle() {
        return cancle;
    }

    public void setCancle(Boolean cancle) {
        this.cancle = cancle;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "idOrder=" + idOrder +
                ", idCost=" + idCost +
                ", idHotel=" + idHotel +
                ", DateTime='" + DateTime + '\'' +
                ", VisitingDateTime='" + VisitingDateTime + '\'' +
                ", paid=" + paid +
                ", cancle=" + cancle +
                '}';
    }
}

