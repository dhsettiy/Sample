package com.test.database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample3 {
	public static void jsonFile() {
		try {
			FileReader fr = new FileReader(new File(
					"C:\\\\Users\\\\dharu\\\\eclipse-workspace\\\\Java\\\\Test\\\\src\\\\test\\\\resources\\\\TestDateBase\\\\test.json"));
			JSONParser jp = new JSONParser();
			Object object = jp.parse(fr);
			JSONObject jb = (JSONObject) object;
			String name = (String) jb.get("name");
			System.out.println(name);
			String location = (String) jb.get("location");
			System.out.println(location);
			String nativ = (String) jb.get("native");
			System.out.println(nativ);
		
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		jsonFile();
	}
}
