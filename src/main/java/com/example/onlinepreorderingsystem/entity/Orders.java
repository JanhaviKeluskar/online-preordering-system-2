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
    long id;
    long idCost;
    long idHotel;
    String DateTime;
    String VisitingDateTime;
    Double paid;
    Boolean cancle;

    public Orders()
    {

    }

    public Orders(long id, long idCost, long idHotel, String dateTime, String visitingDateTime, Double paid, Boolean cancle) {
        this.id = id;
        this.idCost = idCost;
        this.idHotel = idHotel;
        DateTime = dateTime;
        VisitingDateTime = visitingDateTime;
        this.paid = paid;
        this.cancle = cancle;
    }

    public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
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
                "id=" + id +
                ", idCost=" + idCost +
                ", idHotel=" + idHotel +
                ", DateTime='" + DateTime + '\'' +
                ", VisitingDateTime='" + VisitingDateTime + '\'' +
                ", paid=" + paid +
                ", cancle=" + cancle +
                '}';
    }
}

