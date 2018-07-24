import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class FistTest {
    public static WebDriver driver;

    @BeforeTest
    public void startChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\adikalova\\Desktop\\JustTestIt\\enviroment\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://demoqa.com/");
    }

    @Test(priority = 1 )
    public void LoginToDemoqa() throws InterruptedException {
        driver.get("http://demoqa.com/login");
        driver.findElement(By.id(("user_login"))).sendKeys("anastasiya");
        driver.findElement(By.id("user_pass")).sendKeys("A771d6552");
        driver.findElement(By.id("wp-submit")).click();

        Assert.assertTrue(driver.getTitle().contains("Demoqa"), "Login is successful!");
    }
    }

