package TestPages;

import Base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends TestBase {
    HomePage homePage;

 public HomePageTest(){
     super();

    }
    @BeforeMethod
    public void setUp(){
     initialization();
     homePage = new HomePage();


    }
    @Test(priority = 1)
    public void homePageTitleTest(){
     String title =  homePage.homePageTitle();
        Assert.assertEquals(title,"An Insurance Company For Your Car And More | GEICO");

        }


    @Test(priority = 2)
    public void messageTextTest(){
     Assert.assertTrue(homePage.MessageText());
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }





}
