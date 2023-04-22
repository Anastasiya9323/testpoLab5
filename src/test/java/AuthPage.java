import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage {
    private SelenideElement cancelBtn;
    private SelenideElement loginField;

    private SelenideElement passwordField;

    private SelenideElement loginBtn;

    public boolean cancelBtnExist(){
            cancelBtn=$(By.id("com.google.android.gms:id/cancel")).should(Condition.exist);
            return cancelBtn.exists();
    }

    public void cancelBtnClick(){
            cancelBtn=$(By.id("com.google.android.gms:id/cancel"));
            cancelBtn.click();
//        if ($(By.id("com.google.android.gms:id/cancel")).should(Condition.exist).exists()){
//        cancelBtn=$(By.id("com.google.android.gms:id/cancel"));
//        cancelBtn.click();}
    }

    public void inputLogin(String login) {
        loginField=$(By.id("com.vkontakte.android:id/email_or_phone")).should(Condition.exist);
        loginField.sendKeys(login);
    }

    public void inputPasswd(String passwd) {
        passwordField=$(By.id("com.vkontakte.android:id/vk_password")).should(Condition.exist);
        passwordField.sendKeys(passwd);
    }

    public void clickLoginBtn() {
        loginBtn=$(By.id("com.vkontakte.android:id/login_button")).should(Condition.exist);
        loginBtn.click();
    }

    public void loginWithPassword(){
        $(By.id("com.vkontakte.android:id/login_by_password")).should(Condition.exist).click();
    }

    public void continueClick(){
        $(By.id("com.vkontakte.android:id/continue_btn")).should(Condition.exist).click();
    }
}
