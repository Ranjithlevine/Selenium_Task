package Automation_Task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();

        //Switching to the Top frame
        driver.switchTo().frame(0);
        System.out.println("We  are now in the Top frame");

        //Getting all the frames from the top Frame
        List<WebElement>frames=driver.findElements(By.xpath("//frameset[@name='frameset-middle']//frame"));
        int count=frames.size();
        System.out.println("The no of the frame present in the top is "+count);

        //Switching to the left frame
        driver.switchTo().frame("frame-left");
        String leftframe=driver.findElement(By.tagName("body")).getText();
        System.out.println("We are now in the "+leftframe+" frame");

        //Switching back to the Top frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        System.out.println("We  are now in the Top frame");

        //Switching to the Midel frame
        driver.switchTo().frame("frame-middle");
        String MidelFrame=driver.findElement(By.tagName("body")).getText();
        System.out.println("We are now in the "+MidelFrame+" frame");

        //Switching back to the Top frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        System.out.println("We  are now in the Top frame");

        //Switching to the Right frame
        driver.switchTo().frame("frame-right");
        String RightFrame=driver.findElement(By.tagName("body")).getText();
        System.out.println("We are now in the "+RightFrame+" frame");

        //Switching back to the Top frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        System.out.println("We  are now in the Top frame");

        //Switching to the bottom frame
        String Bottomframe=driver.findElement(By.tagName("body")).getText();
        System.out.println("We are now in the "+Bottomframe+" frame");

        //Switching back to the Top frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        System.out.println("We  are now in the Top frame");

        driver.quit();

    }
}
