package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String args[])
    {

        // Instantiate a ChromeDriver class.
       // WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        // Maximize the browser
        driver.manage().window().maximize();

        // Launch Website
        driver.get("https://staging.dx0oqxblmo7a7.amplifyapp.com/login");
    }
}
