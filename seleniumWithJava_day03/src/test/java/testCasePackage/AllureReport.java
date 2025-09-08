package testCasePackage;

import driverPackage.BaseDriver;
import io.qameta.allure.*;
import jdk.jfr.Description;
import jdk.jfr.SettingDefinition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AllureReport extends BaseDriver {
    String baseUrl="https://rahulshettyacademy.com/locatorspractice/";
    @Test
    public void allureReport()throws InterruptedException{
        driver.get(baseUrl);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @Test(priority =1, description = "try login with wrong credential")
    @Description("Try login with wrong credential")
    @Epic("EP001")
    @Feature("try login")
    @Story("error message is getting properly")
    @Step("Verify error message")
    @Severity(SeverityLevel.BLOCKER)
    public void tryLogin()throws InterruptedException{
        driver.findElement(By.id("inputUsername")).sendKeys("hello world");
        driver.findElement(By.name("inputPassword")).sendKeys("2143");
        driver.findElement(By.className("submit")).click();
        Thread.sleep(2000);
        System.out.print(driver.findElement(By.cssSelector("p.error")).getText());

    }
    @Test(priority = 2, description = "reset password")
    @Description("reset password")
    @Epic("EP002")
    @Feature("reset password")
    @Story("password is reset and got properly")
    @Step("verify the password is got properly")
    @Severity(SeverityLevel.CRITICAL)
    public void resetPassword()throws InterruptedException{
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("noname");
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("nomail@mail.com");
        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("00987611");
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 3, description = "login with right credential")
    @Description("login with right password")
    @Epic("EP003")
    @Feature("login")
    @Story("Login successfully")
    @Step("verify the login")
    @Severity(SeverityLevel.CRITICAL)
    public void login()throws InterruptedException{
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("noname");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.name("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(2000);
    }
}
