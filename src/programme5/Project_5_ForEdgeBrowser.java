package programme5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Project_5_ForEdgeBrowser {
    public static void main(String[] args) {
        //set property
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        //create object
        WebDriver driver = new EdgeDriver();
        //launch the URL
        driver.get("https://courses.ultimateqa.com/users/sign_in");
        //maximize the window
        driver.manage().window().maximize();
        //give implecit time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the page title
        System.out.println("the page title is :" + driver.getTitle());
        //print the current url
        System.out.println("The current page URL id :" + driver.getCurrentUrl());
        //get the page source elements
        System.out.println("the page elements is :" + driver.getPageSource());
        //Find User username field and enter username
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("nareshjava@gmail.com");
        //Find Password Field and enter password
        WebElement enterPass = driver.findElement(By.name("user[password]"));
        enterPass.sendKeys("apitesting123");
        //close the browser
        //driver.quit();
    }
}
