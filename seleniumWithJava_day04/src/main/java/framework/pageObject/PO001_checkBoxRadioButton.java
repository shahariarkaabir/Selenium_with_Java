package framework.pageObject;

import framework.driver.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO001_checkBoxRadioButton{
    WebDriver driver=null;

    public PO001_checkBoxRadioButton(WebDriver driver){
        this.driver=driver;
    }


    By fiveStar=By.xpath("//label[contains(@for,'checkbox-4')]");
    By paris=By.xpath("//label[contains(@for,'radio-2')]");

    public void clickFiveStar(){
        driver.findElement(fiveStar).click();
    }
    public void clickParis(){
        driver.findElement(paris).click();
    }

}
