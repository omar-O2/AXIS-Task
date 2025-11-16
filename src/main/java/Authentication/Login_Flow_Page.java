package Authentication;

import Pages.Home_Page;
import Utilities.Json_Data;
import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Login_Flow_Page {

    public WebDriver driver;
    private final By Account_Button = By.xpath(Json_Data.Get_json_Data("Login_Locators"
            , "Account_Button"));
    private final By Login_Button_In_Profile_DDL = By.xpath(Json_Data.Get_json_Data("Login_Locators", "Login_Button_In_Profile_DDL"));
    private final By Email_Field = By.xpath(Json_Data.Get_json_Data("Login_Locators", "Email_Field"));
    private final By Password_Field = By.xpath(Json_Data.Get_json_Data("Login_Locators", "Password_Field"));
    private final By Login_Button = By.xpath(Json_Data.Get_json_Data("Login_Locators", "Login_Button"));



    public Login_Flow_Page(WebDriver driver)  {

        this.driver = driver;


    }


    public Login_Flow_Page Press_Account_Button() {

        Utility.Click_On_Element(driver, Account_Button);
        return this;
    }

    public Login_Flow_Page Press_Login_Button_In_Profile_DDL() {

        Utility.Click_On_Element(driver, Login_Button_In_Profile_DDL);
        return this;

    }


    public Login_Flow_Page Enter_Email(String Email) {
        Utility.Send_Data(driver, Email_Field, Email);
        return this;

    }

    public Login_Flow_Page Enter_Password(String Password) {
        Utility.Send_Data(driver, Password_Field, Password);
        return this;

    }

    public Home_Page Press_Login_Button() {

        Utility.Click_On_Element(driver, Login_Button);
        return new Home_Page(driver);
    }

}
