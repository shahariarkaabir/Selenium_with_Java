package testCasePackage;

import driverPackage.BaseDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC001_VerifyPageTitle extends BaseDriver {
    String baseURL="https://jqueryui.com/checkboxradio/";

    @Test(priority = 1)
    public void verifyPageTitle()throws InterruptedException {
        driver.get(baseURL);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        String pageTitle= driver.getTitle();
        Thread.sleep(2000);
        System.out.println(pageTitle);

        String url=driver.getCurrentUrl();
        System.out.println(url);
        if(url.contains("https")){
            System.out.println("website is secure");
        }
        else {
            System.out.println("website is not secure");
        }
    }
}
