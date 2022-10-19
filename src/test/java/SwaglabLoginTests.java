import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwaglabLoginTests {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\IdeaProjects\\SeleniumwithMaven\\src\\drivers\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.saucedemo.com/");
 Thread.sleep(2000);
 driver.findElement(By.id("user-name")).sendKeys("standard_user");
 driver.findElement(By.id("password")).sendKeys("secret_sauce");
 driver.findElement(By.id("login-button")).click();
 Thread.sleep(2000);
 driver.quit();
    }
}
