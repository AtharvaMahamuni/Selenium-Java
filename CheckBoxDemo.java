import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		// Setting up the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atharva Mahamuni\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
											
		// Invoking the browser
		WebDriver driver = new ChromeDriver();
								
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
								
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@name, 'SeniorCitizenDiscount')]")).isSelected());
//		System.out.println(driver.findElement(By.xpath("//input[contains(@name, 'SeniorCitizenDiscount')]")).isSelected());		
		
		driver.findElement(By.cssSelector("input[name$='SeniorCitizenDiscount']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@name, 'SeniorCitizenDiscount')]")).isSelected());
//		System.out.println(driver.findElement(By.xpath("//input[contains(@name, 'SeniorCitizenDiscount')]")).isSelected());
		
		// @error - expected [true] but found [false]
//		Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@name, 'friendsandfamily')]")).isSelected());
//		System.out.println(driver.findElement(By.xpath("//input[contains(@name, 'friendsandfamily')]")).isSelected());
		
		//TODO: Number of CheckBoxes -
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		Thread.sleep(2000);
		driver.quit();
	}

}
