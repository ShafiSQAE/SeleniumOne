package SeleniumBasicOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup(); //will launch Browser
        WebDriver driver= new FirefoxDriver();

        driver.get("https://www.google.com/");  // will open the link
        driver.manage().window().maximize(); // will maximize the window
        System.out.println(driver.getTitle()); //this will print the title of the page

        driver.quit(); //will close the browser


    }
}
