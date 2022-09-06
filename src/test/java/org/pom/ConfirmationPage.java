package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends BaseClass {

	public ConfirmationPage() {

		PageFactory.initElements(driver, this);

}

	@FindBy(xpath="//input[@name='logout']")
	private WebElement logoutButton;

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	

}