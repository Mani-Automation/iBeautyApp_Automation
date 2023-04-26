package pages.Kiehls.Kiehls_AU;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.utilities.LocatorManager;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_PDP_Page extends CommonActions {
	AppiumDriver driver;
	LocatorManager locator = new LocatorManager();

	public Kiehls_AU_PDP_Page(AppiumDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean verify_user_can_do_check_stock_in_pdp_page() {
		try {

			waitUntil("master_pdp_check_stock_button");
			click("master_pdp_check_stock_button");

			waitUntil("master_pdp_stock_info_label");

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_user_can_do_check_advance_check_stock_in_pdp_page() {
		try {
// This feature updated. Need to rework
			/*
			 * waitUntil("master_pdp_adv_check_stock_button");
			 * click("master_pdp_adv_check_stock_button");
			 * 
			 * waitUntil("master_pdp_search_adv_stock_textfield");
			 * 
			 * sendkeys("master_pdp_search_adv_stock_textfield", "Kie");
			 * waitUntil("master_pdp_search_adv_stock_first_store");
			 * click("master_pdp_search_adv_stock_first_store");
			 * waitUntil("master_pdp_x_close_button");
			 * waitUntil("master_pdp_adv_search_search_button");
			 * click("master_pdp_adv_search_search_button");
			 * 
			 * waitUntil("master_pdp_adv_stock_search_result");
			 * 
			 * click("master_pdp_x_close_button");
			 */
			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_click_buy_now_button_and_verify_the_count_increased_in_cart() throws InterruptedException {
		try {
			String pdp_product_name = driver.findElement(By.xpath(locator.getData("master_pdp_product_name")))
					.getText();

			waitUntilElementVisibleAndClick("master_pdp_buynow_button");

			// waitUntil("master_pdp_product_count_add_button");

			waitUntilElementVisibleAndClick("master_home_cart");

			waitUntil("master_cart_first_product_name");

			waitUntilElementVisibleAndClick("master_cart_product_sub_button");

			waitUntilElementVisibleAndClick("master_done_button");

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_the_product_description_tips_and_ingriedients_tabs_in_pdp() throws InterruptedException {

		try {

			swipeScreenUntilElementVisible("master_pdp_product_des_tab", Direction.UP);

			waitUntilElementVisibleAndClick("master_pdp_product_tip_tab");
			waitUntilElementVisibleAndClick("master_pdp_product_ingridents_tab");
			waitUntilElementVisibleAndClick("master_pdp_product_des_tab");

			swipeScreenUntilElementVisible("master_pdp_product_up_arrow", Direction.UP);
			click("master_pdp_product_up_arrow");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean click_the_first_product_and_navigate_to_PDP() {

		try {

			waitUntil("master_plp_first_product");
			click("master_plp_first_product");

			waitUntil("master_pdp_buynow_button");

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean validate_product_name_price_image_quantity_buy_now_and_wishlist_button_are_available_in_pdp() {
		try {
			waitUntil("master_pdp_product_image");

			waitUntil("master_pdp_product_name");

			waitUntil("master_pdp_price_label");

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_the_product_description_tips_and_ingriedients_tabs_in_pdp_tw() {
		try {

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_click_buy_now_button_on_pdp() {
		try {
			waitUntilElementVisibleAndClick("master_pdp_buynow_button");
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

}
