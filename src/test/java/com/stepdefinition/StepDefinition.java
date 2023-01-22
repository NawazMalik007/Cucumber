package com.stepdefinition;

import com.Base.BaseClass;
import com.Pojo.BookHotelPojo;
import com.Pojo.BookingConfirmationPojo;
import com.Pojo.HotelInfoPojo;
import com.Pojo.PojoClass;
import com.Pojo.SelectHotelPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StepDefinition extends BaseClass {
	 
	public static PojoClass pj;
	public static SelectHotelPojo sh;
	public static HotelInfoPojo hp;
	public static BookHotelPojo bp;
	public static BookingConfirmationPojo bc;
	
	@Given("User launch adactin web Application")
	public void user_launch_adactin_web_Application() {
		
	}

	@When("User enters valid Username  and valid password")
	public void user_enters_valid_Username_and_valid_password() throws InterruptedException {
		PojoClass pj= new PojoClass();
	   type(pj.getUsernamee(),"nawazsheriff");
	   type(pj.getPasswordd(),"sheriff@123");
	   
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		PojoClass pj= new PojoClass();
	  btnClick(pj.getLoginn());
	}

	@Then("User verify Hotel page is displayed")
	public void user_verify_Hotel_page_is_displayed() {
		String searchHotel = getTitle();
		boolean contains = searchHotel.contains("Search Hotel");	
		System.out.println(contains);
		System.out.println(searchHotel);
		}

	@When("User selects preferred location, Hotel,Room type,Number of rooms,Adults per Room,Children per Room")
	public void user_selects_preferred_location_Hotel_Room_type_Number_of_rooms_Adults_per_Room_Children_per_Room() {
		SelectHotelPojo sh = new SelectHotelPojo();
		sh.selectVisibleText(sh.getLocation(), "Sydney");
		sh.selectVisibleText(sh.getHotel(), "Hotel Creek");
		sh.selectVisibleText(sh.getRoomType(), "Standard");
		sh.selectVisibleText(sh.getNoOfRooms(), "1 - One");
		sh.selectVisibleText(sh.getAdultperRoom(), "1 - One");
		sh.selectVisibleText(sh.getChildperRoom(), "1 - One");
	}

	@When("User enters Check In Date")
	public void user_enters_Check_In_Date() {
		SelectHotelPojo sh = new SelectHotelPojo();
	    type(sh.getCheckIn(), "20/01/2023");
	}

	@When("User enters Check Out  Date")
	public void user_enters_Check_Out_Date() {
		SelectHotelPojo sh = new SelectHotelPojo();
	   type(sh.getCheckOut(), "21/01/2023");
	   }

	@When("User clicks Search button")
	public void user_clicks_Search_button() {
		SelectHotelPojo sh = new SelectHotelPojo();
	  btnClick(sh.getSearch());
	}

	@Then("User verify  Select Hotel page is displayed")
	public void user_verify_Select_Hotel_page_is_displayed() {
	  String selectedHotelTitle = getTitle();
	  boolean contains = selectedHotelTitle.contains("Select Hotel");
	  System.out.println(contains);
	  System.out.println(selectedHotelTitle);
	}

	@Then("User clicks Select radio  button")
	public void user_clicks_Select_radio_button() {
		HotelInfoPojo hp= new HotelInfoPojo();
		btnClick(hp.getSelect());
	}

	@Then("User clicks Continue button")
	public void user_clicks_Continue_button() {
		HotelInfoPojo hp= new HotelInfoPojo();
	  btnClick(hp.getContinuee());
	}

	@Then("User verify  Book a hotel page is displayed")
	public void user_verify_Book_a_hotel_page_is_displayed() {
	   String BookHotelTitle = getTitle();
	   boolean contains = BookHotelTitle.contains("Book A Hotel");
	   System.out.println(contains);
	   System.out.println(BookHotelTitle);
	}

	@When("User enters First Name,Last  Name,Billing Address  Name")
	public void user_enters_First_Name_Last_Name_Billing_Address_Name() {
		BookHotelPojo bp= new BookHotelPojo();
		type(bp.getFirstName(), "abul");
		type(bp.getLastName(), "azad");
		type(bp.getAddress(), "pudhupettai");
	}

	@When("User enters Credit Card No.")
	public void user_enters_Credit_Card_No() {
		BookHotelPojo bp= new BookHotelPojo();
		type(bp.getCreditCardNo(), "7654321234567890");
	   
	}

	@When("User selects   Credit Card Type,Expiry Date by selecting month and year,CVV Number")
	public void user_selects_Credit_Card_Type_Expiry_Date_by_selecting_month_and_year_CVV_Number() {
		BookHotelPojo bp= new BookHotelPojo();
	   selectVisibleText(bp.getCreditCardType(), "American Express");
	   selectVisibleText(bp.getExpMonth(), "September");
	   selectVisibleText(bp.getExpYear(), "2021");
	   type(bp.getCvvNum(), "0800");
	}

	@When("User clicks Book now  button")
	public void user_clicks_Book_now_button() {
		BookHotelPojo bp= new BookHotelPojo();
	  btnClick(bp.getBookNow());
	}

	@Then("User verify  Hotel booking confirmation page is displayed with order number")
	public void user_verify_Hotel_booking_confirmation_page_is_displayed_with_order_number() {
		
		BookingConfirmationPojo bc= new BookingConfirmationPojo();
		implictWait(35);
		String orderId = bc.getOrderNo().getAttribute("value");
	    System.out.println(orderId);
	    String bookingConfirmationTitle = getTitle();
	    boolean contains = bookingConfirmationTitle.contains("Booking Confirmation");
	    System.out.println(contains);
	    System.out.println(bookingConfirmationTitle);
	}

	@When("User enters valid {string}  and valid {string}")
	public void user_enters_valid_and_valid(String username, String password) {
		PojoClass pj= new PojoClass();
	    type(pj.getUsernamee(), username);
	    type(pj.getPasswordd(), password);
	}

	@When("User selects preferred {string}, {string},{string},{string},{string},{string}")
	public void user_selects_preferred(String Location, String Hotels, String RoomType, String NumberofRooms, String AdultsperRoom, String ChildrenperRoom) {
		SelectHotelPojo sh = new SelectHotelPojo();
	    selectVisibleText(sh.getLocation(), Location);
	    selectVisibleText(sh.getHotel(), Hotels);
	    selectVisibleText(sh.getRoomType(), RoomType);
	    selectVisibleText(sh.getNoOfRooms(), NumberofRooms);
	    selectVisibleText(sh.getAdultperRoom(), AdultsperRoom);
	    selectVisibleText(sh.getChildperRoom(), ChildrenperRoom);
	}

	@When("User enters {string},{string},{string}")
	public void user_enters(String FirstName, String LastName, String Address) {
		BookHotelPojo bp= new BookHotelPojo();
		 type(bp.getFirstName(), FirstName);
		 type(bp.getLastName(), LastName);
		 type(bp.getAddress(), Address);
	   
	}

	@When("User enters {string} , selects   {string},Expiry Date by selecting {string} and {string},enters {string}")
	public void user_enters_selects_Expiry_Date_by_selecting_and_enters(String CreditCardNo, String CreditCardType, String expMonth, String expYear, String CVVNumber) {
		
		BookHotelPojo bp= new BookHotelPojo();
		type(bp.getCreditCardNo(),CreditCardNo);
		selectVisibleText(bp.getCreditCardType(), CreditCardType);
		selectVisibleText(bp.getExpMonth(), expMonth);
		selectVisibleText(bp.getExpYear(), expYear);
		type(bp.getCvvNum(), CVVNumber);
	}


	
	}
