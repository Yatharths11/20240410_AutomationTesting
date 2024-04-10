import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class GoogleElementLocators {
    public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new FirefoxDriver();
        
        try {
            // Navigate to the provided webpage
            driver.get("https://www.redbus.com/");
            
            WebElement help = driver.findElement(By.xpath("//A[@href='/info/redcare'][text()='Help']"));
            Actions action1 = new Actions(driver);
            action1.click(help).build().perform();
            
            
            driver.get("https://www.redbus.com/info/redcare");
            WebElement cross = driver.findElement(By.xpath("//I[@class='icon-close']"));
            Actions action2 = new Actions(driver);
            action2.click(cross);
//           
//            
//            WebElement cross = driver.findElement(By.xpath("//I[@class='icon-close']"));
//            action.click(cross).build().perform();
//            WebElement unaided = driver.findElement(By.xpath("//A[@href='../schools/unAided.html'][text()='Un-Aided']"));
            

        }
        finally {
        	System.out.println("Here");
        }
    }
}