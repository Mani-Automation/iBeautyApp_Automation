package pages.Kiehls.Kiehls_AU;

import java.io.IOException;

import org.apache.tools.ant.ExitStatusException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.reusableMethods.CommonActions;
import com.utilities.ExtentReport;
import com.utilities.LocatorManager;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_Settings_Page extends CommonActions {
	AppiumDriver driver;

	public Kiehls_AU_Settings_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean user_click_language_switch_and_verify_the_languages() {
		try {
			waitUntil("master_setting_lang_switch_dropdown");
			click("master_setting_lang_switch_dropdown");
			waitUntil("master_setting_page");

			waitUntil("master_setting_lang_switch_english");
			waitUntil("master_setting_lang_switch_japanes");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean user_click_training_manual_and_verify_the_document() {
		try {
			waitUntil("master_setting_trining_manual_dropdown");
			click("master_setting_trining_manual_dropdown");
			waitUntil("master_setting_trining_manual_file");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean user_click_version_details_and_verify_the_details() {
		try {
			waitUntil("master_setting_version_details_dropdown");
			click("master_setting_version_details_dropdown");

			waitUntil("master_setting_version_details_app_version");
			waitUntil("master_setting_version_details_ios_version");
			waitUntil("master_setting_version_details_device_name");
			waitUntil("master_setting_version_details_device_id");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean user_click_technical_assistance_helpline_and_verify_the_details() {
		try {

			waitUntil("master_setting_version_details_dropdown");
			click("master_setting_version_details_dropdown");

			waitUntil("master_setting_version_details_app_version");
			waitUntil("master_setting_version_details_ios_version");
			waitUntil("master_setting_version_details_device_name");
			waitUntil("master_setting_version_details_device_id");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean user_click_delete_cache_or_refresh_app_and_verify() {
		try {

			waitUntil("master_setting_delete_cache_dropdown");
			click("master_setting_delete_cache_dropdown");

			waitUntil("master_setting_delete_cache_clear_button");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean user_click_password_management_and_verify() {
		try {

			waitUntil("master_setting_pwd_management_dropdown");
			click("master_setting_pwd_management_dropdown");

			waitUntil("master_setting_pwd_management_change_pwd_button");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean user_enter_current_password() {
		try {
			waitUntil("master_setting_delete_cache_clear_button");
			click("master_setting_delete_cache_clear_button");
			waitUntil("master_setting_delete_cache_clear_button");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean user_enter_new_password() {
		return false;
	}

	public boolean user_enter_confirm_password() {
		return false;
	}

	public boolean user_click_setting_icon_on_the_right_navigation() {
		try {
			waitUntil("master_home_settings");
			click("master_home_settings");
			waitUntil("master_setting_page");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean user_click_the_change_password_button_in_password_management_and_verify_the_popup() {
		try {
			waitUntil("master_setting_delete_cache_clear_button");
			click("master_setting_delete_cache_clear_button");
			waitUntil("master_setting_delete_cache_clear_button");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean user_click_cancel_button() {
		return false;
	}

}
