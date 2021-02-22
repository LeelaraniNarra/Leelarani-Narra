package automationtests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadrivendemo {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "G:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		File credentials=new File("G:\\Automationsoftware\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(credentials);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
				XSSFSheet sheet1=wb.getSheetAt(0);
		
		int rowcount=sheet1.getLastRowNum();
		for(int i=0; i<=rowcount;i++) {
			String email=sheet1.getRow(i).getCell(0).getStringCellValue();
			String pwd= sheet1.getRow(i).getCell(1).getStringCellValue();
			driver.get("http://demowebshop.tricentis.com/login");
			System.out.println("You are on the correct page");
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.name("Password")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			driver.findElement(By.linkText("Log out")).click();
		}
		driver.quit();
		}
		
		

	}


