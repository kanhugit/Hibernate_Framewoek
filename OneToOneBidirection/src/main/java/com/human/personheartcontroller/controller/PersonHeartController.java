package com.human.personheartcontroller.controller;

import com.human.heart.dto.Heart;
import com.human.person.dto.Person;
import com.human.personheart.dao.PersonHeartDao;

public class PersonHeartController {
	public static void main(String[] args) {
		Person pesrsondata = new Person();

		// Save Person
		pesrsondata.setPersonId(103);
		pesrsondata.setName("kuna");
		pesrsondata.setAddresss("MP");
		pesrsondata.setMob(8989196097L);

		Heart heartdata = new Heart();
		heartdata.setHid(33);
		heartdata.setHeartCondition("Avg");

		// case-1(person has heart and heart has person)
		pesrsondata.setHeart(heartdata);
		heartdata.setPerson(pesrsondata);

		// case-2(Heart has person and Person has heart
//		 pesrsondata.setHeart(heartdata);
//		 heartdata.setPerson(pesrsondata);

		// case-3(person has heart and heart does not have person)
//		 pesrsondata.setHeart(heartdata);
//		 heartdata.setPerson(pesrsondata);

		// case-4( heart has person but person does not have heart)

//		 pesrsondata.setHeart(heartdata);
//		 heartdata.setPerson(pesrsondata);
//		 dao.saveHeart(heartdata);
//		 dao.savePerson(pesrsondata);

		PersonHeartDao dao = new PersonHeartDao();
		dao.savePerson(pesrsondata);
//		 dao.saveHeart(heartdata);
		
//		dao.updatePerson(pesrsondata);
//		dao.updateHeart(heartdata);
		dao.findPersonById(101);
		dao.findHeartById(11);

	}
}
