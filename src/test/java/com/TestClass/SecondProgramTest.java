package com.TestClass;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SecondProgramTest extends MyFirstProgramTest {

	@Test(priority=1)
	public void googleTest() throws AWTException, InterruptedException {
		TestMethod();
		driver.get("https://www.google.com/");
		System.out.println("You are in Given webPage");
		
		String title=driver.getTitle();
		System.out.println("Title is " +title);

		
	}
	@Test(priority=2)
	public void FaceBookTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Facebook");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		String SecondPageTitle=driver.getTitle();
		System.out.println("Second Page title is " +SecondPageTitle);
		Thread.sleep(3000);
		driver.quit();
	}
}
