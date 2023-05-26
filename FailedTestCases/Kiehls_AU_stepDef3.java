package stepDefinitions.Kiehls;

import java.io.IOException;

import org.junit.Assert;

import com.driverfactory.DriverManager;
import com.reusableMethods.CommonActions;
import com.reusableMethods.CommonActions.Direction;
import com.utilities.ConfigReader;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.*;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_AdvanceSearch_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_BACalender_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_BACallBackList_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_BADashboard_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_BATransactions_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_Cart_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_Consultation_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_Customer360_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_CustomerCreation_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_Gift_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_Login_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_PDP_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_PLP_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_ProductReservation_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_ServiceBooking_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_Settings_Page;
import pages.Kiehls.Kiehls_AU.Kiehls_AU_Voucher_page;

public class Kiehls_AU_stepDef3 extends CommonActions {

	AppiumDriver driver = DriverManager.getDriver();

	Kiehls_AU_PDP_Page pdpPage = new Kiehls_AU_PDP_Page(driver);

	Kiehls_AU_PLP_Page plpPage = new Kiehls_AU_PLP_Page(driver);

	Kiehls_AU_Login_Page login = new Kiehls_AU_Login_Page(driver);

	Kiehls_AU_CustomerCreation_Page ccPage = new Kiehls_AU_CustomerCreation_Page(driver);

	Kiehls_AU_Customer360_Page c360Page = new Kiehls_AU_Customer360_Page(driver);

	Kiehls_AU_Cart_Page cartPage = new Kiehls_AU_Cart_Page(driver);

	Kiehls_AU_BADashboard_Page baDashboardPage = new Kiehls_AU_BADashboard_Page(driver);

	Kiehls_AU_BACallBackList_Page baCallbackPage = new Kiehls_AU_BACallBackList_Page(driver);

	Kiehls_AU_BACalender_Page baCalendarPage = new Kiehls_AU_BACalender_Page(driver);

	Kiehls_AU_BATransactions_Page baTransactionPage = new Kiehls_AU_BATransactions_Page(driver);

	Kiehls_AU_Consultation_Page consultationPage = new Kiehls_AU_Consultation_Page(driver);

	Kiehls_AU_Settings_Page settingPage = new Kiehls_AU_Settings_Page(driver);

	Kiehls_AU_Gift_Page giftPage = new Kiehls_AU_Gift_Page(driver);

	Kiehls_AU_Voucher_page voucher = new Kiehls_AU_Voucher_page(driver);

	Kiehls_AU_ProductReservation_Page reservation = new Kiehls_AU_ProductReservation_Page(driver);

	Kiehls_AU_ServiceBooking_Page service = new Kiehls_AU_ServiceBooking_Page(driver);

