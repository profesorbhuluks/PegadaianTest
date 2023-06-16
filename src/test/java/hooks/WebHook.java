package hooks;

import WebDriver.WebDriverInit;
import io.cucumber.java.Before;

public class WebHook {
    @Before
    public void inisialisasiWebdriver() {
        WebDriverInit.initialize();
    }
}
