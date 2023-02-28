package pages.Kiehls.Kiehls_AU;

import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.utilities.ConfigReader;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_Settings_Page extends CommonActions {
	AppiumDriver driver;

	public Kiehls_AU_Settings_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean user_click_language_switch_and_verify_the_languages() {
		try {
			String seg = ConfigReader.getData("app_segment").toString();
			String app = ConfigReader.getData("app").toString();

			waitUntilElementVisibleAndClick("master_setting_lang_switch_dropdown");

			if (app.equals("Kiehls") && seg.equals("AU")) {
				waitUntil("master_setting_lang_switch_english");

			} else {
				waitUntil("master_setting_lang_switch_english");
				waitUntil("master_setting_lang_switch_japanes");
			}

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_click_training_manual_and_verify_the_document() {
		try {

			waitUntilElementVisibleAndClick("master_setting_trining_manual_dropdown");

			waitUntil("master_setting_trining_manual_file");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_click_version_details_and_verify_the_details() {
		try {

			waitUntilElementVisibleAndClick("master_setting_version_details_dropdown");

			waitUntil("master_setting_version_details_app_version");
			waitUntil("master_setting_version_details_ios_version");
			waitUntil("master_setting_version_details_device_name");
			waitUntil("master_setting_version_details_device_id");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_click_technical_assistance_helpline_and_verify_the_details() {
		try {

			waitUntilElementVisibleAndClick("master_setting_tech_assit_helpline_dropdown");

			waitUntil("master_setting_tech_assit_helpline_page");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_click_delete_cache_or_refresh_app_and_verify() {
		try {

			waitUntilElementVisibleAndClick("master_setting_delete_cache_dropdown");

			waitUntil("master_clear_all_button");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_click_password_management_and_verify() {
		try {

			waitUntilElementVisibleAndClick("master_setting_pwd_management_dropdown");
			waitUntil("master_setting_pwd_management_change_pwd_button");
			// need to add popup fields

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_enter_current_password() {
		try {

			waitUntil("master_setting_change_pwd_popup");
			// sendkeys("master_setting_change_pwd_popup_current_pwd", "test");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_enter_new_password() {
		try {
			// hideKeyboard();
			waitUntil("master_setting_change_pwd_popup_new_pwd");

			// sendkeys("master_setting_change_pwd_popup_new_pwd", "test");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_enter_confirm_password() {
		try {
			// hideKeyboard();
			waitUntil("master_setting_change_pwd_popup_confrim_pwd");
			// sendkeys("master_setting_change_pwd_popup_confrim_pwd", "test");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_click_setting_icon_on_the_right_navigation() {
		try {
			waitUntilElementVisibleAndClick("master_home_settings");
			waitUntil("master_setting_page");
			return true;

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_click_the_change_password_button_in_password_management_and_verify_the_popup() {
		try {
			// hideKeyboard();

			waitUntil("master_setting_pwd_management_change_pwd_button");
			click("master_setting_pwd_management_change_pwd_button");
			waitUntil("master_setting_change_pwd_popup");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_click_cancel_button() {
		try {

			waitUntil("master_setting_change_pwd_popup_submit_button");
			waitUntil("master_setting_change_pwd_popup_cancel_button");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;

		}
	}

}
