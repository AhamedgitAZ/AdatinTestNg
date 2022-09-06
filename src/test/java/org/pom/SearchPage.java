package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass{
	
	public SearchPage () {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
 	private WebElement hotels;
	
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@name='room_nos'] ")
	private WebElement numberOfRooms;
	
	
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildrensPerRoom() {
		return childrensPerRoom;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy(name="child_room")
	private WebElement childrensPerRoom;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchButton;
	
	

}
