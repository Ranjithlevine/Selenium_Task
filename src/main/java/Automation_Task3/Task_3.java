package Automation_Task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task_3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.guvi.in/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Sign in button
       WebElement Sign_in= driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
       Sign_in.click();

       //Fullnmae
       WebElement Full_Name=driver.findElement(By.xpath("//input[@id='name']"));
       Full_Name.sendKeys("Ranjithkumar");

       //Email
        WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
        Email.sendKeys("rsnje@gmail.com");

        //Password
        WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("Ranjith@1999.");

        //mobile no
        WebElement Mobile_number=driver.findElement(By.xpath("//input[@id='mobileNumber']"));
        Mobile_number.sendKeys("8428241121");

        //Signup
        WebElement Signin=driver.findElement(By.xpath(" //a[@id='signup-btn']"));
        Signin.click();


        //maybe later
        WebElement maybelater=driver.findElement(By.xpath("//form[@id='details-form']//a[@id='laterBtn']"));
        maybelater.click();

        String title=driver.findElement(By.xpath("//div[@class='success-body-left']//h1")).getText();


       if(title.equals("Almost Done! Check Your Inbox!")){
           System.out.println("Registration sucessfull");
            }

       driver.get("https://www.guvi.in/");

       //LOgin button
       WebElement login=driver.findElement(By.xpath("//a[@id='login-btn']"));
       login.click();

       //Emailbuttom
        WebElement Email_=driver.findElement(By.xpath("//input[@id='email']"));
        Email_.sendKeys("ranjithkumarexpoff@gmail.com");

        //password
        WebElement Password_=driver.findElement(By.xpath("//input[@id='password']"));
        Password_.sendKeys("Ranjith@1999.");

        //Login
        WebElement Login_=driver.findElement(By.xpath("//a[@id='login-btn']"));
       Login_.click();

       String title_=driver.getTitle();
       System.out.println(title_ +" is sucessfull");

        driver.quit();



    }
}
