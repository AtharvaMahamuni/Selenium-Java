import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class enabledOrDisabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Setting up the chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atharva Mahamuni\\OneDrive\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
													
		// Invoking the browser
		WebDriver driver = new ChromeDriver();
										
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Note: In new web-sites the element don't get enabled or disabled just opacity or color changes
		// element still work when we disable it and seen with less opacity so isEnabled() method will not work here.
//		System.out.println(driver.findElement(By.cssSelector("input[id$='_view_date2']")).isEnabled());

//		System.out.println(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style"));
//		display: block; opacity: 0.5;

		if(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style").contains("0.5")) {
			System.out.println("It is disabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("Expected to be enabled but disabled.");
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.cssSelector("input[id$='_rbtnl_Trip_1']")).click();
		
//		System.out.println(driver.findElement(By.cssSelector("input[id$='_view_date2']")).isEnabled());
//		System.out.println(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style"));
//		display: block; opacity: 1;

		if(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style").contains("1")) {
			System.out.println("It is enabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("Expected to be disabled but enabled.");
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.cssSelector("input[id$='_rbtnl_Trip_0']")).click();
		
//		System.out.println(driver.findElement(By.cssSelector("input[id$='_view_date2']")).isEnabled());
//		System.out.println(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style"));
//		display: block; opacity: 0.5;

		if(driver.findElement(By.cssSelector("div[id='Div1']")).getAttribute("style").contains("0.5")) {
			System.out.println("It is disabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("Expected to be enabled but disabled.");
			Assert.assertTrue(false);
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