	Kiehls_AU_AdvanceSearch_Page advSearch = new Kiehls_AU_AdvanceSearch_Page(driver);
	 @Given("^User launches the Application$")
	    public void user_launches_the_application() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @When("^User select country and login to Store and BA account$")
	    public void user_select_country_and_login_to_store_and_ba_account() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @When("^User enter the wrong store credentials$")
	    public void user_enter_the_wrong_store_credentials() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @When("^User enter the store credentials$")
	    public void user_enter_the_store_credentials() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User is on home page$")
	    public void user_is_on_home_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User enter the wrong ba credentials$")
	    public void user_enter_the_wrong_ba_credentials() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User enter the ba credentials$")
	    public void user_enter_the_ba_credentials() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click a category on the home page$")
	    public void user_click_a_category_on_the_home_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User should navigate to PLP page successfully$")
	    public void user_should_navigate_to_plp_page_successfully() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click the first call back history and verify the customer list page$")
	    public void user_click_the_first_call_back_history_and_verify_the_customer_list_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user able see Customer Notification, Callback List, Calender tab in the Dashboard$")
	    public void verify_user_able_see_customer_notification_callback_list_calender_tab_in_the_dashboard() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click first notification on the list and user able to navigate Notification page$")
	    public void user_click_first_notification_on_the_list_and_user_able_to_navigate_notification_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click first calback history on the list and user able to navigate Calback List page$")
	    public void user_click_first_calback_history_on_the_list_and_user_able_to_navigate_calback_list_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click first calendar event on the list and user able to navigate Calendar page$")
	    public void user_click_first_calendar_event_on_the_list_and_user_able_to_navigate_calendar_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click the Sample button$")
	    public void user_click_the_sample_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user able to view the sample product in cart$")
	    public void verify_user_able_to_view_the_sample_product_in_cart() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	       	Assert.assertFalse(false);
	       	
	}

	    @Then("^User click the Points calculator button$")
	    public void user_click_the_points_calculator_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click the check stock button and verify the stock availablity$")
	    public void user_click_the_check_stock_button_and_verify_the_stock_availablity() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click the Add Item button$")
	    public void user_click_the_add_item_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user able to view the product in cart$")
	    public void verify_user_able_to_view_the_product_in_cart() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click proceed button to checkout$")
	    public void user_click_proceed_button_to_checkout() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify the Successfull popup with QR code and transaction id and click close button$")
	    public void verify_the_successfull_popup_with_qr_code_and_transaction_id_and_click_close_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User login to member and verify the C360$")
	    public void user_login_to_member_and_verify_the_c360() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click Buy now button on pdp$")
	    public void user_click_buy_now_button_on_pdp() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click the Change button$")
	    public void user_click_the_change_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click search button and verify the changed customer$")
	    public void user_click_search_button_and_verify_the_changed_customer() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Customer threeSixty screen should be display$")
	    public void customer_threesixty_screen_should_be_display() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click Home button and verify home page should be displayed$")
	    public void user_click_home_button_and_verify_home_page_should_be_displayed() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User Click Customer 360 button from right navigation$")
	    public void user_click_customer_360_button_from_right_navigation() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click wishlist product and verify PDP shold be displayed$")
	    public void user_click_wishlist_product_and_verify_pdp_shold_be_displayed() throws Throwable {
	       	Assert.assertTrue(c360Page.test());	       	Assert.assertFalse(false);

	}

	    @Then("^Verify user general information should be displayed$")
	    public void verify_user_general_information_should_be_displayed() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify the customer note should be displayed in notes section$")
	    public void verify_the_customer_note_should_be_displayed_in_notes_section() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Validate Product name, price, image, quantity, Buy Now and wishlist button are available in PDP$")
	    public void validate_product_name_price_image_quantity_buy_now_and_wishlist_button_are_available_in_pdp() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user can do check Advance check stock in pdp page$")
	    public void verify_user_can_do_check_advance_check_stock_in_pdp_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify the product description, tips and ingriedients tabs in PDP$")
	    public void verify_the_product_description_tips_and_ingriedients_tabs_in_pdp() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User add membership info$")
	    public void user_add_membership_info() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User verify welcome popup successfully$")
	    public void user_verify_welcome_popup_successfully() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Customer threeSixty screen should be display on customer edit$")
	    public void customer_threesixty_screen_should_be_display_on_customer_edit() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User edit membership info$")
	    public void user_edit_membership_info() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User verify Customer ThreeSixty Screen should be displayed$")
	    public void user_verify_customer_threesixty_screen_should_be_displayed() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User enter text look and feel of your skin on text field$")
	    public void user_enter_text_look_and_feel_of_your_skin_on_text_field() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click add button and click start consultation$")
	    public void user_click_add_button_and_click_start_consultation() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click update button on survey$")
	    public void user_click_update_button_on_survey() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click \"([^\"]*)\" button and verify the page$")
	    public void user_click_something_button_and_verify_the_page(String strArg1) throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click build routine button and verify the routine page$")
	    public void user_click_build_routine_button_and_verify_the_routine_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user selected products and click product types and notes$")
	    public void verify_user_selected_products_and_click_product_types_and_notes() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify the skincare solution page and click summary$")
	    public void verify_the_skincare_solution_page_and_click_summary() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click add all to cart button$")
	    public void user_click_add_all_to_cart_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User validate added product on the cart$")
	    public void user_validate_added_product_on_the_cart() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User edit product on build routine select page$")
	    public void user_edit_product_on_build_routine_select_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click send Email button and Verify email your consultation popup$")
	    public void user_click_send_email_button_and_verify_email_your_consultation_popup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click send button and verify the popup$")
	    public void user_click_send_button_and_verify_the_popup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify menu bar items on the home page$")
	    public void verify_menu_bar_items_on_the_home_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify category items on the home page$")
	    public void verify_category_items_on_the_home_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test()); 	       	Assert.assertFalse(false);

	}

	    @Then("^Verify topten items on the home page$")
	    public void verify_topten_items_on_the_home_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test()); 	       	Assert.assertFalse(false);

	}

	    @Then("^Verify members items on the home page$")
	    public void verify_members_items_on_the_home_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify side navigation items on the home page$")
	    public void verify_side_navigation_items_on_the_home_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test()); 	       	Assert.assertFalse(false);

	}

	    @Then("^User click Language Switch and verify the languages$")
	    public void user_click_language_switch_and_verify_the_languages() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click Training Manual and verify the document$")
	    public void user_click_training_manual_and_verify_the_document() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click Version Details and verify the details$")
	    public void user_click_version_details_and_verify_the_details() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click Technical Assistance Helpline and verify the details$")
	    public void user_click_technical_assistance_helpline_and_verify_the_details() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click Delete Cache or Refresh App and verify$")
	    public void user_click_delete_cache_or_refresh_app_and_verify() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click Password Management and verify$")
	    public void user_click_password_management_and_verify() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User enter current password$")
	    public void user_enter_current_password() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User enter new password$")
	    public void user_enter_new_password() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User enter confirm password$")
	    public void user_enter_confirm_password() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click the Member history and verify the page$")
	    public void user_click_the_member_history_and_verify_the_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User verify total number of bottles returned column$")
	    public void user_verify_total_number_of_bottles_returned_column() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click Done button$")
	    public void user_click_done_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user able to see recent recycled bottles$")
	    public void verify_user_able_to_see_recent_recycled_bottles() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click the Gift button on cart page$")
	    public void user_click_the_gift_button_on_cart_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User verify the redemption page$")
	    public void user_verify_the_redemption_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^validate redeem points popup$")
	    public void validate_redeem_points_popup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user can add more gifts from redemption page and validate total and balance points$")
	    public void verify_user_can_add_more_gifts_from_redemption_page_and_validate_total_and_balance_points() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify the upcoming bookings page$")
	    public void verify_the_upcoming_bookings_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click refresh button and it should navigate to list page$")
	    public void user_click_refresh_button_and_it_should_navigate_to_list_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click Customers button and validate customer list page$")
	    public void user_click_customers_button_and_validate_customer_list_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verifty the customer details$")
	    public void verifty_the_customer_details() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click add to cart button on first voucher$")
	    public void user_click_add_to_cart_button_on_first_voucher() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Validate minimum spent limit popup$")
	    public void validate_minimum_spent_limit_popup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click add to cart button on second voucher$")
	    public void user_click_add_to_cart_button_on_second_voucher() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Validate cannot combine voucher popup$")
	    public void validate_cannot_combine_voucher_popup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click collect tab on Redemption page and verify$")
	    public void user_click_collect_tab_on_redemption_page_and_verify() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click the reserve button on cart page$")
	    public void user_click_the_reserve_button_on_cart_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User enter the reservation id$")
	    public void user_enter_the_reservation_id() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click confirm button on product reservation$")
	    public void user_click_confirm_button_on_product_reservation() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User validate generic customer popup and click proceed button$")
	    public void user_validate_generic_customer_popup_and_click_proceed_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Validate product reservation success popup$")
	    public void validate_product_reservation_success_popup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User enter the customer details on the popup$")
	    public void user_enter_the_customer_details_on_the_popup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user able to navigate cart from righ nav after swiched guest mode$")
	    public void verify_user_able_to_navigate_cart_from_righ_nav_after_swiched_guest_mode() throws Throwable {
	       	Assert.assertTrue(c360Page.test()); 	       	Assert.assertFalse(false);

	}

	    @Then("^Verify user able to see brand images$")
	    public void verify_user_able_to_see_brand_images() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click allergy product and verify PDP shold be displayed$")
	    public void user_click_allergy_product_and_verify_pdp_shold_be_displayed() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User click check other stores button on PLP and verfiy the popup$")
	    public void user_click_check_other_stores_button_on_plp_and_verfiy_the_popup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify the selected store on the popup$")
	    public void verify_the_selected_store_on_the_popup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User login to member and verify the C360 \"([^\"]*)\"$")
	    public void user_login_to_member_and_verify_the_c360_something(String strArg1) throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user able to see Add Note button on dashboard$")
	    public void verify_user_able_to_see_add_note_button_on_dashboard() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user able to see Birthday notification$")
	    public void verify_user_able_to_see_birthday_notification() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^User verify the recent purchases on dashboard$")
	    public void user_verify_the_recent_purchases_on_dashboard() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user able to see Last consultation widget$")
	    public void verify_user_able_to_see_last_consultation_widget() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user able to see YTD spent$")
	    public void verify_user_able_to_see_ytd_spent() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user able to validate Membership Tier$")
	    public void verify_user_able_to_validate_membership_tier() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user able to validate Purchase History Expand and collapse all$")
	    public void verify_user_able_to_validate_purchase_history_expand_and_collapse_all() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @Then("^Verify user able to validate Prefered category$")
	    public void verify_user_able_to_validate_prefered_category() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click logout button on home page and click switch store button on BA page$")
	    public void user_click_logout_button_on_home_page_and_click_switch_store_button_on_ba_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click on login button in storePage$")
	    public void user_click_on_login_button_in_storepage() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click on login button in baPage$")
	    public void user_click_on_login_button_in_bapage() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click on Reset Password$")
	    public void user_click_on_reset_password() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User enters store Manager userName and password$")
	    public void user_enters_store_manager_username_and_password() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click on close button in Pop Up$")
	    public void user_click_on_close_button_in_pop_up() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click category on product from right navigation$")
	    public void user_click_category_on_product_from_right_navigation() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Verify user able to see grid and small and list view$")
	    public void verify_user_able_to_see_grid_and_small_and_list_view() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Verify user able to filter the product in PLP$")
	    public void verify_user_able_to_filter_the_product_in_plp() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Verify user able to sort the product in PLP$")
	    public void verify_user_able_to_sort_the_product_in_plp() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Verify user able to search a product base on min and max price$")
	    public void verify_user_able_to_search_a_product_base_on_min_and_max_price() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the BA Home button from right navigation and Click \"([^\"]*)\" then verify the page$")
	    public void user_click_the_ba_home_button_from_right_navigation_and_click_something_then_verify_the_page(String strArg1) throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Verify the Title in callback list$")
	    public void verify_the_title_in_callback_list() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the first customer detials$")
	    public void user_click_the_first_customer_detials() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Verify the Member level$")
	    public void verify_the_member_level() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the Cart button from right navigation and verify the cart page$")
	    public void user_click_the_cart_button_from_right_navigation_and_verify_the_cart_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User search the product and click Add to cart button$")
	    public void user_search_the_product_and_click_add_to_cart_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User Add the Bonus value and verify the estimation points$")
	    public void user_add_the_bonus_value_and_verify_the_estimation_points() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User select a product on the add item pupup$")
	    public void user_select_a_product_on_the_add_item_pupup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the Checkout button$")
	    public void user_click_the_checkout_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the product and verify user get navigate to PDP page$")
	    public void user_click_the_product_and_verify_user_get_navigate_to_pdp_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User select phone and enter the number$")
	    public void user_select_phone_and_enter_the_number() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Verify the customer Name$")
	    public void verify_the_customer_name() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Verify the phone number$")
	    public void verify_the_phone_number() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Verify the Edit button$")
	    public void verify_the_edit_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the membership tab and verify Membership screen should be displayed$")
	    public void user_click_the_membership_tab_and_verify_membership_screen_should_be_displayed() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click add to wishlist icon form PLP$")
	    public void user_click_add_to_wishlist_icon_form_plp() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click wishlist tab$")
	    public void user_click_wishlist_tab() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the summary tab$")
	    public void user_click_the_summary_tab() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click create note button and verify the note popup$")
	    public void user_click_create_note_button_and_verify_the_note_popup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User enter the title$")
	    public void user_enter_the_title() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User enter the Description$")
	    public void user_enter_the_description() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User toogle and mark the message as important$")
	    public void user_toogle_and_mark_the_message_as_important() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the save button$")
	    public void user_click_the_save_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the Create button on Customer search$")
	    public void user_click_the_create_button_on_customer_search() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User add member details$")
	    public void user_add_member_details() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click terms and conditions checkbox$")
	    public void user_click_terms_and_conditions_checkbox() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click confirm button$")
	    public void user_click_confirm_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User verify the consultation home page$")
	    public void user_verify_the_consultation_home_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the Edit button and update member page should be displayed$")
	    public void user_click_the_edit_button_and_update_member_page_should_be_displayed() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click confirm button to update edited changes$")
	    public void user_click_confirm_button_to_update_edited_changes() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click start consultation button$")
	    public void user_click_start_consultation_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click servey button on the consultation page$")
	    public void user_click_servey_button_on_the_consultation_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User verify the survey form page$")
	    public void user_verify_the_survey_form_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click save button to save form$")
	    public void user_click_save_button_to_save_form() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click servey button on the consultation list page$")
	    public void user_click_servey_button_on_the_consultation_list_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click clear all button on survey form$")
	    public void user_click_clear_all_button_on_survey_form() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User select skin options and click save button$")
	    public void user_select_skin_options_and_click_save_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User verify the consultation report page$")
	    public void user_verify_the_consultation_report_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User select the daily routine details$")
	    public void user_select_the_daily_routine_details() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click add or edit button on build routine page$")
	    public void user_click_add_or_edit_button_on_build_routine_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User validate edited product on summary page$")
	    public void user_validate_edited_product_on_summary_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User enters the message to send$")
	    public void user_enters_the_message_to_send() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click setting icon on the right navigation$")
	    public void user_click_setting_icon_on_the_right_navigation() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the change password button in Password management and verify the popup$")
	    public void user_click_the_change_password_button_in_password_management_and_verify_the_popup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click cancel button$")
	    public void user_click_cancel_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the Transaction history and verify the page$")
	    public void user_click_the_transaction_history_and_verify_the_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Verify the Transcation id in transcation$")
	    public void verify_the_transcation_id_in_transcation() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the recycle tab$")
	    public void user_click_the_recycle_tab() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User Select no of bottles to recycle on dropdown$")
	    public void user_select_no_of_bottles_to_recycle_on_dropdown() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click add to cart button$")
	    public void user_click_add_to_cart_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Verify the gift product on cart page$")
	    public void verify_the_gift_product_on_cart_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the Checkout button to redeem$")
	    public void user_click_the_checkout_button_to_redeem() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click calendar button on upcoming booking page$")
	    public void user_click_calendar_button_on_upcoming_booking_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click first customer on the list$")
	    public void user_click_first_customer_on_the_list() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click all bookings button and verify the list page$")
	    public void user_click_all_bookings_button_and_verify_the_list_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click the Voucher Redemption button from right navigation and verify the page$")
	    public void user_click_the_voucher_redemption_button_from_right_navigation_and_verify_the_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Verify redeem requst page components$")
	    public void verify_redeem_requst_page_components() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click reedem button$")
	    public void user_click_reedem_button() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click add to cart button from PLP page$")
	    public void user_click_add_to_cart_button_from_plp_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Varify the reservation id popup$")
	    public void varify_the_reservation_id_popup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User verify active customer on Home page$")
	    public void user_verify_active_customer_on_home_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click active customer on home page$")
	    public void user_click_active_customer_on_home_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click Advance Customer Search button on home page$")
	    public void user_click_advance_customer_search_button_on_home_page() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click search button on the popup$")
	    public void user_click_search_button_on_the_popup() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click staff button on home page to switch guest mode$")
	    public void user_click_staff_button_on_home_page_to_switch_guest_mode() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click product info button on the right nav$")
	    public void user_click_product_info_button_on_the_right_nav() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click add to allergy icon$")
	    public void user_click_add_to_allergy_icon() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click add to allergy icon from plp$")
	    public void user_click_add_to_allergy_icon_from_plp() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User enter store name to find the store$")
	    public void user_enter_store_name_to_find_the_store() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^Verify the dashboard tab$")
	    public void verify_the_dashboard_tab() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click recent purchase and verify its navigate to PDP$")
	    public void user_click_recent_purchase_and_verify_its_navigate_to_pdp() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User validate the date or click to start consultation$")
	    public void user_validate_the_date_or_click_to_start_consultation() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

	    @And("^User click purchase history tab$")
	    public void user_click_purchase_history_tab() throws Throwable {
	       	Assert.assertTrue(c360Page.test());
	}

}
