package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {

    WebDriver driver;

    @FindBy(id = "username")
    WebElement un;

    @FindBy(id = "password")
    WebElement pw;

    @FindBy(css = "button[type='submit']")
    WebElement login_button;

    public void enter_un(String uname){
        un.sendKeys(uname);
    }

    public void enter_pw(String pword){
        pw.sendKeys(pword);
    }

    public void click_lb(){
        login_button.click();
    }

    public loginPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
