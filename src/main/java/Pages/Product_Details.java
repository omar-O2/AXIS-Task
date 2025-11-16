package Pages;

import Utilities.Json_Data;
import Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Product_Details {
public WebDriver driver;

private final By Color = By.xpath(Json_Data.Get_json_Data("Product_Details_Locators","Color"));
    private final By Size = By.xpath(Json_Data.Get_json_Data("Product_Details_Locators","Size"));
    private final By Add_To_cart_Button = By.xpath(Json_Data.Get_json_Data("Product_Details_Locators", "Add_To_cart_Button"));









public Product_Details(WebDriver driver)  {
    this.driver = driver;
}

public Product_Details Press_On_Color() throws InterruptedException {
    Thread.sleep(2000);
    Utility.Scroll_TO_Element(driver,Color);
    Utility.Click_On_Element(driver,Color);
    return this;
}

    public Product_Details Press_On_Size() throws InterruptedException {
        Thread.sleep(2000);
        Utility.Scroll_TO_Element(driver,Size);
        Utility.Click_On_Element(driver, Size);
        return this;
    }
    public Product_Details Press_On_Add_To_cart_Button() throws InterruptedException {
        Thread.sleep(2000);

        Utility.Click_On_Element(driver, Add_To_cart_Button);
        return this;

    }
}
