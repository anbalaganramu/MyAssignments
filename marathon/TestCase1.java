package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.className("selected")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.className("selected")).click();
	
		driver.findElement(By.xpath("(//td[@class='current day']/following-sibling::td)[1]")).click();
		driver.findElement(By.id("search_btn")).click();
		String busCount = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(busCount);
		WebElement sleeper = driver.findElement(By.xpath("//label[text()='SLEEPER']"));
		driver.executeScript("arguments[0].click()",sleeper);
		String busName = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println(busName);
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		
	}

}
