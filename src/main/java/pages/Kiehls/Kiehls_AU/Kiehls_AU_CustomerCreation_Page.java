package pages.Kiehls.Kiehls_AU;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.utilities.ConfigReader;
import com.utilities.ExcelData;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_CustomerCreation_Page extends CommonActions {
	AppiumDriver driver;
	public static String segment;
	Random random = new Random();

	public Kiehls_AU_CustomerCreation_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	//

	public boolean verify_customer_creation_page() throws InterruptedException {

		try {
			Thread.sleep(2000);

			// if (kiehls_rewards_registration_popup.isDisplayed()) {
			// kiehls_rewards_registration_popup_close_button.click();
			// webdriverwait(create_member_page);
			// }

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

//new code
	public boolean create_customer() throws InterruptedException {
		try {
			segment = ConfigReader.getData("app_segment");

			if (segment.equals("JP")) {
				click("master_create_button");
			} else if (segment.equals("KR")) {
				click("master_create_button");
				// popup
				waitUntilElementVisibleAndClick("master_kr_createcustomer_popup");
			} else if (segment.equals("AU")) {
				click("master_create_button");
				// popup
				waitUntilElementVisibleAndClick("master_done_button");

			} else if (segment.equals("TW") || segment.equals("HK") || segment.equals("MY")) {
				click("master_create_button");

			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean user_add_membership_info_jp() {
		try {

			waitUntil("master_createcustomer_memberid");
			String random_member_id = "573" + String.valueOf(random.nextInt(10000000));
			sendkeys("master_createcustomer_memberid", random_member_id);
			sendkeys("master_createcustomer_mobile_number",
					ExcelData.getExcelData("customer_testdata", "jp_mobile_number") + random.nextInt(10000));
			click("master_brand_logo");
			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean user_add_member_details_jp() {
		try {

			// lastname
			sendkeys("master_createcustomer_lastname", ExcelData.getExcelData("customer_testdata", "last_name"));
			click("master_brand_logo");
			sendkeys("master_createcustomer_katakana_lastname",
					ExcelData.getExcelData("customer_testdata", "katakana_last_name"));
			click("master_brand_logo");
			// firstname
			sendkeys("master_createcustomer_firstname", ExcelData.getExcelData("customer_testdata", "first_name"));
			click("master_brand_logo");
			sendkeys("master_createcustomer_katakana_firstname",
					ExcelData.getExcelData("customer_testdata", "katakana_first_name"));
			click("master_brand_logo");
			// email
			waitUntil("master_createcustomer_email");
			sendkeys("master_createcustomer_email",
					ExcelData.getExcelData("customer_testdata", "email_id") + random.nextInt(10000));
			click("master_brand_logo");
			waitUntil("master_createcustomer_email_domain_dropdown");
			click("master_createcustomer_email_domain_dropdown");
			waitUntil("master_createcustomer_email_domain_name");
			click("master_createcustomer_email_domain_name");
			// dob
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

	public boolean user_add_mailing_address_jp() {
		try {

			// zipcode
			sendkeys("master_createcustomer_zipcode", ExcelData.getExcelData("customer_testdata", "jp_zipcode"));
			click("master_brand_logo");
			// city
			sendkeys("master_createcustomer_address1", ExcelData.getExcelData("customer_testdata", "add_street_name"));
			click("master_brand_logo");
			sendkeys("master_createcustomer_address2", ExcelData.getExcelData("customer_testdata", "add_street_name"));
			click("master_brand_logo");
			// address

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_communicate_channals_details() {
		try {

			swipeScreenUntilElementVisible("master_createcustomer_confirm_button", Direction.UP);

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_terms_and_conditions_checkbox_jp() {
		try {

			swipeScreenUntilElementVisible("master_createcustomer_confirm_button", Direction.UP);
			waitUntil("master_createcustomer_confirm_button");
			click("master_createcustomer_accept_checkbox");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_confirm_button() {
		try {

			String seg = ConfigReader.getData("app_segment").toString();

			if (seg.equals("HK") || seg.equals("KR") || seg.equals("TW") || seg.equals("JP") || seg.equals("AU")
					|| seg.equals("MY")) {

				swipeScreenUntilElementVisible("master_createcustomer_confirm_button", Direction.UP);
				waitUntilElementVisibleAndClick("master_createcustomer_confirm_button");
				return true;
			} else {
				return false;

			}

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_verify_mandatory_error_messages() {

		try {
			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {
				swipeScreenUntilElementVisible("master_createcustomer_mandatory_error_lastname", Direction.DOWN);

				// waitUntil("master_createcustomer_mandatory_error_memberid");
				// waitUntil("master_createcustomer_mandatory_error_phonenumber");
				waitUntil("master_createcustomer_mandatory_error_lastname");
				waitUntil("master_createcustomer_mandatory_error_firstname");

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

	public boolean user_verify_customer_threesixty_screen_should_be_displayed() {

		try {

			String seg = ConfigReader.getData("app_segment").toString();

			if (!seg.equals("MY")) {

				waitUntil("master_c360_cus_name_label");

				return true;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_add_membership_info_au() {
		try {
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_member_details_au() {
		try {

			// firstname
			sendkeys("master_createcustomer_firstname", ExcelData.getExcelData("customer_testdata", "first_name"));
			click("master_brand_logo");

			// lastname
			sendkeys("master_createcustomer_lastname", ExcelData.getExcelData("customer_testdata", "last_name"));
			click("master_brand_logo");
			// day
			waitUntil("master_createcustomer_day_dropdown");
			click("master_createcustomer_day_dropdown");
			waitUntil("master_createcustomer_date");
			click("master_createcustomer_date");
			// Month
			waitUntil("master_createcustomer_month_dropdown");
			click("master_createcustomer_month_dropdown");
			waitUntil("master_createcustomer_month");
			click("master_createcustomer_month");

			// Year
			waitUntil("master_createcustomer_year_dropdown");
			click("master_createcustomer_year_dropdown");
			waitUntil("master_createcustomer_year");
			click("master_createcustomer_year");

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
			sendkeys("master_createcustomer_email", "testau" + random.nextInt(10000) + "@gmail.com");
			click("master_brand_logo");

			// phone number
			sendkeys("master_calendar_event_phone_text", "6161616161");
			click("master_brand_logo");

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_mailing_address_au() {
		try {

			// street no
			sendkeys("master_au_createcustomer_streetnumber",
					ExcelData.getExcelData("customer_testdata", "add_street_number"));
			click("master_brand_logo");

			// street
			sendkeys("master_au_createcustomer_streetname",
					ExcelData.getExcelData("customer_testdata", "add_street_name"));
			click("master_brand_logo");

			// city
			sendkeys("master_au_createcustomer_city", ExcelData.getExcelData("customer_testdata", "add_pincode"));
			click("master_brand_logo");

			// state

			waitUntilElementVisibleAndClick("master_au_createcustomer_state_dropdown");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "add_state_name"));

			// postcode

			sendkeys("master_createcustomer_zipcode", ExcelData.getExcelData("customer_testdata", "jp_zipcode"));
			click("master_brand_logo");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_terms_and_conditions_checkbox_au() {
		try {

			swipeScreenUntilElementVisible("master_createcustomer_confirm_button", Direction.UP);

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_membership_info_kr() {
		try {

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_member_details_kr() {
		try {

			// last name
			sendkeys("master_createcustomer_lastname", ExcelData.getExcelData("customer_testdata", "first_name"));
			click("master_brand_logo");

			// phone number
			sendkeys("master_calendar_event_phone_text", "6161616161");
			click("master_brand_logo");

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
			sendkeys("master_createcustomer_email", "testau" + random.nextInt(10000) + "@gmail.com");
			click("master_brand_logo");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_terms_and_conditions_checkbox_kr() {
		try {
			swipeScreenUntilElementVisible("master_kr_createcustomer_agree_checkbox1", Direction.UP);

			waitUntilElementVisibleAndClick("master_kr_createcustomer_agree_checkbox1");

			swipeScreenUntilElementVisible("master_kr_createcustomer_agree_checkbox2", Direction.UP);

			waitUntilElementVisibleAndClick("master_kr_createcustomer_agree_checkbox2");
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_mailing_address_kr() {
		try {

			// add2
			sendkeys("master_createcustomer_address2", ExcelData.getExcelData("customer_testdata", "add_street_name"));
			click("master_brand_logo");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_membership_info_tw() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean user_add_member_details_tw() {
		try {

			// last name
			sendkeys("master_createcustomer_lastname", ExcelData.getExcelData("customer_testdata", "first_name"));
			click("master_brand_logo");

			// phone number
			sendkeys("master_calendar_event_phone_text", "6161616161");
			click("master_brand_logo");

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
			sendkeys("master_createcustomer_email", "testau" + random.nextInt(10000) + "@gmail.com");
			click("master_brand_logo");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_mailing_address_tw() {
		// TODO Auto-generated method stub master_tw_createcustomer_mailing_add_dropdown
		try {

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_terms_and_conditions_checkbox_tw() {
		try {
			swipeScreenUntilElementVisible("master_tw_createcustomer_agree_checkbox", Direction.UP);

			waitUntilElementVisibleAndClick("master_tw_createcustomer_agree_checkbox");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_membership_info_hk() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean user_add_member_details_hk() {
		try {

			// title
			waitUntilElementVisibleAndClick("master_hk_createcustomer_title_dropdown");
			staticTextClick("Mrs");
			// surname
			sendkeys("master_hk_createcustomer_surname", ExcelData.getExcelData("customer_testdata", "first_name"));
			click("master_brand_logo");
			// fn
			sendkeys("master_createcustomer_firstname", ExcelData.getExcelData("customer_testdata", "last_name"));
			click("master_brand_logo");

			// areacode
			// phone
			waitUntilElementVisibleAndClick("master_hk_createcustomer_areacode_dropdown");
			staticTextClick("+852");

			sendkeys("master_calendar_event_phone_text", "60838324");
			click("master_brand_logo");
			// email
			waitUntil("master_createcustomer_email");
			sendkeys("master_createcustomer_email", "testau" + random.nextInt(10000) + "@gmail.com");
			click("master_brand_logo");
			// month
			// Month
			waitUntil("master_createcustomer_month_dropdown");
			click("master_createcustomer_month_dropdown");
			waitUntil("master_createcustomer_month");
			click("master_createcustomer_month");

			waitUntilElementVisibleAndClick("master_hk_createcustomer_age_group_dropdown");
			waitUntilElementVisibleAndClick("master_hk_createcustomer_age");
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_terms_and_conditions_checkbox_hk() {
		try {
			swipeScreenUntilElementVisible("master_hk_createcustomer_agree_checkbox1", Direction.UP);

			waitUntilElementVisibleAndClick("master_hk_createcustomer_agree_checkbox1");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_member_details_my() {
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

	public boolean user_click_terms_and_conditions_checkbox_my() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean user_add_mailing_address_my() {
		try {

			// street no
			sendkeys("master_au_createcustomer_streetnumber",
					ExcelData.getExcelData("customer_testdata", "add_street_number"));
			click("master_brand_logo");

			// street
			sendkeys("master_au_createcustomer_streetname",
					ExcelData.getExcelData("customer_testdata", "add_street_name"));
			click("master_brand_logo");

			// city
			sendkeys("master_au_createcustomer_city", ExcelData.getExcelData("customer_testdata", "add_pincode"));
			click("master_brand_logo");

			// state

			waitUntilElementVisibleAndClick("master_au_createcustomer_state_dropdown");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "add_state_name"));

			// postcode
			sendkeys("master_createcustomer_zipcode", ExcelData.getExcelData("customer_testdata", "jp_zipcode"));
			click("master_brand_logo");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_confirm_button_to_update_edited_changes() {
		try {

			String seg = ConfigReader.getData("app_segment").toString();

			if (seg.equals("MY")) {

				return true;
			} else {
				return false;

			}

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

}
