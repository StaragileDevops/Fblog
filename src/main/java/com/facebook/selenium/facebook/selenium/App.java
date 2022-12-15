package com.facebook.selenium.facebook.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        //System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\ED\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","/home/ubuntu/chromedriver");
        
        
        ChromeOptions chromeOptions =new ChromeOptions();
        //chromeOptions.addArguments("--headless");
        //chromeOptions.addArguments("--no-sandbox");
        //chromeOptions.addArguments("--disable-dev-shm-usage");
        
        chromeOptions.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        
        WebDriver driver = new ChromeDriver(chromeOptions);
        

        driver.get("https://www.facebook.com");
        System.out.println("Successfully opened the website");
        //driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("jufyuzukne@gufum.com");
        driver.findElement(By.id("pass")).sendKeys("Facebook@123");
        WebElement pass = driver.findElement(By.id("pass"));
        pass.clear();
        pass.sendKeys("Facebook@123");
        pass.submit();
        System.out.println("Successfully logged in");
        Thread.sleep(9000);
        driver.quit();        
        System.out.println("Test case executed successfully");
        //For logout
        //driver.findElement(By.id("userNavigationLabel")).click();
        //Thread.sleep(5000);
        //driver.findElement(By.linkText("Log Out")).click();
        //System.out.println("Logged Out Successfully!!!!!!!!!!!!!!!!!!!");
        //String pagetitle = driver.getTitle();
        //System.out.println(pagetitle);
        

    }
    }

