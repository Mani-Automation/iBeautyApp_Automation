package stepDefinitions.Kiehls;

import java.io.IOException;

import org.junit.Assert;

import com.driverfactory.DriverManager;
import com.reusableMethods.CommonActions;
import com.reusableMethods.CommonActions.Direction;
import com.utilities.ConfigReader;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.*;
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

public class Kiehls_AU_stepDef extends CommonActions {

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

// BA Callback

	@Then("^User click the first call back history and verify the customer list page$")
	public void user_click_the_first_call_back_history_and_verify_the_customer_list_page() throws InterruptedException {
		Assert.assertTrue(baCallbackPage.user_click_the_first_call_back_history_and_verify_the_customer_list_page());
	}

	@And("^User click the BA Home button from right navigation and Click \"([^\"]*)\" then verify the page$")
	public void user_click_the_ba_home_button_from_right_navigation_and_click_something_then_verify_the_page(
			String ba_home) {
		Assert.assertTrue(baCallbackPage
				.user_click_the_ba_home_button_from_right_navigation_and_click_something_then_verify_the_page(ba_home));
	}

	@And("^Verify the Title in callback list$")
	public void verify_the_title_in_callback_list() {
		Assert.assertTrue(baCallbackPage.verify_the_title_in_callback_list());
	}

	@And("^Verify the Count in callback list$")
	public void verify_the_count_in_callback_list() {
		Assert.assertTrue(baCallbackPage.verify_the_count_in_callback_list());
	}

	@And("^Verify the Not picked call in callback list$")
	public void verify_the_not_picked_call_in_callback_list() {
		Assert.assertTrue(baCallbackPage.verify_the_not_picked_call_in_callback_list());
	}

	@And("^Verify the called in callback list$")
	public void verify_the_called_in_callback_list() {
		Assert.assertTrue(baCallbackPage.verify_the_called_in_callback_list());
	}

	@And("^Verify the missed call in callback list$")
	public void verify_the_missed_call_in_callback_list() {
		Assert.assertTrue(baCallbackPage.verify_the_missed_call_in_callback_list());
	}

	@And("^Verify the reminder in callback list$")
	public void verify_the_reminder_in_callback_list() {
		Assert.assertTrue(baCallbackPage.verify_the_reminder_in_callback_list());
	}

	@And("^Verify the Created date in callback list$")
	public void verify_the_created_date_in_callback_list() {
		Assert.assertTrue(baCallbackPage.verify_the_created_date_in_callback_list());
	}

	@And("^Verify the Updated date in callback list$")
	public void verify_the_updated_date_in_callback_list() {
		Assert.assertTrue(baCallbackPage.verify_the_updated_date_in_callback_list());
	}

	@And("^User click the first customer detials$")
	public void user_click_the_first_customer_detials() throws InterruptedException {
		Assert.assertTrue(baCallbackPage.user_click_the_first_customer_detials());
	}

	@And("^Verify the Member level$")
	public void verify_the_member_level() {
		Assert.assertTrue(baCallbackPage.verify_the_member_level());
	}

	@And("^Verify the Balance points$")
	public void verify_the_balance_points() {
		Assert.assertTrue(baCallbackPage.verify_the_balance_points());
	}

	@And("^Verify the Points Expiring in 1 month$")
	public void verify_the_points_expiring_in_1_month() {
		Assert.assertTrue(baCallbackPage.verify_the_points_expiring_in_1_month());
	}

	@And("^Verify the R12 Annual spent$")
	public void verify_the_r12_annual_spent() {
		Assert.assertTrue(baCallbackPage.verify_the_r12_annual_spent());
	}

	// BA Transaction

	@Then("^User click the Member history and verify the page$")
	public void user_click_the_member_history_and_verify_the_page() {
		Assert.assertTrue(baTransactionPage.user_click_the_member_history_and_verify_the_page());
	}

	@And("^User click the Transaction history and verify the page$")
	public void user_click_the_transaction_history_and_verify_the_page() {

		Assert.assertTrue(baTransactionPage.user_click_the_transaction_history_and_verify_the_page());
	}

	@And("^Verify the Transcation id in transcation$")
	public void verify_the_transcation_id_in_transcation() {
		Assert.assertTrue(baTransactionPage.verify_the_transcation_id_in_transcation());
	}

	@And("^Verify the Transcation date in transcation$")
	public void verify_the_transcation_date_in_transcation() {
		Assert.assertTrue(baTransactionPage.verify_the_transcation_date_in_transcation());
	}

	@And("^Verify the Counter id in transcation$")
	public void verify_the_counter_id_in_transcation() {
		Assert.assertTrue(baTransactionPage.verify_the_counter_id_in_transcation());
	}

	@And("^Verify the BA id in transcation$")
	public void verify_the_ba_id_in_transcation() {
		Assert.assertTrue(baTransactionPage.verify_the_ba_id_in_transcation());
	}

	@And("^Verify the BA name in transcation$")
	public void verify_the_ba_name_in_transcation() {
		Assert.assertTrue(baTransactionPage.verify_the_ba_name_in_transcation());
	}

	@And("^Verify the Mars id in transcation$")
	public void verify_the_mars_id_in_transcation() {
		Assert.assertTrue(baTransactionPage.verify_the_mars_id_in_transcation());
	}

	@And("^Verify the Customer name in transcation$")
	public void verify_the_customer_name_in_transcation() {
		Assert.assertTrue(baTransactionPage.verify_the_customer_name_in_transcation());
	}

	@And("^Verify the Customer number in transcation$")
	public void verify_the_customer_number_in_transcation() {
		Assert.assertTrue(baTransactionPage.verify_the_customer_number_in_transcation());
	}

	@And("^Verify the Total product quantity in transcation$")
	public void verify_the_total_product_quantity_in_transcation() {
		Assert.assertTrue(baTransactionPage.verify_the_total_product_quantity_in_transcation());
	}

	@And("^Verify the Total transcation price in transcation$")
	public void verify_the_total_transcation_price_in_transcation() {
		Assert.assertTrue(baTransactionPage.verify_the_total_transcation_price_in_transcation());
	}

	@And("^Verify the Submission date in member$")
	public void verify_the_submission_date_in_member() {
		Assert.assertTrue(baTransactionPage.verify_the_submission_date_in_member());
	}

	@And("^Verify the Counter id in member$")
	public void verify_the_counter_id_in_member() {
		Assert.assertTrue(baTransactionPage.verify_the_counter_id_in_member());
	}

	@And("^Verify the BA id in member$")
	public void verify_the_ba_id_in_member() {
		Assert.assertTrue(baTransactionPage.verify_the_ba_id_in_member());
	}

	@And("^Verify the BA name in member$")
	public void verify_the_ba_name_in_member() {
		Assert.assertTrue(baTransactionPage.verify_the_ba_name_in_member());
	}

