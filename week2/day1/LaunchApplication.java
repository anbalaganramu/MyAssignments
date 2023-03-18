package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LaunchApplication {

	public static void main(String[] args) {
		// To launch browser
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		// To open web page
		driver.get("https://www.facebook.com/");
		// To maximize the browser
		driver.manage().window().maximize();
		// To close the current tab
		driver.close();
		
	}

}
