package worksheet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeActionclass {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "../selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String weburl="https://www.makemytrip.com/";
		driver.get(weburl);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		Actions ac= new Actions(driver);
		
		Thread.sleep(3000);
		WebElement hotel = driver.findElement(By.xpath("//span[text()='Hotels']"));
	    hotel.click();
		Thread.sleep(3000);
		
		WebElement place = driver.findElement(By.xpath("//input[@data-cy='city']"));
		Thread.sleep(2000);
	
		
		Thread.sleep(2000);
		ac.click(place).build().perform();
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']"));
		Thread.sleep(2000);
		ac.click(place).keyDown(Keys.LEFT_SHIFT).sendKeys(city,"del").keyUp(Keys.LEFT_SHIFT).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
	
}

}

