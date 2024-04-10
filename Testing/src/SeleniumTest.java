
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver n =new FirefoxDriver();
		
		
		
		n.get("https://www.calculator.net/");
//		 WebElement ele=driver.findElement(By.id("calcSearchTerm"));// 
//		ele.sendKeys("Calcolireee");
		n.findElement(By.id("calcSearchTerm")).sendKeys("sadadad");
//		driver.findElement(By.linkText("Mortgage Calculator")).click();


	}

}
