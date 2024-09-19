package Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    WebDriver driver;

    @FindBy(id ="username")
    WebElement uname;

    @FindBy(id ="password")
    WebElement pass;

    @FindBy(id ="login")
    WebElement button;

    public Login_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String username){
        uname.sendKeys(username);
    }
     public void enterPassword(String password){
     pass.sendKeys(password);
     }
     public void clickLoginBtn(){
     button.click();
     }

    }

