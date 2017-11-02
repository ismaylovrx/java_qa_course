package rustam.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import rustam.addressbook.appmanager.ApplicationManager;

public class TestBase {

    public final ApplicationManager app = new ApplicationManager(BrowserType.IE);

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

      @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }


}