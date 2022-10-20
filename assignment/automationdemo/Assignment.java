package automationdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment {
    WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	   
	    @BeforeMethod
	    public void gmail_login() throws InterruptedException {
	  	  
	  		String BaseURI = "https://accounts.google.com/";
	  	//	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  		driver.get(BaseURI);
	  		
	  		driver.findElement(By.xpath("(//input[@type='email'])")).sendKeys("demouser2726@gmail.com");
	  	     driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
	  	    
	    }
	    @Test(priority=2)
	    public void forgot_password() throws InterruptedException {
	    	Thread.sleep(2000);
	    	
	  //with in invaild password  	
	  
	        driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("Wrong_Password");
	        driver.findElement(By.xpath("(//input[@class='VfPpkd-muHVFf-bMcfAe'])")).click();
	        driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]")).click();
	        
	       
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//span[text()='Forgot password?'])")).click();
	        //TO SHOW FROGOT_PASSWORD_PAGE USING ( "THREAD.SLEEP METHOD" ) 
	        Thread.sleep(5000);
	    }
	    
	    
	    @Test(priority=1)
        public void login() throws InterruptedException {
	    	Thread.sleep(2000);
	    	
	    	//with vaild password
	    	
	        driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("Karthik2627@");
	        driver.findElement(By.xpath("(//input[@class='VfPpkd-muHVFf-bMcfAe'])")).click();
	        driver.findElement(By.xpath("(//span[text()='Next'])")).click();
            //To show page login using ( "THREAD.SLEEP METHOD " )
            Thread.sleep(10000);
}
	    @Test(priority=3)
	    public void open_as_full_screen() throws InterruptedException {
	    	
	    	//Resize the browser
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	Dimension d=new Dimension(640 , 512);
	    	driver.manage().window().setSize(d);
	    	//Thread.sleep(2000);

	    	//Move the browser
	    	Point p=new Point(300, 200);
	    	driver.manage().window().setPosition(p);
	    	//Thread.sleep(2000);

	    	
	    	//Maximize the browser
	    	
	    	driver.manage().window().maximize();
}
	    @AfterMethod
	    public void afterTest() {
	  	 driver.close();
	    }

	}


