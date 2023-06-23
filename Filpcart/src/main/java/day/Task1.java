package day;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task1 {
	
   @Test
	public void MyScrollElemennt() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.olamagri.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		Actions builder=new Actions(driver);		
		//WebElement findElement = driver.findElement(By.xpath("(//div[@class='oga-text-image__title'])[1]"));		
		WebElement findElement = driver.findElement(By.linkText("Find Out More About Us"));
		builder.scrollToElement(findElement).perform();
		
	}

}
