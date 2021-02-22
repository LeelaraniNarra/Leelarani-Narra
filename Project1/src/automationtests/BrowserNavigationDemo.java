package automationtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationDemo {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "G:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
				        
				    
				    driver.get("http://demowebshop.tricentis.com/login"); //we can use this too driver.navigate().to("http://demowebshop.tricentis.com/login");
				    driver.manage().window().maximize();
				    
				    driver.findElement(By.linkText("Register")).click();
				    Thread.sleep(5);
				    driver.navigate().back();
				    Thread.sleep(5);
				    driver.navigate().forward();
				    Thread.sleep(5);
				    driver.navigate().to("http://demowebshop.tricentis.com/login");
				    Thread.sleep(5);
				    driver.navigate().refresh();
				    Thread.sleep(5);
				    driver.quit();
				    

}
}

