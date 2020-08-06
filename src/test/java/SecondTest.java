import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SecondTest extends TestBase {
//    private WebDriver driver;

//    @Before
//    public void setUp() throws Exception {
////        добавление опций коммандной строки, которые будут использованы при запуске
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-fullscreen");
//
////        driver = new EdgeDriver();
//        driver = new ChromeDriver(options);
////        driver = new FirefoxDriver();
//
////        вывод Capabilities в консоль
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("unexpectedAlertBehaviour", "dismiss");
//        System.out.println(((HasCapabilities) driver).getCapabilities());
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        driver.quit();
//    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://localhost/litecart/admin/login.php");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        Thread.sleep(1500);
    }

}