package week2.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

public class FacebookAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com//");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//a[@data-testid ='open-registration-form-button']")).click();
				
		driver.findElement(By.name("firstname")).sendKeys("swathi");
		driver.findElement(By.name("lastname")).sendKeys("Veeramreddy");
		driver.findElement(By.name("reg_email__")).sendKeys("9573737361");
		driver.findElement(By.id("password_step_input")).sendKeys("abcdefg@1");
		
		WebElement dateDropDown = driver.findElement(By.xpath("//select[@id = 'day']"));
		Select drop1 = new Select(dateDropDown);
		drop1.selectByIndex(10);
		 
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@id = 'month']"));
		Select drop2 = new Select(monthDropDown);
		drop2.selectByValue("8");
		
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@name = 'birthday_year']"));
		Select drop3 = new Select(yearDropDown);
		drop3.selectByValue("2010");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
	
}

}