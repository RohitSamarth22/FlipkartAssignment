package testCases;


import java.net.MalformedURLException;

import org.Flipkart.Base.FlipkartBaseConfig;
import org.Flipkart.Pagemodule.Click;
import org.Flipkart.Pagemodule.selectCheckbox;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testCasesFlipkart extends FlipkartBaseConfig{

	public Click clickObj;
	public selectCheckbox checkboxObj;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void initialSetup(String Port) throws MalformedURLException {
		driver = setUp(Port);
		clickObj = new Click(driver);
		checkboxObj = new selectCheckbox(driver);
	}
	
	@Test
	public void scenario() {
		clickObj.closePopupclickMobile();
		checkboxObj.mobileBrandSelect();
		checkboxObj.verifyBrandSelect();
		checkboxObj.unselectBrand();
	}
}