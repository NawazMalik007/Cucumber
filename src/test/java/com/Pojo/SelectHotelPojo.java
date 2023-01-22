package com.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class SelectHotelPojo extends BaseClass {
	public SelectHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	 private WebElement location;
	@FindBy(id="hotels")
	 private WebElement hotel;
	@FindBy(id="room_type")
	 private WebElement roomType;
	@FindBy(id="room_nos")
	 private WebElement noOfRooms;
	@FindBy(id="datepick_in")
	 private WebElement checkIn;
	@FindBy(id="datepick_out")
	 private WebElement checkOut;
	@FindBy(id="adult_room")
	 private WebElement adultperRoom;
	@FindBy(id="child_room")
	 private WebElement childperRoom;
	@FindBy(id="Submit")
	 private WebElement search;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdultperRoom() {
		return adultperRoom;
	}
	public WebElement getChildperRoom() {
		return childperRoom;
	}
	public WebElement getSearch() {
		return search;
	}
	
}
