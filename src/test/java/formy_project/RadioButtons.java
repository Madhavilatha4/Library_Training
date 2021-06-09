package formy_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButtons {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vjkav\\Downloads\\Drivers\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://formy-project.herokuapp.com");
		WebElement element=driver.findElement(By.linkText("Radio Button"));
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);
		WebElement radiobutton1=driver.findElement(By.id("radio-button-1"));
		radiobutton1.click();
		Thread.sleep(1000);
		WebElement radiobutton2=driver.findElement(By.xpath("//body/div[1]/div[2]/input[1]"));
		radiobutton2.click();
		Thread.sleep(1000);
		WebElement radiobutton3=driver.findElement(By.xpath("//body/div[1]/div[3]/input[1]"));
		radiobutton3.click();
		Thread.sleep(1000);
		driver.close();
}
}