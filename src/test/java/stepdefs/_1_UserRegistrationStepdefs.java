package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LocatorsInterface;
import utils.BaseClass;

import static pages.InformationClass.*;

import java.util.Map;

public class _1_UserRegistrationStepdefs extends BaseClass implements LocatorsInterface {
    String registerStr="";
    @When("navigate to Registration page")
    public void navigateToRegistrationPage() throws InterruptedException {
        clickTo(menuUserItem);
        Thread.sleep(2000);
        clickTo(createNewAccount);
    }

    @Then("Create a new account")
    public void createANewAccount(DataTable table) throws InterruptedException {
        Map<String, String> map = table.asMap(String.class, String.class);
        sendKeysTo(registUserNameInput,registerStr= randomString(6));
        sendKeysTo(registEmailInput, map.get("email"));
        sendKeysTo(registPasswordInput, map.get("password"));
        sendKeysTo(registPasswordInputConfirm, map.get("confirmPassword"));
        sendKeysTo(registNameInput, map.get("firstName"));
        sendKeysTo(surNameInput, map.get("lastName"));
        sendKeysTo(registPhoneNummerInput, map.get("phoneNummer"));


        clickTo(selectCountry);
        Thread.sleep(1000);
        select(selectCountry, selectCountryString);
        sendKeysTo(cityInput, map.get("city"));
        sendKeysTo(addresInput, map.get("addres"));
        sendKeysTo(stateInput, map.get("state"));
        sendKeysTo(postCodeInput, map.get("postCode"));
    }

    @And("tick  to Confim box and click to registiration")
    public void tickToConfimBoxAndClickToRegistiration() {
        clickTo(agreeBox);
       clickTo(registerButton);

    }

    @Then("Registration Success message should be displayed")
    public void registrationSuccessMessageShouldBeDisplayed() {
        assertActualURL();
        verifyElementContainsText(userNameTitle,registerStr);
        System.out.println(registerStr);
    }
}
