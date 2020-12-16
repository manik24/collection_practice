package worksheet;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signupjuni {

	 static WebDriver driver;
	
	@BeforeClass
	public static void Setup() throws InterruptedException
   {
	String weburl="https://www.facebook.com/";
	System.setProperty("webdriver.chrome.driver", "../selenium/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(weburl);
	driver.manage().window().maximize();
	Thread.sleep(2000);
   }
	@Test
   public void Case() throws InterruptedException
   {
    WebElement register = driver.findElement(By.id("u_0_2"));
    register.click();
    Thread.sleep(5000);
    
    /* locating the web elements */
    
    WebElement fname = driver.findElement(By.name("firstname"));
    WebElement lname = driver.findElement(By.name("lastname"));
    WebElement email = driver.findElement(By.name("reg_email__"));
    WebElement emailconfirm=driver.findElement(By.name("reg_email_confirmation__"));
    WebElement passwd = driver.findElement(By.id("password_step_input"));
    Thread.sleep(2000);
    
    /* Sending the data to the field found above*/
    fname.sendKeys("Manik");
    lname.sendKeys("Kumar");
    email.sendKeys("manikchandel24@gmail.com");
    Thread.sleep(3000);
    emailconfirm.sendKeys("manikchandel24@gmail.com");
    passwd.sendKeys("hello_manik");
    
    /* Finding and selecting drop down data */
    WebElement birthday=driver.findElement(By.name("birthday_day"));
    WebElement month=driver.findElement(By.id("month"));
    WebElement year=driver.findElement(By.id("year"));
    Select s1=new Select(birthday);
    s1.selectByVisibleText("24");
    Select s2=new Select(month);
    s2.selectByValue("12");
    Select s3=new Select(year);
    s3.selectByValue("1995");
  
    /* radio button selection and submit */
    WebElement gender = driver.findElement(By.cssSelector("input#u_2_3"));
    gender.click();
    Thread.sleep(2000);
    WebElement submit=driver.findElement(By.cssSelector("button#u_2_s"));
    	submit.click();
    	
    	
   }	
   @AfterMethod
public void Teardown() throws InterruptedException
    {
	System.out.println("+++++++++++++++++++++Before method ++++++++++++++++++++");
    Thread.sleep(8000); 
	driver.close();
	}

	
 }



