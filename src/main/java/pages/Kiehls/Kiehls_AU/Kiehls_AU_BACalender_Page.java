package pages.Kiehls.Kiehls_AU;

import static org.junit.Assert.assertTrue;

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
import com.utilities.ExcelData;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Kiehls_AU_BACalender_Page extends CommonActions {

	AppiumDriver driver;

	public Kiehls_AU_BACalender_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "")
	public WebElement t;

	// day,week,month,year

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Day\"]")
	public WebElement calender_day_tab;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Week\"]")
	public WebElement calender_week_tab;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SUN\"]")
	public WebElement calender_week;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Month\"]")
	public WebElement calender_month_tab;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"leftImg\"]")
	public WebElement calender_month;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Year\"]")
	public WebElement calender_year_tab;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Jan\"]")
	public WebElement calender_year;

	public boolean user_verfiy_the_day_tab() {
		try {

			waitUntil("master_calender_day_tab");
			waitUntil("master_calender_day_page_label");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}

	}

	public boolean user_verify_the_week_tab() {
		try {

			waitUntilElementVisibleAndClick("master_calender_week_tab");

			//
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}

	}

	public boolean user_verify_the_month_tab() {
		try {

			waitUntilElementVisibleAndClick("master_calender_month_tab");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}

	}

	public boolean user_verify_the_year_tab() {
		try {
			waitUntilElementVisibleAndClick("master_calender_year_tab");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}

	}

	// TODO

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"addIcon\"]")
	public WebElement calender_create_event_button;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"ToDo List\"]")
	public WebElement calender_todo_list_button;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField")
	public WebElement calender_todo_title_field;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
	public WebElement calender_todo_save_button;
	// XCUIElementTypeButton[@name="Cancel"]

	// @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls
	// UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]")

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]")
	public WebElement calender_todo_created_event;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete\"]")
	public WebElement calender_todo_delete_event;

	@FindBy(xpath = "")
	public WebElement calender_todo_delete_confrim_popup;

	@FindBy(xpath = "")
	public WebElement calender_todo_delete_confrim_yes_button;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
	public WebElement calender_promotion_save_button;

	@FindBy(xpath = "")
	public WebElement calender_promotion_created_event;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete\"]")
	public WebElement calender_promotion_delete_event;

	@FindBy(xpath = "")
	public WebElement calender_promotion_delete_confrim_popup;

	@FindBy(xpath = "")
	public WebElement calender_promotion_delete_confrim_yes_button;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
	public WebElement calender_service_booking_save_button;

	@FindBy(xpath = "")
	public WebElement calender_service_booking_created_event;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete\"]")
	public WebElement calender_service_booking_delete_event;

	@FindBy(xpath = "")
	public WebElement calender_service_booking_delete_confrim_popup;

	@FindBy(xpath = "")
	public WebElement calender_service_booking_delete_confrim_yes_button;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
	public WebElement calender_event_reservation_save_button;

	@FindBy(xpath = "")
	public WebElement calender_event_reservation_created_event;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Delete\"]")
	public WebElement calender_event_reservation_delete_event;

	@FindBy(xpath = "")
	public WebElement calender_event_reservation_delete_confrim_popup;

	@FindBy(xpath = "")
	public WebElement calender_event_reservation_delete_confrim_yes_button;

	public boolean user_click_the_create_event_button() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_calendar_add_button");
			waitUntil("master_setting_change_pwd_popup_cancel_button");
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_click_the_todo_list() {

		try {
			waitUntilElementVisibleAndClick("master_cell_0");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_enter_the_title_in_calender() throws InterruptedException {
		try {
			waitUntil("master_calender_event_title");

			sendkeys("master_calender_event_title", "Test Event");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}

	}

	public boolean user_click_save_button_in_calender() throws InterruptedException {
		try {

			try {
				waitUntilElementVisibleAndClick("master_consultation_save_button");
				return true;
			} catch (NoSuchElementException e) {
				waitUntilElementVisibleAndClick("master_calendar_promotion_save_button");

				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_user_able_to_view_created_todo_list_event() throws InterruptedException {
		try {

			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {

				Thread.sleep(2000);

				for (int i = 0; i <= 20; i++) {
					if (!calender_todo_created_event.isDisplayed()) {
						swipeDown();
					} else if (calender_todo_created_event.isDisplayed()) {
						calender_todo_created_event.click();

						break;
					}
				}
				return true;
			}
			case "PROD": {
				return true;

			}

			default: {
			}
				return false;

			}

		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_click_the_delete_event_button() throws InterruptedException {
		try {
			Thread.sleep(2000);

			if (calender_todo_delete_event.isDisplayed()) {
				calender_todo_delete_event.click();

				webdriverwait(calender_todo_delete_confrim_popup);
				calender_todo_delete_confrim_yes_button.click();

			} else if (calender_promotion_delete_event.isDisplayed()) {
				calender_promotion_delete_event.click();

				webdriverwait(calender_promotion_delete_confrim_popup);
				calender_promotion_delete_confrim_yes_button.click();

			} else if (calender_service_booking_delete_event.isDisplayed()) {
				calender_service_booking_delete_event.click();

				webdriverwait(calender_service_booking_delete_confrim_popup);
				calender_service_booking_delete_confrim_yes_button.click();

			} else if (calender_event_reservation_delete_event.isDisplayed()) {
				calender_event_reservation_delete_event.click();

				webdriverwait(calender_event_reservation_delete_confrim_popup);
				calender_event_reservation_delete_confrim_yes_button.click();

			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}
	// promotion event

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Promotion Activity\"]")
	public WebElement calender_promotion_activity_button;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"settings down\"]")
	public WebElement calender_promotion_activity_service_dropdown;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[2]")
	public WebElement calender_promotion_event_checkbox;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeTextField")
	public WebElement calender_promotion_activity_customer_name_field;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeTextField")
	public WebElement calender_promotion_activity_customer_phone_field;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeTextField")
	public WebElement calender_service_booking_customer_name_field;
	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeTextField")
	public WebElement calender_service_booking_customer_phone_field;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeTextField")
	public WebElement calender_event_reservation_customer_name_field;
	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeTextField")
	public WebElement calender_event_reservation_customer_phone_field;

	public boolean user_click_the_promotion_activity() {
		try {
			waitUntilElementVisibleAndClick("master_cell_2");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}

	}

	public boolean user_select_the_promotion_in_the_service_type() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_login_select_country");

			waitUntilElementVisibleAndClick("master_calendar_checkbox_1");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}

	}

	public boolean user_enter_the_customer_name_in_calender() throws InterruptedException, IOException {
		try {

			waitUntil("master_calender_customer_name_text_field");
			sendkeys("master_calender_customer_name_text_field", "Test Name");
			hideKeyboard();
			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}

	}

	public boolean user_enter_the_phone_number_in_calendar() throws InterruptedException {

		try {

			waitUntil("master_calendar_event_phone_text");
			sendkeys("master_calendar_event_phone_text", "9123456789");
			hideKeyboard();
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_user_able_to_view_created_promotion_event() throws InterruptedException {
		try {
			Thread.sleep(2000);

			for (int i = 0; i <= 20; i++) {
				if (!calender_promotion_created_event.isDisplayed()) {
					swipeDown();
				} else if (calender_promotion_created_event.isDisplayed()) {
					calender_promotion_created_event.click();
					break;
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

//service booking
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Event Reservation\"]")
	public WebElement calender_event_reservation_button;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"settings down\"]")
	public WebElement calender_sevent_reservation_event_dropdown;
	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
	public WebElement calender_event_reservation_checkbox;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Service Booking\"]")
	public WebElement calender_service_booking_button;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"settings down\"]")
	public WebElement calender_service_booking_service_dropdown;
	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton[1]")
	public WebElement calender_service_booking_checkbox;

	public boolean user_click_the_service_booking() {

		try {
			waitUntilElementVisibleAndClick("master_cell_3");
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_select_the_service_booking_in_the_service_type() throws InterruptedException {

		try {
			waitUntilElementVisibleAndClick("master_login_select_country");

			waitUntilElementVisibleAndClick("master_calendar_checkbox_1");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_click_the_event_reservaiton() {
		try {
			waitUntilElementVisibleAndClick("master_cell_1");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_select_the_event_reservaiton_in_the_service_type() throws InterruptedException {
		try {
			waitUntilElementVisibleAndClick("master_login_select_country");

			waitUntilElementVisibleAndClick("master_calendar_checkbox_1");
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_user_able_to_view_created_service_booking_event() throws InterruptedException {
		try {
			Thread.sleep(2000);

			for (int i = 0; i <= 20; i++) {
				if (!calender_service_booking_created_event.isDisplayed()) {
					swipeDown();
				} else if (calender_service_booking_created_event.isDisplayed()) {
					calender_service_booking_created_event.click();
					break;
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_user_able_to_view_created_reservation_event() throws InterruptedException {
		try {
			Thread.sleep(2000);

			for (int i = 0; i <= 20; i++) {
				if (!calender_event_reservation_created_event.isDisplayed()) {
					swipeDown();
				} else if (calender_event_reservation_created_event.isDisplayed()) {
					calender_event_reservation_created_event.click();
					break;
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}
}