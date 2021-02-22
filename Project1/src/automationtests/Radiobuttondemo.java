package automationtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radiobuttondemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click();
		WebElement month=driver.findElement(By.xpath("//*[@placeholder='Month']"));
		Select sel2=new Select(month);
		
		List<WebElement>monthcount=sel2.getOptions();
		System.out.println(monthcount.size());
		
		for(int i=0;i<monthcount.size();i++) {
			System.out.println(monthcount.get(i).getText());
		}
		
		sel2.selectByValue("July");
		
		//driver.close();

	}

}
