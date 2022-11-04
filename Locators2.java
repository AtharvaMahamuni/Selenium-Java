import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String username = "Atharva";
		
//		// Setting up the chromedriver.exe
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atharva Mahamuni\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
//						
//		// Invoking the browser
//		WebDriver driver = new ChromeDriver();
//		
		
		// Setting up the chromedriver.exe
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Atharva Mahamuni\\OneDrive\\Desktop\\chromedriver_win32 (1)\\msedgedriver.exe");
				
		// Invoking the browser
		WebDriver driver = new EdgeDriver();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		String password = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
				
		driver.findElement(By.id("inputUsername")).sendKeys(username);
				
		driver.findElement(By.name("inputPassword")).sendKeys(password);
				
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + username + ",");
	
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		Thread.sleep(1000);
		driver.quit();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		
		String[] passwordArray = passwordText.split("'");
		
		System.out.println(passwordArray[1]);
		
//		for(String pass: passwordArray) {
//			System.out.println(pass);
//		}
//		
		String password = passwordArray[1];
		
		return password;	
	}

}
