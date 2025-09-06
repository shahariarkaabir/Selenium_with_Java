package testCasePackage;

import driverPackage.BaseDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorLearning extends BaseDriver {
    String baseUrl="https://rahulshettyacademy.com/locatorspractice/";

    @Test
    public void locatorLearning()throws InterruptedException{
        driver.get(baseUrl);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("inputUsername")).sendKeys("hello world");
        driver.findElement(By.name("inputPassword")).sendKeys("2143");
        driver.findElement(By.className("submit")).click();
        Thread.sleep(2000);
        System.out.print(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("noname");
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("nomail@mail.com");
        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("00987611");
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("noname");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.name("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(2000);
    }

}
