package pages.Kiehls.Kiehls_AU;

import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.utilities.ConfigReader;
import com.utilities.LocatorManager;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_Gift_Page extends CommonActions {
	AppiumDriver driver;
	LocatorManager locator = new LocatorManager();

	public Kiehls_AU_Gift_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean user_click_the_gift_button_on_cart_page() {
		try {

			// HK, KR, TW, JP ,
			String segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {
			}
			case "MY": {
			}
			case "TW": {
				waitUntilElementVisibleAndClick("master_gift_button");
			}
			case "SG": {
			}
			case "HR": {
			}
			case "NZ": {
			}
			case "JP": {
				waitUntilElementVisibleAndClick("master_gift_button");
			}
			case "HK": {
				waitUntilElementVisibleAndClick("master_gift_button");
			}
			case "KR": {
				waitUntilElementVisibleAndClick("master_gift_button");
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

	public boolean user_verify_the_redemption_page() {
		try {

			// HK, KR, TW, JP ,
			String segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {
			}
			case "MY": {
			}
			case "TW": {
				waitUntilElementVisibleAndClick("master_gift_redemption_tab");

			}
			case "SG": {
			}
			case "HR": {
			}
			case "NZ": {
			}
			case "JP": {
				waitUntilElementVisibleAndClick("master_gift_redemption_tab");

			}
			case "HK": {
				waitUntilElementVisibleAndClick("master_gift_redemption_tab");

			}
			case "KR": {
				waitUntilElementVisibleAndClick("master_gift_redemption_tab");

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

	public boolean user_click_proceed_button() {
		try {
			// HK, KR, TW, JP ,
			String segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {
			}
			case "MY": {
			}
			case "TW": {
				waitUntilElementVisibleAndClick("");

			}
			case "SG": {
			}
			case "HR": {
			}
			case "NZ": {
			}
			case "JP": {
				waitUntilElementVisibleAndClick("");

			}
			case "HK": {
				waitUntilElementVisibleAndClick("");

			}
			case "KR": {
				waitUntilElementVisibleAndClick("");

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

	public boolean validate_redeem_points_popup() {
		try {
			// HK, KR, TW, JP ,
			String segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {
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

	public boolean verify_user_can_add_more_gifts_from_redemption_page_and_validate_total_and_balance_points() {
		try {
			// HK, KR, TW, JP ,
			String segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {
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

	public boolean validate_total_items_and_total_points_in_cart_page() {
		try {
			// HK, KR, TW, JP ,
			String segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {
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

	public boolean user_click_add_to_cart_button() {
		try {
			// HK, KR, TW, JP ,
			String segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {
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

			waitUntilElementVisibleAndClick("");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	public boolean verify_points_label_on_product_in_redemption_page() {
		try {
			// HK, KR, TW, JP ,
			String segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {
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

	public boolean verify_the_gift_product_on_cart_page() {
		try {
			// HK, KR, TW, JP ,
			String segment = ConfigReader.getData("app_segment").toString();
			switch (segment) {
			case "AU": {
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

}
