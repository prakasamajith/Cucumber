package org.hotelbooking;

import java.awt.Robot;
import java.io.IOException;
import java.util.List;

import org.baseclass.BaseClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HotelBooking extends BaseClass {

	WebDriver driver;
	@BeforeTest

	public void launchBrowser() {

		chromeBrowserLaunch();
		maximizeWindow();
		enterApplnUrl("https://omrbranch.com/");
		implicitWait(30);
	}

	@Test(priority = 1)
	public void loginPage() throws IOException, InterruptedException {

		WebElement txtUserName = findLocatorById("email");
		elementSendKeys(txtUserName, getCellData("Details", 0, 0));
		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, getCellData("Details", 0, 1));
		WebElement btnLogin = findLocatorByXpath("//button[text()='Login']");
		elementClick(btnLogin);
		Thread.sleep(2000);
		WebElement profile = findLocatorByXpath("//a[@data-testid='username']");
		String text = elementGetText(profile);
		System.out.println(text);

	}

	@Test(priority = 2)
	public void searchHotel() throws IOException, InterruptedException {

		WebElement hotelBooking = findLocatorByXpath("//div[@data-href=\"https://omrbranch.com/hotel-booking\"]");
		visibilityOfElement(hotelBooking);
		elementClick(hotelBooking);
		WebElement selectState = findLocatorById("state");
		selectDropdownText(selectState, getCellData("Details", 0, 2));
		Thread.sleep(2000);
		WebElement selectCity = findLocatorById("city");
		selectDropdownText(selectCity, getCellData("Details", 0, 3));
		WebElement roomType = findLocatorById("room_type");
		selectDropdownText(roomType, getCellData("Details", 0, 4));
		selectDropdownText(roomType, getCellData("Details", 0, 5));
		selectDropdownText(roomType, getCellData("Details", 0, 6));
		selectDropdownText(roomType, getCellData("Details", 0, 7));
		selectDropdownText(roomType, getCellData("Details", 0, 8));
		WebElement checkIn = findLocatorByName("check_in");
		textInsertJavascript(checkIn, getCellData("Details", 0, 9));
		WebElement checkOut = findLocatorByName("check_out");
		textInsertJavascript(checkOut, getCellData("Details", 0, 10));
		WebElement noOfRooms = findLocatorById("no_rooms");
		selectDropdownAttribute(noOfRooms, getCellData("Details", 0, 11));
		WebElement noOfAdults = findLocatorById("no_adults");
		selectDropdownAttribute(noOfAdults, getCellData("Details", 0, 12));
		WebElement noOfChilds = findLocatorById("no_child");
		elementSendKeysTab(noOfChilds, getCellData("Details", 0, 13));
		
//		switchToFrameByIdOrName("hotelsearch_iframe");
		WebElement sear = findLocatorById("hotelsearch_iframe");
		driver.switchTo().frame(0);
		WebElement searchBtn = findLocatorById("searchBtn");
		elementClick(searchBtn);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void selectHotel() throws InterruptedException {

		WebElement selectHotel = findLocatorByXpath("//h5[text()='Select Hotel']");
		visibilityOfElement(selectHotel);
		String printSelectHotel = elementGetText(selectHotel);
		System.out.println(printSelectHotel);

		List<WebElement> listOfHotels = findLocatorByTagName("h5");
		for (WebElement d : listOfHotels) {
			String hotelsList = elementGetText(d);
			if (!hotelsList.contains("selectHotel")) {
				System.out.println(hotelsList);
			}
		}

		Thread.sleep(3000);
		List<WebElement> hotelPrices = findElements("//div[@class='prize']");
		visibilityOfElement(selectHotel);
		for (WebElement allPrices : hotelPrices) {
			String text = elementGetText(allPrices);
			System.out.println(text);
		}

		Thread.sleep(3000);
		
		
		
	}
	
	@Test(priority = 3)
	
	public void bookHotel() {
		
	}
}
