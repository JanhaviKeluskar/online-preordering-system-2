package com.example.onlinepreorderingsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String Name;
    String City;
    String NearPlace;
    String District;
    String Email;
    String Contact;
    String Location;
    String BankAccount;
    String QRCode;

    public Hotel() {
    }

    public Hotel(long id, String name, String city, String nearPlace, String district, String email, String contact, String location, String bankAccount, String QRCode) {
        this.id = id;
        Name = name;
        City = city;
        NearPlace = nearPlace;
        District = district;
        Email = email;
        Contact = contact;
        Location = location;
        BankAccount = bankAccount;
        this.QRCode = QRCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getNearPlace() {
        return NearPlace;
    }

    public void setNearPlace(String nearPlace) {
        NearPlace = nearPlace;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getBankAccount() {
        return BankAccount;
    }

    public void setBankAccount(String bankAccount) {
        BankAccount = bankAccount;
    }

    public String getQRCode() {
        return QRCode;
    }

    public void setQRCode(String QRCode) {
        this.QRCode = QRCode;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", City='" + City + '\'' +
                ", NearPlace='" + NearPlace + '\'' +
                ", District='" + District + '\'' +
                ", Email='" + Email + '\'' +
                ", Contact='" + Contact + '\'' +
                ", Location='" + Location + '\'' +
                ", BankAccount='" + BankAccount + '\'' +
                ", QRCode='" + QRCode + '\'' +
                '}';
    }
}
