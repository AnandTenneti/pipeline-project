import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class WebDriverClass {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test_pageTitle() {
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(),"Google","Title is not matching");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