	@And("^Verify the Customer name in member$")
	public void verify_the_customer_name_in_member() {
		Assert.assertTrue(baTransactionPage.verify_the_customer_name_in_member());
	}

	@And("^Verify the Customer number in member$")
	public void verify_the_customer_number_in_member() {
		Assert.assertTrue(baTransactionPage.verify_the_customer_number_in_member());
	}

	@Then("^User click the Create Event button$")
	public void user_click_the_create_event_button() throws InterruptedException {
		Assert.assertTrue(baCalendarPage.user_click_the_create_event_button());
	}

	@Then("^Verify user able to view created Promotion Event$")
	public void verify_user_able_to_view_created_promotion_event() throws InterruptedException {
		Assert.assertTrue(baCalendarPage.verify_user_able_to_view_created_promotion_event());
	}

	@And("^User click the Service booking$")
	public void user_click_the_service_booking() {
		Assert.assertTrue(baCalendarPage.user_click_the_service_booking());
	}

	@And("^User select the Service booking in the Service type$")
	public void user_select_the_service_booking_in_the_service_type() throws InterruptedException {
		Assert.assertTrue(baCalendarPage.user_select_the_service_booking_in_the_service_type());
	}

	@And("^User enter the Customer name$")
	public void user_enter_the_customer_name() throws InterruptedException, IOException {
		Assert.assertTrue(baCalendarPage.user_enter_the_customer_name_in_calender());
	}

	@And("^User enther the Phone number$")
	public void user_enther_the_phone_number() throws InterruptedException {
		Assert.assertTrue(baCalendarPage.user_enter_the_phone_number_in_calendar());
	}

	@And("^User click Save button$")
	public void user_click_save_button() throws InterruptedException {
		Assert.assertTrue(baCalendarPage.user_click_save_button_in_calender());
	}

	@And("^User click the Delete Event button$")
	public void user_click_the_delete_event_button() throws InterruptedException {
		Assert.assertTrue(baCalendarPage.user_click_the_delete_event_button());
	}

	@Then("^User verfiy the Day tab$")
	public void user_verfiy_the_day_tab() {
		Assert.assertTrue(baCalendarPage.user_verfiy_the_day_tab());
	}

	@And("^User click the event reservaiton$")
	public void User_click_the_event_reservaiton() {
		Assert.assertTrue(baCalendarPage.user_click_the_event_reservaiton());
	}

	@And("^User select the Event reservaiton in the Service type$")
	public void user_select_the_event_reservaiton_in_the_service_type() throws InterruptedException {
		Assert.assertTrue(baCalendarPage.user_select_the_event_reservaiton_in_the_service_type());
	}

	@And("^User verify the Week tab$")
	public void user_verify_the_week_tab() {
		Assert.assertTrue(baCalendarPage.user_verify_the_week_tab());
	}

	@And("^User verify the Month tab$")
	public void user_verify_the_month_tab() {
		Assert.assertTrue(baCalendarPage.user_verify_the_month_tab());
	}

	@And("^User verify the Year tab$")
	public void user_verify_the_year_tab() {
		Assert.assertTrue(baCalendarPage.user_verify_the_year_tab());
	}

	@Then("^Verify user able to view created ToDo list Event$")
	public void verify_user_able_to_view_created_todo_list_event() throws InterruptedException {
		Assert.assertTrue(baCalendarPage.verify_user_able_to_view_created_todo_list_event());
	}

	@And("^User click the Promotion Activity$")
	public void user_click_the_promotion_activity() {
		Assert.assertTrue(baCalendarPage.user_click_the_promotion_activity());
	}

	@And("^User select the Promotion in the Service type$")
	public void user_select_the_promotion_in_the_service_type() throws InterruptedException {
		Assert.assertTrue(baCalendarPage.user_select_the_promotion_in_the_service_type());
	}

	@And("^User click the ToDo list$")
	public void user_click_the_todo_list() {
		Assert.assertTrue(baCalendarPage.user_click_the_todo_list());
	}

	@And("^User enter the title in calender$")
	public void user_enter_the_title_in_calender() throws InterruptedException {
		Assert.assertTrue(baCalendarPage.user_enter_the_title_in_calender());
	}

	@And("^User click Save button in calender$")
	public void user_click_save_button_in_calender() throws InterruptedException {
		Assert.assertTrue(baCalendarPage.user_click_save_button_in_calender());
	}

	@And("^User enter the Customer name in calender$")
	public void user_enter_the_customer_name_in_calender() throws InterruptedException, IOException {
		Assert.assertTrue(baCalendarPage.user_enter_the_customer_name_in_calender());
	}

	@And("^User enter the Phone number in calendar$")
	public void user_enther_the_phone_number_in_calender() throws InterruptedException {
		Assert.assertTrue(baCalendarPage.user_enter_the_phone_number_in_calendar());
	}

	@Then("^Verify user able to view created service booking Event$")
	public void verify_user_able_to_view_created_service_booking_event() throws InterruptedException {

		Assert.assertTrue(baCalendarPage.verify_user_able_to_view_created_service_booking_event());

	}

	@Then("^Verify user able to view created reservation Event$")
	public void verify_user_able_to_view_created_reservation_event() throws InterruptedException {

		Assert.assertTrue(baCalendarPage.verify_user_able_to_view_created_reservation_event());

	}

	@Then("^Verify user able see Customer Notification, Callback List, Calender tab in the Dashboard$")
	public void verify_user_able_see_customer_notification_callback_list_calender_tab_in_the_dashboard() {
		Assert.assertTrue(baDashboardPage
				.verify_user_able_see_customer_notification_callback_list_calender_tab_in_the_dashboard());
	}

	@Then("^User click first notification on the list and user able to navigate Notification page$")
	public void user_click_first_notification_on_the_list_and_user_able_to_navigate_notification_page() {
		Assert.assertTrue(baDashboardPage
				.user_click_first_notification_on_the_list_and_user_able_to_navigate_notification_page());
	}

	@Then("^User click first calback history on the list and user able to navigate Calback List page$")
	public void user_click_first_calback_history_on_the_list_and_user_able_to_navigate_calback_list_page() {
		Assert.assertTrue(baDashboardPage
				.user_click_first_calback_history_on_the_list_and_user_able_to_navigate_calback_list_page());

	}

	@Then("^User click first calendar event on the list and user able to navigate Calendar page$")
	public void user_click_first_calendar_event_on_the_list_and_user_able_to_navigate_calendar_page() {
		Assert.assertTrue(
				baDashboardPage.user_click_first_calendar_event_on_the_list_and_user_able_to_navigate_calendar_page());

	}

	@Then("^User click Add new button$")
	public void user_click_add_new_button() {
		Assert.assertTrue(baDashboardPage.user_click_add_new_button());

	}

