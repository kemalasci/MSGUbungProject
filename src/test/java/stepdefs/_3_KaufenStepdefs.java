package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LocatorsInterface;
import utils.BaseClass;

import java.awt.*;

import static pages.InformationClass.*;

public class _3_KaufenStepdefs extends BaseClass implements LocatorsInterface {
    @Given("navigate to HP PAVILION 15Z TOUCH LAPTOP")
    public void navigateToHPPAVILIONZTOUCHLAPTOP() {
        clickTo(seeOfferButton);
    }

    @Then("one blue 3 red Laptop add to cart")
    public void oneBlueRedLaptopAddToCart() throws InterruptedException {
        clickTo(addToCardButton);
        Thread.sleep(1000);
        clickTo(redProdukt);
        for (int i = 0; i < 3; i++) {
            clickTo(plusButton);
        }
        Thread.sleep(1000);
        clickTo(addToCardButton);
    }

    @And("The user should be able to purchase the products")
    public void theUserShouldBeAbleToPurchaseTheProducts() {
        clickTo(shoppingCartItem);
        clickTo(checkOutButton);

    }


    @Then("total product price and amount paid must be verified")
    public void totalProductPriceAndAmountPaidMustBeVerified() {
        verifyProduktPrice(redProduktPrice1,blauProduktPrice2, shippingPrice, totalPrice);
    }


    @And("Fill in payment method and purchase is complete")
    public void fillInPaymentMethodAndPurchaseIsComplete() throws InterruptedException, AWTException {
        clickTo(nextButton);
        clickTo(safepayInput);
      //  RobotClass(15);
        sendKeysTo(safepayInput, safePayUserName);
        clickTo(safepayPasswortInput);
        //RobotClass(12);
        sendKeysTo(safepayPasswortInput, safePayPassword);
        clickTo(buttonPayNow);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        verifyElementContainsText(successMsjContainer,successMessage);
    }
}
