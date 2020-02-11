package Framework1.Fwk1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyNotesPage {

public WebDriver driver; 
	
	public MyNotesPage(WebDriver driver) {
		this.driver= driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//button[text()='Add note']")
	public WebElement btnAdd;
	

	public void clickOnAddNoteButton() {
		this.btnAdd.click();
	}
}
