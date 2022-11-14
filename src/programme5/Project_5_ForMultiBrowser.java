package programme5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Project_5_ForMultiBrowser {

    static String browser = "firefox";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.drover", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser selected");
        }
        //get page url
        driver.get(baseUrl);
        //Maximise window
        driver.manage().window().maximize();
        //give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //print title of the page
        System.out.println("the page title is :" + driver.getTitle());

        //print URL of the page
        System.out.println("The current URL is : " + driver.getCurrentUrl());

        //print page source detail
        System.out.println("The page source detail is :" + driver.getPageSource());

        //find email field elements and send the email
        WebElement loginField = driver.findElement(By.id("user[email]"));
        loginField.sendKeys("ultimateq@gmail.com");

        //find password field and send password
        WebElement passField = driver.findElement(By.name("user[password]"));
        passField.sendKeys("testbatch123");

        //Close the browser
        //driver.quit();
    }
}
