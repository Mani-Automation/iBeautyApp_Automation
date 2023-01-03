package pages.Kiehls.Kiehls_AU;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driverfactory.DriverManager;
import com.reusableMethods.CommonActions;
import com.utilities.ConfigReader;
import com.utilities.ExtentReport;
import com.utilities.LocatorManager;
import com.utilities.ExcelData;
import com.utilities.Screenshots;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_Login_Page extends CommonActions {

	AppiumDriver driver;

	ConfigReader config = new ConfigReader();
	LocatorManager locator = new LocatorManager();

	public Kiehls_AU_Login_Page(AppiumDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	boolean first_test = DriverManager.first_test;

	public boolean user_select_country_and_login_to_store_then_login_to_ba_account() {

		try {

			if (first_test == true) {
				// select country

				waitUntil("master_login_select_country");
				click("master_login_select_country");
				waitUntil("master_login_select_country_list");
				String required_country = "//XCUIElementTypeStaticText[@name=\"" + getCountryName() + "\"]";
				driver.findElement(By.xpath(required_country)).click();
				reportStatusPASS(getCountryName() + " country was selected successfully");

				// click login button
				waitUntil("master_proceed_button");
				click("master_proceed_button");
				reportStatusPASS("User clicked proceed button successfully");

				// enter store credentials

				waitUntil("master_store_username_test_field");
				click("master_store_username_test_field");
				clear("master_store_username_test_field");
				sendkeys("master_store_username_test_field",
						ExcelData.getExcelData("store_credentials", "valid_username"));

				click("master_store_password_test_field");
				clear("master_store_password_test_field");
				sendkeys("master_store_password_test_field",
						ExcelData.getExcelData("store_credentials", "valid_password"));

				// click log in button
				click("master_login_button");

				// enter ba credentials
				waitUntil("master_ba_username_test_field");
				click("master_ba_username_test_field");
				clear("master_ba_username_test_field");
				sendkeys("master_ba_username_test_field", ExcelData.getExcelData("ba_credentials", "valid_username"));
				click("master_ba_login_page");
				System.out.println("  User enters the BA username");
				click("master_ba_password_test_field");
				clear("master_ba_password_test_field");
				sendkeys("master_ba_password_test_field", ExcelData.getExcelData("ba_credentials", "valid_password"));

				reportStatusPASS("User enters the BA password");

				// ba login button
				click("master_login_button");
				return true;

			} else {
				waitUntil("master_login_button");
				click("master_ba_password_test_field");
				clear("master_ba_password_test_field");
				sendkeys("master_ba_password_test_field", ExcelData.getExcelData("ba_credentials", "valid_password"));

				// ba login button
				click("master_login_button");

				return true;

			}
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean loginDescriptionMessage() throws Exception {

		try {

			if (first_test == true) {

				waitUntil("master_login_select_country_page");

				return true;

			} else {

				waitUntil("master_login_button");

				return true;

			}
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean user_select_country() throws IOException {

		try {

			waitUntil("master_login_select_country");
			click("master_login_select_country");
			waitUntil("master_login_select_country_list");
			String required_country = "//XCUIElementTypeStaticText[@name=\"" + getCountryName() + "\"]";
			driver.findElement(By.xpath(required_country)).click();
			reportStatusPASS(getCountryName() + " country was selected successfully");
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean clickProceedButton() throws InterruptedException, IOException {

		try {

			waitUntil("master_proceed_button");
			click("master_proceed_button");
			reportStatusPASS("User clicked proceed button successfully");
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

//		

	}

	public boolean enterStoreCredentials() throws InterruptedException, IOException {

		try {

			waitUntil("master_store_username_test_field");
			click("master_store_username_test_field");
			clear("master_store_username_test_field");
			sendkeys("master_store_username_test_field", ExcelData.getExcelData("store_credentials", "valid_username"));
			reportStatusPASS("User enters the Store username");

			click("master_store_password_test_field");
			clear("master_store_password_test_field");
			sendkeys("master_store_password_test_field", ExcelData.getExcelData("store_credentials", "valid_password"));
			reportStatusPASS("User enters the Store password");
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean clickLoginBtnInStorePage() throws InterruptedException, IOException {

		try {
			click("master_login_button");
			reportStatusPASS("User clicked store login button successfully");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean enterBaCredentials() throws InterruptedException, IOException {
		try {

			waitUntil("master_ba_username_test_field");
			click("master_ba_username_test_field");
			clear("master_ba_username_test_field");
			sendkeys("master_ba_username_test_field", ExcelData.getExcelData("ba_credentials", "valid_username"));
			click("master_ba_login_page");
			reportStatusPASS("User enters the BA username");
			click("master_ba_password_test_field");
			clear("master_ba_password_test_field");
			sendkeys("master_ba_password_test_field", ExcelData.getExcelData("ba_credentials", "valid_password"));

			reportStatusPASS("User enters the BA password");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}

	}

	public boolean clickLoginBtnInBaPage() throws InterruptedException, IOException {

		try {

			click("master_login_button");
			reportStatusPASS("User clicked BA login button successfully");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verifuUserIsOnHomePage() throws InterruptedException, IOException {
		boolean flag = false;
		try {
			waitUntil("master_home_search_button");

			if (webElement("master_home_search_button").isDisplayed()) {
				reportStatusPASS("Home page was displyed successfully");
				flag = true;
			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			Assert.assertTrue(false);

		}
		return flag;
	}

	public boolean enterWrongStoreCredentials() throws InterruptedException, IOException {

		try {
			waitUntil("master_store_username_test_field");
			click("master_store_username_test_field");
			clear("master_store_username_test_field");
			sendkeys("master_store_username_test_field",
					ExcelData.getExcelData("store_credentials", "invalid_username"));

			reportStatusPASS("User enters invalid Store username");

			click("master_store_password_test_field");
			clear("master_store_password_test_field");
			sendkeys("master_store_password_test_field",
					ExcelData.getExcelData("store_credentials", "invalid_password"));
			reportStatusPASS("User entered Invalid store password ");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}

	}

	public boolean enterWrongBaCredentials() throws InterruptedException, IOException {
		try {

			waitUntil("master_ba_username_test_field");
			click("master_ba_username_test_field");
			clear("master_ba_username_test_field");
			sendkeys("master_ba_username_test_field", ExcelData.getExcelData("ba_credentials", "invalid_username"));
			reportStatusPASS("User entered Invalid BA username ");
			click("master_ba_login_page");

			click("master_ba_password_test_field");
			clear("master_ba_password_test_field");
			sendkeys("master_ba_password_test_field", ExcelData.getExcelData("ba_credentials", "invalid_password"));
			reportStatusPASS("User entered Invalid BA password ");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}

	}

	public boolean clickResetPassword() throws InterruptedException, IOException {

		try {
			waitUntil("master_reset_button");
			click("master_reset_button");
			waitUntil("master_reset_popup_text");
			reportStatusPASS("User clicked reset button successfully ");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}

	}

	public boolean enterStoreManagerCredentials() throws InterruptedException, IOException {
		try {
			waitUntil("master_store_manager_id");
			click("master_store_manager_id");
			clear("master_store_manager_id");
			sendkeys("master_store_manager_id", ExcelData.getExcelData("store_manager_credentials", "valid_username"));
			reportStatusPASS("User entered store manager username ");

			click("master_ba_login_page");

			click("master_store_password_test_field");
			clear("master_store_password_test_field");
			sendkeys("master_store_password_test_field",
					ExcelData.getExcelData("store_manager_credentials", "valid_password"));

			reportStatusPASS("User entered store manager password ");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}

	}

	public boolean clickCloseButtonInPopup() throws InterruptedException, IOException {

		try {
			waitUntil("master_close_button");
			click("master_close_button");

			reportStatusPASS("User clicked close button in the popup ");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}

	}

	public boolean clickNextButtonInPopupMessage() throws InterruptedException, IOException {

		try {
			waitUntil("master_next_button");
			click("master_next_button");

			reportStatusPASS("User clicked next button in the popup ");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}

	}

	public boolean enterNewAndConfirmPassword() throws InterruptedException, IOException {

		try {
			waitUntil("master_new_password_popup");
			click("master_new_password_popup");
			clear("master_new_password_popup");
			sendkeys("master_new_password_popup", ExcelData.getExcelData("store_credentials", "new_password"));

			reportStatusPASS("User entered new password ");

			click("master_ba_login_page");
			click("master_new_confrim_password_popup");
			clear("master_new_confrim_password_popup");
			sendkeys("master_new_confrim_password_popup", ExcelData.getExcelData("store_credentials", "new_password"));

			reportStatusPASS("User entered new confrim password ");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}

	}

	public boolean clickSubmitButton() throws InterruptedException, IOException {

		try {
			waitUntil("master_next_button");
			click("master_next_button");

			reportStatusPASS("User clicked submit button successfully ");

			waitFor(3000);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}

	}

	public boolean verify_the_user_able_to_see_all_the_components_in_home_page() {

		try {
			waitUntil("master_next_button");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_menu_bar_items_on_the_home_page() {
		try {
			waitUntil("master_home_ba_name");
			waitUntil("master_home_socialbutton1");
			waitUntil("master_home_socialbutton2");
			waitUntil("master_home_socialbutton3");
			waitUntil("master_home_brandlogo");
			waitUntil("master_home_barcode");
			waitUntil("master_home_staff_button");
			waitUntil("master_home_location_button");
			waitUntil("master_home_lan_button");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_category_items_on_the_home_page() {
		try {
			waitUntil("master_home_product_category1");
			waitUntil("master_home_product_category2");
			waitUntil("master_home_product_category3");
			waitUntil("master_home_product_category4");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_topten_items_on_the_home_page() {
		try {
			waitUntil("master_home_topten");
			waitUntil("master_home_topten_item1");
			waitUntil("master_home_topten_item2");
			waitUntil("master_home_topten_item3");
			waitUntil("master_home_topten_item4");

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_members_items_on_the_home_page() {
		try {
			waitUntil("master_home_search_type");
			waitUntil("master_home_search_text");
			waitUntil("master_home_membar_barcode");
			waitUntil("master_home_search_button");
			waitUntil("master_create_button");
			waitUntil("master_home_advance_search_button");
			waitUntil("master_start_consultation_button");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_side_navigation_items_on_the_home_page() {
		try {
			waitUntil("master_home_menu");
			waitUntil("master_home_360");
			waitUntil("master_home_consultation");
			waitUntil("master_home_info");
			waitUntil("master_home_products");
			waitUntil("master_home_cart");
			waitUntil("master_home_ba_home");
			waitUntil("master_home_settings");
			waitUntil("master_home_logoff_button");
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

}
