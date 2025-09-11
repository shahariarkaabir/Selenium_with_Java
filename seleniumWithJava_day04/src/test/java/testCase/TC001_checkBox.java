package testCase;

import framework.driver.BaseDriver;
import framework.pageObject.PO001_checkBoxRadioButton;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC001_checkBox extends BaseDriver {
    String baseURL="https://jqueryui.com/checkboxradio/";

    @Test
    public void checkBox()throws InterruptedException{
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().frame(0);


        PO001_checkBoxRadioButton click=new PO001_checkBoxRadioButton(driver);
        click.clickFiveStar();
        Thread.sleep(2000);
        click.clickParis();
        Thread.sleep(2000);

    }
}
