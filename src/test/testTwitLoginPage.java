package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import twitterPages.twitEditProfile;
//import twitterPages.twitEditProfile;
import twitterPages.twitLandingpage;
import twitterPages.twitLoginPage;
import twitterPages.twitMyProfile;





public class testTwitLoginPage {
	
	public static Properties config= new Properties();
	

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs= new FileInputStream("C:\\sindhuselenium\\PageObjectModel\\src\\twitterConfig\\OR.properties");
		config.load(fs);
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get(config.getProperty("testsite"));
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		
		
		twitLoginPage lp = PageFactory.initElements(driver, twitLoginPage.class);
		twitLandingpage landingpage=lp.DoLogin("sindhuhcom", "test123");
		
	
		twitMyProfile profile= landingpage.gotoProfile();
	
		profile.editProfile();
		
		
		twitEditProfile edit= profile.editProfile();
		
		edit.changePic();
		
		
	

	}

}
