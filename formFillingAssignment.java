import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class formFillingAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Setting up the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atharva Mahamuni\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
													
		// Invoking the browser
		WebDriver driver = new ChromeDriver();
										
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("//div[@class='form-group'] /input[@name='name']")).sendKeys("Atharva Mahamuni");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("atharva@email.com");
		
		driver.findElement(By.cssSelector("input[id='exampleInputPassword1']")).sendKeys("passs@123");
		
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
		
		Select gender = new Select(driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']")));
		
		gender.selectByVisibleText("Male");
		
		driver.findElement(By.cssSelector("input[id='inlineRadio2']")).click();
		
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("05-04-2000");
		
		driver.findElement(By.cssSelector("input[class='btn btn-success']")).click();
		
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		
		Thread.sleep(2000);
		driver.quit();
	}

}
