package rustam.addressbook.tests;

import org.testng.annotations.Test;
import rustam.addressbook.model.GroupData;

public class NewUserDeletionTests extends TestBase {

    @Test
    public void testNewUserDeletion() {
        if (! app.getUserHelper().isThereAUser()) {
            app.getUserHelper().createNewUser();
        }
        app.getUserHelper().selectUser();
        app.getUserHelper().deleteSelectedUsers();

    }

}
