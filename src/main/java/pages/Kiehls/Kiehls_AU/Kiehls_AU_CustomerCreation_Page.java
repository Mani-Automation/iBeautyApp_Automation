package pages.Kiehls.Kiehls_AU;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.utilities.ExtentReport;
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
			reportStatusException(e);
			return false;
		}

	}

//new code
	public boolean create_customer() throws InterruptedException {
		try {
			segment = ConfigReader.getData("app_segment");

			if (segment.equals("AU") || segment.equals("JP")) {
				click("master_create_button");
			} else if (segment.equals("")) {

			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean user_add_membership_info() {
		try {
			if (segment.equals("AU")) {

			} else if (segment.equals("JP")) {
				waitUntil("master_createcustomer_memberid");
				String random_member_id = "573" + String.valueOf(random.nextInt(10000000));
				sendkeys("master_createcustomer_memberid", random_member_id);
				sendkeys("master_createcustomer_mobile_number",
						ExcelData.getExcelData("customer_testdata", "jp_mobile_number") + random.nextInt(10000));
				click("master_brand_logo");

			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean user_add_member_details() {
		try {
			if (segment.equals("AU")) {

			} else if (segment.equals("JP")) {
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

			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_add_mailing_address() {
		try {
			if (segment.equals("AU")) {

			} else if (segment.equals("JP")) {
				// zipcode
				sendkeys("master_createcustomer_zipcode", ExcelData.getExcelData("customer_testdata", "jp_zipcode"));
				click("master_brand_logo");
				// city
				sendkeys("master_createcustomer_address1",
						ExcelData.getExcelData("customer_testdata", "add_street_name"));
				click("master_brand_logo");
				sendkeys("master_createcustomer_address2",
						ExcelData.getExcelData("customer_testdata", "add_street_name"));
				click("master_brand_logo");
				// address

			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_add_communicate_channals_details() {
		try {
			if (segment.equals("AU")) {

			} else if (segment.equals("JP")) {
				swipeScreenUntilElementVisible("master_createcustomer_confirm_button", Direction.UP);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_click_terms_and_conditions_checkbox() {
		try {
			if (segment.equals("AU")) {

			} else if (segment.equals("JP")) {
				swipeScreenUntilElementVisible("master_createcustomer_confirm_button", Direction.UP);
				waitUntil("master_createcustomer_confirm_button");
				click("master_createcustomer_accept_checkbox");

			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_click_confirm_button() {
		try {

			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {
				if (segment.equals("AU")) {

				} else if (segment.equals("JP")) {
					swipeScreenUntilElementVisible("master_createcustomer_confirm_button", Direction.UP);
					waitUntil("master_createcustomer_confirm_button");
					click("master_createcustomer_confirm_button");
				}
				return true;
			}
			case "PROD": {
			}

			default: {
			}
				return false;

			}

		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_verify_mandatory_error_messages() {

		try {
			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {
				swipeScreenUntilElementVisible("master_createcustomer_memberid", Direction.DOWN);
				//waitUntil("master_createcustomer_mandatory_error_memberid");
				//waitUntil("master_createcustomer_mandatory_error_phonenumber");
				//waitUntil("master_createcustomer_mandatory_error_lastname");
				//waitUntil("master_createcustomer_mandatory_error_firstname");

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
			reportStatusException(e);
			return false;
		}
	}

}
