package setup;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Setup {
   public AndroidDriver driver;

    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("deviceName","emulator");
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("appPackage","com.pickaboo");
        caps.setCapability("appActivity","com.pickaboo.MainActivity");
        caps.setCapability("app","C:\\APK\\pickaboo.apk");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AndroidDriver(url,caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;

    }
    @AfterTest
    public void quitDriver() {

        driver.quit();
    }

}