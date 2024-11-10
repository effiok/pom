package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myInfoPage {

    private WebDriver driver;

    public myInfoPage(WebDriver driver){
        this.driver=driver;
    }


    private By btnSearch= By.cssSelector("input[placeholder='Search']");

    private By btnMyInfo = By.cssSelector(".oxd-main-menu-item--name");
    private By txtNameFirstName = By.cssSelector("input[name='firstName']");

    public void ingresarDatos() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(btnSearch).click();
        driver.findElement(btnSearch).sendKeys("My Info");

        driver.findElement(btnMyInfo).click();
        Thread.sleep(2000);
        driver.findElement(txtNameFirstName).clear();
        driver.findElement(txtNameFirstName).sendKeys("Katherine");

    }


}
