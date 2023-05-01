// ++++++++++++
// CODE SAMPLE
// ++++++++++++
// This is a test automation script. This script will open Chrome browser, 
// navigate to https://www.umt.edu.my, get the page title and output the title 
// in the eclipse console. Finally it will close the Chrome browser.

package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		
		//Create WebDriver
		System.setProperty("webdriver.chrome.driver", "full_path_to_chromedriver_on_your_drive");
		WebDriver driver = new ChromeDriver();
		
		//Maximize windows
		driver.manage().window().maximize();
		
		//Execute test cases
		testLogin(driver,"TC01","correct_username","correct_password","expected_output");
		testLogin(driver,"TC02","wrong_username","wrong_password","expected_output");
		
		//Close WebDriver
		driver.quit();
	}
	
	static void testLogin(WebDriver driver, String tc_id, String uname, String pass, String expected_output) {

		//Pre-condition: Go to URL to load the page
		driver.get("full_url_to_login_page");
		
		System.out.println("Testing started for Test Case ID "+tc_id);
		
		//Test Procedure: Key in test data (username and password)
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		
		//Test Procedure: Click submit button
		driver.findElement(By.name("submitButton")).click();
		
		//Verify expected output
		String status = driver.findElement(By.id("status")).getText();
		System.out.print("Test Result: ");
		if(status.equals(expected_output)) 
			System.out.println("Success.");
		else
			System.out.println("Failed.");
		
	}
}
