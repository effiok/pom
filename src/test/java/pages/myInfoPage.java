package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myInfoPage {

    private WebDriver driver;

    public myInfoPage(WebDriver driver){
        this.driver=driver;
    }

    private By btnSearch= By.cssSelector("input[placeholder='Search']");
    private By txtMyInfo= By.cssSelector("input[placeholder='Search']");
    private By btmSearchName= By.cssSelector(".oxd-main-menu-item--name");
    private By txtNameFirstName = By.cssSelector(".oxd-main-menu-item--name");

    public void ingresarDatos() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(btnSearch).click();
        driver.findElement(txtMyInfo).sendKeys("MyInfo");
        driver.findElement(btmSearchName).click();
        driver.findElement(txtNameFirstName).sendKeys("Katherine");

    }


}
