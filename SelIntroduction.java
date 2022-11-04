import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting up the chromedriver.exe
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Atharva Mahamuni\\OneDrive\\Desktop\\chromedriver_win32 (1)\\msedgedriver.exe");
		
		// Invoking the browser
		WebDriver driver = new EdgeDriver();
		
		// Hitting URL on browser
		driver.get("https://atharvamahamuni.github.io");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	
	}

}
