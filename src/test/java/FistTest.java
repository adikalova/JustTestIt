import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class FistTest {
    protected static WebDriver driver;

    @BeforeTest
    public void startChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\adikalova\\Desktop\\JustTestIt\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test(priority = 1, description = "Successful login into Demoqa")
    public void SuccessfulLoginToDemoqa() {
        driver.get("http://demoqa.com/");


    }
}
