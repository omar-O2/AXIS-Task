import Pages.*;
import Authentication.Login_Flow_Page;
import Utilities.Json_Data;
import Utilities.Utility;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.TmsLink;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


import java.io.FileNotFoundException;

public class Login_FLow_Test extends TestBase {



    @Test(priority = 1)
    @Epic("Login")
    @TmsLink("https://omarradwanpop.atlassian.net/projects/SCRUM?selectedItem=com.atlassian.plugins.atlassian-connect-plugin%3Acom.thed.zephyr.je__main-project-page&atlOrigin=eyJpIjoiNDMxNWEwNDliNzdjNGI4Njg4Y2MwYzRkODEyYjIxZDEiLCJwIjoiaiJ9#!/v2/testCase/SCRUM-T9")
    @Owner("Omar")
    @Description("User can login with valid credentials")
    public void Login_With_Valid_Credentials() {
        new Home_Page(driver).Press_On_Submit_Button();
        new Login_Flow_Page(driver).Press_Account_Button().Press_Login_Button_In_Profile_DDL().Enter_Email(Json_Data.Get_json_Data("Login", "Valid_Credentials.Email")).Enter_Password(Json_Data.Get_json_Data("Login","Valid_Credentials.Password"))
                        .Press_Login_Button();

        Utility.Assert_On_URL(driver, Json_Data.Get_json_Data("URLS","Login_URL"),"Success");


    }


    @Test(priority = 2)
    @Epic("Login")
    @TmsLink("https://omarradwanpop.atlassian.net/projects/SCRUM?selectedItem=com.atlassian.plugins.atlassian-connect-plugin%3Acom.thed.zephyr.je__main-project-page&atlOrigin=eyJpIjoiNmRlMzc2YjYyNGQyNGI2Y2FmMjE1OTk4NmUzYjQwMjciLCJwIjoiaiJ9#!/v2/testCase/SCRUM-T10")
    @Owner("Omar")
    @Description("User cannot login with invalid credentials")
    public void Login_With_Invalid_Credentials()  {
        new Home_Page(driver).Press_On_Submit_Button();
        new Login_Flow_Page(driver).Press_Account_Button().Press_Login_Button_In_Profile_DDL().Enter_Email(Json_Data.Get_json_Data("Login", "Invalid_Credentials.Email")).Enter_Password(Json_Data.Get_json_Data("Login","Invalid_Credentials.Password"))
                .Press_Login_Button();

        Utility.Assert_On_Element(driver, By.xpath(Json_Data.Get_json_Data("Assertions_Locators","Login.Alert")),false,"Success");


    }

}

    









