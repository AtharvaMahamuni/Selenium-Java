import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Setting up the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atharva Mahamuni\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
									
		// Invoking the browser
		WebDriver driver = new ChromeDriver();
						
		driver.manage().window().maximize();
						
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");		
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click(); // sometimes bad practice
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='DEL']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
