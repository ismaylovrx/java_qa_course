package rustam.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import rustam.addressbook.model.GroupData;

public class GroupsHelper {
    private WebDriver driver;

    public GroupsHelper(WebDriver driver) {
        this.driver = driver;

    }

    public void returnToGroupPage() {
      driver.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
      driver.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupData groupData) {
      driver.findElement(By.name("group_name")).clear();
      driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
      driver.findElement(By.name("group_header")).clear();
      driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      driver.findElement(By.name("group_header")).clear();
      driver.findElement(By.name("group_header")).sendKeys(groupData.getFooter());
    }

    public void initGroupCreation() {
      driver.findElement(By.name("new")).click();
    }

    public void deleteSelectedGroups() {
      driver.findElement(By.xpath("(//input[@name='delete'])[2]")).click();
    }

    public void selectGroup() {
      driver.findElement(By.name("selected[]")).click();
    }
}
