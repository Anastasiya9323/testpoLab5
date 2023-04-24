import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class TestClass {
    private AndroidDriver driver;

    private static AuthPage authPage;

    private static NewsPage newsPage;

    private static MessengerPage messengerPage;

    private static SettingsPage settingsPage;

    @Before
    public void setUp() throws MalformedURLException {
        Configuration.timeout=10000;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Xiaomi Redmi Note 8T");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("udid", "18834268");
        capabilities.setCapability("appPackage", "com.vkontakte.android");
        capabilities.setCapability("appActivity", "com.vkontakte.android.MainActivity");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        WebDriverRunner.setWebDriver(driver);
        open();
        authPage=new AuthPage();
        newsPage=new NewsPage();
        messengerPage=new MessengerPage();
        settingsPage=new SettingsPage();
    }

    @Test
    public void testVk() throws InterruptedException {
        if (authPage.cancelBtnExist()){
            authPage.cancelBtnClick();
        }
        authPage.inputLogin("");
//        authPage.inputLogin("");
        authPage.clickLoginBtn();
//        Thread.sleep(10000);
//        authPage.loginWithPassword();
        authPage.inputPasswd("");
        authPage.continueClick();
        if (newsPage.cameraOpenBtnExist()){
            swipeMethod(0.90);
        }
        messengerPage.messengerBtnClick();
        if (messengerPage.dialogueFrameExist()){
            swipeMethod(0.90);
        }
        settingsPage.serviceBtnClick();
        settingsPage.menuBtnClick();
        settingsPage.settingsBtnClick();
        settingsPage.appearanceBtnClick();
        if (settingsPage.darkThemeBtnExist()) {
            settingsPage.darkThemeBtnClick();
        }
        settingsPage.systemThemeBtnClick();
        settingsPage.backBtnClick();
        if (settingsPage.appearanceBtnExist()){
            swipeMethod(0.70);
        }
        settingsPage.logoutBtnClick();
        settingsPage.sureLogoutBtnClick();
        settingsPage.anotherAccountBtnClick().exists();
    }

    private void swipeMethod(double percentForStart){
        Dimension size=driver.manage().window().getSize();
        int width=(int)(size.width/2);
        int startPoint=(int)(size.getHeight() * percentForStart);
        int endPoint=(int)(size.getHeight() * 0.20);
        int duration=4000;
        new TouchAction(driver).press(PointOption.point(width,startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration))).moveTo(PointOption.point(width,endPoint)).release().perform();

    }

    @After
    public void teardown() {
        driver.quit();
    }
}
