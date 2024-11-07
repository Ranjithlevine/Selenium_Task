package Automation_Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;

import  java.awt.Color.*;

public class Drag_Drop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
       // WebElement Dropable=driver.findElement(By.xpath("//a[contains(text(),'Droppable')]"));
        //Dropable.click();

        driver.switchTo().frame(0);

        //Element to drag
        WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));

        //Element to drop
        WebElement target= driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions action=new Actions(driver);

        action.dragAndDrop(drag,target).build().perform();

       String Expected_color="#fffa90";

            String color=target.getCssValue("background-color");

            //Converting RGBA to HEX
        String hex=org.openqa.selenium.support.Color.fromString(color).asHex();


        if(hex.equals(Expected_color)){
            System.out.println("Drag and drop has been sucessfull");

        }else{
            System.out.println("Drag and drop is not sucessfull");
        }

        //Verify the background Text
        String Verify= driver.findElement(By.xpath("//div[@id='droppable']")).getText();
        if(Verify.equals("Dropped!")){
            System.out.println("Text has verified");
        }else{
            System.out.println("Please verify the action");
        }

    }
}

