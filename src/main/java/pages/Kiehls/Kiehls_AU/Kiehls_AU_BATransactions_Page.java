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

	@FindBy(xpath = "")
	public WebElement ba_transcation_member_submission_date_title;

	@FindBy(xpath = "")
	public WebElement ba_transcation_transcation_id_title;

	@FindBy(xpath = "")
	public WebElement ba_transcation_member_history_tab;

	@FindBy(xpath = "")
	public WebElement ba_transcation_transcation_history_tab;

	public boolean user_click_the_member_history_and_verify_the_page() {
		try {

			webdriverwait(ba_transcation_member_history_tab);
			ba_transcation_member_history_tab.click();
			webdriverwait(ba_transcation_member_submission_date_title);
			Assert.assertTrue(ba_transcation_member_submission_date_title.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_click_the_transaction_history_and_verify_the_page() {
		try {
			webdriverwait(ba_transcation_transcation_history_tab);
			ba_transcation_transcation_history_tab.click();
			webdriverwait(ba_transcation_transcation_id_title);
			Assert.assertTrue(ba_transcation_transcation_id_title.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	@FindBy(xpath = "")
	public WebElement ba_transcation_id;

	@FindBy(xpath = "")
	public WebElement ba_transcation_date;

	@FindBy(xpath = "")
	public WebElement ba_transcation_counter_id;

	@FindBy(xpath = "")
	public WebElement ba_transcation_ba_id;

	@FindBy(xpath = "")
	public WebElement ba_transcation_ba_name;

	@FindBy(xpath = "")
	public WebElement ba_transcation_mars_id;

	@FindBy(xpath = "")
	public WebElement ba_transcation_customer_name;

	@FindBy(xpath = "")
	public WebElement ba_transcation_customer_phone;

	@FindBy(xpath = "")
	public WebElement ba_transcation_total_product_quantity;

	@FindBy(xpath = "")
	public WebElement ba_transcation_total_transcation_price;

	//

	@FindBy(xpath = "")
	public WebElement ba_member_sumbmission_date;

	@FindBy(xpath = "")
	public WebElement ba_member_ba_id;

	@FindBy(xpath = "")
	public WebElement ba_member_ba_name;

	@FindBy(xpath = "")
	public WebElement ba_member_counter_id;

	@FindBy(xpath = "")
	public WebElement ba_member_customer_name;

	@FindBy(xpath = "")
	public WebElement ba_member_customer_phone;

	public boolean verify_the_transcation_id_in_transcation() {
		try {

			Assert.assertTrue(ba_transcation_id.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_transcation_date_in_transcation() {
		try {
			Assert.assertTrue(ba_transcation_date.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_counter_id_in_transcation() {
		try {
			Assert.assertTrue(ba_transcation_counter_id.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_ba_id_in_transcation() {
		try {
			Assert.assertTrue(ba_transcation_ba_id.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_ba_name_in_transcation() {
		try {
			Assert.assertTrue(ba_transcation_ba_name.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_mars_id_in_transcation() {
		try {
			Assert.assertTrue(ba_transcation_mars_id.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_customer_name_in_transcation() {
		try {
			Assert.assertTrue(ba_transcation_customer_name.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_customer_number_in_transcation() {
		try {
			Assert.assertTrue(ba_transcation_customer_phone.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_total_product_quantity_in_transcation() {
		try {
			Assert.assertTrue(ba_transcation_total_product_quantity.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_total_transcation_price_in_transcation() {
		try {
			Assert.assertTrue(ba_transcation_total_transcation_price.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_submission_date_in_member() {
		try {
			Assert.assertTrue(ba_member_sumbmission_date.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_counter_id_in_member() {
		try {
			Assert.assertTrue(ba_member_counter_id.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_ba_id_in_member() {
		try {
			Assert.assertTrue(ba_member_ba_id.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_ba_name_in_member() {
		try {
			Assert.assertTrue(ba_member_ba_name.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_customer_name_in_member() {
		try {
			Assert.assertTrue(ba_member_customer_name.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_customer_number_in_member() {
		try {
			Assert.assertTrue(ba_member_customer_phone.isDisplayed());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

}
