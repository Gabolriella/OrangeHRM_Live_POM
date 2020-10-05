package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LoginPage;

public class SetupTests {
    //Create a WebDriver Object
    private WebDriver driver;
    //Create LoginPage Object
    protected LoginPage loginPage;

    @BeforeTest
    public void setUp()
    {
        //Browser setup for Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOREMI TAIWO OLAMIDE\\Documents\\OrangeHRM_LIVE_Auto_Test\\Resources\\chromedriver.exe");
        //Instantiate WebDriver Object
        driver = new ChromeDriver();

        //Maximize window size
        driver.manage().window().maximize();

        //Launch the application
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //Instantiate login page after launching the browser - Handle
        loginPage = new LoginPage(driver);
    }
    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }
}
