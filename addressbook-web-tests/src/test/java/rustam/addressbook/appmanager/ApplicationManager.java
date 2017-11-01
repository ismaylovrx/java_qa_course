package rustam.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import rustam.addressbook.model.NewUserData;
import rustam.addressbook.tests.TestBase;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
    public WebDriver driver;

    private UserHelper userHelper;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupsHelper groupsHelper;
    public boolean acceptNextAlert = true;
    public StringBuffer verificationErrors = new StringBuffer();

    public void init() {
        driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/addressbook/");
        groupsHelper = new GroupsHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        userHelper = new UserHelper(driver);
        sessionHelper.login("admin", "secret");
    }



    private void Logout() {
      driver.findElement(By.linkText("Logout")).click();
    }

    public void stop() {
        Logout();
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
          fail(verificationErrorString);
        }
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    public GroupsHelper getGroupsHelper() {
        return groupsHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public void fillNewUserForm(NewUserData newUserData, TestBase testBase) {
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
}
