package pages.Kiehls.Kiehls_AU;

import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.utilities.ExcelData;

import io.appium.java_client.AppiumDriver;
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

public class Kiehls_AU_Customer360_Page extends CommonActions {

	AppiumDriver driver;

	public Kiehls_AU_Customer360_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/****************** Locators ******************/

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"viewSearchType\"]")
	public WebElement C360_CustomersearchButton;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[2]")
	public WebElement C360_CustomersearchEmailButton;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]")
	public WebElement C360_CustomersearchMobileNumberButton;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"txtSearch\"]")
	public WebElement C360_searchTextFieldInHomePage;

	@FindBy(xpath = "///XCUIElementTypeCell[@name=\"cell_0\"]")
	public WebElement C360_SearchButtonInHomePage;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"btnCreate\"]")
	public WebElement C360_CreateCustomerButton;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	public WebElement C360_AdvanceSearchButton;

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"startConsultation\"]")
	public WebElement C360_StartConsultationButton;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Zuzy Zoure\"]")
	public WebElement C360_CustomerName;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2]")
	public WebElement C360_RefreshButtonInC360;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]")
	public WebElement C360_EditButtonInC360;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Birthday\"]")
	public WebElement C360_BirthDayText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Gender\"]")
	public WebElement C360_GenderText;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Not provided\"]")
	public WebElement C360_Gender;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"45KK0012066\"]")
	public WebElement C360_MemberShipNumber;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"A$0.00\"]")
	public WebElement C360_YtdSpending;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"06/14/2022 14:00:00\"]")
	public WebElement C360_MemberShipSince;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Not provided\"]")
	public WebElement C360_CustomerType;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Not provided\"]")
	public WebElement C360_R12Spending;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]")
	public WebElement C360_PurchaseHistoryButton;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[2]")
	public WebElement C360_SummaryButton;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[3]")
	public WebElement C360_MemberShipButton;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell[5]")
	public WebElement C360_wishListButton;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement C360_SearchHistoryInPurchaseHistoryTab;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
	public WebElement C360_YearSelectionInPurchaseHistoryTab;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\\\"Kiehls UAT\\\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")
	public WebElement C360_FilterButton;

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"General Information\"]")
	public WebElement C360_GeneralInformationTextInSummaryTab;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Follow Up\"])[1]")
	public WebElement C360_FollowUpButton;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Create Note\"]")
	public WebElement C360_CreateNoteButton;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"sideMenuTbl\"]/XCUIElementTypeButton[1]")
	public WebElement C360_HomeButtonInNavigatonBar;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"sideMenuTbl\"]/XCUIElementTypeButton[2]")
	public WebElement C360_Customer360ButtonInNavigationbar;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"sideMenuTbl\"]/XCUIElementTypeButton[3]")
	public WebElement C360_ConsultationInNavigatonBar;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"sideMenuTbl\"]/XCUIElementTypeButton[4]")
	public WebElement C360_AboutUsButtonInNavigationBar;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"sideMenuTbl\"]/XCUIElementTypeButton[5]")
	public WebElement C360_ProductsButtonInNavigatonBar;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"sideMenuTbl\"]/XCUIElementTypeButton[6]")
	public WebElement C360_CartButtonInNavigatonBar;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"Empty list\"]/XCUIElementTypeOther[1]/XCUIElementTypeButton")
	public WebElement C360_BaHomeButtonInNavigatonBar;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"Empty list\"]/XCUIElementTypeOther[2]/XCUIElementTypeButton")
	public WebElement C360_SettingsButtonInNavigatonBar;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"Empty list\"]/XCUIElementTypeOther[3]/XCUIElementTypeButton")
	public WebElement C360_LogOutButtonInNavigatonBar;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"sideMenuTbl\"]/XCUIElementTypeButton[6]")
	public WebElement C360_UpdateButtonInInMemberEdit;

	/////////// mani

	// 22

	@FindBy(xpath = "//XCUIElementTypeOther[@name=\"viewSearchType\"]/XCUIElementTypeOther")
	public WebElement C360_home_customer_search_dropdown;

	@FindBy(xpath = "//XCUIElementTypeCell[@name=\"cell_Mobile Number\"]")
	public WebElement C360_home_customer_search_dropdown_mobile_number_list;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"txtSearch\"]")
	public WebElement C360_home_customer_search_mobile_number_field;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"btnSearch\"]")
	public WebElement C360_home_customer_search_button;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Purchase History\"]")
	public WebElement C360_purchase_history;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"test R\"]")
	public WebElement C360_profile_customer_name;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"8667224536\"]")
	public WebElement C360_profile_customer_phone_number;
	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]")
	public WebElement C360_profile_customer_edit_button;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"01/02/1992\"]")
	public WebElement C360_profile_customer_birth_date;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"M\"]")
	public WebElement C360_profile_customer_gender;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"R12 Spending\"]")
	public WebElement C360_profile_customer_r12_spending;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"SMS / e-mail / Mail / Calls\"]")
	public WebElement C360_profile_customer_opt_in;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"07/27/2022 06:17:42\"]")
	public WebElement C360_profile_customer_membership_since;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Local Customer\"]")
	public WebElement C360_profile_customer_type;

	public boolean tap_on_customer_search_dropdown() throws InterruptedException {
		try {
			webdriverwait(C360_home_customer_search_dropdown);
			C360_home_customer_search_dropdown.click();

			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean customer_threesixty_screen_should_be_display() {
		try {
			webdriverwait(C360_purchase_history);
			Assert.assertTrue(C360_purchase_history.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean tap_on_mobile_number_from_the_dropdown_list() throws InterruptedException {
		try {
			webdriverwait(C360_home_customer_search_dropdown_mobile_number_list);
			C360_home_customer_search_dropdown_mobile_number_list.click();
			Thread.sleep(2000);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"txtSearch\"]")
	public WebElement email_text;

	public boolean enter_email_and_tap_on_search_button() throws InterruptedException {
		try {
			webdriverwait(email_text);
			email_text.sendKeys(ExcelData.getExcelData("customer_testdata", "email_id"));

			webdriverwait(C360_home_customer_search_button);
			C360_home_customer_search_button.click();
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean verify_the_customer_name() {
		try {
			Assert.assertTrue(C360_profile_customer_name.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean verify_the_phone_number() {
		try {
			Assert.assertTrue(C360_profile_customer_phone_number.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_edit_button() {
		try {
			Assert.assertTrue(C360_profile_customer_edit_button.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_birthday_date() {
		try {
			Assert.assertTrue(C360_profile_customer_birth_date.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verity_the_gender() {
		try {
			Assert.assertTrue(C360_profile_customer_gender.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_r12_spending() {
		try {
			Assert.assertTrue(C360_profile_customer_r12_spending.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_opt_in() {
		try {
			Assert.assertTrue(C360_profile_customer_opt_in.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_membership_since() {
		try {
			Assert.assertTrue(C360_profile_customer_membership_since.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean verify_the_customer_type() {
		try {
			Assert.assertTrue(C360_profile_customer_type.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}
	// 23

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Update Member\"]")
	public WebElement C360_update_member_page;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Update\"]")
	public WebElement C360_update_member_update_button;

	public boolean verify_the_customer_details_and_click_update_button() {
		try {
			webdriverwait(C360_update_member_update_button);
			C360_update_member_update_button.click();
			webdriverwait(C360_purchase_history);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_click_the_edit_button_and_update_member_page_should_be_displayed() {
		try {
			webdriverwait(C360_profile_customer_edit_button);

			C360_profile_customer_edit_button.click();
			webdriverwait(C360_update_member_page);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	// 24

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Membership\"]")
	public WebElement C360_membership_tab;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
	public WebElement C360_membership_date;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
	public WebElement C360_membership_point;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
	public WebElement C360_membership_type;

	public boolean user_click_the_membership_tab_and_verify_membership_screen_should_be_displayed()
			throws InterruptedException {
		try {
			webdriverwait(C360_membership_tab);
			C360_membership_tab.click();
			Thread.sleep(2000);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean verify_membership_date_points_store_and_type_are_displayed() {
		try {

			Assert.assertTrue(C360_membership_date.isDisplayed());

			Assert.assertTrue(C360_membership_point.isDisplayed());

			Assert.assertTrue(C360_membership_type.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	// 25

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"navHome\"]")
	public WebElement C360_home_icon;

	@FindBy(xpath = "//XCUIElementTypeImage[@name=\"btnWishList\"]")
	public WebElement C360_pdp_wishlist_icon;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"sideMenuTbl\"]/XCUIElementTypeButton[2]")
	public WebElement C360_icon_right_navigation;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Wishlist\"]")
	public WebElement C360_wishlist_tab;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"leftarrow black\"]")
	public WebElement C360_wishlist_first_product;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"btnBuyNow\"]")
	public WebElement C360_pdp_buy_now_button;

	public boolean user_click_home_button_and_verify_home_page_should_be_displayed() {
		try {
			webdriverwait(C360_home_icon);
			C360_home_icon.click();
			webdriverwait(C360_home_customer_search_dropdown);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_click_customer_360_button_from_right_navigation() {
		try {
			webdriverwait(C360_icon_right_navigation);
			C360_icon_right_navigation.click();
			webdriverwait(C360_purchase_history);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_click_wishlist_product_and_verify_pdp_shold_be_displayed() {
		try {
			webdriverwait(C360_wishlist_first_product);
			C360_wishlist_first_product.click();
			webdriverwait(C360_pdp_buy_now_button);
			Assert.assertTrue(C360_pdp_buy_now_button.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_click_add_to_wishlist_icon() {
		try {
			webdriverwait(C360_pdp_wishlist_icon);
			C360_pdp_wishlist_icon.click();
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_click_wishlist_tab() {
		try {
			webdriverwait(C360_wishlist_tab);
			C360_wishlist_tab.click();
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}
	// 26

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Summary\"]")
	public WebElement C360_customer_summary_tab;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"General Information\"])[2]")
	public WebElement C360_customer_summary_general_info;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"8667224536\"])[2]")
	public WebElement C360_customer_summary_general_info_mobile;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"mraghuram19@gmail.com\"]")
	public WebElement C360_customer_summary_general_info_mail;
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"AU\"]")
	public WebElement C360_customer_summary_general_info_loacation;

	public boolean verify_user_general_information_should_be_displayed() {
		try {

			webdriverwait(C360_customer_summary_general_info_mobile);

			Assert.assertTrue(C360_customer_summary_general_info_mobile.isDisplayed());

			Assert.assertTrue(C360_customer_summary_general_info_mail.isDisplayed());

			Assert.assertTrue(C360_customer_summary_general_info_loacation.isDisplayed());
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean user_clickthe_summary_tab() {
		try {
			webdriverwait(C360_customer_summary_tab);
			C360_customer_summary_tab.click();
			webdriverwait(C360_customer_summary_general_info_mobile);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	// 27

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Create Note\"]")
	public WebElement C360_summary_create_note_button;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")
	public WebElement C360_summary_create_note_popup;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
	public WebElement C360_summary_create_note_title_field;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Description\"]")
	public WebElement C360_summary_create_note_description_field;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
	public WebElement C360_summary_create_note_save_button;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch")
	public WebElement C360_summary_create_note_important_msg_toggle;

	public boolean verify_the_customer_note_should_be_displayed_in_notes_section() {
		try {
//
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_click_create_note_button_and_verify_the_note_popup() {
		try {

			webdriverwait(C360_summary_create_note_button);
			C360_summary_create_note_button.click();
			webdriverwait(C360_summary_create_note_popup);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}

	}

	public boolean user_enter_the_title() throws InterruptedException {
		try {

			webdriverwait(C360_summary_create_note_title_field);
			C360_summary_create_note_title_field.sendKeys("test note");
			Thread.sleep(1000);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_enter_the_description() throws InterruptedException {
		try {

			webdriverwait(C360_summary_create_note_description_field);
			C360_summary_create_note_description_field.sendKeys("test note");
			Thread.sleep(1000);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_toogle_and_mark_the_message_as_important() throws InterruptedException {
		try {

			webdriverwait(C360_summary_create_note_important_msg_toggle);
			C360_summary_create_note_important_msg_toggle.click();
			Thread.sleep(1000);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}

	public boolean user_click_the_save_button() throws InterruptedException {
		try {

			webdriverwait(C360_summary_create_note_save_button);
			C360_summary_create_note_save_button.click();
			Thread.sleep(2000);
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;
		}
	}
	// 28

	public boolean enter_mobile_number_and_tap_on_search_button() {
		return false;
	}

}
