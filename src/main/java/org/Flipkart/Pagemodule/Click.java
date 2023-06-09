package org.Flipkart.Pagemodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click {
	
    WebDriver driver;
	
	public Click(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
	
	@FindBy(xpath="//*[@class='_2KpZ6l _2doB4z']")  
	public WebElement button;
	
	@FindBy(xpath="//*[text()='Mobiles & Tablets']")
	public WebElement mobiles;
	
	public void closePopupclickMobile() {
	    button.click();
	    mobiles.click();
	}

}