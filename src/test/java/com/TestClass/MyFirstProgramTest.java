package com.TestClass;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MyFirstProgramTest {
	
	public WebDriver driver;
	public Robot robot;
	public void TestMethod() throws AWTException {
	//public static void main(String arg[]) {	
		System.out.println("Welcome to DevOps");
		
		robot = new Robot();
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println("ChromeDriver is successfully launched");

	}
	

}

