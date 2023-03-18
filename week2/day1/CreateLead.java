package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		// Launch URL
		driver.get("https://www.olamagri.com/");
		// Maximize window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'container-4436efdd9c\']/div[2]/div/div/div[1]/div[4]/a")).click();
		driver.findElement(By.id("newsform1-email")).sendKeys("sun@gmail.com");
		driver.findElement(By.id("newsform1-firstname")).sendKeys("Sun");
		driver.findElement(By.id("newsform1-firstname")).clear();
		driver.findElement(By.id("newsform1-lastname")).sendKeys("Moon");
		// Dropdown
		WebElement countryDD = driver.findElement(By.id("newsform1-country"));
		
		// Create a object 
		Select sec=new Select(countryDD);
		// selectByIndex
		//sec.selectByIndex(3);
		
		// selectByValue
		//sec.selectByValue("Antigua And Barbuda");
		
		// selectByVisible
		sec.selectByVisibleText("Cameroon");
		
		
	}

}
