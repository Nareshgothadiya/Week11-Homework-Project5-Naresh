package programme5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Project_5_ForChromeBrowser {
    public static void main(String[] args) {
        //set driver property
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        //create object
        WebDriver driver = new ChromeDriver();
        //Launch the url
        driver.get("https://courses.ultimateqa.com/users/sign_in");
        //maximise the window
        driver.manage().window().maximize();
        //give implecit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //print the page title
        System.out.println("the page title is : " + driver.getTitle());
        //print the current page URL
        System.out.println("The Current page URL is :" + driver.getCurrentUrl());
        //get page source elements
        System.out.println("The page source element are :" + driver.getPageSource());
        //find the email field and sent the email
        WebElement userField = driver.findElement(By.id("user[email]"));
        userField.sendKeys("ultimateqa@gmail.com");
        //find password field and send password
        WebElement passField = driver.findElement(By.name("user[password]"));
        passField.sendKeys("ultimate123");
        //close browser
        //driver.quit();

    }
}
