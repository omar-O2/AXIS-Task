package Authentication;

import Utilities.Json_Data;
import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
    public WebDriver driver;
    private final By Register_Button_In_Account_DDL = By.xpath(Json_Data.Get_json_Data("Registration_Locators","Register_Button_In_Account_DDL"));
    private final By First_Name_Field = By.xpath(Json_Data.Get_json_Data("Registration_Locators", "First_Name_Field"));
    private final By Middle_Name_Field = By.xpath(Json_Data.Get_json_Data("Registration_Locators", "Middle_Name_Field"));
    private final By Last_Name_Field = By.xpath(Json_Data.Get_json_Data("Registration_Locators", "Last_Name_Field"));
    private final By Email_Field = By.xpath(Json_Data.Get_json_Data("Registration_Locators", "Email_Field"));
    private final By Password_Field = By.xpath(Json_Data.Get_json_Data("Registration_Locators","Password_Field"));
    private final By Confirm_Password_Field = By.xpath(Json_Data.Get_json_Data("Registration_Locators", "Confirm_Password_Field"));
    private final By News_Teller_Checkbox = By.xpath(Json_Data.Get_json_Data("Registration_Locators", "News_Teller_Checkbox"));
    private final By Remember_Me_Checkbox = By.cssSelector(Json_Data.Get_json_Data("Registration_Locators", "Remember_Me_Checkbox"));
    private final By Register_Button = By.xpath(Json_Data.Get_json_Data("Registration_Locators", "Register_Button"));







    public Registration(WebDriver driver)  {
        this.driver = driver;
    }

    public Registration Press_Register_Button_In_Account_DDL() {

        Utility.Click_On_Element(driver, Register_Button_In_Account_DDL);
        return this;
    }




    public Registration Enter_First_Name(String First_Name) {
       Utility.Send_Data(driver, First_Name_Field, First_Name);
        return this;
    }

    public Registration Enter_Middle_Name(String Middle_Name) {
        Utility.Send_Data(driver, Middle_Name_Field, Middle_Name);
        return this;
    }

    public Registration Enter_Last_Name(String Last_Name) {
        Utility.Send_Data(driver, Last_Name_Field, Last_Name);
        return this;
    }

    public Registration Enter_Email(String Email) {
        Utility.Send_Data(driver, Email_Field, Email);
        return this;
    }

    public Registration Enter_Password(String Password) {
        Utility.Send_Data(driver, Password_Field, Password);
        return this;
    }


    public Registration Enter_Confirm_Password(String Confirm_Password) {
        Utility.Send_Data(driver, Confirm_Password_Field, Confirm_Password);
        return this;
    }



    public Registration Press_On_News_Teller_Checkbox() {

        Utility.Click_On_Element(driver, News_Teller_Checkbox);
        return this;
    }
    public Registration Press_On_Remember_Me_Checkbox() {
        Utility.Click_On_Element(driver, Remember_Me_Checkbox);
        return this;
    }


    public Registration Press_On_Register_Button() {
        Utility.Scroll_TO_Element(driver,Register_Button);
        Utility.Click_On_Element(driver, Register_Button);
        return this;
    }



}