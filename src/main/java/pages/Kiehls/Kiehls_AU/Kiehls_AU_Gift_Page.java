package pages.Kiehls.Kiehls_AU;

import org.openqa.selenium.By;
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
			// HK, KR, TW, JP - North

			if (getCmsConfig("gift").equalsIgnoreCase("Yes")) {

				waitUntilElementVisibleAndClick("master_gift_button");

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
			if (getCmsConfig("gift").equalsIgnoreCase("Yes")) {
				waitUntilElementVisibleAndClick("master_gift_redemption_tab");

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
			if (getCmsConfig("gift").equalsIgnoreCase("Yes")) {
				waitUntilElementVisibleAndClick("master_gift_proceed_button");
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
			if (getCmsConfig("gift").equalsIgnoreCase("Yes")) {
				waitUntil("master_gift_redeem_checkout_popup");
				waitUntilElementVisibleAndClick("master_done_button");

				waitUntilElementVisibleAndClick("master_cart_product_sub_button");

				waitUntilElementVisibleAndClick("master_done_button");
			} else {

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

			if (getCmsConfig("gift").equalsIgnoreCase("Yes")) {
				waitUntilElementVisibleAndClick("master_gift_first_product_addtocart_button");
				waitUntilElementVisibleAndClick("master_gift_second_product_addtocart_button");

			} else {

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
			String seg = ConfigReader.getData("app_segment").toString();

			if (seg.equals("HK") || seg.equals("KR") || seg.equals("TW") || seg.equals("JP")) {

			} else {

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
			if (getCmsConfig("gift").equalsIgnoreCase("Yes")) {
				Thread.sleep(4000);
				waitUntilElementVisibleAndClick("master_gift_first_product_addtocart_button");

			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	public boolean verify_points_label_on_product_in_redemption_page() {
		try {

			if (getCmsConfig("gift").equalsIgnoreCase("Yes")) {
				waitUntil("master_gift_first_product_price_label");

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
			String seg = ConfigReader.getData("app_segment").toString();

			if (getCmsConfig("gift").equalsIgnoreCase("Yes")) {
				waitUntil("master_gift_first_product_price_label");
				if (seg.equals("HK") || seg.equals("KR") || seg.equals("TW") || seg.equals("JP")) {
					waitUntil("master_cart_first_product_name");

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
