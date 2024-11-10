package locator;

import org.openqa.selenium.By;

public class loginSelector {
// option + command + l esto es para ordenar el formato
    // declaramos un objeto usuario, pass y boton
    public static By txtUser = By.cssSelector("input[name='username']");
    public static By txtPass = By.cssSelector("input[name='password']");
    public static By btnSubmit = By.cssSelector("button[type='submit']");

}
