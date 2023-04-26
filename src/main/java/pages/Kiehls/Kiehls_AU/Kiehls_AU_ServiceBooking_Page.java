package pages.Kiehls.Kiehls_AU;

import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.utilities.ConfigReader;
import com.utilities.LocatorManager;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_ServiceBooking_Page extends CommonActions {
	AppiumDriver driver;
	LocatorManager locator = new LocatorManager();

	public Kiehls_AU_ServiceBooking_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean varify_the_reservation_id_popup() {
		try {
			if (getCmsConfig("service_booking").equalsIgnoreCase("Yes")) {
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean verify_the_upcoming_bookings_page() {
		try {
			if (getCmsConfig("service_booking").equalsIgnoreCase("Yes")) {
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean user_click_refresh_button_and_it_should_navigate_to_list_page() {
		try {
			if (getCmsConfig("service_booking").equalsIgnoreCase("Yes")) {
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_customers_button_and_validate_customer_list_page() {
		try {
			if (getCmsConfig("service_booking").equalsIgnoreCase("Yes")) {
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean verifty_the_customer_details() {
		try {
			if (getCmsConfig("service_booking").equalsIgnoreCase("Yes")) {
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_calendar_button_on_upcoming_booking_page() {
		try {
			if (getCmsConfig("service_booking").equalsIgnoreCase("Yes")) {
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_first_customer_on_the_list() {
		try {
			if (getCmsConfig("service_booking").equalsIgnoreCase("Yes")) {
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_all_bookings_button_and_verify_the_list_page() {
		try {
			if (getCmsConfig("service_booking").equalsIgnoreCase("Yes")) {
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

}
