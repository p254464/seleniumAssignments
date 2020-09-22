package assignments3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("Parameswari");
		driver.findElementById("createLeadForm_lastName").sendKeys("M");
		Select s = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		s.selectByVisibleText("Employee");
		Select m = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		m.selectByValue("9001");
		Select n = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		n.selectByIndex(15);
		Select O = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		O.selectByIndex(5);
		Select C = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
		C.selectByValue("IND");
		driver.findElementByName("submitButton").click();
		System.out.println(driver.getTitle());

		// driver.close();

	}

}
