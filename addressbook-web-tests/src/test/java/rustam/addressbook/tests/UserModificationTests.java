package rustam.addressbook.tests;

import org.testng.annotations.Test;
import rustam.addressbook.model.NewUserData;

public class UserModificationTests extends TestBase {

    @Test
    public void testUserModofocation(){
        if (! app.getUserHelper().isThereAUser()) {
            app.getUserHelper().modifyNewUser();
        }


    }

}
