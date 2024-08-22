package com.test.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample7 {
	public static void json_Value() {
		try {
			// File file = new File(
			// "C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\TestDataBase.xlsx");
			// FileInputStream fs = new FileInputStream(file);
			FileReader fr = new FileReader(new File(
					"C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\test.json"));
			JSONParser js = new JSONParser();
			Object object = js.parse(fr);// java Object->he254derksire8521 (typeCastTo)->Json Object->nhderkge257
			JSONObject s = (JSONObject) object;
			String name = (String) s.get("name");
			System.out.println(name);
			String location = (String) s.get("location");
			System.out.println(location);
			String natice = (String) s.get("native");
			System.out.println(natice);
			JSONArray subject = (JSONArray) s.get("subjects");
			for (Object value : subject) {
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		json_Value();
	}
}
