package com.navishka.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			
			//Create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//Read JSON file and map/convert to Java POJO: data/sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//Print first name and last name
			System.out.println("First name: " + theStudent.getFirstName());
			System.out.println("Last name: " + theStudent.getLastName());
			
			//Print Address: street and city
			Address tempAddress = theStudent.getAddress();
			
			System.out.println(tempAddress);
			System.out.println("Street: " + tempAddress.getStreet());
			System.out.println("City: " + tempAddress.getCity());
			System.out.println("State: " + theStudent.getAddress().getState());
			
			//Print out the languages
			for(String tempLang: theStudent.getLanguages()) {
				System.out.println("Languages: " + tempLang);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
