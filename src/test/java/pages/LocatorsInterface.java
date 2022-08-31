package pages;

import org.openqa.selenium.By;

import java.awt.*;

public interface LocatorsInterface {


    By advantageDemoTitle = By.xpath("//span[text()='dvantage']");
    By menuUserItem = By.id("menuUserSVGPath");

    By inputUserName = By.cssSelector("input[name='username']");
    By inputPassword = By.cssSelector("input[name='password']");
    By signIn = By.cssSelector("button#sign_in_btnundefined");
    By userNameTitle = By.cssSelector("span.hi-user.containMiniTitle.ng-binding");
    By seeOfferButton = By.cssSelector("button#see_offer_btn");
    By addToCardButton = By.cssSelector("button[name='save_to_cart']");

    By grayProdukt = By.xpath("(//span[@title='GRAY'])[2]");
    By plusButton = By.cssSelector("div.plus");
    By shoppingCartItem = By.id("shoppingCartLink");



    By checkOutButton = By.cssSelector("button.roboto-medium.tami.uft-class.ng-binding");
    By redProduktPrice1 = By.xpath("(//p[@class='price roboto-regular ng-binding'])[1]");
    By blauProduktPrice2 = By.xpath("(//p[@class='price roboto-regular ng-binding'])[2]");

    By shippingPrice = By.cssSelector("span[id='shippingCost']");
    By totalPrice = By.cssSelector("span.roboto-medium.totalValue.ng-binding");
    By nextButton = By.id("next_btn");
    By safepayInput = By.cssSelector("input[name='safepay_username']");
    By safepayPasswortInput = By.cssSelector("input[name='safepay_password']");
    By buttonPayNow = By.cssSelector("button#pay_now_btn_SAFEPAY");
    By successMsjContainer = By.cssSelector("span.roboto-regular.ng-scope");
    By createNewAccount = By.cssSelector("a.create-new-account.ng-scope");
    By registUserNameInput = By.cssSelector("input[name='usernameRegisterPage']");
    By registEmailInput = By.cssSelector("input[name='emailRegisterPage']");
    By registPasswordInput = By.cssSelector("input[name='passwordRegisterPage']");
    By registPasswordInputConfirm = By.cssSelector("input[name='confirm_passwordRegisterPage']");

    By registNameInput = By.cssSelector("input[name='first_nameRegisterPage']");
    By surNameInput = By.cssSelector("input[name='last_nameRegisterPage']");
    By registPhoneNummerInput = By.cssSelector("input[name='phone_numberRegisterPage']");
    By selectCountry = By.cssSelector("select[name='countryListboxRegisterPage']");

    By cityInput = By.cssSelector("input[name='cityRegisterPage']");
    By addresInput = By.cssSelector("input[name='addressRegisterPage']");
    By stateInput = By.cssSelector("input[name='state_/_province_/_regionRegisterPage']");
    By postCodeInput = By.cssSelector("input[name='postal_codeRegisterPage']");
    By agreeBox = By.cssSelector("input[name='i_agree']");
    By registerButton = By.cssSelector("button#register_btnundefined");

}
