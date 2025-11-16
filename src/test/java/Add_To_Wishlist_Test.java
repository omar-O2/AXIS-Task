import Authentication.Login_Flow_Page;
import Pages.Home_Page;
import Pages.Products_List;
import Utilities.Json_Data;
import Utilities.Utility;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.TmsLink;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class Add_To_Wishlist_Test extends TestBase{

    @Test(priority = 1)
    @Epic("Add to wishlist")
    @TmsLink("https://omarradwanpop.atlassian.net/projects/SCRUM?selectedItem=com.atlassian.plugins.atlassian-connect-plugin%3Acom.thed.zephyr.je__main-project-page&atlOrigin=eyJpIjoiNDdiYmE5ZTlhMWI4NDcyYTk2ZGJkODUwMWI1MDEyN2IiLCJwIjoiaiJ9#!/v2/testCase/SCRUM-T5")
    @Owner("Omar")
    @Description("User can add product to wishlist")
    public void Add_To_Wishlist()  {
        new Home_Page(driver).Press_On_Submit_Button();
        new Login_Flow_Page(driver).Press_Account_Button().Press_Login_Button_In_Profile_DDL().Enter_Email(Json_Data.Get_json_Data("Login", "Valid_Credentials.Email")).Enter_Password(Json_Data.Get_json_Data("Login","Valid_Credentials.Password"))
                .Press_Login_Button().Press_On_Men_Tab();
        new Products_List(driver).Press_On_Add_To_Wishlist_Button();

        Utility.Assert_On_Element(driver, By.xpath(Json_Data.Get_json_Data("Assertions_Locators","Wishlist.Alert")),false,"Success");


    }
}
