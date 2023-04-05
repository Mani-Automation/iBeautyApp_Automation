package pages.Kiehls.Kiehls_AU;

import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.utilities.ConfigReader;
import com.utilities.ExcelData;
import com.utilities.LocatorManager;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_Cart_Page extends CommonActions {
	AppiumDriver driver;
	LocatorManager locator = new LocatorManager();
	public static String sampleProductName;

	public Kiehls_AU_Cart_Page(AppiumDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean click_cart_button_and_verify_the_cart_page() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_home_cart");

			waitUntil("master_cart_checkout_button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_the_add_item_button() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_cart_additem_button");
			waitUntil("master_add_item_popup");
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_search_the_product_and_add_it_to_cart() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_cell_1");

			waitUntil("master_cart_first_product_name");

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean verify_user_able_to_view_the_product_in_cart() throws InterruptedException {
		try {
			waitUntil("master_cart_first_product_name");
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_the_sample_button() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_cart_addsample_button");
			waitUntil("master_cart_sample_add_to_cart_button");
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_search_the_product_and_click_add_to_cart_button() throws InterruptedException {
		try {

			// waitUntil("master_cart_sample_first_product_name");

			// click("master_cart_sample_first_product_name");

			// waitUntilElementVisibleAndClick("master_cart_sample_add_to_cart_button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean verify_user_able_to_view_the_sample_product_in_cart() throws InterruptedException {
		try {

			// waitUntil("master_cart_first_product_name");
			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_the_points_calculator_button() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_cart_point_cal_button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean user_add_the_bonus_value_and_verify_the_estimation_points() throws InterruptedException {
		try {

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_the_check_stock_button_and_verify_the_stock_availablity() throws InterruptedException {
		try {

			// waitUntilElementVisibleAndClick("master_cart_check_stock_button");
			Thread.sleep(3000);
			// waitUntil("master_cart_product_check_stock_label");
			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_the_checkout_button() throws InterruptedException {
		try {

			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {

				waitUntilElementVisibleAndClick("master_cart_checkout_button");
				waitUntilElementVisibleAndClick("master_setting_change_pwd_popup_cancel_button");

				return true;
			}
			case "PROD": {
				return true;

			}

			default: {
			}
				return false;

			}

		} catch (

		Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean verify_the_successfull_popup_with_qr_code_and_transaction_id_and_click_close_button() {
		try {

			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {

				waitUntil("master_purchase_successful_qr_code");
				waitUntil("master_purchase_successful_transaction_code");

				waitUntilElementVisibleAndClick("master_purchase_successful_popup_close_button");

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

	public boolean user_click_the_change_button() {
		try {

			waitUntilElementVisibleAndClick("master_cart_change_customer_button");
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_select_phone_and_enter_the_number() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_cart_change_customer_customer_dropdown");

			waitUntilElementVisibleAndClick("master_cell_0");

			waitUntilElementVisibleAndClick("master_close_button_customer");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean user_click_search_button_and_verify_the_changed_customer() throws InterruptedException {
		try {

			waitUntil("master_cart_change_customer_button");
			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_click_the_checkout_button_to_redeem() {
		try {

			if (getCmsConfig("gift").equalsIgnoreCase("Yes")) {
				waitUntilElementVisibleAndClick("master_cart_checkout_button");

			} else {

			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public boolean user_select_a_product_on_the_add_item_pupup() {
		try {
			Thread.sleep(4000);
			waitUntilElementVisibleAndClick("master_cart_additem_search_product_first_item");

			return true;
		} catch (Exception e) {

			e.printStackTrace();

			return false;
		}
	}

}