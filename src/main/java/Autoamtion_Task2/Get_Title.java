package Autoamtion_Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");

       //Storing the title
        String Title= driver.getTitle();

        //Comparing the title
        if(Title.equals("STORE")){
            System.out.println("Page landed on the correct browser");
        }else{
            System.out.println("Page not landed on the correct browser");

        }
    }
}
