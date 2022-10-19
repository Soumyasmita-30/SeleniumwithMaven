package SeleniumTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoTest {
    static WebDriver driver;
@Before
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\IdeaProjects\\SeleniumwithMaven\\src\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void loginToApplication() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @After
    public void closeBrowser(){
    driver.quit();
    }
}
