package formy_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ConfirmationPage;
import pages.FormPage;


public class Form {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vjkav\\Downloads\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("http://formy-project.herokuapp.com/form");
	
	
		FormPage.submitform(driver);
		ConfirmationPage.waitforalert(driver);
		String Expected="The form was successfully submitted!";

		if(Expected.equals(ConfirmationPage.getAlertBannerYText(driver)))
		{
			System.out.println("Test pass");
		}
		else 
			System.out.println("Test fail");
		
		driver.quit();
	}	
	
}

