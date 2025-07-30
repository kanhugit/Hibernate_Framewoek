package com.tcs.passport.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  // Marks this class as a JPA entity
public class Passport {

    @Id  // Primary key for Passport entity
    private int passportId;
    private String passportNumber;

    // Getter and Setter methods
    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
