import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewsPage {
    private SelenideElement cameraOpenBtn;

    public boolean cameraOpenBtnExist(){
        cameraOpenBtn=$(By.xpath("//android.widget.FrameLayout[@content-desc=\"Открыть камеру\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView")).should(Condition.exist);
        return cameraOpenBtn.exists();
    }

}
