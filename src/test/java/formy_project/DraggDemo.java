package formy_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vjkav\\Downloads\\Drivers\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
	
	Actions act=new Actions(driver);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	WebElement Dist=	driver.findElement(By.xpath("//div[@id='droppable']"));
	String Btext=Dist.getText();
	System.out.println(Btext);
	WebElement target=	driver.findElement(By.xpath("//div[@id='draggable']"));
	Thread.sleep(2000);
	
	act.clickAndHold(target).pause(Duration.ofSeconds(2)).moveToElement(Dist).pause(Duration.ofSeconds(2)).release().perform();
	
	//act.dragAndDrop(target, Dist).perform();
	String Atext=Dist.getText();
	System.out.println(Atext);
	driver.quit();
	}

}
