package com.bitm.newtours5th.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	static{
		System.setProperty("webdriver.gecko.driver", "E:/selenium5th/Files/geckodriver-v0.18.0-win64/geckodriver.exe");
	}
	 public static FirefoxDriver driver = new FirefoxDriver();
	 
	 public void driverexecution(){
		 System.out.println("Driver Executed!!");
	 }
	 private DriverManager(){
		
	 }
}
