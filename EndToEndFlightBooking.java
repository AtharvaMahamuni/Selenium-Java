import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndFlightBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Setting up the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atharva Mahamuni\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
									
		// Invoking the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
						
		driver.manage().window().maximize();
						
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");	

		driver.findElement(By.cssSelector("input[id*='originStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		
		driver.findElement(By.cssSelector("input[id*='destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//div[contains(@id, 'destinationStation1_CTNR')] //a[@value='GOI']")).click();
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
//		WebElement returnDate =  ;
		
		if(driver.findElement(By.cssSelector("div[id='Div1']")).getDomAttribute("style").contains("0.5")) {
			System.out.print("Return date is disabled");
		} else {
			System.out.print("Return date is enabled");
		}
		
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		
		for(int i = 1; i <= 5; i++) {
			driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
		}
		
		driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']")).click();
		driver.findElement(By.cssSelector("option[value='USD']")).click();
		
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("ind");
	 	List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		
	 	for(WebElement option: options) {
	 		if(option.getText().equalsIgnoreCase("India")) {
	 			option.click();
	 			break;
	 		}
	 	}
	 	
		Thread.sleep(2000);
		driver.quit();
	}

}
