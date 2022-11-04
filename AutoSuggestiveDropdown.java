import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Setting up the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atharva Mahamuni\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
											
		// Invoking the browser
		WebDriver driver = new ChromeDriver();
								
		driver.manage().window().maximize();
								
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");		
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}	
		
		Thread.sleep(2000);
		driver.quit();
	}

}
