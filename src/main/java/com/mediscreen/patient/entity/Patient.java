package com.mediscreen.patient.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message ="The first name is mandatory")
    private String firstName;
    @NotBlank(message ="The last name is mandatory")
    private String lastName;
    @NotBlank(message ="The birthdate is mandatory")
    @Column(name = "dateOfBirth")
    private String dateOfBirth;
    @NotBlank(message ="The gender is mandatory")
    @Size(min=1, max=32, message = "The gender must be betwin 1 and 32 characters")
    private String gender;
    @Size(min=1, max=128, message = "The home address must be betwin 1 and 128 characters")
    private String address;
    @Size(min=8, max=16, message = "The phone number must be betwin 8 and 16 characters")
    private String phone;

    public Patient() {
    }

    public Patient(String firstName, String lastName, String dateOfBirth, String gender, String address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
