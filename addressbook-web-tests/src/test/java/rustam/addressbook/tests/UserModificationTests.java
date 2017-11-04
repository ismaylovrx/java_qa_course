package rustam.addressbook.tests;

import org.testng.annotations.Test;
import rustam.addressbook.model.NewUserData;

public class UserModificationTests extends TestBase {

    @Test
    public void testUserModofocation(){
        app.getUserHelper().selectUser();
        app.getUserHelper().initUserModification();
        app.getUserHelper().fillNewUserForm(new NewUserData("Mahir", "Suleyman", "Boxter",
                "Tiesto Company", "Zarfarpalan 133", "5947957", "0703442020",
                "5468123", "test@test.com", "23", "November", "1980", null), false);
        app.getUserHelper().submitUserModification();

    }
}
