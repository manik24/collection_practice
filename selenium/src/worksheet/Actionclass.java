package worksheet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.*;


import com.sun.xml.bind.v2.schemagen.xmlschema.List;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.dirver", "../selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(9000);
		WebElement hotel = driver.findElement(By.xpath("//span[text()='Hotels']"));
		hotel.click();
		
		Thread.sleep(3000);
		WebElement place = driver.findElement(By.id("city"));
		place.click();
		
		Thread.sleep(3000);
		WebElement dplace = driver.findElement(By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']"));
		dplace.sendKeys("Del");
		Thread.sleep(2000);
		dplace.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		dplace.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement checkin = driver.findElement(By.xpath("//input[@id='checkin']"));
		checkin.click();
		Thread.sleep(2000);
		WebElement  checkindate=driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Thu Dec 24 2020')]"));
		checkindate.click();
		
		Thread.sleep(2000);
		WebElement  checkoutdate=driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sat Dec 26 2020')]"));
		checkoutdate.click();
		
		System.out.println("====================================guest++===========");
		Thread.sleep(3000);
		WebElement  room_guest_count=driver.findElement(By.xpath("//p[@data-cy='roomGuestCount']"));
		room_guest_count.click();
		
		System.out.println("====================================adults++===========");
		Thread.sleep(3000);
		WebElement  adults_count=driver.findElement(By.xpath("//li[@data-cy='adults-2']"));
		adults_count.click();

		Thread.sleep(3000);
		WebElement  children_count=driver.findElement(By.xpath("//li[@data-cy='children-1']"));
		children_count.click();
		
		Thread.sleep(3000);
		WebElement set_child_age=driver.findElement(By.className("ageSelectBox"));
		set_child_age.click();
		Select s1= new Select(set_child_age);
		s1.selectByIndex(7);
	
		Thread.sleep(3000);
		//apply button click
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		
		
		
		Thread.sleep(3000);
		WebElement travel_occassion=driver.findElement(By.xpath("//span[text()='Travelling For']"));
		travel_occassion.click();
		
		Thread.sleep(3000);
		WebElement travel_occassion_select=driver.findElement(By.xpath("//li[text()='Work']"));
		travel_occassion_select.click();
		
		Thread.sleep(3000);
		//submit button
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
	/*	
		java.util.List<WebElement> ls= driver.findElements(By.xpath("//p[@id='hlistpg_hotel_shown_price'][@class='latoBlack font26 blackText appendBottom5']"));
		System.out.println("size of the list is "+ls.size());
		
		for(WebElement we : ls)
		{
			System.out.println("element is "+we);
		}
		
		*/
		Thread.sleep(10000);
		driver.close();
	}
}
