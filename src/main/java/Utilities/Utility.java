package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;





public class Utility {
    public static void Assert_On_Element (WebDriver driver, By locator, Boolean Expected, String Message) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertEquals(
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)).isEmpty(),
                Expected,Message);

    }
   public static void Assert_On_URL(WebDriver driver, String expectedUrl, String message) {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.urlToBe(expectedUrl));

       Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, message);
   }




    public static void Click_On_Element(WebDriver driver , By locator) {

        new WebDriverWait(driver, Duration.ofSeconds(45)).until(ExpectedConditions.visibilityOfElementLocated(locator));

        new WebDriverWait(driver, Duration.ofSeconds(45)).until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();

    }

    public static void Element_Appears(WebDriver driver , By locator) {


        new WebDriverWait(driver, Duration.ofSeconds(45)).until(ExpectedConditions.elementToBeClickable(locator));


    }


    /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void Send_Data(WebDriver driver , By locator, String Text) {


        new WebDriverWait(driver, Duration.ofSeconds(45)).until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).sendKeys(Text);
    }

    /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static WebElement By_To_WebElement(WebDriver driver, By locator){
        return driver.findElement(locator);
    }
    public static void Scroll_TO_Element(WebDriver driver, By Locator){

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Utility.By_To_WebElement(driver, Locator));
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.not(ExpectedConditions.attributeToBeNotEmpty(Utility.By_To_WebElement(driver,Locator),"diabled")));


    }
    /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void Hover_Element(WebDriver driver, By locator) {



        Actions actions = new Actions(driver);
        actions.moveToElement(Utility.By_To_WebElement(driver,locator)).perform();
    }

    /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void Hover_And_Click_On_Element(WebDriver driver, By locator ,By element) {

        Actions actions = new Actions(driver);

        actions.moveToElement(Utility.By_To_WebElement(driver,locator))
                .moveToElement(Utility.By_To_WebElement(driver,element))
                .click()
                .build()
                .perform();


    }

    public static void Choose_Element_From_DDL(WebDriver driver, By locator, int index) {

      new Select(By_To_WebElement(driver,locator)).selectByIndex(index);


    }




}





