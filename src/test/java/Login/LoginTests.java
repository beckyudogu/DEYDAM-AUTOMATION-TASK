package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import selenium webdriver
    private WebDriver driver;
    //import chrome driver
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //Get url
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //page wait for complete loading
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Maximize page
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());
        //locate username field
        driver.findElement(By.id("username")).sendKeys("beccatester44337");
        //locate password field
        driver.findElement(By.id("password")).sendKeys("testersis2334#");
        //click on sign in button
        driver.findElement(By.id("root")).click();
        //close the browser after test
        driver.quit();

    }
        //initiate the test run command
        public static void main (String args[]) throws InterruptedException {
            LoginTests tests = new LoginTests();
            tests.setUp();
        }

    }



