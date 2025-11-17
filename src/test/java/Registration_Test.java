import Authentication.Login_Flow_Page;
import Authentication.Registration;
import Pages.Home_Page;
import Utilities.Json_Data;
import Utilities.Utility;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.TmsLink;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class Registration_Test extends TestBase {



    @Test(priority = 1)
    @Epic("Registration")
    @TmsLink("https://omarradwanpop.atlassian.net/projects/SCRUM?selectedItem=com.atlassian.plugins.atlassian-connect-plugin%3Acom.thed.zephyr.je__main-project-page&atlOrigin=eyJpIjoiNmRlMzc2YjYyNGQyNGI2Y2FmMjE1OTk4NmUzYjQwMjciLCJwIjoiaiJ9#!/v2/testCase/SCRUM-T10")
    @Owner("Omar")
    @Description("User can register with invalid credentials")
    public void Registration_With_Valid_Credentials() {
        new Home_Page(driver).Press_On_Submit_Button();
        new Login_Flow_Page(driver).Press_Account_Button();
        new Registration(driver).Press_Register_Button_In_Account_DDL().Enter_First_Name(Json_Data.Get_json_Data("Registration_Cases_Data", "Registration_With_Valid_Credentials.First_Name"))
                .Enter_Middle_Name(Json_Data.Get_json_Data("Registration_Cases_Data", "Registration_With_Valid_Credentials.Middle_Name")).Enter_Last_Name(Json_Data.Get_json_Data("Registration_Cases_Data", "Registration_With_Valid_Credentials.Last_Name")).Enter_Email(Json_Data.Get_json_Data("Registration_Cases_Data", "Registration_With_Valid_Credentials.Email"))
                .Enter_Password(Json_Data.Get_json_Data("Registration_Cases_Data", "Registration_With_Valid_Credentials.Password")).Enter_Confirm_Password(Json_Data.Get_json_Data("Registration_Cases_Data", "Registration_With_Valid_Credentials.Confirm_Password"))
                .Press_On_Register_Button();
        Utility.Assert_On_URL(driver, Json_Data.Get_json_Data("URLS","Registration_URL"),"Success");



    }


    @Test(priority = 2)
    @Epic("Registration")
    @TmsLink("https://omarradwanpop.atlassian.net/projects/SCRUM?selectedItem=com.atlassian.plugins.atlassian-connect-plugin%3Acom.thed.zephyr.je__main-project-page&atlOrigin=eyJpIjoiMDcyNzBjYWUwNTlhNDg2OWFhNjk1Y2I5NjZkNzhkODEiLCJwIjoiaiJ9#!/v2/testCase/SCRUM-T4")
    @Owner("Omar")
    @Description("User cannot register with invalid credentials")
    public void Registration_With_Invalid_Credentials() {
        new Home_Page(driver).Press_On_Submit_Button();
        new Login_Flow_Page(driver).Press_Account_Button();
        new Registration(driver).Press_Register_Button_In_Account_DDL().Enter_First_Name(Json_Data.Get_json_Data("Registration_Cases_Data", "Registration_With_Invalid_Credentials.First_Name"))
                .Enter_Middle_Name(Json_Data.Get_json_Data("Registration_Cases_Data", "Registration_With_Invalid_Credentials.Middle_Name")).Enter_Last_Name(Json_Data.Get_json_Data("Registration_Cases_Data", "Registration_With_Invalid_Credentials.Last_Name")).Enter_Email(Json_Data.Get_json_Data("Registration_Cases_Data", "Registration_With_Invalid_Credentials.Email"))
                .Enter_Password(Json_Data.Get_json_Data("Registration_Cases_Data", "Registration_With_Invalid_Credentials.Password")).Enter_Confirm_Password(Json_Data.Get_json_Data("Registration_Cases_Data", "Registration_With_Invalid_Credentials.Confirm_Password"))
                .Press_On_Register_Button();

        Utility.Assert_On_Element(driver, By.xpath(Json_Data.Get_json_Data("Assertions_Locators","Registration.Alert")),false,"Success");


    }
}

