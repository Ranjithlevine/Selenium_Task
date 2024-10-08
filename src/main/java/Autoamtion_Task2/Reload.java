package Autoamtion_Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reload {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        //Getting the URL
        String URL=driver.getCurrentUrl();

        //Printing the URL
        System.out.println("The current URL is "+ URL);

        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.quit();
    }
}
