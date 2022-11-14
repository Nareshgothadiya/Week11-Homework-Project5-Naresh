package programme5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Project_5_ForFirefoxBrowser {
    public static void main(String[] args) {
        //Set Property
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        //create object
        WebDriver driver = new FirefoxDriver();
        //launch url
        driver.get("https://courses.ultimateqa.com/users/sign_in");
        //maximise windows
        driver.manage().window().maximize();
        //give implicit time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //get page title
        System.out.println("Page Title is : " + driver.getTitle());
        //get current url
        System.out.println("Current URL is :" + driver.getCurrentUrl());
        //get page source
        System.out.println("Page source elements are :" + driver.getPageSource());
        //Find Username field and enter username
        WebElement enterUsername = driver.findElement(By.id("user[email]"));
        enterUsername.sendKeys("naresh123@gmail.com");
        //Find Password Field and enter password
        WebElement enterPassword = driver.findElement(By.name("user[password]"));
        enterPassword.sendKeys("selenium123");
        //Close the browser
        //driver.quit();
    }
}