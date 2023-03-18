package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[contains(text(),'boys')])[1]")).click();
		Thread.sleep(3000);
		String getCount = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(getCount);
	//	driver.findElement(By.xpath("//div[@id='brandsRefinements']//label/input")).click();
		
		WebElement brand1= driver.findElement(By.xpath("(//div[@id='brandsRefinements']//label/input)[1]"));
		driver.executeScript("arguments[0].click()",brand1);
		Thread.sleep(3000);
		WebElement brand2= driver.findElement(By.xpath("(//div[@id='brandsRefinements']//label/input)[2]"));
		driver.executeScript("arguments[0].click()",brand2);
		
		driver.findElement(By.xpath("(//span[@class='a-button-inner'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(3000);
				
		String brandTitle=driver.findElement(By.xpath("(//h5[@class='s-line-clamp-1']/span)[1]")).getText();
		System.out.println(brandTitle);
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-text-center']//h2)[1]")).getText());
		Thread.sleep(3000);
		System.out.println("Discount price Rs. "+driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-spacing-top-small s-price-instructions-style']//span[@class='a-price-whole'])[1]")).getText());
		
	}

}
