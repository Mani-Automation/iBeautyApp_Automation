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

	public boolean user_click_the_first_call_back_history_and_verfify_the_customer_list_page()
			throws InterruptedException {
		try {

			webdriverwait(ba_home_callback_first_item);
			ba_home_callback_first_item.click();
			reportStatusPASS("User clicked created customer in the callback list");

			Thread.sleep(3000);

			webdriverwait(ba_home_customer_callback_list_page);
			Assert.assertTrue(ba_home_customer_callback_list_page.isDisplayed());
			reportStatusPASS("User is on Callback detail page");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}

	}

	public boolean user_click_the_ba_home_button_from_right_navigation_and_click_something_then_verify_the_page(
			String ba_home) {
		// BA HOME -> 1) Dashboard 2) Notification 3) CALLBACK LIST 4) CALENDAR 5)
		// Transactions
		try {
			webdriverwait(ba_home_button);
			ba_home_button.click();
			reportStatusPASS("User clicked BA Home button on the right navigation");

			String ba_home_item = "//XCUIElementTypeStaticText[@name=\"" + ba_home + "\"]";
			webdriverwait(driver.findElement(By.xpath(ba_home_item)));
			driver.findElement(By.xpath(ba_home_item)).click();
			reportStatusPASS("User clicked " + ba_home + " button on the right navigation sub menu");

			if (ba_home.equalsIgnoreCase("DASHBOARD")) {
				Assert.assertTrue(ba_home_dashboard_page.isDisplayed());
			} else if (ba_home.equalsIgnoreCase("Notification")) {
				Assert.assertTrue(ba_home_notification_page.isDisplayed());
			} else if (ba_home.equalsIgnoreCase("CALLBACK LIST")) {
				Assert.assertTrue(ba_home_Callback_list_page.isDisplayed());
				reportStatusPASS("User able to see Callback list page successfully");

			} else if (ba_home.equalsIgnoreCase("CALENDAR")) {
				Assert.assertTrue(ba_home_calender_page.isDisplayed());
				reportStatusPASS("User able to see Calender page successfully");

			} else if (ba_home.equalsIgnoreCase("Transactions")) {
				Assert.assertTrue(ba_home_transactions_page.isDisplayed());
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			reportStatusException(e);
			return false;

		}
	}

	@FindBy(xpath = "//XCUIElementTypeStaticText[@index=\"8\"]")
	public WebElement ba_home_Callback_list_title;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@index=\"7\"]")
	public WebElement ba_home_Callback_list_count;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@index=\"0\"]")
	public WebElement ba_home_Callback_list_not_picked;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@index=\"1\"]")
	public WebElement ba_home_Callback_list_called;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@index=\"2\"]")
	public WebElement ba_home_Callback_list_missed_call;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@index=\"3\"]")
	public WebElement ba_home_Callback_list_reminder;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@index=\"4\"]")
	public WebElement ba_home_Callback_list_created_date;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@index=\"5\"]")
	public WebElement ba_home_Callback_list_updated_date;

	public boolean verify_the_title_in_callback_list() {

		try {
			Assert.assertTrue(ba_home_Callback_list_title.isDisplayed());
			reportStatusPASS("User verified Title of the customer in CallBack list");
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}

	}

	public boolean verify_the_count_in_callback_list() {
		try {
			Assert.assertTrue(ba_home_Callback_list_count.isDisplayed());
			reportStatusPASS("User verified Call count in CallBack list");

			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_the_not_picked_call_in_callback_list() {
		try {
			Assert.assertTrue(ba_home_Callback_list_not_picked.isDisplayed());
			reportStatusPASS("User verified call not picked count in CallBack list");
			return true;

		}

		catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_the_called_in_callback_list() {
		try {
			Assert.assertTrue(ba_home_Callback_list_called.isDisplayed());
			reportStatusPASS("User verified picked call count in CallBack list");
			return true;

		}

		catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_the_missed_call_in_callback_list() {
		try {
			Assert.assertTrue(ba_home_Callback_list_missed_call.isDisplayed());
			reportStatusPASS("User verified missed call count in CallBack list");
			return true;

		}

		catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_the_reminder_in_callback_list() {
		try {
			Assert.assertTrue(ba_home_Callback_list_reminder.isDisplayed());
			reportStatusPASS("User verified reminder count in CallBack list");
			return true;

		}

		catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_the_created_date_in_callback_list() {
		try {
			Assert.assertTrue(ba_home_Callback_list_created_date.isDisplayed());
			reportStatusPASS("User verified callback created date in CallBack list");
			return true;

		}

		catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_the_updated_date_in_callback_list() {
		try {
			Assert.assertTrue(ba_home_Callback_list_updated_date.isDisplayed());
			reportStatusPASS("User verified callback updated date in CallBack list");
			return true;

		}

		catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
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
			webdriverwait(ba_home_customer_callback_first_item_detail_button);
			ba_home_customer_callback_first_item_detail_button.click();
			Thread.sleep(1000);
			return true;

		}

		catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_the_member_level() {
		try {
			Assert.assertTrue(ba_home_customer_callback_member_level.isDisplayed());
			reportStatusPASS("User able to see customer member level");
			return true;
		}

		catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_the_balance_points() {
		try {
			Assert.assertTrue(ba_home_customer_callback_balance_points.isDisplayed());
			reportStatusPASS("User able to see customer balance points");
			return true;
		}

		catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_the_points_expiring_in_1_month() {
		try {
			Assert.assertTrue(ba_home_customer_callback_points_expiring.isDisplayed());
			reportStatusPASS("User able to see customer expiring details");
			return true;
		}

		catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_the_r12_annual_spent() {
		try {
			Assert.assertTrue(ba_home_customer_callback_r12_annual_spent.isDisplayed());
			reportStatusPASS("User able to see customer Anual spent");
			return true;
		}

		catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

}