	@And("^Verify user able to navigate to calender page and see all calender events list popup$")
	public void verify_user_able_to_navigate_to_calender_page_and_see_all_calender_events_list_popup() {
		Assert.assertTrue(
				baDashboardPage.verify_user_able_to_navigate_to_calender_page_and_see_all_calender_events_list_popup());

	}

	@And("^User click the Cart button from right navigation and verify the cart page$")
	public void user_click_the_cart_button_from_right_navigation_and_verify_the_cart_page() throws Throwable {
		Assert.assertTrue(cartPage.click_cart_button_and_verify_the_cart_page());
	}

	@Then("^User click the Add Item button$")
	public void user_click_the_add_item_button() throws InterruptedException {
		Assert.assertTrue(cartPage.user_click_the_add_item_button());

	}

	@Then("^Verify user able to view the product in cart$")
	public void verify_user_able_to_view_the_product_in_cart() throws InterruptedException {
		Assert.assertTrue(cartPage.verify_user_able_to_view_the_product_in_cart());
	}

	@Then("^User click the Sample button$")
	public void user_click_the_sample_button() throws InterruptedException {
		Assert.assertTrue(cartPage.user_click_the_sample_button());
	}

	@Then("^Verify user able to view the sample product in cart$")
	public void verify_user_able_to_view_the_sample_product_in_cart() throws InterruptedException {
		Assert.assertTrue(cartPage.verify_user_able_to_view_the_sample_product_in_cart());
	}

	@Then("^User click the check stock button and verify the stock availablity$")
	public void user_click_the_check_stock_button_and_verify_the_stock_availablity() throws InterruptedException {
		Assert.assertTrue(cartPage.user_click_the_check_stock_button_and_verify_the_stock_availablity());
	}

	@Then("^User click the Points calculator button$")
	public void user_click_the_points_calculator_button() throws InterruptedException {
		Assert.assertTrue(cartPage.user_click_the_points_calculator_button());
	}

	@Then("^Verify the Successfull popup with QR code and transaction id and click close button$")
	public void verify_the_successfull_popup_with_qr_code_and_transaction_id_and_click_close_button()
			throws InterruptedException {
		Assert.assertTrue(
				cartPage.verify_the_successfull_popup_with_qr_code_and_transaction_id_and_click_close_button());
	}

	@Then("^User click the Change button$")
	public void user_click_the_change_button() throws InterruptedException {
		Assert.assertTrue(cartPage.user_click_the_change_button());
	}

	@Then("^User click search button and verify the changed customer$")
	public void user_click_search_button_and_verify_the_changed_customer() throws InterruptedException {
		Assert.assertTrue(cartPage.user_click_search_button_and_verify_the_changed_customer());
	}

	@And("^User search the product and add it to cart$")
	public void user_search_the_product_and_add_it_to_cart() throws InterruptedException {
		Assert.assertTrue(cartPage.user_search_the_product_and_add_it_to_cart());
	}

	@And("^User search the product and click Add to cart button$")
	public void user_search_the_product_and_click_add_to_cart_button() throws InterruptedException {
		Assert.assertTrue(cartPage.user_search_the_product_and_click_add_to_cart_button());
	}

	@And("^User Add the Bonus value and verify the estimation points$")
	public void user_add_the_bonus_value_and_verify_the_estimation_points() throws InterruptedException {
		Assert.assertTrue(cartPage.user_add_the_bonus_value_and_verify_the_estimation_points());
	}

	@And("^User click the Checkout button$")
	public void user_click_the_checkout_button() throws InterruptedException {
		Assert.assertTrue(cartPage.user_click_the_checkout_button());
	}

	@And("^User select phone and enter the number$")
	public void user_select_phone_and_enter_the_number() throws InterruptedException {
		Assert.assertTrue(cartPage.user_select_phone_and_enter_the_number());
	}

	@Then("^tap on customer search dropdown$")
	public void tap_on_customer_search_dropdown() throws InterruptedException {
		Assert.assertTrue(c360Page.tap_on_customer_search_dropdown());
	}

	@Then("^Customer threeSixty screen should be display$")
	public void customer_threesixty_screen_should_be_display() {
		Assert.assertTrue(c360Page.customer_threesixty_screen_should_be_display());
	}

	@And("^tap on Mobile Number from the dropdown list$")
	public void tap_on_Mobile_Number_from_the_dropdown_list() throws InterruptedException, IOException {

		String segment = ConfigReader.getData("app_segment");

		if (segment.equals("AU")) {
			Assert.assertTrue(c360Page.tap_on_mobile_number_from_the_dropdown_list());

		} else if (segment.equals("JP")) {
			Assert.assertTrue(c360Page.tap_on_mobile_number_from_the_dropdown_list());

		} else if (segment.equals("KR") || segment.equals("TW")) {
			Assert.assertTrue(c360Page.tap_on_mobile_number_from_the_dropdown_list_kr());

		}

	}

	@And("^enter Mobile Number and tap on search button$")
	public void enter_mobile_number_and_tap_on_search_button() throws IOException {

		String segment = ConfigReader.getData("app_segment");

		if (segment.equals("AU")) {
			Assert.assertTrue(c360Page.enter_mobile_number_and_tap_on_search_button());

		} else if (segment.equals("JP")) {
			Assert.assertTrue(c360Page.enter_mobile_number_and_tap_on_search_button());

		} else if (segment.equals("KR") || segment.equals("TW") || segment.equals("HK")) {
			Assert.assertTrue(c360Page.enter_mobile_number_and_tap_on_search_button_kr());

		}

	}

	@Then("^User verify total number of bottles returned column$")
	public void user_verify_total_number_of_bottles_returned_column() throws Throwable {
		Assert.assertTrue(c360Page.user_verify_total_number_of_bottles_returned_column());
	}

	@Then("^User click Done button$")
	public void user_click_done_button() throws Throwable {
		Assert.assertTrue(c360Page.user_click_done_button());
	}

	@Then("^Verify user able to see recent recycled bottles$")
	public void verify_user_able_to_see_recent_recycled_bottles() throws Throwable {
		Assert.assertTrue(c360Page.verify_user_able_to_see_recent_recycled_bottles());
	}

	@And("^User click the recycle tab$")
	public void user_click_the_recycle_tab() throws Throwable {
		Assert.assertTrue(c360Page.user_click_the_recycle_tab());
	}

	@And("^User Select no of bottles to recycle on dropdown$")
	public void user_select_no_of_bottles_to_recycle_on_dropdown() throws Throwable {
		Assert.assertTrue(c360Page.user_select_no_of_bottles_to_recycle_on_dropdown());
	}

	// new

	@And("^enter Email and tap on search button$")
	public void enter_email_and_tap_on_search_button() throws InterruptedException {
		Assert.assertTrue(c360Page.enter_email_and_tap_on_search_button());
	}

