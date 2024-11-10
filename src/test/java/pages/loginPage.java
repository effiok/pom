package pages;

import locator.loginSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class loginPage {

    private WebDriver driver;

    // constructor
    // aqui recibe el parametro de otras clases
    public loginPage(WebDriver driver) {
        // utilizo el que tengo declarado localmente
        this.driver = driver;
    }

    public void ingresarCredenciales() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(loginSelector.txtUser).sendKeys("Admin");
        driver.findElement(loginSelector.txtPass).sendKeys("admin123");
        driver.findElement(loginSelector.btnSubmit).click();

    }
}
