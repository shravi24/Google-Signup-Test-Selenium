package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
 
 public static void main(String[] args) throws InterruptedException {
  
	

	
		
	 System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();


     driver.manage().window().maximize();
     
       driver.get("https://accounts.google.com/SignUp");
  
       driver.findElement(By.id("firstName")).sendKeys("demo");
       driver.findElement(By.id("lastName")).sendKeys("Byshraddha");
       
       
    driver.findElement(By.id("username")).sendKeys("Your Email Address");
       
       
       driver.findElement(By.name("Passwd")).sendKeys("DemoPassword");
      Thread.sleep(1000);

       

       driver.findElement(By.name("ConfirmPasswd")).sendKeys("DemoPassword");
       Thread.sleep(1000);
       Thread.sleep(1000);
      
       driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();  
       driver.findElement(By.cssSelector("div[title='Birthday']")).sendKeys("March");
       driver.findElement(By.id("BirthDay")).sendKeys("12");
       driver.findElement(By.id("BirthYear")).sendKeys("1997");
       driver.findElement(By.cssSelector(" div[title='Gender']")).sendKeys("Female");
       driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("91234554372");
       driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("seleniumtrain@gmail.com");
       driver.findElement(By.cssSelector("#CountryCode div[title='Location']")).sendKeys("India");
  
 }

}