	@And("^Verify the customer Name$")
	public void verify_the_customer_name() {
		Assert.assertTrue(c360Page.verify_the_customer_name());
	}

	@And("^Verify the phone number$")
	public void verify_the_phone_number() {
		Assert.assertTrue(c360Page.verify_the_phone_number());
	}

	@And("^Verify the Edit button$")
	public void verify_the_edit_button() {
		Assert.assertTrue(c360Page.verify_the_edit_button());
	}

	@And("^Verify the Birthday Date$")
	public void verify_the_birthday_date() {
		Assert.assertTrue(c360Page.verify_the_birthday_date());
	}

	@And("^Verity the Gender$")
	public void verity_the_gender() {
		Assert.assertTrue(c360Page.verity_the_gender());
	}

	@And("^Verify the R12 Spending$")
	public void verify_the_r12_spending() {
		Assert.assertTrue(c360Page.verify_the_r12_spending());
	}

	@And("^Verify the Opt In$")
	public void verify_the_opt_in() {
		Assert.assertTrue(c360Page.verify_the_opt_in());
	}

	@And("^Verify the Membership Since$")
	public void verify_the_membership_since() {
		Assert.assertTrue(c360Page.verify_the_membership_since());
	}

	@And("^Verify the Customer type$")
	public void verify_the_customer_type() {
		Assert.assertTrue(c360Page.verify_the_customer_type());
	}
//23

	@Then("^Verify the customer details and click update button$")
	public void verify_the_customer_details_and_click_update_button() {
		Assert.assertTrue(c360Page.verify_the_customer_details_and_click_update_button());
	}

	@And("^User click the Edit button and update member page should be displayed$")
	public void user_click_the_edit_button_and_update_member_page_should_be_displayed() throws IOException {

		String segment = ConfigReader.getData("app_segment");

		if (segment.equals("AU")) {
			Assert.assertTrue(c360Page.user_click_the_edit_button_and_update_member_page_should_be_displayed());

		} else if (segment.equals("JP")) {
			Assert.assertTrue(c360Page.user_click_the_edit_button_and_update_member_page_should_be_displayed());

		} else if (segment.equals("KR")) {
			Assert.assertTrue(c360Page.user_click_the_edit_button_and_update_member_page_should_be_displayed_kr());

		} else if (segment.equals("TW")) {
			Assert.assertTrue(c360Page.user_click_the_edit_button_and_update_member_page_should_be_displayed_tw());

		}
	}

//24

	@Then("^User edit membership info$")
	public void user_edit_membership_info() throws Throwable {

		String segment = ConfigReader.getData("app_segment");

		if (segment.equals("AU")) {
			Assert.assertTrue(c360Page.user_edit_membership_info());

		} else if (segment.equals("JP")) {
			Assert.assertTrue(c360Page.user_edit_membership_info());

		} else if (segment.equals("KR") || segment.equals("TW")) {
			Assert.assertTrue(c360Page.user_edit_membership_info_kr());

		}
	}

	@And("^User edit member details$")
	public void user_edit_member_details() throws Throwable {

		String segment = ConfigReader.getData("app_segment");

		if (segment.equals("AU")) {
			Assert.assertTrue(c360Page.user_edit_member_details());

		} else if (segment.equals("JP")) {
			Assert.assertTrue(c360Page.user_edit_member_details());

		} else if (segment.equals("KR")) {
			Assert.assertTrue(c360Page.user_edit_member_details_kr());

		} else if (segment.equals("TW")) {
			Assert.assertTrue(c360Page.user_edit_member_details_tw());

		}
	}

	@And("^User click confirm button to update edited changes$")
	public void user_click_confirm_button_to_update_edited_changes() throws Throwable {
		Assert.assertTrue(ccPage.user_click_confirm_button_to_update_edited_changes());
	}

	@And("^User edit mailing address$")
	public void user_edit_mailing_address() throws Throwable {

		String segment = ConfigReader.getData("app_segment");

		if (segment.equals("AU")) {
			Assert.assertTrue(c360Page.user_edit_mailing_address());

		} else if (segment.equals("JP")) {
			Assert.assertTrue(c360Page.user_edit_mailing_address());

		} else if (segment.equals("KR")) {
			Assert.assertTrue(c360Page.user_edit_mailing_address_kr());

		} else if (segment.equals("TW") || segment.equals("HK")) {
			Assert.assertTrue(c360Page.user_edit_mailing_address_tw());

		}

	}

	@And("^User edit communicate channals details$")
	public void user_edit_communicate_channals_details() throws Throwable {
		Assert.assertTrue(c360Page.user_edit_communicate_channals_details());
	}

	@And("^User click the membership tab and verify Membership screen should be displayed$")
	public void user_click_the_membership_tab_and_verify_membership_screen_should_be_displayed()
			throws InterruptedException {
		Assert.assertTrue(c360Page.user_click_the_membership_tab_and_verify_membership_screen_should_be_displayed());

	}

	@And("^verify membership date, points, store and type are displayed$")
	public void verify_membership_date_points_store_and_type_are_displayed() {
		Assert.assertTrue(c360Page.verify_membership_date_points_store_and_type_are_displayed());
	}

	// 25
	@Then("^User click Home button and verify home page should be displayed$")
	public void user_click_home_button_and_verify_home_page_should_be_displayed() {
		Assert.assertTrue(c360Page.user_click_home_button_and_verify_home_page_should_be_displayed());
	}

	@Then("^User Click Customer 360 button from right navigation$")
	public void user_click_customer_360_button_from_right_navigation() {
		Assert.assertTrue(c360Page.user_click_customer_360_button_from_right_navigation());
	}

	@Then("^User click wishlist product and verify PDP shold be displayed$")
	public void user_click_wishlist_product_and_verify_pdp_shold_be_displayed() {
		Assert.assertTrue(c360Page.user_click_wishlist_product_and_verify_pdp_shold_be_displayed());
	}

	@And("^User click add to wishlist icon$")
	public void user_click_add_to_wishlist_icon() {
		Assert.assertTrue(c360Page.user_click_add_to_wishlist_icon());
	}

	@And("^User click wishlist tab$")
	public void user_click_wishlist_tab() {
		Assert.assertTrue(c360Page.user_click_wishlist_tab());
	}
//26

	@Then("^Verify user general information should be displayed$")
	public void verify_user_general_information_should_be_displayed() {
		Assert.assertTrue(c360Page.verify_user_general_information_should_be_displayed());
	}

	@And("^User click the summary tab$")
	public void user_click_the_summary_tab() {
		Assert.assertTrue(c360Page.user_clickthe_summary_tab());
	}

//27
	@Then("^Verify the customer note should be displayed in notes section$")
	public void verify_the_customer_note_should_be_displayed_in_notes_section() {
		Assert.assertTrue(c360Page.verify_the_customer_note_should_be_displayed_in_notes_section());
	}

