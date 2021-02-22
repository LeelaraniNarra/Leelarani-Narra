package automationtests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

		driver.manage().window().maximize();//maximize browser

		driver.get("https://opensource-demo.orangehrmlive.com/");//open url
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit wait
		  

		String Expectedtitle="OrangeHRM";
		System.out.println(Expectedtitle);
		String Actualtitle=driver.getTitle();
		System.out.println(Actualtitle);
		
		if(Expectedtitle.equals(Actualtitle)) 
		{
     
			driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");//user name

			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); //password

			driver.findElement(By.xpath("//*[@id='btnLogin']")).click();//login
			
									
			driver.findElement(By.xpath("//*[@id='welcome']")).click();
			
			WebDriverWait Mywaitt=new WebDriverWait(driver,10);//explicit wait
			
			//Mywaitt.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//a[contains(text(),'Logout')]")));
				
			Mywaitt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Logout')]")));
			
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();//logout
			System.out.println("end");
			driver.close();
		}

		else
		{
			System.out.println("titles are different");
		}
		
	}
}
