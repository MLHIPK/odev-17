package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;
public class ButtonPage extends BaseTest {
    public ButtonPage open() {
        Selenide.open("https://demoqa.com/elements");
        return this;}

    public SelenideElement getStartedBtn() {
        return $(new ByText("Buttons"));
    }

    public SelenideElement clickMeBtn() {
        return $(new ByText("Click Me"));
    }

    public SelenideElement clickMessageText() {
        return $(By.id("dynamicClickMessage"));
    }

}
