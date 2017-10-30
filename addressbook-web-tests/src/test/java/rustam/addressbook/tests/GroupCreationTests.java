package rustam.addressbook.tests;

import org.testng.annotations.Test;
import rustam.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupsHelper().initGroupCreation();
    app.getGroupsHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupsHelper().submitGroupCreation();
    app.getGroupsHelper().returnToGroupPage();
  }

}