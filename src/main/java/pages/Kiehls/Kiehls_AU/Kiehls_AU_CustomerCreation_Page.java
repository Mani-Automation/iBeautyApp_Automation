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

			if (segment.equals("KR")) {

				// Create Customer Button
				click("master_create_button");

				// Popup on Create Customer Page
				waitUntilElementVisibleAndClick("master_kr_createcustomer_popup");

				return true;

			} else if (segment.equals("AU") || segment.equals("NZ")) {

				// Create Customer Button
				click("master_create_button");

				// Popup on Create Customer Page
				waitUntilElementVisibleAndClick("master_done_button");

				return true;

			} else {
				click("master_create_button");
				return true;

			}
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean user_add_membership_info_jp() {
		try {

			waitUntil("master_createcustomer_memberid");
			String random_member_id = ExcelData.getExcelData("customer_testdata", "member_id")
					+ String.valueOf(random.nextInt(10000000));
			sendkeys("master_createcustomer_memberid", random_member_id);

			sendkeys("master_createcustomer_mobile_number",
					ExcelData.getExcelData("customer_testdata", "mobile_number_rand") + random.nextInt(10000));
			clickLogoToHideKeyboard();

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean user_add_member_details_jp() {
		try {

			// Last Name
			sendExcelData("master_createcustomer_lastname", "customer_testdata", "last_name");

			// Katakana Last Name
			sendExcelData("master_createcustomer_katakana_lastname", "customer_testdata", "katakana_last_name");

			// First Name
			sendExcelData("master_createcustomer_lastname", "customer_testdata", "first_name");

			// Katakana First Name
			sendExcelData("master_createcustomer_katakana_firstname", "customer_testdata", "katakana_first_name");

			// Email
			sendExcelData("master_createcustomer_email", "customer_testdata", "first_name" + generateRandomNumber());


			// Domain Name
			waitUntilElementVisibleAndClick("master_createcustomer_email_domain_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_email_domain_name");

			// DOB Year
			waitUntilElementVisibleAndClick("master_createcustomer_year_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_year");

			// DOB Month
			waitUntilElementVisibleAndClick("master_createcustomer_month_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_month");

			// DOB Date
			waitUntilElementVisibleAndClick("master_createcustomer_day_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_date");

			// Gender
			waitUntilElementVisibleAndClick("master_createcustomer_gender_dropdown");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "gender_male"));

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_mailing_address_jp() {
		try {

			// Zip coode
			sendExcelData("master_createcustomer_zipcode", "customer_testdata", "jp_zipcode");

			// City
			sendExcelData("master_createcustomer_address1", "customer_testdata", "add_street_name");

			// Street Name
			sendExcelData("master_createcustomer_address2", "customer_testdata", "add_street_name");

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

			if (seg.equals("SG")) {
				swipeScreenUntilElementVisible("master_createcustomer_confirm_button", Direction.UP);
				waitUntilElementVisibleAndClick("master_createcustomer_confirm_button");
				waitUntilElementVisibleAndClick("master_sg_createcustomer_proceed_button");
				return true;
			} else if (seg.equals("HK")) {
				swipeScreenUntilElementVisible("master_hk_update_button", Direction.UP);
				waitUntilElementVisibleAndClick("master_hk_update_button");
				return true;

			} else {

				swipeScreenUntilElementVisible("master_createcustomer_confirm_button", Direction.UP);
				waitUntilElementVisibleAndClick("master_createcustomer_confirm_button");
				return true;

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
		return true; // Do Not Delete this method
	}

	public boolean user_add_membership_info_kr() {
		return true; // Do Not Delete this method
	}

	public boolean user_add_mailing_address_hk() {
		return true; // Do Not Delete this method
	}

	public boolean user_add_mailing_address_sg() {
		return true; // Do Not Delete this method
	}

	public boolean user_click_terms_and_conditions_checkbox_nz() {
		return true; // Do Not Delete this method
	}

	public boolean user_add_mailing_address_nz() {
		return true; // Do Not Delete this method
	}

	public boolean user_add_communicate_channals_details_hk() {
		return true; // Do Not Delete this method
	}

	public boolean user_add_mailing_address_th() {
		return true; // Do Not Delete this method
	}

	public boolean user_add_member_details_au() {
		try {

			// First Name
			sendExcelData("master_createcustomer_firstname", "customer_testdata", "first_name");

			// Last Name
			sendExcelData("master_createcustomer_lastname", "customer_testdata", "last_name");

			// DOB Date
			waitUntilElementVisibleAndClick("master_createcustomer_day_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_date");

			// DOB Month
			waitUntilElementVisibleAndClick("master_createcustomer_month_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_month");

			// DOB Year
			waitUntilElementVisibleAndClick("master_createcustomer_year_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_year");

			// Gender
			waitUntilElementVisibleAndClick("master_createcustomer_gender_dropdown");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "gender_male"));

			// Email
			sendkeys("master_createcustomer_email", setRandomEmail());
			clickLogoToHideKeyboard();

			// Mobile Number
			sendExcelData("master_calendar_event_phone_text", "customer_testdata", "mobile_number");
			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_mailing_address_au() {
		try {

			// Street Number
			sendExcelData("master_au_createcustomer_streetnumber", "customer_testdata", "add_street_number");

			// Street Name
			sendExcelData("master_au_createcustomer_streetname", "customer_testdata", "add_street_name");

			// City
			sendExcelData("master_au_createcustomer_city", "customer_testdata", "add_pincode");

			// State
			waitUntilElementVisibleAndClick("master_au_createcustomer_state_dropdown");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "add_state_name"));

			// Postal code
			sendExcelData("master_createcustomer_zipcode", "customer_testdata", "jp_zipcode");

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

	public boolean user_add_member_details_kr() {
		try {

			// Last Name
			sendExcelData("master_createcustomer_lastname", "customer_testdata", "first_name");

			// Mobile Number
			sendExcelData("master_calendar_event_phone_text", "customer_testdata", "mobile_number");

			// Year
			waitUntilElementVisibleAndClick("master_createcustomer_year_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_year");

			// Month
			waitUntilElementVisibleAndClick("master_createcustomer_month_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_month");

			// Day
			waitUntilElementVisibleAndClick("master_createcustomer_day_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_date");

			// Gender
			waitUntilElementVisibleAndClick("master_createcustomer_gender_dropdown");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "gender_male"));

			// Email
			waitUntil("master_createcustomer_email");
			sendkeys("master_createcustomer_email", setRandomEmail());
			clickLogoToHideKeyboard();

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

			// Address 2
			sendExcelData("master_createcustomer_address2", "customer_testdata", "add_street_name");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_membership_info_tw() {
		return true;
	}

	public boolean user_add_member_details_tw() {
		try {

			// Last Name
			sendExcelDataWithRandomText("master_createcustomer_lastname", "customer_testdata", "test_name",
					RandomStringGenerate());

			// phone number
			sendExcelDataWithRandomText("master_calendar_event_phone_text", "customer_testdata", "mobile_number_rand",
					random.nextInt(10000));

			// Year
			waitUntilElementVisibleAndClick("master_createcustomer_year_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_year");

			// Month
			waitUntilElementVisibleAndClick("master_createcustomer_month_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_month");

			// Day
			waitUntilElementVisibleAndClick("master_createcustomer_day_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_date");

			// gender
			waitUntilElementVisibleAndClick("master_createcustomer_gender_dropdown");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "gender_male"));

			// Email
			waitUntil("master_createcustomer_email");
			sendkeys("master_createcustomer_email", setRandomEmail());
			clickLogoToHideKeyboard();

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_mailing_address_tw() {
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

			// Title
			waitUntilElementVisibleAndClick("master_hk_createcustomer_title_dropdown");
			staticTextClick("Mrs");

			// Surname
			sendExcelData("master_hk_createcustomer_surname", "customer_testdata", "first_name");

			// First Name
			sendExcelData("master_createcustomer_firstname", "customer_testdata", "last_name");

			// Area Code
			waitUntilElementVisibleAndClick("master_hk_createcustomer_areacode_dropdown");
			staticTextClick("+" + ExcelData.getExcelData("customer_testdata", "area_code"));

			// Mobile
			sendExcelData("master_calendar_event_phone_text", "customer_testdata", "mobile_number");

			// Email
			waitUntil("master_createcustomer_email");
			sendkeys("master_createcustomer_email", setRandomEmail());
			clickLogoToHideKeyboard();

			// Month
			waitUntilElementVisibleAndClick("master_createcustomer_month_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_month");

			// Gender
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

			swipeScreenUntilElementVisible("master_hk_createcustomer_agree_checkbox2", Direction.UP);
			waitUntilElementVisibleAndClick("master_hk_createcustomer_agree_checkbox2");

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_member_details_my() {
		try {

			// Title
			waitUntilElementVisibleAndClick("master_hk_createcustomer_title_dropdown");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "customer_title"));

			// First Name
			sendExcelDataWithRandomText("master_createcustomer_firstname", "customer_testdata", "first_name",
					RandomStringGenerate());

			// Last Name
			sendExcelDataWithRandomText("master_createcustomer_lastname", "customer_testdata", "last_name",
					RandomStringGenerate());

			// Mobile number
			waitUntil("master_calendar_event_phone_text");
			sendExcelData("master_calendar_event_phone_text", "customer_testdata",
					"mobile_number_rand" + random.nextInt(10000));

			// Email
			waitUntil("master_createcustomer_email");
			sendkeys("master_createcustomer_email", setRandomEmail());
			clickLogoToHideKeyboard();

			// Gender
			waitUntilElementVisibleAndClick("master_createcustomer_gender_dropdown");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "gender_male"));

			// DOB Day
			waitUntilElementVisibleAndClick("master_nz_createcustomer_day_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_date");

			// Month
			waitUntilElementVisibleAndClick("master_createcustomer_month_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_month");

			// Year
			waitUntilElementVisibleAndClick("master_createcustomer_year_dropdown");
			waitUntilElementVisibleAndClick("master_my_createcustomer_year");

			// Language
			waitUntilElementVisibleAndClick("master_my_createcustomer_language");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "language"));

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_terms_and_conditions_checkbox_my() {
		return true;
	}

	public boolean user_add_mailing_address_my() {
		try {

			// Street Number
			sendExcelData("master_au_createcustomer_streetnumber", "customer_testdata", "add_street_number");

			// Street Name
			sendExcelData("master_au_createcustomer_streetname", "customer_testdata", "add_street_name");

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
			}

			else if (seg.equals("HK")) {
				swipeScreenUntilElementVisible("master_hk_update_button", Direction.UP);
				waitUntilElementVisibleAndClick("master_hk_update_button");
				return true;

			} else {
				swipeScreenUntilElementVisible("master_createcustomer_confirm_button", Direction.UP);
				waitUntilElementVisibleAndClick("master_createcustomer_confirm_button");
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_member_details_th() {
		try {

			// Customer Type
			waitUntilElementVisibleAndClick("master_th_createcustomer_customer_type");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "customer_type"));

			// Passport Number
			sendExcelData("master_th_createcustomer_passport_id", "customer_testdata",
					"passport_number" + random.nextInt(1000));

			// First Name
			sendExcelData("master_createcustomer_firstname", "customer_testdata",
					"first_name" + RandomStringGenerate());

			// Last Name
			sendExcelData("master_createcustomer_lastname", "customer_testdata", "last_name" + RandomStringGenerate());

			// Mobile number -------------------------
			sendkeys("master_calendar_event_phone_text",
					"0" + ExcelData.getExcelData("customer_testdata", "mobile_number_rand") + random.nextInt(10000));
			clickLogoToHideKeyboard();

			// Email
			waitUntil("master_createcustomer_email");
			sendkeys("master_createcustomer_email", setRandomEmail());
			clickLogoToHideKeyboard();

			// Gender
			waitUntilElementVisibleAndClick("master_createcustomer_gender_dropdown");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "gender_male"));

			// DOB Day
			waitUntilElementVisibleAndClick("master_nz_createcustomer_day_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_date");

			// DOB Month
			waitUntilElementVisibleAndClick("master_createcustomer_month_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_month");

			// DOB Year
			waitUntilElementVisibleAndClick("master_createcustomer_year_dropdown");
			waitUntilElementVisibleAndClick("master_sg_createcustomer_year");

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_terms_and_conditions_checkbox_th() {
		try {
			swipeScreenUntilElementVisible("master_th_createcustomer_agree_checkbox1", Direction.UP);
			waitUntilElementVisibleAndClick("master_th_createcustomer_agree_checkbox1");

			swipeScreenUntilElementVisible("master_th_createcustomer_agree_checkbox2", Direction.UP);
			waitUntilElementVisibleAndClick("master_th_createcustomer_agree_checkbox2");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_member_details_sg() {
		try {

			// First Name
			waitUntil("master_createcustomer_firstname");
			sendkeys("master_createcustomer_firstname",
					ExcelData.getExcelData("customer_testdata", "first_name") + RandomStringGenerate());
			clickLogoToHideKeyboard();

			// Last Name
			sendkeys("master_createcustomer_lastname",
					ExcelData.getExcelData("customer_testdata", "last_name") + RandomStringGenerate());
			clickLogoToHideKeyboard();

			// Mobile number
			sendkeys("master_calendar_event_phone_text",
					ExcelData.getExcelData("customer_testdata", "mobile_number_rand") + random.nextInt(10000));
			clickLogoToHideKeyboard();

			// Email
			waitUntil("master_createcustomer_email");
			sendkeys("master_createcustomer_email", setRandomEmail());
			clickLogoToHideKeyboard();

			// Month
			waitUntilElementVisibleAndClick("master_createcustomer_month_dropdown");
			waitUntilElementVisibleAndClick("master_sg_createcustomer_month");

			// Year
			waitUntilElementVisibleAndClick("master_createcustomer_year_dropdown");
			waitUntilElementVisibleAndClick("master_sg_createcustomer_year");

			// Gender
			waitUntilElementVisibleAndClick("master_createcustomer_gender_dropdown");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "gender_male"));

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_terms_and_conditions_checkbox_sg() {
		try {

			swipeScreenUntilElementVisible("master_sg_createcustomer_agree_checkbox1", Direction.UP);
			waitUntilElementVisibleAndClick("master_sg_createcustomer_agree_checkbox1");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_add_member_details_nz() {
		try {

			// First Name
			sendkeys("master_createcustomer_firstname",
					ExcelData.getExcelData("customer_testdata", "first_name") + RandomStringGenerate());
			clickLogoToHideKeyboard();

			// Last Name
			sendkeys("master_createcustomer_lastname",
					ExcelData.getExcelData("customer_testdata", "last_name") + RandomStringGenerate());
			clickLogoToHideKeyboard();

			// Day
			waitUntilElementVisibleAndClick("master_nz_createcustomer_day_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_date");

			// Month
			waitUntilElementVisibleAndClick("master_createcustomer_month_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_month");

			// Year
			waitUntilElementVisibleAndClick("master_createcustomer_year_dropdown");
			waitUntilElementVisibleAndClick("master_createcustomer_year");

			// Gender
			waitUntilElementVisibleAndClick("master_createcustomer_gender_dropdown");
			staticTextClick(ExcelData.getExcelData("customer_testdata", "gender_male"));

			// Email
			waitUntil("master_createcustomer_email");
			sendkeys("master_createcustomer_email", setRandomEmail());
			clickLogoToHideKeyboard();

			// Mobile number
			sendkeys("master_calendar_event_phone_text", ExcelData.getExcelData("customer_testdata", "mobile_number"));
			clickLogoToHideKeyboard();

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}
}
