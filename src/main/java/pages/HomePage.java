package pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends TestBase {


    @FindBy(xpath = "//*[contains(text(),'The Insurance Savings You Expect')]")
    WebElement messageText;


    public HomePage() {
        PageFactory.initElements(driver, this);

    }

    public String homePageTitle() {
        return driver.getTitle();
    }

    public boolean MessageText() {
        return messageText.isDisplayed();
    }
}
