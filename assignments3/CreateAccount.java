package assignments3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		driver.findElementByXPath("//input[@id='accountName']").sendKeys("Debit Limited Account");
		driver.findElementByXPath("//textarea[@name='description']").sendKeys("Selenium Automation Tester");
		driver.findElementByXPath("//input[@id='groupNameLocal']").sendKeys("param");
		driver.findElementByXPath("//input[@id='officeSiteName']").sendKeys("Coimbatore");
		driver.findElementByXPath("//input[@id='annualRevenue'and@class='inputBox']").sendKeys("10000$");
		Select n = new Select(driver.findElementByName("industryEnumId"));
		n.selectByIndex(3);
		Select O = new Select(driver.findElementByName("ownershipEnumId"));
		O.selectByVisibleText("S-Corporation");	
		Select s = new Select(driver.findElementById("dataSourceId"));
		s.selectByValue("LEAD_EMPLOYEE");
		Select P = new Select(driver.findElementById("marketingCampaignId"));
		P.selectByIndex(7);
		Select T = new Select(driver.findElementById("generalStateProvinceGeoId"));
		T.selectByValue("TX");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		WebElement End = driver.findElementByLinkText("Create Account Ignoring Duplicates");
		End.click();
		Thread.sleep(500);
		End.sendKeys(Keys.ENTER);
		
		
			
		
		
	}

}
