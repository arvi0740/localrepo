package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class automation
{
    public static void main(String[] args) throws InterruptedException {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(400);
        WebElement userName= driver.findElement(By.id("email"));
        userName.sendKeys("9415698321");
        Thread.sleep(200);
        WebElement passWord = driver.findElement(By.id("pass"));
        passWord.sendKeys("pragyarvind");
        Thread.sleep(200);
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);

        WebElement profile= driver.findElement(By.xpath("//*[name()='g' and contains(@mask,'url(#:R6km')]//*[name()='image' and contains(@x,'0')]"));
        profile.click();
        Thread.sleep(2000);
        WebElement logout = driver.findElement(By.xpath("//span[normalize-space()='Log Out']"));


        logout.click();
        Thread.sleep(400);

        driver.quit();









    }
}



