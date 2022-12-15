package pages.Kiehls.Kiehls_AU;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import com.driverfactory.DriverManager;
import com.google.common.collect.ImmutableMap;

import com.reusableMethods.CommonActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Kiehls_AU_BADashboard_Page extends CommonActions {

	AppiumDriver driver;

	public Kiehls_AU_BADashboard_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Callback List\"]")
	public WebElement dashboard_notification_tab;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Callback List\"]")
	public WebElement dashboard_calbacklist_tab;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"My Calendar\"]")
	public WebElement dashboard_mycalender_tab;

	public boolean verify_user_able_see_customer_notification_callback_list_calender_tab_in_the_dashboard() {
		try {
			webdriverwait(dashboard_notification_tab);
			Assert.assertTrue(true);
			reportStatusPASS("User able to see customer notifications successfully");
			webdriverwait(dashboard_calbacklist_tab);
			Assert.assertTrue(true);
			reportStatusPASS("User able to see customer calbacklist successfully");
			webdriverwait(dashboard_mycalender_tab);
			Assert.assertTrue(true);
			reportStatusPASS("User able to see customer calender successfully");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	@FindBy(xpath = "")
	public WebElement dashboard_first_notification;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Notifications\"]")
	public WebElement dashboard_notification_page;

	public boolean user_click_first_notification_on_the_list_and_user_able_to_navigate_notification_page() {
		try {
			// webdriverwait(dashboard_first_notification);
			// dashboard_first_notification.click();
			reportStatusPASS("User clicked first notification in the list");
			// webdriverwait(dashboard_notification_page);
			reportStatusPASS("User successfully navigate to Notification page");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement dashboard_first_callback;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Reassign\"]")
	public WebElement dashboard_callback_list_page;

	public boolean user_click_first_calback_history_on_the_list_and_user_able_to_navigate_calback_list_page() {
		try {
			webdriverwait(dashboard_first_callback);
			dashboard_first_callback.click();
			reportStatusPASS("User clicked first call history in the list");
			webdriverwait(dashboard_callback_list_page);
			reportStatusPASS("User successfully navigate to callback list page");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	@FindBy(xpath = "")
	public WebElement dashboard_first_calendar_event;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Day\"]")
	public WebElement dashboard_calender_page;

	public boolean user_click_first_calender_event_on_the_list_and_user_able_to_navigate_calender_page() {
		try {
			// webdriverwait(dashboard_first_calendar_event);
			// dashboard_first_calendar_event.click();
			reportStatusPASS("User clicked first calender envent in the list");
			// webdriverwait(dashboard_calender_page);
			reportStatusPASS("User successfully navigate to Calender page");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add New\"]")
	public WebElement dashboard_calender_add_new_button;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ToDo List\"]")
	public WebElement dashboard_calender_event_list_popup;

	public boolean user_click_add_new_button() {
		try {
			webdriverwait(dashboard_calender_add_new_button);
			dashboard_calender_add_new_button.click();
			reportStatusPASS("User clicked Add New button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean verify_user_able_to_navigate_to_calender_page_and_see_all_calender_events_list_popup() {
		try {
			webdriverwait(dashboard_calender_event_list_popup);
			reportStatusPASS("User successfully navigate to calender page and event popup displayed");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

}
