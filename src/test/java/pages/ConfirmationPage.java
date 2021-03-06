package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {
public static void waitforalert(WebDriver driver) {
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
		
	}
	
	public static String getAlertBannerYText(WebDriver driver) {
		String actual=driver.findElement(By.className("alert")).getText();
		return actual;
	
		
	}
}
