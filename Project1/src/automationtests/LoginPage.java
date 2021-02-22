package automationtests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
    driver.get("https://www.facebook.com/");
 driver.manage().window().maximize();
              String str= "rgba(24, 119, 242, 1)";
		      String Color = driver.findElement(By.xpath("//button[normalize-space()='Log In']")).getCssValue("background-color");
		      //System.out.println(Color); 
		          if(str.equals(Color) ){
		    	   System.out.println("the color of Log in button is blue(rgba(24, 119, 242, 1)");
		           }
		         else
		           {
		    	  System.out.println("the color of Log in button is not  blue");  
		           }
		            
		      String  str1 ="rgba(255, 255, 255, 1)";
		      String Color1 = driver.findElement(By.xpath("//input[@id='email']")).getCssValue("background-color");
		     // System.out.println(Color1);  
		          if(str1.equals(Color1) ){
		    	  System.out.println("the color of the label is white");
		          }
		        else
		          {
		    	  System.out.println("the color of the label is not white");  
		          }
		      
		      
		        boolean LoginIconPresence =driver.findElement(By.xpath("//button[normalize-space()='Log In']")).isDisplayed();
	            boolean LoginIconEnabled = driver.findElement(By.xpath("//button[normalize-space()='Log In']")).isEnabled();
	 
	              if (LoginIconPresence==true && LoginIconEnabled==true)
	              {
	            	      System.out.println("the Login Button is Enabled"); 
	                    // WebElement LoginIcon= driver.findElement(By.xpath("//button[normalize-space()='Log In']"));
	                    // LoginIcon.click();
	              }
	              else
	              {
	            	  System.out.println("the Login Button is Not Enabled");
	              }
	            	  
	  
		         driver.findElement(By.linkText("Forgotten password?")).click();
		    	 String strUrl = driver.getCurrentUrl();
		         if(strUrl.contains("facebook")){
		        	 System.out.println("the Url contains Facebook");  
		         }
		         
		         else
		         {
		        	 System.out.println("the Url is not Contains Facebook");
		         }
		         
		         
		         driver.findElement(By.linkText("Forgotten account?")).click();
		         driver.findElement(By.id("identify_email")).click();
		         driver.findElement(By.id("identify_email")).sendKeys("999999876543");
		         driver.findElement(By.id("did_submit")).click();
	//checking for Error Message	         
		         WebDriverWait waitt=new WebDriverWait(driver,10);

	             waitt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='_9o4g fsl fwb fcb']")));

	              String str4=driver.findElement(By.xpath("//*[@class='_9o4g fsl fwb fcb']")).getText();

	               

	              String str5=driver.findElement(By.xpath("//*[@class='_9o4h']")).getText();

	              String str6=str4 +" "+ str5;

	              String str7="No search results Your search did not return any results. Please try again with other information.";

	              if(str6.equals(str7))

	              {

	              System.out.println(str7);

	              }

	              else

	              {

	              System.out.println("Text is not displayed");

	              }
		//verifying page title         
		         
		         String expectedname ="Forgotten Password | Can't Log In | Facebook";
		         String actualtitle=driver.getTitle();
		         if(actualtitle.equals(expectedname)) {
		        	 System.out.println("you are on the right page");
		        	 System.out.println("the title of Your Current page is :"+ actualtitle);
		        	 
		         }
		  //     Verifying  Find Your Account is Displayed
		         boolean IconPresence =driver.findElement(By.xpath("//h2[@class='uiHeaderTitle']")).isDisplayed();
		            boolean IconEnabled = driver.findElement(By.xpath("//h2[@class='uiHeaderTitle']")).isEnabled();
		 
		              if (IconPresence==true && IconEnabled==true)
		              {
		            	      System.out.println("Find Your Account is Displayed"); 
		                   
		              }
		              else
		              {
		            	  System.out.println("Find Your Account is Not Displayed");
		              }
		              
		             
		              
		              
				         
		    
		      driver.close();
		   }
         
	}


