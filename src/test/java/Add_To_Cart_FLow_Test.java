import Authentication.Login_Flow_Page;
import Pages.*;
import Utilities.Json_Data;
import Utilities.Utility;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.TmsLink;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Add_To_Cart_FLow_Test extends TestBase {
    @Test(priority = 1)
    @Epic("Add to cart")
    @TmsLink("https://omarradwanpop.atlassian.net/projects/SCRUM?selectedItem=com.atlassian.plugins.atlassian-connect-plugin%3Acom.thed.zephyr.je__main-project-page&atlOrigin=eyJpIjoiODhkYjBlNWU2NDdmNDI1NDlmYWE4NmQ5MTAzY2Q0YzkiLCJwIjoiaiJ9#!/v2/testCase/SCRUM-T11/testScript")
    @Owner("Omar")
    @Description("User hover accessories category")
    public void Hover_Accessories_Category() throws InterruptedException {
        new Home_Page(driver).Press_On_Submit_Button();
        new Login_Flow_Page(driver).Press_Account_Button().Press_Login_Button_In_Profile_DDL().Enter_Email(Json_Data.Get_json_Data("Login", "Valid_Credentials.Email")).Enter_Password(Json_Data.Get_json_Data("Login","Valid_Credentials.Password"))
                .Press_Login_Button();
        new Home_Page(driver).Hover_Accessories_Category();

        Utility.Assert_On_Element(driver, By.xpath(Json_Data.Get_json_Data("Assertions_Locators","Add_To_Cart.Accessories_Subcategory")),false,"Success");


    }

    @Test(priority = 2)
    @Epic("Add to cart")
    @TmsLink("https://omarradwanpop.atlassian.net/projects/SCRUM?selectedItem=com.atlassian.plugins.atlassian-connect-plugin%3Acom.thed.zephyr.je__main-project-page&atlOrigin=eyJpIjoiNGRlNzI0Y2Q5MTczNDVkZTkwN2MzODg5ZjYzOWY4ODMiLCJwIjoiaiJ9#!/v2/testCase/SCRUM-T12/testScript")
    @Owner("Omar")
    @Description("User chooses shoes subcategory")
    public void Choose_Shoes_Subcategory() throws InterruptedException {
        new Home_Page(driver).Press_On_Submit_Button();
        new Login_Flow_Page(driver).Press_Account_Button().Press_Login_Button_In_Profile_DDL().Enter_Email(Json_Data.Get_json_Data("Login", "Valid_Credentials.Email")).Enter_Password(Json_Data.Get_json_Data("Login","Valid_Credentials.Password"))
                .Press_Login_Button();
        new Home_Page(driver).Choose_Shoes_Subcategory();
        Utility.Assert_On_URL(driver, Json_Data.Get_json_Data("URLS","Shoes_Subcategory_URL"),"Success");



    }

    @Test(priority = 3)
    @Epic("Add to cart")
    @TmsLink("https://omarradwanpop.atlassian.net/projects/SCRUM?selectedItem=com.atlassian.plugins.atlassian-connect-plugin%3Acom.thed.zephyr.je__main-project-page&atlOrigin=eyJpIjoiZGY0ZDgwZTQyNDIxNDdiMjk0NjA5YjZlN2FkNzY1MWQiLCJwIjoiaiJ9#!/v2/testCase/SCRUM-T13/testScript")
    @Owner("Omar")
    @Description("User Filters products in ascending order by price")
    public void Filter_Products_From_Low_To_High() throws InterruptedException {
        new Home_Page(driver).Press_On_Submit_Button();
        new Login_Flow_Page(driver).Press_Account_Button().Press_Login_Button_In_Profile_DDL().Enter_Email(Json_Data.Get_json_Data("Login", "Valid_Credentials.Email")).Enter_Password(Json_Data.Get_json_Data("Login","Valid_Credentials.Password"))
                .Press_Login_Button();
        new Home_Page(driver).Choose_Shoes_Subcategory().Press_On_X_Icon().Choose_Price_Option_In_DDL();
        Utility.Assert_On_URL(driver, Json_Data.Get_json_Data("URLS","ASC_Order_Sort_URL"),"Success");



    }



    @Test(priority = 4)
    @Epic("Add to cart")
    @TmsLink("https://omarradwanpop.atlassian.net/projects/SCRUM?selectedItem=com.atlassian.plugins.atlassian-connect-plugin%3Acom.thed.zephyr.je__main-project-page&atlOrigin=eyJpIjoiMTQ3ODcxNTdlOGFlNGZlMDg4MmE0NTI5NGIwMDQyYjciLCJwIjoiaiJ9#!/v2/testCase/SCRUM-T6")
    @Owner("Omar")
    @Description("User can add product to cart")
    public void Add_To_Cart() throws InterruptedException {
        new Home_Page(driver).Press_On_Submit_Button();
        new Login_Flow_Page(driver).Press_Account_Button().Press_Login_Button_In_Profile_DDL().Enter_Email(Json_Data.Get_json_Data("Login", "Valid_Credentials.Email")).Enter_Password(Json_Data.Get_json_Data("Login","Valid_Credentials.Password"))
                .Press_Login_Button().Press_On_Men_Tab();
        new Products_List(driver).Press_On_View_Details_Button().Press_On_Color().Press_On_Size().Press_On_Add_To_cart_Button();


        Utility.Assert_On_URL(driver, Json_Data.Get_json_Data("URLS","Add_To_Cart_URL"),"Success");


    }

}
