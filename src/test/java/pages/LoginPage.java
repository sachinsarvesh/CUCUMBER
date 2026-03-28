package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    protected WebDriver driver;

    private By un_tb  = By.id("username");
    private By pw_tb = By.id("password");
    private By lb = By.cssSelector("button[type='submit']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enter_un(String uname){
        driver.findElement(un_tb).sendKeys(uname);
    }

    public void enter_pw(String pword){
        driver.findElement(pw_tb).sendKeys(pword);
    }

    public void click_lb(){
        driver.findElement(lb).click();
    }

    public void login(String uname, String pword){
        enter_un(uname);
        enter_pw(pword);
        click_lb();
    }
}
