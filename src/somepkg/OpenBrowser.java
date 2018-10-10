package somepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {

	@Test
	public void openB(){
	//System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    
		driver.get("https://adman.livereachmedia.com/");
	}
}
