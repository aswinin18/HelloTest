package somepkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {

	@Test
	public void openB() throws InterruptedException{
	//System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
    
		driver.get("https://adman.livereachmedia.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Current URL:"+driver.getCurrentUrl());
		System.out.println("CLosing browser");
		driver.quit();
		
	}
}