	@And("^User click create note button and verify the note popup$")
	public void user_click_create_note_button_and_verify_the_note_popup() {
		Assert.assertTrue(c360Page.user_click_create_note_button_and_verify_the_note_popup());
	}

	@And("^User enter the title$")
	public void user_enter_the_title() throws InterruptedException {
		Assert.assertTrue(c360Page.user_enter_the_title());
	}

	@And("^User enter the Description$")
	public void user_enter_the_description() throws InterruptedException {
		Assert.assertTrue(c360Page.user_enter_the_description());
	}

	@And("^User toogle and mark the message as important$")
	public void user_toogle_and_mark_the_message_as_important() throws InterruptedException {
		Assert.assertTrue(c360Page.user_toogle_and_mark_the_message_as_important());
	}

	@And("^User click the save button$")
	public void user_click_the_save_button() throws InterruptedException {
		Assert.assertTrue(c360Page.user_click_the_save_button());
	}

	@Then("^Verify the Create new member page$")
	public void verify_the_create_new_member_page() throws InterruptedException {
		Assert.assertTrue(ccPage.verify_customer_creation_page());
	}

	@And("^User click the Create button on Customer search$")
	public void user_click_the_create_button_on_customer_search() throws InterruptedException {

		Assert.assertTrue(ccPage.create_customer());

	}

	////// create customer
	@Then("^User add membership info$")
	public void user_add_membership_info() throws IOException {
		String segment = ConfigReader.getData("app_segment");

		if (segment.equals("AU")) {
			Assert.assertTrue(ccPage.user_add_membership_info_au());

		} else if (segment.equals("JP")) {
			Assert.assertTrue(ccPage.user_add_membership_info_jp());
		} else if (segment.equals("KR")) {
			Assert.assertTrue(ccPage.user_add_membership_info_kr());
		} else if (segment.equals("TW")) {
			Assert.assertTrue(ccPage.user_add_membership_info_tw());

		} else if (segment.equals("HK") || segment.equals("MY")) {
			Assert.assertTrue(ccPage.user_add_membership_info_hk());

		}

	}

	@And("^User add member details$")
	public void user_add_member_details() throws IOException {

		String segment = ConfigReader.getData("app_segment");

		if (segment.equals("AU")) {
			Assert.assertTrue(ccPage.user_add_member_details_au());

		} else if (segment.equals("JP")) {
			Assert.assertTrue(ccPage.user_add_member_details_jp());

		} else if (segment.equals("KR")) {
			Assert.assertTrue(ccPage.user_add_member_details_kr());

		} else if (segment.equals("TW")) {
			Assert.assertTrue(ccPage.user_add_member_details_tw());

		} else if (segment.equals("HK")) {
			Assert.assertTrue(ccPage.user_add_member_details_hk());

		} else if (segment.equals("MY")) {
			Assert.assertTrue(ccPage.user_add_member_details_my());

		}
	}

	@And("^User add mailing address$")
	public void user_add_mailing_address() throws IOException {
		String segment = ConfigReader.getData("app_segment");

		if (segment.equals("AU")) {
			Assert.assertTrue(ccPage.user_add_mailing_address_au());

		} else if (segment.equals("JP")) {
			Assert.assertTrue(ccPage.user_add_mailing_address_jp());

		} else if (segment.equals("KR")) {
			Assert.assertTrue(ccPage.user_add_mailing_address_kr());

		} else if (segment.equals("TW")) {

			Assert.assertTrue(ccPage.user_add_mailing_address_tw());

		} else if (segment.equals("MY")) {

			Assert.assertTrue(ccPage.user_add_mailing_address_my());

		}
	}

	@And("^User add communicate channals details$")
	public void user_add_communicate_channals_details() throws IOException {

		Assert.assertTrue(ccPage.user_add_communicate_channals_details());

	}

	@And("^User click terms and conditions checkbox$")
	public void user_click_terms_and_conditions_checkbox() throws IOException {
		String segment = ConfigReader.getData("app_segment");

		if (segment.equals("AU")) {
			Assert.assertTrue(ccPage.user_click_terms_and_conditions_checkbox_au());

		} else if (segment.equals("JP")) {
			Assert.assertTrue(ccPage.user_click_terms_and_conditions_checkbox_jp());

		} else if (segment.equals("KR")) {
			Assert.assertTrue(ccPage.user_click_terms_and_conditions_checkbox_kr());

		} else if (segment.equals("TW")) {
			Assert.assertTrue(ccPage.user_click_terms_and_conditions_checkbox_tw());

		} else if (segment.equals("HK")) {
			Assert.assertTrue(ccPage.user_click_terms_and_conditions_checkbox_hk());

		} else if (segment.equals("MY")) {
			Assert.assertTrue(ccPage.user_click_terms_and_conditions_checkbox_my());

		}
	}

	@And("^User click confirm button$")
	public void user_click_confirm_button() {
		Assert.assertTrue(ccPage.user_click_confirm_button());
	}

	@Then("^User verify Customer ThreeSixty Screen should be displayed$")
	public void user_verify_customer_threesixty_screen_should_be_displayed() throws Throwable {
		Assert.assertTrue(ccPage.user_verify_customer_threesixty_screen_should_be_displayed());
	}

	@And("^User verify mandatory error messages$")
	public void user_verify_mandatory_error_messages() {
		Assert.assertTrue(ccPage.user_verify_mandatory_error_messages());
	}

	// login
	@When("^User select country and login to store then login to ba account$")
	public void user_select_country_and_login_to_store_then_login_to_ba_account() {
		Assert.assertTrue(login.user_select_country_and_login_to_store_then_login_to_ba_account());
	}

	@Given("User launches the Application")
	public void user_launches_the_application() throws Exception {

		Assert.assertTrue(login.loginDescriptionMessage());
	}

	@Then("User click on proceed button")
	public void user_click_on_proceed_button() throws Exception {

		Assert.assertTrue(login.clickProceedButton());
	}

//updating   mm
	@Then("^User select the country$")
	public void user_select_the_country() throws IOException {

		Assert.assertTrue(login.user_select_country());
	}

	@When("User enter the store credentials")
	public void user_enter_the_store_credentials() throws Exception {

		Assert.assertTrue(login.enterStoreCredentials());

	}

	@When("User click on login button in storePage")
	public void user_click_on_login_button_in_store_page() throws Exception {

		Assert.assertTrue(login.clickLoginBtnInStorePage());
	}

	@Then("User enter the ba credentials")
	public void user_enter_the_ba_credentials() throws Exception {
		Assert.assertTrue(login.enterBaCredentials());
	}

	@Then("User click on login button in baPage")
	public void user_click_on_login_button_in_ba_page() throws Exception {

		Assert.assertTrue(login.clickLoginBtnInBaPage());
	}

	@Then("User is on home page")
	public void user_is_on_home_page() throws Exception {
		Assert.assertTrue(login.verifuUserIsOnHomePage());

	}

