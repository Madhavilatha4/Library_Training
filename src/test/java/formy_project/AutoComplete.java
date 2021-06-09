package formy_project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoComplete {
	
	public static void main(String[] args) {
		//WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vjkav\\Downloads\\Drivers\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		//WebElement element=driver.findElement(By.linkText("Autocomplete"));
	
		//element.click();
		
		WebElement autocomplete=driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("1092 Township Square,GA");
		WebDriverWait wait=new WebDriverWait(driver,10);
		//Thread.sleep(2000);
		WebElement Autoresult=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
		//Thread.sleep(2000);
		Autoresult.click();
		//Thread.sleep(2000);
		System.out.println("elements entered");
		driver.quit();
		
	
	}

}
