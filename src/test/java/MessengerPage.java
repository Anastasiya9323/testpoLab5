import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MessengerPage {
    private SelenideElement messengerBtn;

    private SelenideElement dialogueFrame;

    public void messengerBtnClick(){
        messengerBtn=$(By.xpath("//android.widget.FrameLayout[@content-desc=\"Мессенджер\"]/android.widget.FrameLayout[2]/android.widget.ImageView")).should(Condition.exist);
        messengerBtn.click();
    }

    public boolean dialogueFrameExist(){
        dialogueFrame=$(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")).should(Condition.exist);
        return dialogueFrame.exists();
    }
}
