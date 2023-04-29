// ++++++++++++
// CODE SAMPLE
// ++++++++++++
// This is a test automation script. This script will open Chrome browser, 
// navigate to https://www.umt.edu.my, get the page title and output the title 
// in the eclipse console. Finally it will close the Chrome browser.

package day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "full_path_to_chromedriver_on_your_drive");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.umt.edu.my");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
