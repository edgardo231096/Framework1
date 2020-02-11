package Framework1.Fwk1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;  
	
	public LoginPage(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH , using="//input[@name='login.username']")
	public WebElement txtUsername; 
	
	@FindBy(how=How.XPATH , using="//input[@name='login.password']")
	public WebElement txtPassword; 
	
	@FindBy(how=How.XPATH , using="//button[text()='Login']")
	public WebElement btnLogin;  
	
	public void enterUsername(String username) {
		this.txtUsername.sendKeys(username);
	} 
	
	public void enterPassword(String pwd) {
		this.txtPassword.sendKeys(pwd);
	} 
	
	public void clickOnLoginButton() {
		this.btnLogin.click();
	} 
	
	
}
