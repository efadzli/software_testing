// ++++++++++++
// CODE SAMPLE
// ++++++++++++
// This is a test automation script to verify Login functionalities: 
// 1. Open Chrome browser, 
// 2. Navigate to a login page
// 3. Key in username and password 
// 4. Click login button 
// 5. Compare expected output with the actual output to determine test result

package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		
		//Create WebDriver
		System.setProperty("webdriver.chrome.driver", "/Users/efadzli/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//Maximize windows
		driver.manage().window().maximize();
		
		//Pre-condition: Go to URL to load the page
		driver.get("http://efadzli.com/software_testing/index.php?view=user_login");
		
		System.out.println("Testing started for Test Case ID TC01");
		
		//Test Procedure: Key in test data (username and password)
		driver.findElement(By.id("username")).sendKeys("adam");
		driver.findElement(By.id("password")).sendKeys("adam123");
		
		//Test Procedure: Click submit button
		driver.findElement(By.name("submitButton")).click();
		
		
		//Verify expected output
		String status = driver.findElement(By.id("status")).getText();
		System.out.print("Test Result: ");
		if(status.equals("Congratulations!")) 
			System.out.println("Success.");
		else
			System.out.println("Failed.");
		
		//Close WebDriver
		driver.quit();
	}
	
}
