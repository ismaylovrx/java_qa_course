package rustam.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import rustam.addressbook.model.NewUserData;

public class UserHelper extends HelperBase{


    public UserHelper(WebDriver driver) {
        super(driver);

    }

    public void initNewUserCreation() {
        click(By.linkText("add new"));
    }

    public void fillNewUserForm(NewUserData newUserData, boolean creation) {
        type(By.name("firstname"), newUserData.getName());
        type(By.name("lastname"), newUserData.getLastname());
        type(By.name("nickname"), newUserData.getNickname());
        type(By.name("company"), newUserData.getCompany());
        type(By.name("address"), newUserData.getAddress());
        type(By.name("home"), newUserData.getHome_tel());
        type(By.name("mobile"), newUserData.getMobile_tel());
        type(By.name("work"), newUserData.getWork_tel());
        type(By.name("email"), newUserData.getEmail());
        new Select(driver.findElement(By.name("bday"))).selectByVisibleText(newUserData.getBday());
        new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(newUserData.getBmonth());
        type(By.name("byear"), newUserData.getByear());

        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(newUserData.getgroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void selectUser() {
        click(By.name("selected[]"));
    }

    public void deleteSelectedUsers() {
        click(By.xpath("//input[@value='Delete']"));
        driver.switchTo().alert().accept();
    }

    public void type(By locator, String text) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void submitNewUserCreation() {
        click(By.name("submit"));
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }


    public void initUserModification() {
        click(By.cssSelector("img[alt=\"Edit\"]"));
    }

    public void submitUserModification() {
        click(By.name("update"));
    }

    public boolean isThereAUser() {
      return isElementPresent (By.name("selected[]"));

    }

    public void createNewUser() {
    initNewUserCreation();
    fillNewUserForm(new NewUserData("Rafig", "Suleyman", "Boxter",
            "Tiesto Company", "Zarfarpalan 133", "5947957", "0703442020",
            "5468123", "test@test.com", "23", "November", "1980", "test1"), true);
    submitNewUserCreation();
  }

  public void modifyNewUser() {
    selectUser();
    initUserModification();
    fillNewUserForm(new NewUserData("Mahir", "Suleyman", "Boxter",
            "Tiesto Company", "Zarfarpalan 133", "5947957", "0703442020",
            "5468123", "test@test.com", "23", "November", "1980", null), false);
    submitUserModification();
  }
}
