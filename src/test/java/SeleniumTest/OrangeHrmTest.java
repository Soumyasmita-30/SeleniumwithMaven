package SeleniumTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmTest {
    static WebDriver driver;
@Before
    public void openBrowser1(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\IdeaProjects\\SeleniumwithMaven\\src\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void loginToApplication1() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

        Thread.sleep(2000);

        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @After
    public void closeBrowser1(){
    driver.quit();
    }
}
