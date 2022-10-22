package pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoPage extends TestBase {

    @FindBy(xpath = "(//div[@class='product-checkbox'])[1]")
    WebElement autoCheckBox;

    @FindBy(xpath = "//a[contains(text(),'Start My Quote')]")
    WebElement startQuote;

    @FindBy(xpath= "//input[@id='bundle-modal-zip']")
   WebElement entZipCode;

    @FindBy(xpath = "(//input[@value='Continue'])[1]")
    WebElement continueBtn;

    @FindBy(xpath = "//input[@aria-label='Date of Birth']")
    WebElement  eintDateOfBirth;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement continue2Btn;

    @FindBy(xpath = "//input[@aria-label='First Name']")
    WebElement entFirstName;

    @FindBy(xpath = "//input[@aria-label='Last Name']")
    WebElement entLastName;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement nextBtn;

 //   @FindBy(xpath = "//input[@ placeholder ='MM/DD/YYYY']")
  //  WebElement startPolicy;

  //  @FindBy(xpath = "//button[@type='submit']")
  //  WebElement nextBtn2;


    public AutoPage(){
        PageFactory.initElements(driver,this);

    }


    public AutoPage setStartQuote(String zipCode , String DateOfBirth, String FirstName,String LastName) {
        autoCheckBox.click();
        startQuote.click();
       entZipCode .sendKeys(zipCode);
        continueBtn.click();
        eintDateOfBirth.sendKeys(DateOfBirth);
        continue2Btn.click();
        entFirstName.sendKeys(FirstName);
        entLastName.sendKeys(LastName);
        nextBtn.click();

        return new AutoPage();
    }






}