	@And("^User click logout button on home page and click switch store button on BA page$")
	public void user_click_logout_button_on_home_page_and_click_switch_store_button_on_ba_page() {
		Assert.assertTrue(login.user_click_logout_button_on_home_page_and_click_switch_store_button_on_ba_page());
	}

	@When("User enter the wrong store credentials")
	public void user_enter_the_wrong_store_credentials() throws InterruptedException, IOException {

		Assert.assertTrue(login.enterWrongStoreCredentials());
	}

	@Then("User enter the wrong ba credentials")
	public void user_enter_the_wrong_ba_credentials() throws InterruptedException, IOException {

		Assert.assertTrue(login.enterWrongBaCredentials());
	}

	@Then("User click on Reset Password")
	public void user_click_on_reset_password() throws InterruptedException, IOException {

		Assert.assertTrue(login.clickResetPassword());
	}

	@Then("User enters store Manager userName and passWord")
	public void user_enters_store_manager_user_name_and_pass_word() throws InterruptedException, IOException {

		Assert.assertTrue(login.enterStoreManagerCredentials());
	}

	@Then("User click on close button in Pop Up")
	public void user_click_on_close_button_in_pop_up() throws InterruptedException, IOException {

		Assert.assertTrue(login.clickCloseButtonInPopup());
	}

	@Then("User click on next button")
	public void user_click_on_next_button() throws InterruptedException, IOException {

		Assert.assertTrue(login.clickNextButtonInPopupMessage());
	}

	@Then("User enters the newPassword and confirm passWord")
	public void user_enters_the_new_password_and_confirm_pass_word() throws InterruptedException, IOException {

		Assert.assertTrue(login.enterNewAndConfirmPassword());
	}

	@Then("User click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {

	}

	@Then("^Validate Product name, price, image, quantity, Buy Now and wishlist button are available in PDP$")
	public void validate_product_name_price_image_quantity_buy_now_and_wishlist_button_are_available_in_pdp() {

		Assert.assertTrue(
				pdpPage.validate_product_name_price_image_quantity_buy_now_and_wishlist_button_are_available_in_pdp());

	}

	@Then("^Verify user can do check stock in pdp page$")
	public void verify_user_can_do_check_stock_in_pdp_page() {
		Assert.assertTrue(pdpPage.verify_user_can_do_check_stock_in_pdp_page());
	}

	@Then("^Verify user can do check Advance check stock in pdp page$")
	public void verify_user_can_do_check_advance_check_stock_in_pdp_page() {
		Assert.assertTrue(pdpPage.verify_user_can_do_check_advance_check_stock_in_pdp_page());
	}

	@Then("^User click BUY NOW button and verify the count increased in cart$")
	public void user_click_buy_now_button_and_verify_the_count_increased_in_cart() throws InterruptedException {
		Assert.assertTrue(pdpPage.user_click_buy_now_button_and_verify_the_count_increased_in_cart());

	}

	@Then("^Verify the product description, tips and ingriedients tabs in PDP$")
	public void verify_the_product_description_tips_and_ingriedients_tabs_in_pdp() throws InterruptedException {
		Assert.assertTrue(pdpPage.verify_the_product_description_tips_and_ingriedients_tabs_in_pdp());
	}

	@And("^User click the product and verify user get navigate to PDP page$")
	public void user_click_the_product_and_verify_user_get_navigate_to_pdp_page() {

		Assert.assertTrue(pdpPage.click_the_first_product_and_navigate_to_PDP());

	}

	@Then("^User should navigate to PLP page successfully$")
	public void user_should_navigate_to_plp_page_successfully() throws InterruptedException {

		Assert.assertTrue(plpPage.verify_user_should_navigate_to_PLP_page());

	}

	@And("^User click \"([^\"]*)\" category on the Home page$")
	public void user_click_something_category_on_the_home_page(String product) throws InterruptedException {

		Assert.assertTrue(plpPage.click_category_from_home_page(product));

	}

	@And("^User click \"([^\"]*)\" category on product from right navigation$")
	public void user_click_something_category_on_product_from_right_navigation(String product)
			throws InterruptedException, IOException {
		Assert.assertTrue(plpPage.click_category_from_right_navigation(product));

	}

	@And("^Verify user able to see grid and small and list view$")
	public void verify_user_able_to_see_grid_and_small_and_list_view() throws InterruptedException, IOException {

		Assert.assertTrue(plpPage.verify_plp_small_grid_view());
		Assert.assertTrue(plpPage.verify_plp_list_view());
		Assert.assertTrue(plpPage.verify_plp_gird_view());

	}

	@And("^Verify user able to filter the product in PLP$")
	public void verify_user_able_to_filter_the_product_in_plp() throws InterruptedException {

		Assert.assertTrue(plpPage.verify_plp_filter());

	}

	@And("^Verify user able to sort the product in PLP$")
	public void verify_user_able_to_sort_the_product_in_plp() throws InterruptedException, IOException {
		Assert.assertTrue(plpPage.verify_plp_sort());

	}

	@And("^Verify user able to search a product base on min and max price$")
	public void verify_user_able_to_search_a_product_base_on_min_and_max_price()
			throws InterruptedException, IOException {
		Assert.assertTrue(plpPage.verify_search_product_with_price());

	}

	// consultation start

	@Then("^User enter text look and feel of your skin on text field$")
	public void user_enter_text_look_and_feel_of_your_skin_on_text_field() {
		Assert.assertTrue(consultationPage.user_enter_text_look_and_feel_of_your_skin_on_text_field());
	}

	@And("^User click start consultation button$")
	public void user_click_start_consultation_button() {
		Assert.assertTrue(consultationPage.user_click_start_consultation_button());
	}

	@And("^User verify the consultation home page$")
	public void user_verify_the_consultation_home_page() {
		Assert.assertTrue(consultationPage.user_verify_the_consultation_home_page());
	}

	@And("^User click servey button on the consultation page$")
	public void user_click_servey_button_on_the_consultation_page() {
		Assert.assertTrue(consultationPage.user_click_servey_button_on_the_consultation_page());
	}

	@And("^User click servey button on the consultation list page$")
	public void user_click_servey_button_on_the_consultation_list_page() {
		Assert.assertTrue(consultationPage.user_click_servey_button_on_the_consultation_list_page());

	}

	@And("^User verify the survey form page$")
	public void user_verify_the_survey_form_page() {
		Assert.assertTrue(consultationPage.user_verify_the_survey_form_page());
	}

	@And("^User click save button to save form$")
	public void user_click_save_button_to_save_form() {
		Assert.assertTrue(consultationPage.user_click_save_button_to_save_form());
	}

	@Then("^User click add button and click start consultation$")
	public void user_click_add_button_and_click_start_consultation() {
		Assert.assertTrue(consultationPage.user_click_add_button_and_click_start_consultation());
	}

