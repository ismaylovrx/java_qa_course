package rustam.addressbook.tests;

import org.testng.annotations.Test;
import rustam.addressbook.model.NewUserData;

public class NewUserCreationTests extends TestBase{

  @Test
  public void testNewUserCreation() throws Exception {

    app.getNavigationHelper().gotoNewUserPage();
    app.getUserHelper().initNewUserCreation();
    app.getUserHelper().fillNewUserForm(new NewUserData("Rafig", "Suleyman", "Boxter", "Tiesto Company", "Zarfarpalan 133", "5947957", "0703442020", "5468123", "test@test.com", "23", "November", "1980"), NewUserCreationTests.this);
    submitNewUserCreation();

  }

}
