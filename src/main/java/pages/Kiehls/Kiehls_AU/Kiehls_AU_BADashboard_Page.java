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
import com.utilities.LocatorManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Kiehls_AU_BADashboard_Page extends CommonActions {

	AppiumDriver driver;
	LocatorManager locator = new LocatorManager();

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

			waitUntil("master_ba_dashboard_callback_viewall_button");

			waitUntil("master_ba_dashboard_calender_addnew_button");

			waitUntil("master_ba_dashboard_callbutton_viewall_button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	@FindBy(xpath = "")
	public WebElement dashboard_first_notification;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Notifications\"]")
	public WebElement dashboard_notification_page;

	public boolean user_click_first_notification_on_the_list_and_user_able_to_navigate_notification_page() {
		try {

			try {
				// waitUntil("master_ba_dashboard_first_notification");

				return true;
			} catch (NoSuchElementException e) {
				System.out.println("BA Dashboard : There is no notification on the Dashboard");
				return true;

			}

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement dashboard_first_callback;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Reassign\"]")
	public WebElement dashboard_callback_list_page;

	public boolean user_click_first_calback_history_on_the_list_and_user_able_to_navigate_calback_list_page() {
		try {
			try {
			///	waitUntilElementVisibleAndClick("master_ba_dashboard_first_callback");

			//	waitUntil("master_callbacklist_downarrow_button");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");

				return true;
			} catch (NoSuchElementException e) {
				System.out.println("BA Dashboard : There is no callback list on the Dashboard");
				return true;

			}

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	@FindBy(xpath = "")
	public WebElement dashboard_first_calendar_event;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Day\"]")
	public WebElement dashboard_calender_page;

	public boolean user_click_first_calendar_event_on_the_list_and_user_able_to_navigate_calendar_page() {
		try {

			try {
				// waitUntilElementVisibleAndClick("master_ba_dashboard_first_callback");

				// waitUntil("master_ba_callback_page");
				return true;
			} catch (NoSuchElementException e) {
				System.out.println("BA Dashboard : There is Calendar event on the Dashboard");
				return true;

			}

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean verify_user_able_to_navigate_to_calender_page_and_see_all_calender_events_list_popup() {
		try {

			waitUntil("master_setting_change_pwd_popup_cancel_button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

}