	@Then("^User verify is survey form created successfully$")
	public void user_verify_is_survey_form_created_successfully() {
		Assert.assertTrue(consultationPage.user_verify_is_survey_form_created_successfully());
	}

	@Then("^User click update button on survey$")
	public void user_click_update_button_on_survey() {
		Assert.assertTrue(consultationPage.user_click_update_button_on_survey());
	}

	@And("^User get current status of no fo consultation and date$")
	public void user_get_current_status_of_no_fo_consultation_and_date() {
		Assert.assertTrue(consultationPage.user_get_current_status_of_no_fo_consultation_and_date());
	}

	@And("^User click clear all button on survey form$")
	public void user_click_clear_all_button_on_survey_form() {
		Assert.assertTrue(consultationPage.user_click_clear_all_button_on_survey_form());
	}

	@Then("^User click \"([^\"]*)\" button and verify the page$")
	public void user_click_something_button_and_verify_the_page(String strArg1) throws IOException {
		Assert.assertTrue(consultationPage.user_click_something_button_and_verify_the_page(strArg1));
	}

	@And("^User select skin options and click save button$")
	public void user_select_skin_options() {
		Assert.assertTrue(consultationPage.user_select_skin_options());
	}

	@And("^Verify mandatory error messages in the form$")
	public void verify_mandatory_error_messages_in_the_form() {
		Assert.assertTrue(consultationPage.verify_mandatory_error_messages_in_the_form());
	}

	@Then("^User click remove from email check box$")
	public void user_click_remove_from_email_check_box() {
		Assert.assertTrue(consultationPage.user_click_remove_from_email_check_box());
	}

	@Then("^User click build routine button and verify the routine page$")
	public void user_click_build_routine_button_and_verify_the_routine_page() {
		Assert.assertTrue(consultationPage.user_click_build_routine_button_and_verify_the_routine_page());
	}

	@Then("^Verify user selected products and click product types and notes$")
	public void verify_user_selected_products_and_click_product_types_and_notes() {
		Assert.assertTrue(consultationPage.verify_user_selected_products_and_click_product_types_and_notes());
	}

	@Then("^Verify the skincare solution page and click summary$")
	public void verify_the_skincare_solution_page_and_click_summary() {
		Assert.assertTrue(consultationPage.verify_the_skincare_solution_page_and_click_summary());
	}

	@Then("^User click add all to cart button$")
	public void user_click_add_all_to_cart_button() {
		Assert.assertTrue(consultationPage.user_click_add_all_to_cart_button());
	}

	@Then("^User validate added product on the cart$")
	public void user_validate_added_product_on_the_cart() {
		Assert.assertTrue(consultationPage.user_validate_added_product_on_the_cart());
	}

	@And("^User verify the consultation report page$")
	public void user_verify_the_consultation_report_page() {
		Assert.assertTrue(consultationPage.user_verify_the_consultation_report_page());
	}

	@And("^User select the daily routine details$")
	public void user_select_the_daily_routine_details() {
		Assert.assertTrue(consultationPage.user_select_the_daily_routine_details());
	}

	@And("^Verify the cart page$")
	public void verify_the_cart_page() {
		Assert.assertTrue(consultationPage.verify_the_cart_page());
	}

	@And("^User click add or edit button on build routine page$")
	public void user_click_add_or_edit_button_on_build_routine_page() {
		Assert.assertTrue(consultationPage.user_click_add_or_edit_button_on_build_routine_page());
	}

	@Then("^User edit product on build routine select page$")
	public void user_edit_product_on_build_routine_select_page() {
		Assert.assertTrue(consultationPage.user_edit_product_on_build_routine_select_page());
	}

	@And("^User validate edited product on summary page$")
	public void user_validate_edited_product_on_summary_page() {
		Assert.assertTrue(consultationPage.user_validate_edited_product_on_summary_page());
	}

	// home

	@Then("^Verify menu bar items on the home page$")
	public void verify_menu_bar_items_on_the_home_page() throws Throwable {
		Assert.assertTrue(login.verify_menu_bar_items_on_the_home_page());
	}

	@Then("^Verify category items on the home page$")
	public void verify_category_items_on_the_home_page() throws Throwable {
		Assert.assertTrue(login.verify_category_items_on_the_home_page());
	}

	@Then("^Verify topten items on the home page$")
	public void verify_topten_items_on_the_home_page() throws Throwable {
		Assert.assertTrue(login.verify_topten_items_on_the_home_page());
	}

	@Then("^Verify members items on the home page$")
	public void verify_members_items_on_the_home_page() throws Throwable {
		Assert.assertTrue(login.verify_members_items_on_the_home_page());
	}

	@Then("^Verify side navigation items on the home page$")
	public void verify_side_navigation_items_on_the_home_page() throws Throwable {
		Assert.assertTrue(login.verify_side_navigation_items_on_the_home_page());
	}
//settings

	@Then("^User click Language Switch and verify the languages$")
	public void user_click_language_switch_and_verify_the_languages() throws Throwable {
		Assert.assertTrue(settingPage.user_click_language_switch_and_verify_the_languages());
	}

	@Then("^User click Training Manual and verify the document$")
	public void user_click_training_manual_and_verify_the_document() throws Throwable {
		Assert.assertTrue(settingPage.user_click_training_manual_and_verify_the_document());
	}

	@Then("^User click Version Details and verify the details$")
	public void user_click_version_details_and_verify_the_details() throws Throwable {
		Assert.assertTrue(settingPage.user_click_version_details_and_verify_the_details());
	}

	@Then("^User click Technical Assistance Helpline and verify the details$")
	public void user_click_technical_assistance_helpline_and_verify_the_details() throws Throwable {
		Assert.assertTrue(settingPage.user_click_technical_assistance_helpline_and_verify_the_details());
	}

	@Then("^User click Delete Cache or Refresh App and verify$")
	public void user_click_delete_cache_or_refresh_app_and_verify() throws Throwable {
		Assert.assertTrue(settingPage.user_click_delete_cache_or_refresh_app_and_verify());
	}

	@Then("^User click Password Management and verify$")
	public void user_click_password_management_and_verify() throws Throwable {
		Assert.assertTrue(settingPage.user_click_password_management_and_verify());
	}

	@Then("^User enter current password$")
	public void user_enter_current_password() throws Throwable {
		Assert.assertTrue(settingPage.user_enter_current_password());
	}

	@Then("^User enter new password$")
	public void user_enter_new_password() throws Throwable {
		Assert.assertTrue(settingPage.user_enter_new_password());
	}

	@Then("^User enter confirm password$")
	public void user_enter_confirm_password() throws Throwable {
		Assert.assertTrue(settingPage.user_enter_confirm_password());
	}

