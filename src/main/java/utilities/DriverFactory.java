package utilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class DriverFactory {


    public static RemoteWebDriver getDriver(String browser) throws MalformedURLException {
    Map<String, Object> capabilities = new HashMap<>();
        capabilities.put("browserName", "chrome");
        Capabilities desiredCapabilities =  new DesiredCapabilities(capabilities);


        switch (browser) {
            case "web":
                return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
        }
        return null;
    }
}
