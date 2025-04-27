package pageobjects.Railway;


import common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends GeneralPage {
    WebDriver driver;
    // Locators for Register page
    private final By txtEmail = By.id("email");
    private final By txtPassword = By.id("password");
    private final By txtConfirmPassword = By.id("confirmPassword");
    private final By txtPid = By.id("pid");
    private final By btnRegister = By.xpath("//input[@value='Register']");
    private final By _lblRegisterErrorMsg = By.xpath("//*[@id=\"content\"]/p[2]");
    private final By _lblPasswordLengthErrorMsg = By.xpath("//*[@id=\"RegisterForm\"]/fieldset/ol/li[2]/label[2]");
    private final By _lblIdLengthErrorMsg = By.xpath("//*[@id=\"RegisterForm\"]/fieldset/ol/li[4]/label[2]");

    public WebElement enterEmail() {return Constant.WEBDRIVER.findElement(txtEmail);}
    public WebElement enterPassword() {return Constant.WEBDRIVER.findElement(txtPassword);}
    public WebElement enterConfirmPassword() {return Constant.WEBDRIVER.findElement(txtConfirmPassword);}
    public WebElement enterPersonalID() {return Constant.WEBDRIVER.findElement(txtPid);}
    public WebElement getbtnRegister() {return Constant.WEBDRIVER.findElement(btnRegister);}

    public WebElement getLblRegisterErrorMsg(){
        return Constant.WEBDRIVER.findElement(_lblRegisterErrorMsg);
    }
    //TC10
    public WebElement getLblPasswordLengthErrorMsg(){
        return Constant.WEBDRIVER.findElement(_lblPasswordLengthErrorMsg);
    }
    public WebElement getLblIdLengthErrorMsg(){
        return Constant.WEBDRIVER.findElement(_lblIdLengthErrorMsg);
    }
    public HomePage register(String email, String password, String confirmPassword, String PersonalID) {
//        JavascriptExecutor js = (JavascriptExecutor) Constant.WEBDRIVER;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        this.enterEmail().sendKeys(email);
        this.enterPassword().sendKeys(password);
        this.enterConfirmPassword().sendKeys(confirmPassword);
        this.enterPersonalID().sendKeys(PersonalID);
        getbtnRegister().submit();
        return new HomePage();
    }
}