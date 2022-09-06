package org.test;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pom.BookPage;
import org.pom.ConfirmationPage;
import org.pom.LoginPage;
import org.pom.SearchPage;
import org.pom.SelectPage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Adactin extends BaseClass {

	@BeforeSuite

	private void launchBrowser() {

		browserLaunch("http://adactinhotelapp.com/");

	}

	@Test(priority = 1)
	private void login() {

		LoginPage a = new LoginPage();
		enterText(a.getUsername(), "AHAMEDNAWAZ");
		enterText(a.getPassword(), "Ahamed@123");
		buttonClick(a.getLogin());

		System.out.println("Log in Successfully");

	}

	@Test(priority = 2)
	private void searchHotel() {

		SearchPage b = new SearchPage();

		WebElement location = b.getLocation();
		selectByIndex(location, 5);

		WebElement adultsPerRoom = b.getAdultsPerRoom();
		selectByIndex(adultsPerRoom, 2);

		WebElement checkInDate = b.getCheckInDate();
		checkInDate.clear();
		enterDate(checkInDate, "05/09/2022");

		WebElement checkOutDate = b.getCheckOutDate();
		checkOutDate.clear();
		enterDate(checkOutDate, "08/9/2022");

		WebElement roomType = b.getRoomType();
		selectByvisibleText(roomType, "Super Deluxe");

		WebElement numberOfRooms = b.getNumberOfRooms();
		selectByIndex(numberOfRooms, 5);

		WebElement childrensPerRoom = b.getChildrensPerRoom();
		selectByValue(childrensPerRoom, "2");

		WebElement hotels = b.getHotels();
		selectByvisibleText(hotels, "Hotel Creek");

		WebElement searchButton = b.getSearchButton();
		buttonClick(searchButton);

		System.out.println(" Successflly navigated to select Hotel page ");

	}

	@Test(priority = 3)
	public void selectHotel() {

		SelectPage c = new SelectPage();

		WebElement selectButton = c.getSelectButton();
		buttonClick(selectButton);

		WebElement continueButton = c.getContinueButton();
		buttonClick(continueButton);

		System.out.println("Successfully navigated to Book A Hotel Page");
	}

	@Test(priority = 4)
	private void bookHotel() {

		BookPage d = new BookPage();

		enterText(d.getFirstname(), "AHAMED");
		enterText(d.getLastname(), "NAWAZ");
		enterText(d.getBillingAddress(), "CHENNAI");
		enterText(d.getCreditCard(), "1234567891234567");

		WebElement creditCardType = d.getCreditCardType();
		selectByvisibleText(creditCardType, "American Express");

		WebElement expiryMonth = d.getExpiryMonth();
		selectByValue(expiryMonth, "2");

		WebElement expiryYear = d.getExpiryYear();
		selectByValue(expiryYear, "2022");

		WebElement cvvNumber = d.getCvvNumber();
		enterText(d.getCvvNumber(), "123");

		WebElement bookNow = d.getBookNow();
		buttonClick(bookNow);

		System.out.println(" Successfully navigated to confirmation page");

	}

	@Test(priority =5)
	private void bookConfirmation() {
		
	ConfirmationPage e = new ConfirmationPage();
	
	WebElement logoutButton= e.getLogoutButton();
	buttonClick(logoutButton);
	
	System.out.println(" TestNg - successfull");
		
		
		
		
		
		
		
	}
}
