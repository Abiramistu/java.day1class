package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleCode {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantaite the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Loads a new web page in the current browser window
		// Maximise the screen
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
	}

}
