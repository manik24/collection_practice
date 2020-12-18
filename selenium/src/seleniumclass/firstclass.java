package seleniumclass;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstclass {
	
	public static void main(String[] args) throws Exception 
	{
	    String weburl="https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", "../selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(weburl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	   
		 
		 WebElement register = driver.findElement(By.id("u_0_2"));
	    register.click();
	   /* Thread.sleep(5000);
	    WebElement hk = driver.findElement(By.cssSelector("input#u_1_3._8esa"));
	    hk.click();
	    */
		
		
		 WebElement gender = driver.findElement(By.cssSelector("#input._8esa[Value=2]"));
		    gender.click();
		    Thread.sleep(9000);
		 //   WebElement submit=driver.findElement(By.name("websubmit"));
		   // 	submit.click();
		    	
		    	
		    	
	  //  for(WebElement a:hk)
	    //	System.out.println("List is "+a);
	    /*
	    WebElement fname = driver.findElement(By.id("u_1_b"));
	    WebElement lname = driver.findElement(By.cssSelector("input[aria-label='Surname']"));
	    WebElement email = driver.findElement(By.id("u_1_g"));
	    WebElement passwd = driver.findElement(By.id("password_step_input"));
        Thread.sleep(2000);
	    fname.sendKeys("Manik");
	    lname.sendKeys("Kumar");
	    email.sendKeys("manikchandel24@gmail.com");
	    passwd.sendKeys("hello_manik");
	    Thread.sleep(8000);
	    */
		driver.close();
	}

}
