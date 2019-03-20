package Maven.Maven1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MyFirstProgram {
	
	@Test
	public void TestMethod() {
		
		System.out.println("Welcome to DevOps");
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println("ChromeDriver is successfully launched");
		driver.get("https://www.google.com/");
		System.out.println("You are in Given webPage");
		
		String title=driver.getTitle();
		System.out.println("Title is " +title);
		driver.quit();
	}
	

}

