package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Inbha");
		driver.findElement(By.name("lastname")).sendKeys("A");
		driver.findElement(By.name("reg_email__")).sendKeys("inbha@gmail.com");
		
		driver.findElement(By.xpath("//div[text()='Re-enter email address']/following-sibling::input")).sendKeys("inbha@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Inbha@12345");
		
		driver.findElement(By.xpath("//div[text()='Re-enter email address']/following-sibling::input"));
		
		WebElement sDay = driver.findElement(By.id("day"));
		Select day=new Select(sDay);
		day.selectByIndex(21);
		
		WebElement sMonth = driver.findElement(By.id("month"));
		Select month=new Select(sMonth);
		month.selectByIndex(11);
		
		WebElement sYear = driver.findElement(By.id("year"));
		Select year=new Select(sYear);
		year.selectByVisibleText("1981");
		
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}
	

}
