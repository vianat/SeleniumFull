import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class FirstTest extends TestBase {
//    private WebDriver driver;

//    @Before
//    public void setUp() throws Exception {
//        добавление опций коммандной строки, которые будут использованы при запуске
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-fullscreen");

//        driver = new EdgeDriver();
//        driver = new ChromeDriver(options);
//        driver = new FirefoxDriver();

//        вывод Capabilities в консоль
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("unexpectedAlertBehaviour", "dismiss");
//        System.out.println(((HasCapabilities) driver).getCapabilities());
//    }

//    @After
//    public void tearDown() throws Exception {
//        driver.quit();
//    }

    @Test
    public void test0() throws InterruptedException {
        driver.get("http://localhost/litecart/admin/login.php");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        Thread.sleep(1500);
    }

    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.cssSelector("#app- span.name")).click();
        driver.findElement(By.cssSelector("#doc-template span.name")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Template");

        driver.findElement(By.cssSelector("#doc-logotype span.name")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Logotype");



        driver.findElement(By.cssSelector("#app-:nth-of-type(2)")).click();
        driver.findElement(By.cssSelector("#doc-catalog span.name")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Catalog");

        driver.findElement(By.cssSelector("#doc-product_groups")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Product Groups");

        driver.findElement(By.cssSelector("#doc-option_groups")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Option Groups");

        driver.findElement(By.cssSelector("#doc-manufacturers")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Manufacturers");

        driver.findElement(By.cssSelector("#doc-suppliers")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Suppliers");

        driver.findElement(By.cssSelector("#doc-delivery_statuses")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Delivery Statuses");

        driver.findElement(By.cssSelector("#doc-sold_out_statuses")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Sold Out Statuses");

        driver.findElement(By.cssSelector("#doc-quantity_units")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Quantity Units");

        driver.findElement(By.cssSelector("#doc-csv")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "CSV Import/Export");



        driver.findElement(By.cssSelector("#app-:nth-of-type(3)")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Countries");



        driver.findElement(By.cssSelector("#app-:nth-of-type(4)")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Currencies");



        driver.findElement(By.cssSelector("#app-:nth-of-type(5)")).click();
        driver.findElement(By.cssSelector("#doc-customers")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Customers");

        driver.findElement(By.cssSelector("#doc-csv")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "CSV Import/Export");

        driver.findElement(By.cssSelector("#doc-newsletter")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Newsletter");



        driver.findElement(By.cssSelector("#app-:nth-of-type(6)")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Geo Zones");



        driver.findElement(By.cssSelector("#app-:nth-of-type(7)")).click();
        driver.findElement(By.cssSelector("#doc-languages")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Languages");

        driver.findElement(By.cssSelector("#doc-storage_encoding")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Storage Encoding");



        driver.findElement(By.cssSelector("#app-:nth-of-type(8)")).click();
        driver.findElement(By.cssSelector("#doc-jobs")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Job Modules");

        driver.findElement(By.cssSelector("#doc-customer")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Customer Modules");

        driver.findElement(By.cssSelector("#doc-shipping")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Shipping Modules");

        driver.findElement(By.cssSelector("#doc-payment")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Payment Modules");

        driver.findElement(By.cssSelector("#doc-order_total")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Order Total Modules");

        driver.findElement(By.cssSelector("#doc-order_success")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Order Success Modules");

        driver.findElement(By.cssSelector("#doc-order_action")).click();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Order Action Modules");
    }

}