import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// Setting up the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atharva Mahamuni\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
				
		// Invoking the browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Atharva");
		
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		driver.findElement(By.className("signInBtn")).click();
		
		// implicit wait comes into picture program waits till p.error element appears on screen 
		// This wait is up to 5 seconds as we mentioned above on line 19.
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		// Here the input fields and other information yet to come on screen but as we are on single page application
		// We need to use the sleep to stop execution for 1 second.
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("john@email.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		// Here implicit wait will kick-in automatically as element is about to appear
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Atharva");
		
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.xpath(" //div[@class='login-container']/p")).getText());
	
		Thread.sleep(1000);
		driver.quit();
	}

}
