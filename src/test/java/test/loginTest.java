package test;

import org.testng.annotations.Test;
import pages.basePage;
import pages.loginPage;

public class loginTest extends basePage {

    @Test
    public void enterCredencials() throws InterruptedException {

        loginPage login = new loginPage(driver);
        login.ingresarCredenciales();

    }

}
