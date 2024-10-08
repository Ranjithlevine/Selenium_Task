package Autoamtion_Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");

        //Search field
        WebElement search =driver.findElement(By.id("searchInput"));
        search.click();
        search.sendKeys("Artificial intelligence");
     //Search button
       WebElement button= driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();
       //view history
        WebElement History=driver.findElement(By.xpath("//a[@accesskey='h']"));
        History.click();
      //Getting the title
        String title= driver.getTitle();
        System.out.println(title);
    }
}
