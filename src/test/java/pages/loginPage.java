package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class loginPage {

private WebDriver driver;

// constructor
    // aqui recibe el parametro de otras clases
public loginPage (WebDriver driver){
    // utilizo el que tengo declarado localmente
    this.driver = driver;
}
// declaramos un objeto usuario, pass y boton

private By txtUser=By.cssSelector("input[name='username']");
private By txtPass=By.cssSelector("input[name='password']");
private By btnSubmit=By.cssSelector("button[type='submit']");


    public void ingresarCredenciales() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(txtUser).sendKeys("Admin");
        driver.findElement(txtPass).sendKeys("admin123");
        driver.findElement(btnSubmit).click();

    }

/*

    @Test(priority = 1)
    public void ingresarUsuario() throws InterruptedException {
        Thread.sleep(2000);
        // Para selenium el valor del atributo en '' simples. y el valor entre dos comillas.
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);

    }

@Test(priority = 2)
    public void busquedaMyInfo(){

        driver.findElement(By.cssSelector("input[placeholder='Search']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("My info");
        driver.findElement(By.cssSelector(".oxd-main-menu-item--name")).click();

    }

    @Test(priority = 3)
    public void ingresarDatosUsuario() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='firstName']")).click();

        driver.findElement(By.cssSelector("input[name='firstName']")).clear();
        driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Katherine");

    }

  */

}
