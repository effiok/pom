package test;

import org.testng.annotations.Test;
import pages.basePage;
import pages.loginPage;
import pages.myInfoPage;

public class loginTest extends basePage {

    @Test
    public void enterCredencials() throws InterruptedException {

        loginPage login = new loginPage(driver);
        login.ingresarCredenciales();

        myInfoPage info = new myInfoPage(driver);
        info.ingresarDatos();

    }

}
