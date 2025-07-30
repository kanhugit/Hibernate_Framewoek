package com.tcs.person.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.tcs.passport.dto.Passport;

@Entity  // Marks this class as a JPA entity
public class Person {

    @Id  // Primary key for Person entity
    private int personId;
    private String name;
    private int age;

    @OneToOne(cascade = CascadeType.ALL)  
    // One-to-One mapping: A Person has one Passport
    // CascadeType.ALL means any operation (persist, merge, remove, refresh, detach) on Person will also affect Passport
    private Passport passport;

    // Getter and Setter methods
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}

