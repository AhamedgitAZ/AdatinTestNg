package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage extends BaseClass {

	public BookPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"first_name\"]")
	private WebElement firstname;

	@FindBy(xpath = "//input[@name=\"last_name\"]")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement billingAddress;

	@FindBy(id = "cc_num")
	private WebElement creditCard;

	@FindBy(id = "cc_type")
	private WebElement creditCardType;

	@FindBy(name = "cc_exp_month")
	private WebElement expiryMonth;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	@FindBy(name = "cc_exp_year")
	private WebElement expiryYear;

	@FindBy(name = "cc_cvv")
	private WebElement cvvNumber;

	@FindBy(name = "book_now")
	private WebElement bookNow;

}
