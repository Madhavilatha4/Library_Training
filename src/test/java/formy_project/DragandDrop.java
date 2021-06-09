package formy_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vjkav\\Downloads\\Drivers\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://formy-project.herokuapp.com");
		WebElement element=driver.findElement(By.linkText("Drag and Drop"));
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
		WebElement image=driver.findElement(By.id("image"));
		WebElement box=driver.findElement(By.id("box"));
		String text1=box.getText();
		System.out.println(text1);
		Thread.sleep(1000);
		Actions actions=new Actions(driver);
		//actions.dragAndDrop(image,box).perform();
	actions.clickAndHold(image).pause(Duration.ofSeconds(2))
	.moveToElement(box).pause(Duration.ofSeconds(2))
	.release().build().perform();
		
		Thread.sleep(1000);
		String text=box.getText();
		System.out.println(text);
		driver.quit();
	}

}
