package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;

public class AddPage extends BaseTest {
    String firstname="Meliha";
    String lastname="İpek";
    String useremail="pekm.3366@gmail.com";
    Integer age=33;
    Integer salary=40000;
    String department="Destek Uzmanı";
    String edituseremail="pekm.3366@gmail.com";
    Integer editsalary=45000;

    public AddPage addOpen() {
        Selenide.open("https://demoqa.com/webtables");
        return this;
    }

    public SelenideElement addBtn() {
        return  $(By.id("addNewRecordButton"));
    }
    public SelenideElement firstNameTxt() { return  $("#firstName").setValue(firstname); }
    public SelenideElement lastNameTxt() { return $("#lastName").setValue(lastname); }
    public SelenideElement userEmail() { return  $("#userEmail").setValue(useremail); }
    public SelenideElement age() { return  $("#age").setValue(String.valueOf(age)); }
    public SelenideElement salary() { return  $("#salary").setValue(String.valueOf(salary)); }
    public SelenideElement department() { return  $("#department").setValue(department);}
    public SelenideElement addClick() { return  $("#submit"); }

    public SelenideElement editBtn() { return   $("#edit-record-4");  }
    public SelenideElement editUserEmail() { return  $("#userEmail").setValue(edituseremail); }
    public SelenideElement editSalary() { return $("#salary").setValue(String.valueOf(editsalary)); }
    public SelenideElement submit() { return $(new ByText("Submit"));
    }

}
