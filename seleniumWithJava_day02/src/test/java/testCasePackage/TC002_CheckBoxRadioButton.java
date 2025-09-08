package testCasePackage;

import driverPackage.BaseDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC002_CheckBoxRadioButton extends BaseDriver {
    String baseURL = "https://jqueryui.com/checkboxradio/";

    @Test(priority = 1)
    public void radioButtonCheckboxButton() throws InterruptedException {
        driver.get(baseURL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@for='radio-1']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[@for='checkbox-1']")).click();
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
    }

}
