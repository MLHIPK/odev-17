package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ButtonPage;
import tests.BaseTest;


public class ButtonSteps {
    ButtonPage buttonPage = new ButtonPage();


    @Given("I open Demo page")
    public void iOpenDemoPage () {
       buttonPage.open();
            }

    @Then("I push the buttons")
    public void iPushTheButtons () {
        buttonPage.getStartedBtn().click(); }

    @And("I push the click me buttons")
    public void iPushTheClickMeButtons () {
        buttonPage.clickMeBtn().click();
    }

    @Then("Read click text")
    public void readClickText() {
        buttonPage.clickMessageText().getText();
    }

}
