package automationtests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframedemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//Switch to frame
		WebElement frame=driver.findElement(By.xpath("//*[@id='Single']//iframe"));
		driver.switchTo().frame(frame);
		
		//Enter the value in textbox
		WebElement textbox=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
		textbox.sendKeys("Selenium");
		
		driver.switchTo().defaultContent();

		
		//iframe  in frame
		WebElement secondtab=driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
		secondtab.click();
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame(0);
		
		WebElement textbox2=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
		textbox2.sendKeys("Webdriver");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
		
		driver.close();
		
		
	}

}
