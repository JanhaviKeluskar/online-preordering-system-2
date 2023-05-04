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
    String name;
    String msg;

    public Feedback() {
    }

    public Feedback(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
