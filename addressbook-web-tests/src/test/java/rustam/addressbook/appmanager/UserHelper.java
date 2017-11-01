package rustam.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import rustam.addressbook.model.NewUserData;
import rustam.addressbook.tests.TestBase;

public class UserHelper {
    private WebDriver driver;

    public UserHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void initNewUserCreation() {
        driver.findElement(By.linkText("add new")).click();
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
