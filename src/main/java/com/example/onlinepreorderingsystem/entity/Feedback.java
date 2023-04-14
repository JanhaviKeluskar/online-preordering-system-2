package com.example.onlinepreorderingsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long Id;
    long Cost;
    long Hotel;
    String Feedback;
    long Rating;

    public Feedback() {
    }

    public Feedback(long cost, long hotel, String feedback, long rating) {
        Cost = cost;
        Hotel = hotel;
        Feedback = feedback;
        Rating = rating;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getCost() {
        return Cost;
    }

    public void setCost(long cost) {
        Cost = cost;
    }

    public long getHotel() {
        return Hotel;
    }

    public void setHotel(long hotel) {
        Hotel = hotel;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String feedback) {
        Feedback = feedback;
    }

    public long getRating() {
        return Rating;
    }

    public void setRating(long rating) {
        Rating = rating;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "Cost=" + Cost +
                ", Hotel=" + Hotel +
                ", Feedback='" + Feedback + '\'' +
                ", Rating=" + Rating +
                '}';
    }
}
