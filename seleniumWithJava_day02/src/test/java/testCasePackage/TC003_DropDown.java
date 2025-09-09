package testCasePackage;

import driverPackage.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;

public class TC003_DropDown extends BaseDriver {
    String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

    @Test(priority = 1)
    public void dropDown() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().window().maximize();
        Thread.sleep(200);

        driver.switchTo().frame("iframeResult");
        Thread.sleep(2000);
        WebElement e = driver.findElement(By.name("cars"));
        Select s = new Select(e);
        s.selectByValue("audi");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
    }

    @Test(priority = 2)
    public void multipleDropDown() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.switchTo().frame("iframeResult");
        Thread.sleep(2000);
        WebElement e = driver.findElement(By.name("cars"));
        Select s = new Select(e);
        Actions a = new Actions(driver);
        a.keyDown(Keys.CONTROL).click(s.getOptions().get(1)).click(s.getOptions().get(2)).build().perform();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
    }
}
