
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://calculator.net/");
		WebElement ele = driver.findElement(By.id("calcSearchTerm"));
		ele.sendKeys("dvASDCasDa");
		driver.findElement(By.xpath("//span[@id=\"bluebtn\"]")).click();
//		driver.findElement(By.linkText("Mortgage Calculator")).click();
		

	}

}
