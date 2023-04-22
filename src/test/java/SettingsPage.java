import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SettingsPage {

    private SelenideElement serviceBtn;

    private SelenideElement menuBtn;

    private SelenideElement settingsBtn;

    private SelenideElement appearanceBtn;

    private SelenideElement darkThemeBtn;

    private SelenideElement systemThemeBtn;

    private SelenideElement backBtn;

    private SelenideElement logoutBtn;

    private SelenideElement sureLogoutBtn;

    private SelenideElement anotherAccountBtn;

    public void serviceBtnClick(){
        serviceBtn=$(By.xpath("//android.widget.FrameLayout[@content-desc=\"Сервисы\"]/android.widget.FrameLayout[2]/android.widget.ImageView")).should(Condition.exist);
        serviceBtn.click();
    }

    public void menuBtnClick(){
        menuBtn=$(By.id("com.vkontakte.android:id/menu")).should(Condition.exist);
        menuBtn.click();
    }

    public void settingsBtnClick(){
//        settingsBtn=$(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]")).should(Condition.exist);
        settingsBtn=$(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]")).should(Condition.exist);
        settingsBtn.click();

    }

    public void appearanceBtnClick(){
        appearanceBtn=$(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]")).should(Condition.exist);
        appearanceBtn.click();

    }

    public void darkThemeBtnClick(){
        darkThemeBtn=$(By.id("com.vkontakte.android:id/dark_theme_btn")).should(Condition.exist);
        darkThemeBtn.click();
    }

    public boolean darkThemeBtnExist(){
        darkThemeBtn=$(By.id("com.vkontakte.android:id/dark_theme_btn")).should(Condition.exist);
        return darkThemeBtn.exists();
    }

    public void systemThemeBtnClick(){
        systemThemeBtn=$(By.id("com.vkontakte.android:id/system_theme_btn")).should(Condition.exist);
        systemThemeBtn.click();
    }

    public void backBtnClick(){
        backBtn=$(By.xpath("//android.widget.ImageButton[@content-desc=\"Назад\"]")).should(Condition.exist);
        backBtn.click();
    }

    public boolean appearanceBtnExist(){
        appearanceBtn=$(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]")).should(Condition.exist);
        return appearanceBtn.exists();

    }

    public void logoutBtnClick(){
        logoutBtn=$(By.id("com.vkontakte.android:id/logout")).should(Condition.exist);
        logoutBtn.click();
    }

    public void sureLogoutBtnClick(){
        sureLogoutBtn=$(By.id("android:id/button1")).should(Condition.exist);
        sureLogoutBtn.click();
    }

    public SelenideElement anotherAccountBtnClick(){
        anotherAccountBtn=$(By.id("com.vkontakte.android:id/use_another_account")).should(Condition.exist);
        return anotherAccountBtn;
    }
}
