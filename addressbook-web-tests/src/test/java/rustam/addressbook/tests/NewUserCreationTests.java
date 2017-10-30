package rustam.addressbook.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import rustam.addressbook.model.NewUserData;

public class NewUserCreationTests {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    baseUrl = "http://localhost:8080";
    driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    login("admin", "secret");
  }


  @Test
  public void testNewUserCreation() throws Exception {

    gotoNewUserPage();
    initNewUserCreation();
    fillNewUserForm(new NewUserData("Rafig", "Suleyman", "Boxter", "Tiesto Company", "Zarfarpalan 133", "5947957", "0703442020", "5468123", "test@test.com", "23", "November", "1980"));
    submitNewUserCreation();

  }

  private void Logout() {
    driver.findElement(By.linkText("Logout")).click();
  }

  private void submitNewUserCreation() {
    driver.findElement(By.xpath("//input[21]")).click();
  }

  private void fillNewUserForm(NewUserData newUserData) {
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

  private void initNewUserCreation() {
    driver.findElement(By.linkText("add new")).click();
  }

  private void gotoNewUserPage() {
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
  }

  private void login(String username, String password) {
    driver.get(baseUrl + "/addressbook/");
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
  }

  @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
    Logout();
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
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
}
