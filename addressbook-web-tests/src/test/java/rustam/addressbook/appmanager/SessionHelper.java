package rustam.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.fail;

public class SessionHelper extends HelperBase {

       public SessionHelper(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        type(By.name("user"),username);
        type(By.name("pass"),password);
        click(By.cssSelector("input[type=\"submit\"]"));
    }
    public void Logout() {
        driver.findElement(By.linkText("Logout")).click();
    }


}
