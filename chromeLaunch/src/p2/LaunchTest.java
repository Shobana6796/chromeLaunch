package p2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTest
{
	public static void main(String[] args) throws InterruptedException
	{
		String url="https://www.facebook.com";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		
		
	}

}
