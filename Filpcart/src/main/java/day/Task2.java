package day;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.olamagri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		WebElement ele = driver.findElement(By.xpath("(//h5[@class='oga-header__menu-item-link'])[1]"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(ele).perform();
		driver.findElement(By.xpath("//span[text()='Our Leadership']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Our Leadership Team")) {
			System.out.println("Success");
		}
		else {
			System.out.println("Try Again...");
		}
	}
}
