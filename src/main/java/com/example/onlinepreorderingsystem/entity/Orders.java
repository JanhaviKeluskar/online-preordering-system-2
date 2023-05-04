package com.example.onlinepreorderingsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Orders
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    long idCustomer;
    @CreationTimestamp
    LocalDate date;
    LocalDateTime visitingDateTime;
    Double paid;
    int idStatus;

    public Orders()
    {

    }

    public Orders(long idCustomer, LocalDateTime visitingDateTime, Double paid) {
        this.idCustomer = idCustomer;
        this.visitingDateTime = visitingDateTime;
        this.paid = paid;
        this.idStatus = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public LocalDateTime getVisitingDateTime() {
        return visitingDateTime;
    }

    public void setVisitingDateTime(LocalDateTime visitingDateTime) {
        this.visitingDateTime = visitingDateTime;
    }

    public Double getPaid() {
        return paid;
    }

    public void setPaid(Double paid) {
        this.paid = paid;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", idCustomer=" + idCustomer +
                ", visitingDateTime=" + visitingDateTime +
                ", paid=" + paid +
                ", idStatus=" + idStatus +
                '}';
    }
}

