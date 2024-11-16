package Automation_Task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();

        //Navigating to the URL
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Getting the Current window url
        String Original_window=driver.getWindowHandle();

        //Click here Element
        WebElement clickhere=driver.findElement(By.xpath("//a[contains(text(),'Click')]"));
        clickhere.click();

        //Getting all the windows
        Set<String> windows=driver.getWindowHandles();
        List<String> listofWindows=new ArrayList<>(windows);
        driver.switchTo().window(listofWindows.get(1));

        //Storing the Title to verify
        String Title=driver.getTitle();
        System.out.println(Title);
        String Check="New Window";

        //verifing the Title
        if(Check.equals(Title)){
            System.out.println("Title is present");
        }else {
            System.out.println("Failed");
        }
        driver.close();

        //Switching back to the old window to the whether its in active or not
        driver.switchTo().window(Original_window);
        if(Original_window.equals(driver.getWindowHandle())){
            System.out.println("Current window is active");
        }else{
            System.out.println("Current window is not active");
        }
        driver.quit();

    }

}
