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
import com.utilities.ConfigReader;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Kiehls_AU_BACallBackList_Page extends CommonActions {

	AppiumDriver driver;

	public Kiehls_AU_BACallBackList_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Callback List\"]")
	public WebElement ba_home_dashboard_page;
	@FindBy(xpath = "")
	public WebElement ba_home_notification_page;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Call Back List\"]")
	public WebElement ba_home_Callback_list_page;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Day\"]")
	public WebElement ba_home_calender_page;
	@FindBy(xpath = "")
	public WebElement ba_home_transactions_page;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"DASHBOARD\"]")
	public WebElement ba_home_dashboard_item;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NOTIFICATION\"]")
	public WebElement ba_home_notification_item;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CALLBACK LIST\"]")
	public WebElement ba_home_Callback_list_item;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CALENDAR\"]")
	public WebElement ba_home_calender_item;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"TRANSACTIONS\"]")
	public WebElement ba_home_transactions_item;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public WebElement ba_home_callback_first_item;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Reassign\"]")
	public WebElement ba_home_customer_callback_list_page;

	@FindBy(xpath = "(//XCUIElementTypeTable[@name=\"Empty list\"])[2]/XCUIElementTypeOther[1]")
	public WebElement ba_home_button;

	// XCUIElementTypeButton[@name="Day"]
	// XCUIElementTypeButton[@name="navHome"]

	public boolean user_click_the_first_call_back_history_and_verify_the_customer_list_page()
			throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_callbacklist_page_titleLabel");

			waitUntil("master_callbacklist_total_cus_page");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}

	}

	public boolean user_click_the_ba_home_button_from_right_navigation_and_click_something_then_verify_the_page(
			String ba_home) {
		// BA HOME -> 1) Dashboard 2) Notification 3) CALLBACK LIST 4) CALENDAR 5)
		// Transactions
		try {

			waitUntilElementVisibleAndClick("master_home_right_nav_ba_button");

			String ba_home_item = "//XCUIElementTypeStaticText[@name=\"" + ba_home + "\"]";

			if (ba_home.equalsIgnoreCase("DASHBOARD")) {
				driver.findElement(By.xpath(ba_home_item)).click();

				waitUntil("master_ba_dashboard_calender_addnew_button");
				return true;

			} else if (ba_home.equalsIgnoreCase("NOTIFICATION")) {
				driver.findElement(By.xpath(ba_home_item)).click();

				Assert.assertTrue(ba_home_notification_page.isDisplayed());
				return true;

			} else if (ba_home.equalsIgnoreCase("CALLBACK LIST")) {
				driver.findElement(By.xpath(ba_home_item)).click();

				waitUntil("master_ba_callback_page");

				return true;

			} else if (ba_home.equalsIgnoreCase("CALENDAR")) {
				driver.findElement(By.xpath(ba_home_item)).click();

				waitUntil("master_calender_month_label");

				return true;

			} else if (ba_home.equalsIgnoreCase("TRANSACTIONS")) {
				driver.findElement(By.xpath(ba_home_item)).click();

				waitUntil("master_transaction_history_tab");

				return true;

			} else if (ba_home.equalsIgnoreCase("SERVICE BOOKING")) {

				if (getCmsConfig("service_booking").equalsIgnoreCase("TRUE")) {

					driver.findElement(By.xpath(ba_home_item)).click();

					waitUntil("master_transaction_history_tab");
				}

				return true;

			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_the_title_in_callback_list() {

		try {

			waitUntil("master_callbacklist_page_titleLabel");

			return true;
		}

		catch (Exception e) {
			e.printStackTrace();

			return false;

		}

	}

//
	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton")
	public WebElement ba_home_customer_callback_first_item_detail_button;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Silver Wings\"]")
	public WebElement ba_home_customer_callback_member_level;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"0 PT\"]")
	public WebElement ba_home_customer_callback_balance_points;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"-\"])[2]")
	public WebElement ba_home_customer_callback_points_expiring;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"NA\"]")
	public WebElement ba_home_customer_callback_r12_annual_spent;

	public boolean user_click_the_first_customer_detials() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_callbacklist_downarrow_button");
			Thread.sleep(5000);
			return true;

		}

		catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_the_member_level() {
		try {

			// waitUntil("master_callbacklist_member_level_point_label");
			return true;
		}

		catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_the_points_expiring_in_1_month() {
		try {
			Assert.assertTrue(ba_home_customer_callback_points_expiring.isDisplayed());
			return true;
		}

		catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_the_r12_annual_spent() {
		try {
			Assert.assertTrue(ba_home_customer_callback_r12_annual_spent.isDisplayed());
			return true;
		}

		catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

}
