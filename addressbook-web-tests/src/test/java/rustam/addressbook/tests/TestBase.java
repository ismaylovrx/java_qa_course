package rustam.addressbook.tests;

import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import rustam.addressbook.appmanager.ApplicationManager;

public class TestBase {

    public final ApplicationManager app = new ApplicationManager();
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }


    public void Logout() {
        driver.findElement(By.linkText("Logout")).click();
    }

    public void submitNewUserCreation() {
        driver.findElement(By.xpath("//input[21]")).click();
    }

    public void gotoNewUserPage() {
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    }

    public void login(String username, String password) {
        driver.get(baseUrl + "/addressbook/");
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }


}