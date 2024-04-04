package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class InputPage extends PageBase {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Input\")")
    WebElement inputBlock;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Text Input\")")
    WebElement textInputWithLabelTitle;

    public InputPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void clickInputBlock() {
        waitForVisibility(inputBlock);
        inputBlock.click();
    }

    public String checkTextInputWithLabelTitle() {
       return textInputWithLabelTitle.getText();
    }
}
