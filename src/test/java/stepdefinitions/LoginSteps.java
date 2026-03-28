//package stepdefinitions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.time.Duration;
//
//public class LoginSteps {
//
//    WebDriver driver = null;
//
//    @Given("browser opened")
//    public void browser_opened() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe" );
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        driver.manage().window().maximize();
//    }
//
//    @Given("user is on the login page")
//    public void user_is_on_the_login_page() {
//        driver.navigate().to("https://the-internet.herokuapp.com/login");
//
//    }
//
//    @When("user enters {string} and {string}")
//    public void user_enters_the_credentials(String username, String password ) {
//        driver.findElement(By.id("username")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//
//
//    }
//
//    @And("user clicks login")
//    public void user_clicks_login(){
//        driver.findElement(By.cssSelector("button[type='submit']")).click();
//    }
//
//    @Then("homepage is shown")
//    public void homepage_is_shown() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.findElement(By.id("flash")).isDisplayed();
//        driver.close();
//        driver.quit();
//
//    }
//}
