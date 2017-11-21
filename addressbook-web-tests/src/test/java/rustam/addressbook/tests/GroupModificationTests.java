package rustam.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import rustam.addressbook.model.GroupData;

public class GroupModificationTests  extends TestBase{

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupsHelper().getGroupCount();
        if (! app.getGroupsHelper().isThereAGroup()) {
            app.getGroupsHelper().createGroup(new GroupData("test1", "h2", "footer2"));
        }
        app.getGroupsHelper().selectGroup(before -1);
        app.getGroupsHelper().initGroupModification();
        app.getGroupsHelper().fillGroupForm(new GroupData("test2", "test3", "test4"));
        app.getGroupsHelper().submitGroupModification();
        app.getGroupsHelper().returnToGroupPage();
        int after = app.getGroupsHelper().getGroupCount();
        Assert.assertEquals(after, before);
    }


}
