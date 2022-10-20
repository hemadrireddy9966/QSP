package automationdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AsignmentOnGmail {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	WebDriver driver;
	    @BeforeMethod
	    public void gmail_login() throws InterruptedException {
	  	  
	  		String BaseURI = "https://accounts.google.com/";
	  		//System.setProperty("webdriver.chrome.driver", ".\data\chromedriver.exe");
	  		driver=new ChromeDriver();
	  		driver.get(BaseURI);
	  		driver.findElement(By.xpath("(//input[@type='email'])")).sendKeys("demou2627@gmail.com");
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
	    	
	        driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("User@7262");
            driver.findElement(By.xpath("(//input[@class='VfPpkd-muHVFf-bMcfAe'])")).click();
            //To show page login using ( "THREAD.SLEEP METHOD " )
            Thread.sleep(5000);
}
	    @Test(priority=3)
	    public void open_as_full_screen() throws InterruptedException {
	    	
	    	//To show page opened as full screen
	    	Thread.sleep(5000);
	    	driver.manage().window().maximize();
	    	driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("User@7262");
	        driver.findElement(By.xpath("(//input[@class='VfPpkd-muHVFf-bMcfAe'])")).click();
	    	
	      
            
	    	    
	   
}
	    @AfterMethod
	    public void afterTest() {
	  	  driver.close();
	    }

	}