package com.tcs.personpassport.controller;

import com.tcs.passport.dto.Passport;
import com.tcs.person.dto.Person;
import com.tcs.personpassport.dao.PersonPassportDao;

public class PersonPassportController {
    public static void main(String[] args) {
        // Creating a new Person object
        Person person = new Person();
        person.setPersonId(201);
        person.setName("John Doe");
        person.setAge(30);

        // Creating a new Passport object
        Passport passport = new Passport();
        passport.setPassportId(301);
        passport.setPassportNumber("X123456");

        // person.setPassport(passport);

        // Creating an instance of DAO
        PersonPassportDao dao = new PersonPassportDao();

        // Saving Person and Passport separately
        dao.savePerson(person);
        dao.savePassport(passport);

        // dao.updatePerson(person);
        // dao.updatePassport(passport);
    }
}

