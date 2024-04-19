package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddPage;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.open;

public class AddSteps {

    AddPage addPage = new AddPage();
    @Given("I open Demo page2")
    public void iOpenDemoPage2 () {
        addPage.addOpen();
    }

    @Then("I push the add buttons")
    public void iPushTheAddButtons () {
        addPage.addBtn().click(); }


    @And("Firstname input")
    public void firstnameInput() {
        addPage.firstNameTxt();
    }

    @And("Lastname input")
    public void lastnameInput() {
        addPage.lastNameTxt();
    }

    @And("Email input")
    public void emailInput() {
        addPage.userEmail();
    }

    @And("Age input")
    public void ageInput() {
        addPage.age();
    }

    @And("Salary input")
    public void salaryInput() {
        addPage.salary();
    }

    @And("Depart input")
    public void departInput() {
        addPage.department();
    }

    @Then("Submit click")
    public void submitClick() {
        addPage.addClick().click();
    }

    @Given("Click edit button")
    public void clickEditButton() {
        addPage.editBtn().click();
    }

    @When("Update email")
    public void updateEmail() {
        addPage.editUserEmail();
    }

    @And("Update salary")
    public void updateSalary() {
        addPage.editSalary();
    }

    @Then("Submit click button")
    public void submitClickButton() {
        addPage.submit().click();
    }
}
