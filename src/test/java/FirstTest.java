import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void test() {
        driver.get("https://google.com");
        driver.manage().window().maximize();
    }
}