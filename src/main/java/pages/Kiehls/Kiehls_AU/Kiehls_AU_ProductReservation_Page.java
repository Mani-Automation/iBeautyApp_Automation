package pages.Kiehls.Kiehls_AU;

import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.utilities.ConfigReader;
import com.utilities.LocatorManager;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_ProductReservation_Page extends CommonActions {
	AppiumDriver driver;
	LocatorManager locator = new LocatorManager();

	public Kiehls_AU_ProductReservation_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean user_click_the_reserve_button_on_cart_page() {
		try {

			if (getCmsConfig("product_reservation").equalsIgnoreCase("Yes")) {

				waitUntil("");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_enter_the_reservation_id() {
		try {
			if (getCmsConfig("product_reservation").equalsIgnoreCase("Yes")) {

				waitUntil("");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_validate_generic_customer_popup_and_click_proceed_button() {
		try {
			if (getCmsConfig("product_reservation").equalsIgnoreCase("Yes")) {

				waitUntil("");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean validate_product_reservation_success_popup() {
		try {
			if (getCmsConfig("product_reservation").equalsIgnoreCase("Yes")) {

			waitUntil("");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_add_to_cart_button_from_plp_page() {
		try {
			if (getCmsConfig("product_reservation").equalsIgnoreCase("Yes")) {

				waitUntil("");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean varify_the_reservation_id_popup() {
		try {
			if (getCmsConfig("product_reservation").equalsIgnoreCase("Yes")) {

				waitUntil("");
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

}
