package tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriverbasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PramodKumar\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String titlename = driver.getTitle();
		System.out.println(titlename);
		if(titlename.equals("Google"))
		{
			System.out.println("Correct title");
		}else
		{
			System.out.println("incorrect title");
		}
		driver.quit();
		//Thread.sleep(1000);
		System.setProperty("webdriver.gecko.driver","C:\\Users\\PramodKumar\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://google.com");
		System.out.println(driver1.getCurrentUrl());
		System.out.println(driver1.getPageSource());
		System.out.println("Brower lunched successfully");
		
		driver1.quit();
		
		
	}

	//private static void Threadsleep(int i) {
		// TODO Auto-generated method stub
		
	}


