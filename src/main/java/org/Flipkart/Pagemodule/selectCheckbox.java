package org.Flipkart.Pagemodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectCheckbox {
	
    WebDriver driver;
	
	public selectCheckbox(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
	
	@FindBy(xpath="(//*[text()='SAMSUNG'])[2]")
	public WebElement Samsung;
	
	@FindBy(xpath="//*[text()='APPLE']")
	public WebElement Apple;
	
	@FindBy(xpath="//*[text()='realme']")
	public WebElement Realme;
	
	@FindBy(xpath="//div[text()='SAMSUNG'][@class='_3sckoD']")
	public WebElement verifySamsung;
	
	@FindBy(xpath="//div[text()='APPLE'][@class='_3sckoD']")
	public WebElement verifyApple;
	
	@FindBy(xpath="//div[text()='realme'][@class='_3sckoD']")
	public WebElement verifyRealme;
		
	public void mobileBrandSelect() {
		Samsung.click();
		Apple.click();
		Realme.click();
	}
	
	public void verifyBrandSelect() {
		verifySamsung.isDisplayed();
		verifyApple.isDisplayed();
		verifyRealme.isDisplayed();
	}
	
	public void unselectBrand() {
		verifySamsung.click();
		verifyApple.click();
		verifyRealme.click();
	}

}