	@And("^User click setting icon on the right navigation$")
	public void user_click_setting_icon_on_the_right_navigation() throws Throwable {
		Assert.assertTrue(settingPage.user_click_setting_icon_on_the_right_navigation());
	}

	@And("^User click the change password button in Password management and verify the popup$")
	public void user_click_the_change_password_button_in_password_management_and_verify_the_popup() throws Throwable {
		Assert.assertTrue(
				settingPage.user_click_the_change_password_button_in_password_management_and_verify_the_popup());
	}

	@And("^User click cancel button$")
	public void user_click_cancel_button() throws Throwable {
		Assert.assertTrue(settingPage.user_click_cancel_button());
	}

	// gift
	@Then("^User click the Gift button on cart page$")
	public void user_click_the_gift_button_on_cart_page() {
		Assert.assertTrue(giftPage.user_click_the_gift_button_on_cart_page());
	}

	@Then("^User verify the redemption page$")
	public void user_verify_the_redemption_page() {
		Assert.assertTrue(giftPage.user_verify_the_redemption_page());
	}

	@Then("^User click proceed button$")
	public void user_click_proceed_button() {
		Assert.assertTrue(giftPage.user_click_proceed_button());
	}

	@Then("^validate redeem points popup$")
	public void validate_redeem_points_popup() {
		Assert.assertTrue(giftPage.validate_redeem_points_popup());
	}

	@Then("^Verify user can add more gifts from redemption page and validate total and balance points$")
	public void verify_user_can_add_more_gifts_from_redemption_page_and_validate_total_and_balance_points() {
		Assert.assertTrue(
				giftPage.verify_user_can_add_more_gifts_from_redemption_page_and_validate_total_and_balance_points());
	}

	@Then("^validate total items and total points in cart page$")
	public void validate_total_items_and_total_points_in_cart_page() {
		Assert.assertTrue(giftPage.validate_total_items_and_total_points_in_cart_page());
	}

	@And("^User click add to cart button$")
	public void user_click_add_to_cart_button() {
		Assert.assertTrue(giftPage.user_click_add_to_cart_button());
	}

	@And("^Verify the gift product on cart page$")
	public void verify_the_gift_product_on_cart_page() {
		Assert.assertTrue(giftPage.verify_the_gift_product_on_cart_page());
	}

	@And("^Verify points label on Product in Redemption page$")
	public void verify_points_label_on_product_in_redemption_page() {
		Assert.assertTrue(giftPage.verify_points_label_on_product_in_redemption_page());
	}

//voucher 

	@Then("^User click add to cart button on first voucher$")
	public void user_click_add_to_cart_button_on_first_voucher() throws Throwable {
		Assert.assertTrue(voucher.user_click_add_to_cart_button_on_first_voucher());
	}

	@Then("^Validate minimum spent limit popup$")
	public void validate_minimum_spent_limit_popup() throws Throwable {
		Assert.assertTrue(voucher.validate_minimum_spent_limit_popup());
	}

	@Then("^User click add to cart button on second voucher$")
	public void user_click_add_to_cart_button_on_second_voucher() throws Throwable {
		Assert.assertTrue(voucher.user_click_add_to_cart_button_on_second_voucher());
	}

	@Then("^Validate cannot combine voucher popup$")
	public void validate_cannot_combine_voucher_popup() throws Throwable {
		Assert.assertTrue(voucher.validate_cannot_combine_voucher_popup());
	}

	@And("^User click the Voucher Redemption button from right navigation and verify the page$")
	public void user_click_the_voucher_redemption_button_from_right_navigation_and_verify_the_page() throws Throwable {
		Assert.assertTrue(voucher.user_click_the_voucher_redemption_button_from_right_navigation_and_verify_the_page());
	}

	@And("^Verify redeem requst page components$")
	public void verify_redeem_requst_page_components() throws Throwable {
		Assert.assertTrue(voucher.verify_redeem_requst_page_components());
	}

	@And("^User click reedem button$")
	public void user_click_reedem_button() throws Throwable {
		Assert.assertTrue(voucher.user_click_reedem_button());
	}

	// product reservation
	@Then("^User click the reserve button on cart page$")
	public void user_click_the_reserve_button_on_cart_page() throws Throwable {
		Assert.assertTrue(reservation.user_click_the_reserve_button_on_cart_page());
	}

	@Then("^User enter the reservation id$")
	public void user_enter_the_reservation_id() throws Throwable {
		Assert.assertTrue(reservation.user_enter_the_reservation_id());
	}

	@Then("^User validate generic customer popup and click proceed button$")
	public void user_validate_generic_customer_popup_and_click_proceed_button() throws Throwable {
		Assert.assertTrue(reservation.user_validate_generic_customer_popup_and_click_proceed_button());
	}

	@Then("^Validate product reservation success popup$")
	public void validate_product_reservation_success_popup() throws Throwable {
		Assert.assertTrue(reservation.validate_product_reservation_success_popup());
	}

	@And("^User click add to cart button from PLP page$")
	public void user_click_add_to_cart_button_from_plp_page() throws Throwable {
		Assert.assertTrue(reservation.user_click_add_to_cart_button_from_plp_page());
	}

	@And("^Varify the reservation id popup$")
	public void varify_the_reservation_id_popup() throws Throwable {
		Assert.assertTrue(reservation.varify_the_reservation_id_popup());
	}

	/// service booking
	@Then("^Verify the upcoming bookings page$")
	public void verify_the_upcoming_bookings_page() throws Throwable {
		Assert.assertTrue(service.verify_the_upcoming_bookings_page());
	}

	@Then("^User click refresh button and it should navigate to list page$")
	public void user_click_refresh_button_and_it_should_navigate_to_list_page() throws Throwable {
		Assert.assertTrue(service.user_click_refresh_button_and_it_should_navigate_to_list_page());
	}

	@Then("^User click Customers button and validate customer list page$")
	public void user_click_customers_button_and_validate_customer_list_page() throws Throwable {
		Assert.assertTrue(service.user_click_customers_button_and_validate_customer_list_page());
	}

	@Then("^Verifty the customer details$")
	public void verifty_the_customer_details() throws Throwable {
		Assert.assertTrue(service.verifty_the_customer_details());
	}

	@And("^User click calendar button on upcoming booking page$")
	public void user_click_calendar_button_on_upcoming_booking_page() throws Throwable {
		Assert.assertTrue(service.user_click_calendar_button_on_upcoming_booking_page());
	}

	@And("^User click first customer on the list$")
	public void user_click_first_customer_on_the_list() throws Throwable {
		Assert.assertTrue(service.user_click_first_customer_on_the_list());
	}

	@And("^User click all bookings button and verify the list page$")
	public void user_click_all_bookings_button_and_verify_the_list_page() throws Throwable {
		Assert.assertTrue(service.user_click_all_bookings_button_and_verify_the_list_page());
	}

}
