package Pages;

import Authentication.Login_Flow_Page;
import Utilities.Json_Data;
import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Home_Page {
    public WebDriver driver;
    private final By Men_Tab = By.xpath(Json_Data.Get_json_Data("Home_Page_Locators", "Men_Tab"));
    private final By Accessories_Tab = By.xpath(Json_Data.Get_json_Data("Home_Page_Locators", "Accessories_Tab"));
    private final By Shoes_Subcategory = By.xpath(Json_Data.Get_json_Data("Home_Page_Locators", "Shoes_Subcategory"));
    private final By Opt_In_Consent = By.id(Json_Data.Get_json_Data("Home_Page_Locators","Opt_In_Consent"));
    private final By Submit_Button = By.id(Json_Data.Get_json_Data("Home_Page_Locators","Submit_Button"));













    public Home_Page(WebDriver driver)  {
        this.driver=driver;
    }
    public Home_Page Press_On_Men_Tab(){
        Utility.Click_On_Element(driver, Men_Tab);
        Utility.Click_On_Element(driver, Men_Tab);
        return this;

    }
    public Home_Page Hover_Accessories_Category(){
        Utility.Hover_Element(driver,Accessories_Tab);
        return this;

    }
    public Products_List Choose_Shoes_Subcategory() throws InterruptedException {
       Utility.Hover_And_Click_On_Element(driver,Accessories_Tab,Shoes_Subcategory);
        return new Products_List(driver);

    }
    public Home_Page Press_On_Submit_Button(){
        Utility.Click_On_Element(driver, Opt_In_Consent);
        Utility.Click_On_Element(driver, Submit_Button);
        return this;

    }




}
