package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailsignup {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\PramodKumar\\Desktop\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PramodKumar\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		//driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("pramod632");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@type='password' and @class='whsOnd zHQkBf']")).sendKeys("ammu0227");driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.manage().window().maximize();
        Thread.sleep(20000);
       driver.findElement(By.xpath("//tr[@class='zA zE' and @id=':2t']")).click();
       Thread.sleep(20000);
       //driver.findElement(By.xpath("//div[@id=':jw' and @class='T-I J-J5-Ji amD T-I-awG T-I-ax7 T-I-Js-Gs L3']")).click();
       driver.findElement(By.xpath("//div[@class='TN bzz aHS-bnt' and @style='margin-left:0px']")).click();
        driver.findElement(By.xpath("//a[@class='gb_b gb_hb gb_R']")).click();
        driver.findElement(By.xpath("//a[@class='gb_Aa gb_Ag gb_Ig gb_ff gb_Tb']")).click();
       driver.quit();
	}

}
