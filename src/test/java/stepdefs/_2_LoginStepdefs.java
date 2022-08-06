package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LocatorsInterface;
import utils.BaseClass;

import java.util.Map;

import static pages.InformationClass.*;

public class _2_LoginStepdefs extends BaseClass implements LocatorsInterface {


    @Given("user on homePage")
    public void userOnHomePage() {

        open(url);
        verifyElementContainsText(advantageDemoTitle, advantageHomePageTitle);

    }
    @When("Enter username and password and click Login button")
    public void enterUsernameAndPasswordAndClickLoginButton() throws InterruptedException {
        clickTo(menuUserItem);
        Thread.sleep(3000);

        sendKeysTo(inputUserName, inputUserNameString);

    }





    @When("user Login as follows")
    public void userLoginAsFollows(DataTable table) throws InterruptedException {
        clickTo(menuUserItem);
        Map<String, String> map = table.asMap(String.class, String.class);
        sendKeysTo(inputUserName, map.get("userName"));
        sendKeysTo(inputPassword, map.get("password"));
        Thread.sleep(2000);
        clickTo(signIn);
    }
    @Then("User should be able to login successfully")
    public void userShouldBeAbleToLoginSuccessfully() {
        verifyElementContainsText(userNameTitle,inputUserNameString);
    }
}

