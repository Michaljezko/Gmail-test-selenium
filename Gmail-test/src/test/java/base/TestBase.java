package base;

import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;

public class TestBase {
    static {
        Configuration.baseUrl = "https://www.fixtest.eu";
        Configuration.timeout = 5000;
//        Configuration.pollingInterval = 100;
//        Configuration.headless = true;
        Configuration.holdBrowserOpen = true;
//        Configuration.browser = "firefox";
//        Configuration.browserSize = "1820x1080";
//        Configuration.clickViaJs = true;
        Configuration.reportsFolder = "src/test/resources/reportaze";
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriverr.exe");
    }



    @After
    public void tearDown () {
    }
}

