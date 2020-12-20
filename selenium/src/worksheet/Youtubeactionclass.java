package worksheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Youtubeactionclass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "../selenium/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		String weburl="https://www.youtube.com/";
		driver.get(weburl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	/*
		
		// Play all the videos of the web page on youtube
		java.util.List<WebElement> ls= driver.findElements(By.xpath("//a[@class='yt-simple-endpoint inline-block style-scope ytd-thumbnail']"));
		for(int i=0;i<=ls.size();i++)
		{
			ls.get(i).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
	
		*/
		
		
		//below code is to run a specific video on web page on youtube
		
		driver.findElement(By.xpath("//a[@href='/watch?v=hoNb6HuNmU0'][@class='yt-simple-endpoint inline-block style-scope ytd-thumbnail']")).click();
		
		
	}
}
