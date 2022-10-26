package pagelibrary;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    @FindBy(id = "email_create")
    public WebElement emailCreateField;


    public SignInPage () {

        PageFactory.initElements(driver, this);
    }

}
