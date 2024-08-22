package com.test.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Sample6 {
public static void properties() throws IOException {
	File file=new File("C:\\Users\\dharu\\eclipse-workspace\\Java\\Test\\src\\test\\resources\\TestDateBase\\config.properties");
	FileInputStream fs=new FileInputStream(file);
    Properties prop=new Properties();
    prop.load(fs);
    String userName = prop.getProperty("userName");
    String passWord = prop.getProperty("passWord");
    System.out.println(userName);
    System.out.println(passWord);
}
public static void main(String[] args) throws IOException {
	properties();
}
}
