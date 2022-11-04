import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Setting up the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atharva Mahamuni\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
							
		// Invoking the browser
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
				
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		for(int i = 0; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Thread.sleep(2000);
		driver.quit();
	}

}
