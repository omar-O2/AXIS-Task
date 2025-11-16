import Utilities.Json_Data;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.net.URL;

public class TestBase {
    public static WebDriver driver;

    @BeforeMethod
    public static void Initiate_Website() {

        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\Production\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
        driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://ecommerce.tealiumdemo.com/");
    }
   @AfterMethod
    public static void Close_Browser(){
        driver.quit();
    }
}




