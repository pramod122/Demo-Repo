package tutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ladbrokes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PramodKumar\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sports.ladbrokes.com/en-gb/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='button clean']")).click();
		
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		//Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("testuser11");
		driver.findElement(By.name("lastname")).sendKeys("ladbroke");
		WebElement day = driver.findElement(By.name("day"));
		WebElement month = driver.findElement(By.name("month"));
		WebElement year = driver.findElement(By.name("year"));
		WebElement countrycode = driver.findElement(By.name("countrycode"));
		Select select1 = new Select(day);
		select1.selectByVisibleText("11");
		Select select2 = new Select(month);
		select2.selectByVisibleText("July");
		Select select3 = new Select(year);
		select3.selectByVisibleText("1989");
		
		driver.findElement(By.name("email")).sendKeys("testuser1234@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		Thread.sleep(1000);
		Select select4 = new Select(countrycode);
		select4.selectByVisibleText("United Kingdom");
		driver.findElement(By.name("zip")).sendKeys("tw3 3rw");
		//WebElement zip = driver.findElement(By.name("zip"));
		//Select select5 = new Select(zip);
		//select5.selectByVisibleText("20");
		driver.findElement(By.name("address")).sendKeys("19 Albert Road");
		driver.findElement(By.name("city")).sendKeys("hounslow");
		driver.findElement(By.name("cellphone")).sendKeys("7894617952");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 2500)");
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		driver.findElement(By.name("userName")).sendKeys("test_user1234");
		driver.findElement(By.name("password")).sendKeys("easthamP12");
		driver.findElement(By.id("no-limits")).click();
		driver.findElement(By.id("terms-checkbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Open account')]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("post")).click();
		driver.findElement(By.xpath("//button[contains(text(),'SAVE MY PREFERENCES')]")).click();
		
		
		//driver.switchTo().window("msapplication-tap-highlight");
		//driver.findElement(By.xpath("//button[@class='fn-title-button active' and @value='Mrs']")).click();

	}

}
