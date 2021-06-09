package formy_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardandMouseInput {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vjkav\\Downloads\\Drivers\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://formy-project.herokuapp.com/keypress");
		WebElement name=driver.findElement(By.id("name"));
		name.click();
		name.sendKeys("Madhavi");
		System.out.println("enter name");
		Thread.sleep(1000);
		WebElement button=driver.findElement(By.id("button"));
		System.out.println("Clicking button");
		button.click();
		driver.quit();
		
	
	}

}
