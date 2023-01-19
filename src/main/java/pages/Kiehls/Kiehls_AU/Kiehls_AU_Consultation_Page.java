package pages.Kiehls.Kiehls_AU;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.reusableMethods.CommonActions;
import com.utilities.ConfigReader;
import com.utilities.ExtentReport;
import com.utilities.LocatorManager;
import com.utilities.ExcelData;
import com.utilities.Screenshots;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_Consultation_Page extends CommonActions {

	AppiumDriver driver;

	ConfigReader config = new ConfigReader();
	LocatorManager locator = new LocatorManager();
	static boolean consultationPageSkipMode;

	public Kiehls_AU_Consultation_Page(AppiumDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public boolean user_enter_text_look_and_feel_of_your_skin_on_text_field() {
		try {
			waitUntil("master_survey_text_view_1");
			sendkeys("master_survey_text_view_1", ExcelData.getExcelData("customer_testdata", "sample_text"));
			waitUntil("master_survey_form_page");

			click("master_survey_form_page");

			return true;

		} catch (Exception e) {
			return false;

		}
	}

	public boolean user_click_start_consultation_button() {
		try {
			
			waitUntilElementVisibleAndClick("master_start_consultation_button");

			return true;

		} catch (Exception e) {
			return false;

		}
	}

	public boolean user_verify_the_consultation_home_page() {
		try {

			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {
				if (ConfigReader.getData("app").equals("Kiehls")) {
					try {
						waitUntil("master_consultation_page");

						return true;

					} catch (Exception e) {
						waitUntil("master_consultation_page_with_member");
						return true;

					}
				} else if (ConfigReader.getData("app").equals("Lancome")) {
					try {
						waitUntil("master_consultation_page");

						return true;

					} catch (Exception e) {
						waitUntil("master_consultation_page_with_member");
						return true;

					}
				} else if (ConfigReader.getData("app").equals("Armani")) {
					try {
						waitUntil("master_consultation_page");

						return true;

					} catch (Exception e) {
						waitUntil("master_consultation_page_with_member");
						// webdriverwait(driver
						// .findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Healthy Skin
						// Check\"]")));
						return true;

					}
				}

			}
			case "PROD": {
				return true;

			}

			default: {
			}
				return false;

			}

		} catch (Exception e) {
			return false;

		}
	}

	public boolean user_click_servey_button_on_the_consultation_page() {
		try {
			waitUntil("master_survey_button");
			click("master_survey_button");

			return true;

		} catch (Exception e) {
			return false;

		}
	}

	public boolean user_verify_the_survey_form_page() {
		try {
			waitUntil("master_survey_form_page");
			return true;

		} catch (Exception e) {
			return false;

		}
	}

	public boolean user_click_save_button_to_save_form() {
		try {

			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {

				waitUntil("master_consultation_save_button");
				click("master_consultation_save_button");
				return true;
			}
			case "PROD": {

			}

			default: {
			}
				return false;

			}

		} catch (Exception e) {
			return false;

		}
	}

	public boolean user_click_add_button_and_click_start_consultation() {
		try {
			waitUntil("master_add_consultation_button");
			click("master_add_consultation_button");
			waitUntil("master_start_consultation_member_button");
			click("master_start_consultation_member_button");

			return true;

		} catch (Exception e) {
			return false;

		}
	}

	public boolean user_click_update_button_on_survey() {
		try {
			waitUntil("master_update_button");
			click("master_update_button");
			return true;

		} catch (Exception e) {
			return false;

		}
	}

	public static String consultation_count_status_value;

	public boolean user_get_current_status_of_no_fo_consultation_and_date() {
		try {
			waitUntil("master_consultation_count_status_text");
			consultation_count_status_value = gettext("master_consultation_count_status_text");
			System.out.println(consultation_count_status_value + " 1");
			return true;

		} catch (Exception e) {
			return false;

		}
	}

	public boolean user_verify_is_survey_form_created_successfully() {
		try {
			waitUntil("master_consultation_count_status_text");

			System.out.println(gettext("master_consultation_count_status_text") + " 2");

			if (!gettext("master_consultation_count_status_text").equals(consultation_count_status_value)) {

				return true;
			} else {
				return false;

			}

		} catch (Exception e) {
			return false;

		}

	}

	public boolean user_click_clear_all_button_on_survey_form() {
		try {
			waitUntil("master_clear_all_button");
			click("master_clear_all_button");
			waitUntil("master_clear_all_proceed_button");
			click("master_clear_all_proceed_button");

			return true;

		} catch (Exception e) {
			return false;

		}
	}

	public boolean user_click_something_button_and_verify_the_page(String con) throws IOException {

		try {
			String locator = "//XCUIElementTypeStaticText[@name=\"" + con + "\"]";

			if (con.equals("Survey")) {
				driver.findElement(By.xpath(locator)).click();
				waitUntil("master_clear_all_button");
				return true;

			} else if (con.equals("SkinCare")) {
				driver.findElement(By.xpath(locator)).click();

				Thread.sleep(3000);

				if (webElement("master_save_button").isDisplayed()) {
					consultationPageSkipMode = false;
					return true;

				} else {
					consultationPageSkipMode = true;
					return true;

				}

			} else {
				return false;

			}

		} catch (Exception e) {
			return false;

		}
	}

	public boolean user_select_skin_options() {
		try {

			switch (ConfigReader.getData("appEnv")) {
			case "UAT": {

				if (consultationPageSkipMode == false) {

					// swipeScreenUntilElementVisible("master_consultation_skincare_very_frequently",
					// Direction.UP);
					// click("master_consultation_skincare_very_frequently");

					swipeScreenUntilElementVisible("master_consultation_skincare_combination1", Direction.UP);
					click("master_consultation_skincare_combination1");

					swipeScreenUntilElementVisible("master_consultation_skincare_eye_cream", Direction.UP);
					click("master_consultation_skincare_toner");
					click("master_consultation_skincare_eye_cream");
					click("master_consultation_skincare_sunscreen");

					swipeScreenUntilElementVisible("master_consultation_skincare_peer", Direction.UP);
					click("master_consultation_skincare_peer");

					// swipeScreenUntilElementVisible("master_consultation_skincare_hairspray",
					// Direction.UP);
					// click("master_consultation_skincare_hairspray");

					// swipeScreenUntilElementVisible("master_consultation_skincare_textview1",
					// Direction.UP);
					// sendkeys("master_consultation_skincare_textview1",ExcelData.getExcelData("customer_testdata",
					// "sample_text"));
					// click("master_consultation_skincare_header");

					// swipeScreenUntilElementVisible("master_consultation_skincare_combination2",
					// Direction.UP);
					// click("master_consultation_skincare_combination2");

					// swipeScreenUntilElementVisible("master_consultation_skincare_textview2",
					// Direction.UP);
					// sendkeys("master_consultation_skincare_textview2",
					// ExcelData.getExcelData("customer_testdata", "sample_text"));
					// click("master_consultation_skincare_header");

					swipeScreenUntilElementVisible("master_consultation_skincare_tzone", Direction.UP);
					click("master_consultation_skincare_tzone");
					click("master_consultation_skincare_cheeks");

					click("master_save_button");
					return true;

				} else if (consultationPageSkipMode == true) {
					click("master_skip_button");

					Thread.sleep(1000);
					click("master_skip_button");

					Thread.sleep(1000);
					click("master_skip_button");

					waitUntil("master_consultation_skincare_combination1");
					click("master_consultation_skincare_combination1");

					waitUntil("master_next_button");
					click("master_next_button");

					Thread.sleep(1000);
					click("master_skip_button");

					waitUntil("master_consultation_skincare_toner");
					click("master_consultation_skincare_toner");
					click("master_consultation_skincare_eye_cream");
					click("master_consultation_skincare_sunscreen");

					click("master_next_button");

					waitUntil("master_consultation_skincare_peer");
					click("master_consultation_skincare_peer");

					click("master_next_button");

					Thread.sleep(1000);
					click("master_skip_button");
					Thread.sleep(1000);
					click("master_skip_button");
					Thread.sleep(1000);
					click("master_skip_button");
					Thread.sleep(1000);
					click("master_skip_button");
					Thread.sleep(1000);
					click("master_skip_button");

					waitUntil("master_consultation_skincare_tzone");
					click("master_consultation_skincare_tzone");
					click("master_consultation_skincare_cheeks");

					waitUntil("master_submit_button");
					click("master_submit_button");

					return true;
				} else {
					return false;

				}
			}
			case "PROD": {
				return true;

			}

			default: {
			}
				return false;

			}

		} catch (Exception e) {
			return false;

		}
	}

	public boolean verify_mandatory_error_messages_in_the_form() {
		try {
			click("master_save_button");
			waitUntil("master_consultation_skincare_mandatory_error1");
			click("master_consultation_skincare_combination1");

			click("master_save_button");
			waitUntil("master_consultation_skincare_mandatory_error2");
			click("master_consultation_skincare_toner");
			click("master_consultation_skincare_eye_cream");
			click("master_consultation_skincare_sunscreen");

			click("master_save_button");
			waitUntil("master_consultation_skincare_mandatory_error3");
			click("master_consultation_skincare_peer");

			click("master_save_button");
			waitUntil("master_consultation_skincare_mandatory_error4");
			click("master_consultation_skincare_tzone");
			click("master_consultation_skincare_cheeks");

			click("master_save_button");

			return true;

		} catch (Exception e) {
			return false;

		}

	}

	public void test() {

	}

	public boolean user_click_remove_from_email_check_box() {
		try {

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean user_click_build_routine_button_and_verify_the_routine_page() {
		try {

			waitUntil("master_consultation_broutine_button");
			click("master_consultation_broutine_button");
			waitUntil("master_consultation_broutine_profile_title");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean verify_user_selected_products_and_click_product_types_and_notes() {
		try {
			waitUntil("master_next_button");

			waitUntil("master_consultation_broutine_newlabal_product1");
			waitUntil("master_consultation_broutine_curlabal_product3");

			click("master_consultation_broutine_markallcurrent_button");
			waitUntil("master_consultation_broutine_1curlabal_product1");

			click("master_consultation_broutine_day_button");
			sendkeys("master_consultation_broutine_addnote1", "SampleNote");

			click("master_consultation_broutine_night_button");
			click("master_consultation_broutine_dayandnight_button");

			click("master_next_button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean verify_the_skincare_solution_page_and_click_summary() {
		try {
			waitUntil("master_consultation_broutine_summary_button");
			click("master_consultation_broutine_summary_button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean user_click_add_all_to_cart_button() {
		try {
			swipeScreenUntilElementVisible("master_consultation_broutine_addalltocart_button", Direction.UP);
			click("master_consultation_broutine_addalltocart_button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean user_validate_added_product_on_the_cart() {
		try {

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean user_verify_the_consultation_report_page() {

		try {

			waitUntil("master_consultation_broutine_title");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean user_select_the_daily_routine_details() {
		try {

			waitUntil("master_consultation_broutine_form_title");

			// 1
			waitUntil("master_consultation_broutine_add_product_button1");
			click("master_consultation_broutine_add_product_button1");

			waitUntil("master_consultation_broutine_add_product11");
			click("master_consultation_broutine_add_product11");

			// 2
			waitUntil("master_consultation_broutine_add_product_button2");
			click("master_consultation_broutine_add_product_button2");

			waitUntil("master_consultation_broutine_add_product21");
			click("master_consultation_broutine_add_product21");

			// 3
			swipeScreenUntilElementVisible("master_consultation_broutine_add_product_button3", Direction.UP);
			waitUntil("master_consultation_broutine_add_product_button3");
			click("master_consultation_broutine_add_product_button3");

			waitUntil("master_consultation_broutine_add_product31");
			click("master_consultation_broutine_add_product31");
			Thread.sleep(300);
			click("master_consultation_broutine_add_product31");

			// save
			waitUntil("master_save_button");
			click("master_save_button");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean verify_the_cart_page() {
		try {
			waitUntil("master_checkout_button");

			waitUntil("master_checkout_product_count_text1");
			waitUntil("master_checkout_product_count_text2");
			waitUntil("master_checkout_product_count_text3");
			waitUntil("master_checkout_product_totalitem_text");

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

}