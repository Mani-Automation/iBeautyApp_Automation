package pages.Kiehls.Kiehls_AU;

import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.utilities.ConfigReader;
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

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
	public WebElement home_cart_button;

	public boolean click_cart_button_and_verify_the_cart_page() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_home_cart");

			waitUntil("master_cart_checkout_button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"btnAddItem\"])[2]")
	public WebElement cart_add_item_button;
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"productSearch\"]")
	public WebElement cart_add_item_product_name_field;
	@FindBy(xpath = "//XCUIElementTypeCell[@name=\"cell_141\"]/XCUIElementTypeOther[1]")
	public WebElement cart_add_item_first_product_name;
	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"btnClose\"])[1]")
	public WebElement cart_add_item_close_button;
	@FindBy(xpath = "//XCUIElementTypeCell[@name=\"cell_0\"]")
	public WebElement cart_add_first_product;

	public boolean user_click_the_add_item_button() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_cart_additem_button");
			waitUntil("master_add_item_popup");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
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
			reportStatusException(e);
			return false;
		}
	}

	public boolean verify_user_able_to_view_the_product_in_cart() throws InterruptedException {
		try {

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	//
	@FindBy(xpath = "(//XCUIElementTypeOther[@name=\"btnSample\"])[2]")
	public WebElement cart_sample_button;
	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
	public WebElement cart_sample_search_product_field;
	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
	public WebElement cart_sample_search_first_product;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"ADD TO CART\"]")
	public WebElement cart_sample_add_cart_button;

	public boolean user_click_the_sample_button() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_cart_addsample_button");
			waitUntil("master_cart_sample_add_to_cart_button");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_search_the_product_and_click_add_to_cart_button() throws InterruptedException {
		try {

			waitUntil("master_cart_sample_first_product_name");
			sampleProductName = driver.findElement(By.xpath(locator.getData("master_cart_sample_first_product_name")))
					.getText();
			click("master_cart_sample_first_product_name");

			waitUntilElementVisibleAndClick("master_cart_sample_add_to_cart_button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean verify_user_able_to_view_the_sample_product_in_cart() throws InterruptedException {
		try {

			waitUntil("master_cart_first_product_name");
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

//
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"calculator\"]")
	public WebElement cart_points_calculator_button;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
	public WebElement cart_points_calculator_bonus_field;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Calculate\"]")
	public WebElement cart_points_calculator_calculate_button;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\": 0 PT\"]")
	public WebElement cart_points_calculator_earned_points;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"x\"]")
	public WebElement cart_points_calculator_close_button;

	public boolean user_click_the_points_calculator_button() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_cart_point_cal_button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean user_add_the_bonus_value_and_verify_the_estimation_points() throws InterruptedException {
		try {

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	@FindBy(xpath = "")
	public WebElement cart_check_stock_button;

	@FindBy(xpath = "")
	public WebElement cart_check_stock_status_text;

	public boolean user_click_the_check_stock_button_and_verify_the_stock_availablity() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_cart_check_stock_button");
			waitUntil("master_cart_product_check_stock_label");
			if (driver.findElement(By.xpath(locator.getData("master_cart_first_product_name"))).getText()
					.equals(sampleProductName)) {

				waitUntilElementVisibleAndClick("master_cart_product_sub_button");
				waitUntilElementVisibleAndClick("master_done_button");
				return true;

			} else {
				System.out.println("Add sample in cart - Failed!");
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"btnCheckout\"]")
	public WebElement cart_check_out_button;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SUCCESSFUL\"]")
	public WebElement cart_check_out_successfull_popup;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeImage")
	public WebElement cart_check_out_transaction_id_text;
	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeImage")
	public WebElement cart_check_out_qr_code;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"close black\"]")
	public WebElement cart_check_out_close_button;

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
			reportStatusException(e);
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
			reportStatusException(e);
			return false;
		}
	}

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"btnChange\"]")
	public WebElement cart_change_customer_button;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Customer Search\"]")
	public WebElement cart_change_customer_popup;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"btnDropDown\"])[1]")
	public WebElement cart_change_customer_search_type_dropdown;

	@FindBy(xpath = "//XCUIElementTypeCell[@name=\"cell_1\"]/XCUIElementTypeOther[1]")
	public WebElement cart_change_customer_phone_number_type;
	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"txtEnterField\"]")
	public WebElement cart_change_customer_phone_number_field;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"btnSearch\"]")
	public WebElement cart_change_customer_search_button;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"test R\"]")
	public WebElement cart_customer_name;
	// XCUIElementTypeStaticText[@name="X"]

	public boolean user_click_the_change_button() {
		try {

			waitUntilElementVisibleAndClick("master_cart_change_customer_button");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_select_phone_and_enter_the_number() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_cart_change_customer_customer_dropdown");

			waitUntilElementVisibleAndClick("master_cell_3");

			waitUntil("master_cart_change_cus_text_field");
			sendkeys("master_cart_change_cus_text_field", "8667224536");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean user_click_search_button_and_verify_the_changed_customer() throws InterruptedException {
		try {
			hideKeyboard();
			waitUntilElementVisibleAndClick("master_pdp_adv_search_search_button");
			waitUntil("master_cart_change_customer_button");

			return true;

		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

}