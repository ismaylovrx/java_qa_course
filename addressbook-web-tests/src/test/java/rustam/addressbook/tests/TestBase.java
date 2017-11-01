package rustam.addressbook.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import rustam.addressbook.appmanager.ApplicationManager;
import rustam.addressbook.model.NewUserData;

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

    public void fillNewUserForm(NewUserData newUserData) {
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(newUserData.getName());
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(newUserData.getLastname());
        driver.findElement(By.name("nickname")).clear();
        driver.findElement(By.name("nickname")).sendKeys(newUserData.getNickname());
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys(newUserData.getCompany());
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(newUserData.getAddress());
        driver.findElement(By.name("home")).clear();
        driver.findElement(By.name("home")).sendKeys(newUserData.getHome_tel());
        driver.findElement(By.name("mobile")).clear();
        driver.findElement(By.name("mobile")).sendKeys(newUserData.getMobile_tel());
        driver.findElement(By.name("work")).clear();
        driver.findElement(By.name("work")).sendKeys(newUserData.getWork_tel());
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(newUserData.getEmail());
        new Select(driver.findElement(By.name("bday"))).selectByVisibleText(newUserData.getBday());
        new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(newUserData.getBmonth());
        driver.findElement(By.name("byear")).clear();
        driver.findElement(By.name("byear")).sendKeys(newUserData.getByear());
    }

    public void initNewUserCreation() {
        driver.findElement(By.linkText("add new")).click();
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