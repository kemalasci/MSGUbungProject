package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.SecureRandom;
import java.util.List;

import static org.testng.Assert.*;

public class BaseClass {

    protected WebDriver driver;
    private WebDriverWait wait;
    Robot robot;


    private void setUpDriver() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);


        driver.manage().window().maximize();


    }


    public BaseClass() {
        setUpDriver();
    }

    public void open(String url) {

        driver.get(url);
    }

    public void hoverToElement(By locator) {
        WebElement element = driver.findElement(locator);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public void sendKeysTo(By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }


    public void clickTo(By locator) {

        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }


    public List<WebElement> getListOf(By locator) {
        return driver.findElements(locator);
    }


    public void select(By locator, String selectByText) {
        Select objSelect = new Select(driver.findElement(locator));
        objSelect.selectByValue(selectByText);
    }


    public void sendkeyByAction(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        new Actions(driver).moveToElement(element).sendKeys(text).build().perform();
    }

    public void clickToAction(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        new Actions(driver).moveToElement(element).click().build().perform();
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void verifyElementContainsText(By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        System.out.println(driver.findElement(locator).getText());
        //   assertTrue(driver.findElement(locator).getText().toLowerCase().contains(text.toLowerCase()));
        Assert.assertEquals(driver.findElement(locator).getText().toLowerCase(), text.toLowerCase());
    }

    public void verifyProduktPrice(By grayProdukt, By blauProdukt, By shipping, By totalPreis) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(grayProdukt));


        String strGrayProduktPrice = driver.findElement(grayProdukt).getText().substring(1).replace(",","");
        System.out.println("grayProduktPrice= " + strGrayProduktPrice);
        double grayProduktPrice = Double.parseDouble(strGrayProduktPrice);



        String strBlauProduktPrice = driver.findElement(blauProdukt).getText().substring(1).replace(",","");
        System.out.println("blauProduktPrice = " +strBlauProduktPrice);
        double blauProduktPrice = Double.parseDouble(strBlauProduktPrice);
        sleep(3);


        String strShipping = driver.findElement(shipping).getText().substring(1).replace(",","");
        System.out.println("shipping= " +strShipping);
        double Shipping = Double.parseDouble(strShipping);


        double TotalPreisCheck= grayProduktPrice+blauProduktPrice+Shipping;
        System.out.println("TotalPreisCheck = "+TotalPreisCheck);


        String strTotalPreis= driver.findElement(totalPreis).getText().substring(1).replace(",","");
        System.out.println("TotalPreis = "+ strTotalPreis);
        double totalPreisSumme =Double.parseDouble(strTotalPreis);

        assertEquals(totalPreisSumme,TotalPreisCheck);

    }


    public void RobotClass(int a) throws AWTException, InterruptedException {

        for (int i = 0; i < (a); i++) {
            Thread.sleep(500);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);

        }


    }


    public static String randomString(int leng) {
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(leng);
        for (int i = 0; i < leng; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public void assertActualURL() {
        assertTrue(driver.getCurrentUrl().toLowerCase().contains("http://www.advantageonlineshopping.com/#/"));
    }

}





