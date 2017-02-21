package twitterPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class twitEditProfile {
	
	WebDriver driver;
	public twitEditProfile(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(xpath="//*[@id='page-container']/div[4]/div/div[1]/div[2]/button/div[1]/span")
	public WebElement inlineEditicon;
	@FindBy(css="button.ProfileHeaderEditing-button.u-boxShadowInsetUserColorHover")
	public WebElement uploadPhoto;
	@FindBy(css="li.cancel-options > button.dropdown-link")
	

	public WebElement cancel;
	@FindBy(css="button.ProfilePage-cancelButton.btn")
	public WebElement cancelmenu;
	
	public void changePic(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Alert alert= driver.switchTo().alert();
		alert.accept();
		inlineEditicon.click();
		uploadPhoto.sendKeys("C:\\download.jpg");
		cancel.click();
		cancelmenu.click();
	}
public void changeTitle(){
	
}

public void changeSummary(){
	
}
}
