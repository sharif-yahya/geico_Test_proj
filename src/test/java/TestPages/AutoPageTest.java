package TestPages;

import Base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AutoPage;
import pages.HomePage;

import java.util.Iterator;
import java.util.Set;

public class AutoPageTest extends TestBase {
    AutoPage autoPage;
    HomePage homePage;

    public AutoPageTest() {
        super();
    }

    @BeforeMethod
    public void SetUp() {
        initialization();
        autoPage = new AutoPage();
        homePage = new HomePage();


    }

    @Test
    public void setAutoQuoteTest()throws IllegalArgumentException  {

        autoPage = autoPage.setStartQuote(prop.getProperty("zipCode"), prop.getProperty("DateOfBirth"),
                prop.getProperty("FirstName"),prop.getProperty("LastName"));


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}





