package Pages;

import Utilities.Json_Data;
import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products_List {
    public WebDriver driver;
    private final By Add_To_Wishlist_Button = By.xpath(Json_Data.Get_json_Data("Products_List", "Add_To_Wishlist_Button"));
    private final By View_Details_Button = By.xpath(Json_Data.Get_json_Data("Products_List", "View_Details_Button"));
    private final By Sort_By_DDL = By.cssSelector(Json_Data.Get_json_Data("Products_List", "Sort_By_DDL"));
    private final By X_Icon = By.id("tealiumlabs_retail-21_inquiry5667_closeButton");
















    public Products_List(WebDriver driver)  {
        this.driver=driver;
    }
    public Products_List Press_On_Add_To_Wishlist_Button(){
        Utility.Scroll_TO_Element(driver,Add_To_Wishlist_Button);
        Utility.Click_On_Element(driver, Add_To_Wishlist_Button);
        return this;

    }
    public Product_Details Press_On_View_Details_Button()  {
        Utility.Scroll_TO_Element(driver,View_Details_Button);
        Utility.Click_On_Element(driver, View_Details_Button);
        return new Product_Details(driver);

    }
    public Product_Details Choose_Price_Option_In_DDL() {
    Utility.Choose_Element_From_DDL(driver,Sort_By_DDL,2);
        return  new Product_Details(driver);

    }
    public Products_List Press_On_X_Icon() {
        Utility.Click_On_Element(driver, X_Icon);
        return this;
    }



    }
