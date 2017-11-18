package rustam.addressbook.tests;

import org.testng.annotations.Test;
import rustam.addressbook.model.GroupData;
import rustam.addressbook.model.NewUserData;

public class NewUserCreationTests extends TestBase{

  @Test
  public void testNewUserCreation() throws Exception {

    app.getNavigationHelper().gotoNewUserPage();
    app.getUserHelper().createNewUser();

  }



}
