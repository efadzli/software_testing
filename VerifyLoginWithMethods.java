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
		
		System.setProperty("webdriver.chrome.driver", "/Users/efadzli/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		testLogin(driver,"TC01","adam","adam123","Congratulations!");
		testLogin(driver,"TC02","john","xxxx","Login failed! Please try again.");
		
		
		driver.quit();
	}
	
	static void testLogin(WebDriver driver, String tc_id, String uname, String pass, String expected_output) {

		driver.get("http://efadzli.com/software_testing/index.php?view=user_login");
		
		System.out.println("Testing started for Test Case ID "+tc_id);
		
		//key in username and password
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		
		//click submit button
		driver.findElement(By.name("submitButton")).click();
		
		//get status
		String status = driver.findElement(By.id("status")).getText();
		System.out.print("Test Case "+tc_id+": ");
		if(status.equals(expected_output)) 
			System.out.println("Testing successful.");
		else
			System.out.println("Testing failed.");
		
	}
}
