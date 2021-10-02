package googlecloudtests;

import driver.DriverOrigin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;

public class BaseTest extends BasePage {

    private final Logger LOGGER = LogManager.getLogger();

    @BeforeSuite(alwaysRun = true)
    public void onStartLog() {
        LOGGER.info("- - -TEST STARTED- - -");
    }

    @AfterSuite(alwaysRun = true)
    public void teardown() {
        DriverOrigin.getDriverOrigin().killDriver();
        LOGGER.info("- - - -TEST ENDED- - - -\n\n");
    }
}
