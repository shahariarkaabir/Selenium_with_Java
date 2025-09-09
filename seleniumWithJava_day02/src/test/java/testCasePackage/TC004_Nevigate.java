package testCasePackage;

import driverPackage.BaseDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC004_Nevigate extends BaseDriver {
    String baseURL = "https://www.w3schools.com";

    @Test
    public void nevigate() throws InterruptedException {
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
    }
}
