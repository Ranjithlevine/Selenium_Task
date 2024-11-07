package Automation_Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task_1 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");

        //Swtiching to Iframe

        driver.switchTo().frame(0);
        WebElement Datepicker=driver.findElement(By.xpath("//input[@id='datepicker']"));
        Datepicker.click();

        //Datepicker
        String CurrentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        System.out.println("The current month is "+ CurrentMonth);

        //Changing to next month
        WebElement Next=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
        Next.click();

        //Printing the Next month
        String NextMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        System.out.println("The Next month is "+ NextMonth);

        //Selecting Date
        List <WebElement> Date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td//a"));
        for(WebElement SearchDate:Date)
            if (SearchDate.getText().equals("22")) {
                SearchDate.click();
            }
        String Selected_Date=Datepicker.getAttribute("value");
        System.out.println("The select date is "+Selected_Date);

        driver.quit();


    }
}
