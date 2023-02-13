package pages.Kiehls.Kiehls_AU;

import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.utilities.ConfigReader;
import com.utilities.LocatorManager;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_Voucher_page extends CommonActions {
	AppiumDriver driver;
	LocatorManager locator = new LocatorManager();

	public Kiehls_AU_Voucher_page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean user_click_add_to_cart_button_on_first_voucher() {
		try {

			waitUntil("");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean validate_minimum_spent_limit_popup() {
		try {

			waitUntil("");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_add_to_cart_button_on_second_voucher() {
		try {

			waitUntil("");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean validate_cannot_combine_voucher_popup() {
		try {

			waitUntil("");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_the_voucher_redemption_button_from_right_navigation_and_verify_the_page() {
		try {

			waitUntil("");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean verify_redeem_requst_page_components() {
		try {

			waitUntil("");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_reedem_button() {
		try {

			waitUntil("");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

}
