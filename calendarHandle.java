import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Setting up the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atharva Mahamuni\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
													
		// Invoking the browser
		WebDriver driver = new ChromeDriver();
										
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("button[class='ui-datepicker-trigger']")).click();
		
//		Thread.sleep(2000);
		// .ui-state-default.ui-state-highlight - this class always select current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	
		// Will learn how to select future dates later
		
		Thread.sleep(2000);
		driver.quit();
	}

}
