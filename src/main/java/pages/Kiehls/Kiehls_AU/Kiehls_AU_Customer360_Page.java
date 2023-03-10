package pages.Kiehls.Kiehls_AU;

import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.reusableMethods.CommonActions.Direction;
import com.utilities.ConfigReader;
import com.utilities.ExcelData;
import com.utilities.LocatorManager;

import io.appium.java_client.AppiumDriver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

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

public class Kiehls_AU_Customer360_Page extends CommonActions {

	AppiumDriver driver;
	public static String segment;
	Random random = new Random();
	LocatorManager locator = new LocatorManager();

	public Kiehls_AU_Customer360_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/****************** Locators ******************/

	public boolean tap_on_customer_search_dropdown() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_c360_home_customer_search_dropdown");

			return true;

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean customer_threesixty_screen_should_be_display() throws IOException {
		try {
			try {
				Thread.sleep(3000);
				waitUntilElementVisibleAndClick("master_c360_search_result_first_cus");

				return true;
			} catch (

			Exception noSuchElementException) {
				waitUntil("master_c360_cus_name_label");
				return true;

			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean tap_on_mobile_number_from_the_dropdown_list() throws InterruptedException {
		try {

			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls")) {
				waitUntilElementVisibleAndClick("master_c360_home_customer_search_lucid_list");

				return true;
			} else if (application.equals("Valentino")) {
				waitUntilElementVisibleAndClick("master_c360_home_customer_search_lucid_list");
				waitUntilElementVisibleAndClick("master_valentino_c360_abc_num_pad");
				return true;
			} else if (application.equals("YSL")) {

				waitUntilElementVisibleAndClick("master_c360_home_customer_search_marsid_list");

				return true;
			}

			else {
				return true;
			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean verify_the_customer_name() {
		try {

			waitUntil("master_c360_cus_name_label");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean verify_the_phone_number() {
		try {

			waitUntil("master_c360_cus_phone_label");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean verify_the_edit_button() {
		try {
			waitUntil("master_c360_cus_edit_button");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean verify_the_birthday_date() {
		try {
			waitUntil("");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean verity_the_gender() {
		try {
			waitUntil("");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean verify_the_r12_spending() {
		try {
			waitUntil("");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean verify_the_opt_in() {
		try {
			waitUntil("");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean verify_the_membership_since() {
		try {
			waitUntil("");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean verify_the_customer_type() {
		try {
			waitUntil("");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}
	// 23

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Update Member\"]")
	public WebElement C360_update_member_page;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Update\"]")
	public WebElement C360_update_member_update_button;

	public boolean verify_the_customer_details_and_click_update_button() {
		try {

			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {
				swipeScreenUntilElementVisible("master_createcustomer_confirm_button", Direction.UP);
				waitUntilElementVisibleAndClick("master_createcustomer_confirm_button");
				waitUntil("master_c360_cus_name_label");
				return true;
			}
			case "PROD": {
				return true;

			}

			default: {
			}
				return false;

			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_the_edit_button_and_update_member_page_should_be_displayed() {
		try {
			segment = ConfigReader.getData("app_segment");

			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {

				waitUntilElementVisibleAndClick("master_c360_cus_edit_button");
				waitUntil("master_createcustomer_mobile_number");

				return true;
			}
			case "PROD": {
				return true;

			}

			default: {
			}
				return false;

			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	// 24

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Membership\"]")
	public WebElement C360_membership_tab;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
	public WebElement C360_membership_date;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
	public WebElement C360_membership_point;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
	public WebElement C360_membership_type;

	public boolean user_click_the_membership_tab_and_verify_membership_screen_should_be_displayed()
			throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_c360_cus_mem_tab");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean verify_membership_date_points_store_and_type_are_displayed() {
		try {

			Assert.assertTrue(C360_membership_date.isDisplayed());

			Assert.assertTrue(C360_membership_point.isDisplayed());

			Assert.assertTrue(C360_membership_type.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	// 25

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"navHome\"]")
	public WebElement C360_home_icon;

	@FindBy(xpath = "//XCUIElementTypeImage[@name=\"btnWishList\"]")
	public WebElement C360_pdp_wishlist_icon;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"sideMenuTbl\"]/XCUIElementTypeButton[2]")
	public WebElement C360_icon_right_navigation;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Wishlist\"]")
	public WebElement C360_wishlist_tab;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"leftarrow black\"]")
	public WebElement C360_wishlist_first_product;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"btnBuyNow\"]")
	public WebElement C360_pdp_buy_now_button;

	public boolean user_click_home_button_and_verify_home_page_should_be_displayed() {
		try {

			waitUntilElementVisibleAndClick("master_home_button");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_customer_360_button_from_right_navigation() {
		try {

			waitUntilElementVisibleAndClick("master_home_360");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_wishlist_product_and_verify_pdp_shold_be_displayed() {
		try {
			waitUntilElementVisibleAndClick("master_c360_cus_wishtab_leftarrow");
			waitUntilElementVisibleAndClick("master_pdp_wishlist_button");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_add_to_wishlist_icon() {
		try {
			Thread.sleep(4000);
			waitUntilElementVisibleAndClick("master_pdp_wishlist_button");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_wishlist_tab() {
		try {

			waitUntilElementVisibleAndClick("master_c360_cus_wishlist_tab");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}
	// 26

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Summary\"]")
	public WebElement C360_customer_summary_tab;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"General Information\"])[2]")
	public WebElement C360_customer_summary_general_info;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"8667224536\"])[2]")
	public WebElement C360_customer_summary_general_info_mobile;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"mraghuram19@gmail.com\"]")
	public WebElement C360_customer_summary_general_info_mail;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"AU\"]")
	public WebElement C360_customer_summary_general_info_loacation;

	public boolean verify_user_general_information_should_be_displayed() {
		try {
			waitUntil("master_c360_cus_summary_create_note_button");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean user_clickthe_summary_tab() {
		try {

			waitUntilElementVisibleAndClick("master_c360_cus_summary_tab");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	// 27

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Create Note\"]")
	public WebElement C360_summary_create_note_button;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")
	public WebElement C360_summary_create_note_popup;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
	public WebElement C360_summary_create_note_title_field;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Description\"]")
	public WebElement C360_summary_create_note_description_field;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
	public WebElement C360_summary_create_note_save_button;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch")
	public WebElement C360_summary_create_note_important_msg_toggle;

	public boolean verify_the_customer_note_should_be_displayed_in_notes_section() {
		try {
//

			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {

				return true;
			}
			case "PROD": {
				return true;

			}

			default: {
			}
				return false;

			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_create_note_button_and_verify_the_note_popup() {
		try {

			waitUntilElementVisibleAndClick("master_c360_cus_summary_create_note_button");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean user_enter_the_title() throws InterruptedException {
		try {

			webdriverwait(C360_summary_create_note_title_field);
			C360_summary_create_note_title_field.sendKeys("test note");
			Thread.sleep(1000);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_enter_the_description() throws InterruptedException {
		try {

			webdriverwait(C360_summary_create_note_description_field);
			C360_summary_create_note_description_field.sendKeys("test note");
			Thread.sleep(1000);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_toogle_and_mark_the_message_as_important() throws InterruptedException {
		try {

			webdriverwait(C360_summary_create_note_important_msg_toggle);
			C360_summary_create_note_important_msg_toggle.click();
			Thread.sleep(1000);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_the_save_button() throws InterruptedException {
		try {

			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {
				webdriverwait(C360_summary_create_note_save_button);
				C360_summary_create_note_save_button.click();
				Thread.sleep(2000);
				return true;
			}
			case "PROD": {
				return true;

			}

			default: {
			}
				return false;

			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}
	// 28

	public boolean enter_mobile_number_and_tap_on_search_button() {

		try {

			waitUntil("master_home_search_text");
			sendkeys("master_home_search_text", ExcelData.getExcelData("customer_testdata", "mars_id"));

			waitUntilElementVisibleAndClick("master_cart_additem_search_product_button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

//

	public boolean user_edit_membership_info() {
		try {
			if (segment.equals("AU")) {

			} else if (segment.equals("JP")) {

				waitUntil("master_createcustomer_mobile_number");

				clearAndSendkeys("master_createcustomer_mobile_number",
						ExcelData.getExcelData("customer_testdata", "jp_mobile_number") + random.nextInt(10000));
				click("master_brand_logo");

			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean user_edit_member_details() {
		try {
			if (segment.equals("AU")) {

			} else if (segment.equals("JP")) {
				// lastname
				clearAndSendkeys("master_createcustomer_lastname",
						ExcelData.getExcelData("customer_testdata", "last_name"));
				click("master_brand_logo");

			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_edit_mailing_address() {
		try {
			if (segment.equals("AU")) {

			} else if (segment.equals("JP")) {
				// zipcode
				clearAndSendkeys("master_createcustomer_zipcode",
						ExcelData.getExcelData("customer_testdata", "jp_zipcode"));
				click("master_brand_logo");
				// city
				clearAndSendkeys("master_createcustomer_address1",
						ExcelData.getExcelData("customer_testdata", "add_street_name") + " Edit");
				click("master_brand_logo");
				clearAndSendkeys("master_createcustomer_address2",
						ExcelData.getExcelData("customer_testdata", "add_street_name") + " Edit");
				click("master_brand_logo");
				// address

			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_edit_communicate_channals_details() {
		try {
			if (segment.equals("AU")) {

			} else if (segment.equals("JP")) {
				swipeScreenUntilElementVisible("master_createcustomer_confirm_button", Direction.UP);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_verify_total_number_of_bottles_returned_column() {
		try {

			segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {
				waitUntil("master_c360_recycle_bottle_date");
				waitUntil("master_c360_recycle_bottle_returned");
				waitUntil("master_c360_recycle_bottle_store");
				break;
			}
			case "MY": {
				waitUntil("master_c360_recycle_bottle_date");
				waitUntil("master_c360_recycle_bottle_returned");
				waitUntil("master_c360_recycle_bottle_store");
				break;
			}
			case "TW": {
			}
			case "SG": {
			}
			case "HR": {
			}
			case "NZ": {
			}
			case "JP": {
			}
			case "HK": {
			}
			case "KR": {
			}
			case "TH": {
			}
			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean user_click_done_button() {
		try {
			segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {
				waitUntilElementVisibleAndClick("master_done_button");
				break;
			}
			case "MY": {
				waitUntilElementVisibleAndClick("master_done_button");
				break;
			}
			case "TW": {
			}
			case "SG": {
			}
			case "HR": {
			}
			case "NZ": {
			}
			case "JP": {

			}
			case "HK": {
			}
			case "KR": {
			}
			case "TH": {
			}
			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean verify_user_able_to_see_recent_recycled_bottles() {
		try {
			segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {

				Thread.sleep(6000);
				if (driver.findElement(By.xpath(locator.getData("master_recycle_bottles_returned_label"))).getText()
						.equals("4.0")) {
					waitUntilElementVisibleAndClick("master_c360_recycle_bottle_dropdown");
					waitUntilElementVisibleAndClick("master_cell_2");

					waitUntilElementVisibleAndClick("master_done_button");

					Thread.sleep(6000);

					if (driver.findElement(By.xpath(locator.getData("master_recycle_bottles_returned_label"))).getText()
							.equals("3.0")) {

						return true;

					}
				}
				break;
			}
			case "MY": {
			}
			case "TW": {
			}
			case "SG": {
			}
			case "HR": {
			}
			case "NZ": {
			}
			case "JP": {
			}
			case "HK": {
			}
			case "KR": {
			}
			case "TH": {
			}
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean user_click_the_recycle_tab() {
		try {

			segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {
				waitUntilElementVisibleAndClick("master_c360_cus_recycle_tab");
			}
			case "MY": {
				waitUntilElementVisibleAndClick("master_c360_cus_recycle_tab");
			}
			case "TW": {
			}
			case "SG": {
			}
			case "HR": {
			}
			case "NZ": {
			}
			case "JP": {
			}
			case "HK": {
			}
			case "KR": {
			}
			case "TH": {
			}
			}
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean user_select_no_of_bottles_to_recycle_on_dropdown() {
		try {

			segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {
				waitUntilElementVisibleAndClick("master_c360_recycle_bottle_dropdown");
				waitUntilElementVisibleAndClick("master_cell_3");
				break;
			}
			case "MY": {
				waitUntilElementVisibleAndClick("master_c360_recycle_bottle_dropdown");
				waitUntilElementVisibleAndClick("master_cell_3");

				// waitUntilElementVisibleAndClick("master_c360_recycle_bottle_dropdown_value_3");
				break;
			}
			case "TW": {
			}
			case "SG": {
			}
			case "HR": {
			}
			case "NZ": {
			}
			case "JP": {

			}
			case "HK": {
			}
			case "KR": {
			}
			case "TH": {
			}
			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean tap_on_mobile_number_from_the_dropdown_list_kr() {
		try {

			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls")) {
				waitUntilElementVisibleAndClick("master_kr_c360_home_customer_search_name_list");

				return true;
			} else if (application.equals("Valentino")) {
				waitUntilElementVisibleAndClick("master_c360_home_customer_search_lucid_list");
				waitUntilElementVisibleAndClick("master_valentino_c360_abc_num_pad");
				return true;
			} else {
				return false;
			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean enter_mobile_number_and_tap_on_search_button_kr() {
		try {

			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls")) {

				waitUntil("master_home_search_text");
				sendkeys("master_home_search_text", "test");

				waitUntilElementVisibleAndClick("master_cart_additem_search_product_button");

				return true;
			} else if (application.equals("Valentino")) {

				return true;
			} else {
				return false;
			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_the_edit_button_and_update_member_page_should_be_displayed_kr() throws IOException {

		try {
			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls") || application.equals("Valentino")) {

				waitUntilElementVisibleAndClick("master_c360_cus_edit_button");
				// popup
				// waitUntilElementVisibleAndClick("master_kr_createcustomer_popup");
				// waitUntil("master_calendar_event_phone_text");
				return true;
			}

			else {
				return false;
			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean user_edit_membership_info_kr() {
		try {

			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls") || application.equals("Valentino")) {

				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_edit_member_details_kr() {

		try {

			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls") || application.equals("Valentino")) {

				clear("master_createcustomer_email");
				waitUntil("master_createcustomer_email");
				sendkeys("master_createcustomer_email", "newtestnew" + random.nextInt(10000) + "@gmail.com");
				click("master_brand_logo");

				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean user_edit_mailing_address_kr() {

		try {
			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls") || application.equals("Valentino")) {
				// add2
				sendkeys("master_createcustomer_address2", "newteststreet");
				click("master_brand_logo");

				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean user_click_the_edit_button_and_update_member_page_should_be_displayed_tw() {

		try {
			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls") || application.equals("Valentino")) {

				waitUntilElementVisibleAndClick("master_c360_cus_edit_button");

				waitUntil("master_calendar_event_phone_text");
				return true;
			}

			else {
				return false;
			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_edit_member_details_tw() {

		try {

			// gender
			waitUntil("master_createcustomer_gender_dropdown");
			click("master_createcustomer_gender_dropdown");
			Thread.sleep(2000);

			String gender = "//XCUIElementTypeStaticText[@name=\""
					+ ExcelData.getExcelData("customer_testdata", "gender_male").toString() + "\"]";
			webdriverwait(driver.findElement(By.xpath(gender)));
			driver.findElement(By.xpath(gender)).click();
			// im an internation - checkbox

			// email
			waitUntil("master_createcustomer_email");
			clear("master_createcustomer_email");
			sendkeys("master_createcustomer_email", "ntest" + random.nextInt(10000) + "@gmail.com");
			click("master_brand_logo");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_edit_mailing_address_tw() {
		return true;
	}

	public boolean tap_on_mobile_number_from_the_dropdown_list_my() {
		try {

			waitUntilElementVisibleAndClick("master_kr_c360_home_customer_search_name_list");

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

		return true;
	}

	public boolean enter_mobile_number_and_tap_on_search_button_my() {
		try {

			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls")) {

				waitUntil("master_home_search_text");
				sendkeys("master_home_search_text", "a@a.com");

				waitUntilElementVisibleAndClick("master_cart_additem_search_product_button");

				return true;
			} else if (application.equals("Valentino")) {

				return true;
			} else {
				return false;
			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_edit_membership_info_my() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean user_edit_member_details_my() {
		try {

			// local

			// title
			waitUntilElementVisibleAndClick("master_hk_createcustomer_title_dropdown");
			staticTextClick("Mrs");

			// fn
			sendkeys("master_createcustomer_firstname", ExcelData.getExcelData("customer_testdata", "last_name"));
			click("master_brand_logo");

			sendkeys("master_createcustomer_lastname", ExcelData.getExcelData("customer_testdata", "first_name"));
			click("master_brand_logo");
			// phone
			// phone number
			waitUntilElementVisibleAndClick("master_calendar_event_phone_text");

			sendkeys("master_calendar_event_phone_text", "18465" + random.nextInt(10000));
			click("master_brand_logo");
			// email
			waitUntil("master_createcustomer_email");
			sendkeys("master_createcustomer_email", "testau" + random.nextInt(10000) + "@gmail.com");
			click("master_brand_logo");

			// gender
			waitUntil("master_createcustomer_gender_dropdown");
			click("master_createcustomer_gender_dropdown");

			// Year
			waitUntil("master_createcustomer_year_dropdown");
			click("master_createcustomer_year_dropdown");
			waitUntil("master_createcustomer_year");
			click("master_createcustomer_year");

			// Month
			waitUntil("master_createcustomer_month_dropdown");
			click("master_createcustomer_month_dropdown");
			waitUntil("master_createcustomer_month");
			click("master_createcustomer_month");

			// day
			waitUntil("master_createcustomer_day_dropdown");
			click("master_createcustomer_day_dropdown");
			waitUntil("master_createcustomer_date");
			click("master_createcustomer_date");

			// lang
			waitUntil("master_my_createcustomer_language");
			click("master_my_createcustomer_language");

			staticTextClick("English");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_edit_member_details_hk() {
		try {

			// fn
			sendkeys("master_createcustomer_firstname", "Test" + RandomStringGenerate());
			click("master_brand_logo");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean tap_on_mobile_number_from_the_dropdown_list_th() {
		try {

			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls")) {
				waitUntilElementVisibleAndClick("master_kr_c360_home_customer_search_name_list");

				return true;
			} else if (application.equals("Valentino")) {
				waitUntilElementVisibleAndClick("master_c360_home_customer_search_lucid_list");
				waitUntilElementVisibleAndClick("master_valentino_c360_abc_num_pad");
				return true;
			} else {
				return false;
			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean enter_mobile_number_and_tap_on_search_button_th() {
		try {

			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls")) {

				waitUntil("master_home_search_text");
				sendkeys("master_home_search_text", "a@a.com");

				waitUntilElementVisibleAndClick("master_cart_additem_search_product_button");

				return true;
			} else if (application.equals("Valentino")) {

				return true;
			} else {
				return false;
			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_edit_member_details_th() {
		try {
			// national id

			// firstname
			sendkeys("master_createcustomer_firstname", "Test");
			click("master_brand_logo");

			// lastname
			sendkeys("master_createcustomer_lastname", "Data");
			click("master_brand_logo");

			// gender
			waitUntil("master_createcustomer_gender_dropdown");
			click("master_createcustomer_gender_dropdown");
			Thread.sleep(2000);

			String gender = "//XCUIElementTypeStaticText[@name=\""
					+ ExcelData.getExcelData("customer_testdata", "gender_male").toString() + "\"]";
			webdriverwait(driver.findElement(By.xpath(gender)));
			driver.findElement(By.xpath(gender)).click();
			// im an internation - checkbox

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_edit_member_details_sg() {
		try {

			// gender
			waitUntil("master_createcustomer_gender_dropdown");
			click("master_createcustomer_gender_dropdown");
			Thread.sleep(2000);

			String gender = "//XCUIElementTypeStaticText[@name=\""
					+ ExcelData.getExcelData("customer_testdata", "gender_male").toString() + "\"]";
			webdriverwait(driver.findElement(By.xpath(gender)));
			driver.findElement(By.xpath(gender)).click();
			// im an internation - checkbox

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean tap_on_customer_search_dropdown_nz() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean enter_mobile_number_and_tap_on_search_button_nz() {
		try {

			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls")) {

				waitUntil("master_home_search_text");
				sendkeys("master_home_search_text", "a@a.com");

				waitUntilElementVisibleAndClick("master_cart_additem_search_product_button");

				return true;
			} else if (application.equals("Valentino")) {

				return true;
			} else {
				return false;
			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_edit_member_details_nz() {

		try {

			// lastname
			sendkeys("master_createcustomer_lastname", "Test" + RandomStringGenerate());
			click("master_brand_logo");

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean tap_on_mobile_number_from_the_dropdown_list_au() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean enter_mobile_number_and_tap_on_search_button_au() {
		try {

			waitUntil("master_home_search_text");
			sendkeys("master_home_search_text", ExcelData.getExcelData("customer_testdata", "email_address2"));

			waitUntilElementVisibleAndClick("master_cart_additem_search_product_button");
			return true;

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_edit_member_details_au() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean customer_threesixty_screen_should_be_display_au() {
		try {

			waitUntil("master_c360_cus_name_label");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_the_edit_button_and_update_member_page_should_be_displayed_au() {
		try {
			segment = ConfigReader.getData("app_segment");

			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {

				waitUntilElementVisibleAndClick("master_c360_cus_edit_button");

				waitUntilElementVisibleAndClick("master_createcustomer_header_text");

				return true;
			}
			case "PROD": {
				return true;

			}

			default: {
			}
				return false;

			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_the_edit_button_and_update_member_page_should_be_displayed_sg() {
		try {

			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls") || application.equals("Valentino")) {

				waitUntilElementVisibleAndClick("master_c360_cus_edit_button");

				return true;
			}

			else {
				return false;
			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_edit_mailing_address_nz() {

		return true;
	}

	public boolean user_able_to_verify_dashboard_components() {
		try {

			waitUntil("");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_slider_icon_on_c360_page() {
		try {

			waitUntilElementVisibleAndClick("master_c360_dashboard_slider_icon");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

}
