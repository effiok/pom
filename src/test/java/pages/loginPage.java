package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class loginPage {


    WebDriver driver;

    @Test
    public void abrirNavegador(){


        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        //options.addArguments("--headless");
        //variable de tipo webdriver para manejar el navegador
        driver = new ChromeDriver(options);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }

    public void ingresarUsuario(){

        Thread.sleep(2000);

        // Para selenium el valor del atributo en '' simples. y el valor entre dos comillas.

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");



    }

}
