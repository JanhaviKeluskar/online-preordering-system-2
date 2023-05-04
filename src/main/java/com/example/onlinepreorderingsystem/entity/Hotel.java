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
    String name;
    String address;
    String city;
    String district;
    String email;
    String contact;
    String bankAccount;
    String ifsc;
    String upi;

    public Hotel() {
    }

    public Hotel(String name, String address, String city, String district, String email, String contact, String bankAccount, String ifsc, String upi) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.district = district;
        this.email = email;
        this.contact = contact;
        this.bankAccount = bankAccount;
        this.ifsc = ifsc;
        this.upi = upi;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getUpi() {
        return upi;
    }

    public void setUpi(String upi) {
        this.upi = upi;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", ifsc='" + ifsc + '\'' +
                ", upi='" + upi + '\'' +
                '}';
    }
}

