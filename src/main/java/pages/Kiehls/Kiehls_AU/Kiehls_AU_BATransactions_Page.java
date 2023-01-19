package pages.Kiehls.Kiehls_AU;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.*;

import com.driverfactory.DriverManager;
import com.google.common.collect.ImmutableMap;

import com.reusableMethods.CommonActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Kiehls_AU_BATransactions_Page extends CommonActions {

	AppiumDriver driver;

	public Kiehls_AU_BATransactions_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean user_click_the_member_history_and_verify_the_page() {
		try {

			waitUntilElementVisibleAndClick("master_transaction_member_history_tab");
			waitUntil("master_transaction_member_history_sub_date");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_click_the_transaction_history_and_verify_the_page() {
		try {
			waitUntilElementVisibleAndClick("master_transaction_history_tab");
			waitUntil("master_transaction_history_transaction_id");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean verify_the_transcation_id_in_transcation() {
		try {

			waitUntil("master_transaction_history_transaction_id");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_transcation_date_in_transcation() {
		try {
			waitUntil("master_transaction_history_transaction_date");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_counter_id_in_transcation() {
		try {
			waitUntil("master_transaction_history_counter_id");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_ba_id_in_transcation() {
		try {
			waitUntil("master_transaction_history_ba_id");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_ba_name_in_transcation() {
		try {
			waitUntil("master_transaction_history_ba_name");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_mars_id_in_transcation() {
		try {
			waitUntil("master_transaction_history_mars_id");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_customer_name_in_transcation() {
		try {
			waitUntil("master_transaction_history_cus_name");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_customer_number_in_transcation() {
		try {
			waitUntil("");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_total_product_quantity_in_transcation() {
		try {
			waitUntil("master_transaction_history_purchase_qty");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_total_transcation_price_in_transcation() {
		try {
			waitUntil("master_transaction_history_total_price");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_submission_date_in_member() {
		try {
			waitUntil("master_transaction_member_history_sub_date");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_counter_id_in_member() {
		try {
			waitUntil("master_transaction_member_history_counter_id");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_ba_id_in_member() {
		try {
			waitUntil("master_transaction_member_history_ba_id");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_ba_name_in_member() {
		try {
			waitUntil("master_transaction_member_history_ba_name");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_customer_name_in_member() {
		try {
			waitUntil("master_transaction_member_history_customer_name");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_customer_number_in_member() {
		try {
			waitUntil("master_transaction_member_history_customer_no");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

}
