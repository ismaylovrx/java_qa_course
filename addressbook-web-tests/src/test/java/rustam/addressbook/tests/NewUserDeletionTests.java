package rustam.addressbook.tests;

import org.testng.annotations.Test;

public class NewUserDeletionTests extends TestBase {

    @Test
    public void testNewUserDeletion() {

        app.getUserHelper().selectUser();
        app.getUserHelper().deleteSelectedUsers();
        driver.switchTo().alert().accept();
    }

}
