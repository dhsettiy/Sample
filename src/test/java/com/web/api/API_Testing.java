package com.web.api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

public class API_Testing {
public static void main(String[] args) {
	RestAssured.baseURI="https://rahulshettyacademy.com";
	String responce=given().log().all().queryParam("key", "qaclick123").header("Content-Type", "Application/Json").body("{\r\n"
			+ "  \"location\": {\r\n"
			+ "    \"lat\": -38.383494,\r\n"
			+ "    \"lng\": 33.427362\r\n"
			+ "  },\r\n"
			+ "  \"accuracy\": 50,\r\n"
			+ "  \"name\": \"Frontline house\",\r\n"
			+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
			+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
			+ "  \"types\": [\r\n"
			+ "    \"shoe park\",\r\n"
			+ "    \"shop\"\r\n"
			+ "  ],\r\n"
			+ "  \"website\": \"http://google.com\",\r\n"
			+ "  \"language\": \"French-IN\"\r\n"
			+ "}").when().post("maps/api/place/add/json").then().log().all().statusCode(200).extract().asString();
	JsonPath jsonPath=new JsonPath(responce);
	String place_id = jsonPath.getString("place_id");
	System.out.println(""+place_id+"");
	String updateResponce=given().log().all().queryParam("place_id", place_id).queryParam("key", "qaclick123").header("content-Type", "Application/json").body("{\r\n"
			+ "\"place_id\":\""+place_id+"\",\r\n"
			//"\"place_id\":\""+place_id+"\",\r\n"
			+ "\"address\":\"3/54,omskathi street, USA\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}").when().put("maps/api/place/update/json").then().log().all().statusCode(200).extract().asString();
	System.out.println(updateResponce);
	String getResp=given().log().all().queryParam("place_id", place_id).queryParam("key", "qaclick123").header("context-Type","Application/Json").when().get("maps/api/place/get/json").then().log().all().statusCode(200).extract().asString();
	System.out.println(getResp);
}
}
