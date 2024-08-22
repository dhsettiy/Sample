package com.app.api;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeSerialization {
public static void main(String[] args) throws IOException {
	try {
		String apiResponce="C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\API.json";
		ObjectMapper obj=new ObjectMapper();
		User_Class value = obj.readValue(new File(apiResponce), User_Class.class);
		System.out.println(value.getSquadName());
		System.out.println(value.getHomeTown());
		System.out.println(value.getformed());
		System.out.println(value.getsecretBase());
		List<MembersClass> member = value.getMember();
		for(MembersClass mb: member) {
			String age = mb.getAge();
			String city = mb.getCity();
			String id = mb.getID();
			String secretIdentity = mb.getSecretIdentity();
			String state = mb.getState();
			System.out.println(age);
			System.out.println(city);
			System.out.println(id);
			System.out.println(secretIdentity);
			System.out.println(state);
		}
		
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
