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
			if (getCmsConfig("voucher").equalsIgnoreCase("Yes")) {
				waitUntilElementVisibleAndClick("master_voucher_checkout_button");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean validate_minimum_spent_limit_popup() {
		try {

			if (getCmsConfig("voucher").equalsIgnoreCase("Yes")) {
				// Minimum spent limit popup
				waitUntil("master_survey_form_page");

				// Close Button
				waitUntilElementVisibleAndClick("master_done_button");

				// remove the product
				waitUntilElementVisibleAndClick("master_voucher_sub_button");
				waitUntilElementVisibleAndClick("master_done_button");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_add_to_cart_button_on_second_voucher() {
		try {
			if (getCmsConfig("voucher").equalsIgnoreCase("Yes")) {
				waitUntilElementVisibleAndClick("master_voucher_checkout2_button");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean validate_cannot_combine_voucher_popup() {
		try {
			if (getCmsConfig("voucher").equalsIgnoreCase("Yes")) {
				// You can't combine these vouchers
				waitUntil("master_survey_form_page");

				// Close Button
				waitUntilElementVisibleAndClick("master_done_button");

				// remove the product
				waitUntilElementVisibleAndClick("master_voucher_sub_button");
				waitUntilElementVisibleAndClick("master_done_button");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_the_voucher_redemption_button_from_right_navigation_and_verify_the_page() {
		try {
			if (getCmsConfig("voucher").equalsIgnoreCase("Yes")) {
				waitUntilElementVisibleAndClick("master_home_voucher_redemption");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean verify_redeem_requst_page_components() {
		try {
			if (getCmsConfig("voucher").equalsIgnoreCase("Yes")) {
				// Customer Name - Redeem Request Page
				waitUntil("master_gift_customer_name_label");

				// Current Point - Redeem Request Page
				waitUntil("master_gift_current_point_label");

				// Membership Tier - Redeem Request Page
				waitUntil("master_voucher_membership_tier_label");

				// Total Point - Redeem Request Page
				waitUntil("master_total_point_value_label");

				// Balance Point - Redeem Request Page
				waitUntil("master_balance_point_value_label");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_reedem_button() {
		try {
			if (getCmsConfig("voucher").equalsIgnoreCase("Yes")) {
				waitUntilElementVisibleAndClick("master_gift_proceed_button");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_collect_tab_on_redemption_page_and_verify() {
		try {
			if (getCmsConfig("voucher").equalsIgnoreCase("Yes")) {
				waitUntilElementVisibleAndClick("master_voucher_collect_tab");

				waitUntil("master_voucher_collect_page");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

}
