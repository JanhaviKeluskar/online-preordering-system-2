package com.example.onlinepreorderingsystem.entity;


import jakarta.persistence.*;

@Entity
public class Owner
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_owner")
    @SequenceGenerator(name="seq_owner")
    long id;
    String name;
    String contact;
    String email;
    String password;

    public Owner() {
    }

    public Owner(String name, String contact, String email, String password)
    {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.password = password;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
