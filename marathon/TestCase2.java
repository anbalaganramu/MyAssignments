package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//strong[text()='Hyderabad']")).click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.findElement(By.xpath("//span[@class='sc-fcdeBU cNeUMt']")).click();
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Sir");
		driver.findElement(By.xpath("(//span[@class='sc-jhaWeW ChCae'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
		String movieName= driver.findElement(By.xpath("(//a[@class='__venue-name'])[1]")).getText();
		System.out.println(movieName);
		driver.findElement(By.xpath("(//div[@class='info-section'])[1]")).click();
		String parkingFacility=driver.findElement(By.xpath("//div[contains(text(),'Parking')]")).getText();
		System.out.println(parkingFacility+" is available");
		
		if(parkingFacility=="Parking Facility") {
			System.out.println("Yes. The theatre has a parking facility");
		}
		
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		
		driver.findElement(By.xpath("//div[@class='showtime-pill-container _available']")).click();
		
		driver.findElement(By.xpath("(//ul[@id='popQty']/li)[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='_available'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='bar-btn _primary'])[1]")).click();
		Thread.sleep(3000);
		String subTotal = driver.findElement(By.xpath("//span[@class='__sub-total']")).getText();
		System.out.println("Sub Total: "+subTotal);
	}

}
