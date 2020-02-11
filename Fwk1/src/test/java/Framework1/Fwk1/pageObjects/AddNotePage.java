package Framework1.Fwk1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddNotePage {

	public WebDriver driver;  
	
	public AddNotePage(WebDriver driver) {
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH , using="//input[@name='note.title']")
	public WebElement txtTitle; 
	
	@FindBy(how=How.XPATH , using="//textarea[@name='note.description']")
	public WebElement txtDescription; 
	
	@FindBy(how=How.XPATH , using="//button[text()='Add Note']")
	public WebElement btnAddNote;  
	
	public void enterTitle(String title) {
		this.txtTitle.sendKeys(title);
	} 
	
	public void enterDescription(String desc) {
		this.txtDescription.sendKeys(desc);
	} 
	
	public void clickOnAddNoteButton() {
		this.btnAddNote.click();
	} 
}
