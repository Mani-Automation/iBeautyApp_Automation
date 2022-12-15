package pages.Kiehls.Kiehls_AU;

import java.io.IOException;

import org.apache.tools.ant.ExitStatusException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.reusableMethods.CommonActions;
import com.utilities.ExtentReport;
import com.utilities.LocatorManager;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_PLP_Page extends CommonActions {
	AppiumDriver driver;

	public Kiehls_AU_PLP_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// menu

	// skincare
	// (//XCUIElementTypeCell[@name="cell_0"])[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]
	// Body
	// (//XCUIElementTypeCell[@name="cell_0"])[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]
	// men
	// (//XCUIElementTypeCell[@name="cell_0"])[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]
	// Hair
	// (//XCUIElementTypeCell[@name="cell_0"])[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]

	// right side navigation
	// product btn
	// //XCUIElementTypeTable[@name="sideMenuTbl"]/XCUIElementTypeButton[5]
	// skincare //XCUIElementTypeApplication[@name="Kiehls
	// UAT"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton
	// body //XCUIElementTypeApplication[@name="Kiehls
	// UAT"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton
	// men
	// hair
	// pet
	// others
	// gifts

	// plp
	// min price //XCUIElementTypeApplication[@name="Kiehls
	// UAT"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]
	// 4 gird //XCUIElementTypeButton[@name="GridIcon"]
	// 4-1 add to cart (//XCUIElementTypeButton[@name="addToCartButton"])[1]
	// 9 gird //XCUIElementTypeButton[@name="SmallGridIcon"]
	// 9-1 addcart (//XCUIElementTypeStaticText[@name="ADD TO CART"])[1]
	// list //XCUIElementTypeButton[@name="ListIcon"]
	// list 10+addtocart (//XCUIElementTypeButton[@name="addToCartButton"])[1]

	// filter //XCUIElementTypeButton[@name="btnFilter"]
	// sort //XCUIElementTypeButton[@name="btnSort"]

	// min price input (//XCUIElementTypeTextField[@name="txtPrice"])[1]
	// max price input (//XCUIElementTypeTextField[@name="txtPrice"])[2]
	// search product //XCUIElementTypeTextField[@name="txtProduct"]

	// plp menu
	// skincare //XCUIElementTypeStaticText[@name="Skincare"] or
	// (//XCUIElementTypeCell[@name="cell_0"])[1]/XCUIElementTypeOther
	// body //XCUIElementTypeStaticText[@name="Body"] or
	// (//XCUIElementTypeCell[@name="cell_1"])[1]/XCUIElementTypeOther

	// gird

	// @FindBy(xpath = "")
	// public WebElement plp_small_gird_button;

	// filter
	// by sub cat
	// //XCUIElementTypeTable[@name="tblCategory"]/XCUIElementTypeButton[1]
	// by cus concern
	// //XCUIElementTypeTable[@name="tblCategory"]/XCUIElementTypeButton[2]
	// by product line
	// //XCUIElementTypeTable[@name="tblCategory"]/XCUIElementTypeButton[3]
	// sub-facewash //XCUIElementTypeStaticText[@name="Face Wash"] or
	// (//XCUIElementTypeCell[@name="cell_0"])[2]
	// grid first product name
	// (//XCUIElementTypeCell[@name="cell_0"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]
	// search result //XCUIElementTypeStaticText[@name="Search results for"]

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"tblCategory\"]/XCUIElementTypeButton[1]")
	public WebElement plp_filter_by_sub_category;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"tblCategory\"]/XCUIElementTypeButton[2]")
	public WebElement plp_filter_by_customer_concern;

	@FindBy(xpath = "//XCUIElementTypeTable[@name=\"tblCategory\"]/XCUIElementTypeButton[3]")
	public WebElement plp_filter_by_product_line;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Face Wash\"]")
	public WebElement plp_filter_by_sub_category_facewash;

	@FindBy(xpath = "(//XCUIElementTypeCell[@name=\"cell_0\"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	public WebElement plp_first_product_name;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Search results for\"]")
	public WebElement plp_search_product_result_text;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"btnSort\"]")
	public WebElement plp_sort_button;

	@FindBy(xpath = "(//XCUIElementTypeTextField[@name=\"txtPrice\"])[1]")
	public WebElement plp_min_price_input;

	@FindBy(xpath = "(//XCUIElementTypeTextField[@name=\"txtPrice\"])[2]")
	public WebElement plp_max_price_input;

	@FindBy(xpath = "//XCUIElementTypeTextField[@name=\"txtProduct\"]")
	public WebElement plp_search_product_input;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Search results for\"]")
	public WebElement plp_product_search_result_text;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"SmallGridIcon\"]")
	public WebElement plp_small_gird_button;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"GridIcon\"]")
	public WebElement plp_gird_button;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"ListIcon\"]")
	public WebElement plp_list_view_button;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"ADD TO CART\"])[1]")
	public WebElement plp_add_to_cart_button_1st_position;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"addToCartButton\"])[1]")
	public WebElement plp_add_to_cart_button_1st_position_2;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"ADD TO CART\"])[10]")
	public WebElement plp_add_to_cart_button_10th_position;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"addToCartButton\"])[10]")
	public WebElement plp_add_to_cart_button_10th_position_2;

	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"ADD TO CART\"])[12]")
	public WebElement plp_add_to_cart_button_12th_position;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"addToCartButton\"])[12]")
	public WebElement plp_add_to_cart_button_12th_position_2;
	//
	@FindBy(xpath = "(//XCUIElementTypeCell[@name=\"cell_0\"])[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]")
	public WebElement home_product_skincare;

	@FindBy(xpath = "(//XCUIElementTypeCell[@name=\"cell_0\"])[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]")
	public WebElement home_product_body;

	@FindBy(xpath = "(//XCUIElementTypeCell[@name=\"cell_0\"])[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]")
	public WebElement home_product_men;

	@FindBy(xpath = "(//XCUIElementTypeCell[@name=\"cell_0\"])[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]")
	public WebElement home_product_hair;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"menubutton\"]")
	public WebElement right_navigation_menu;

	// @FindBy(xpath =
	// "//XCUIElementTypeTable[@name=\"sideMenuTbl\"]/XCUIElementTypeButton[5]")
	@FindBy(xpath = "(//XCUIElementTypeTable[@name=\"Empty list\"])[1]/XCUIElementTypeOther[5]")
	public WebElement right_navigation_product_button;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeButton")
	public WebElement right_navigation_product_skincare;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeButton")
	public WebElement right_navigation_product_body;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeButton")
	public WebElement right_navigation_product_men;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeButton")
	public WebElement right_navigation_product_hair;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeButton")
	public WebElement right_navigation_product_pet;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeButton")
	public WebElement right_navigation_product_others;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[5]/XCUIElementTypePopover/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeButton")
	public WebElement right_navigation_product_gift;

//verify plp page

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"From\"]")
	public WebElement plp_min_price;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"btnFilter\"]")
	public WebElement plp_filter_button;

	public boolean click_category_from_home_page(String product) throws InterruptedException {

		try {
			

			if (product.equalsIgnoreCase("Skincare")) {
				home_product_skincare.click();
				reportStatusPASS("User clicked Skincare category on the Home page");
				return true;

			} else if (product.equalsIgnoreCase("Body")) {
				home_product_body.click();
				reportStatusPASS("User clicked Body category on the Home page");

				return true;

			} else if (product.equalsIgnoreCase("Men")) {
				home_product_men.click();
				reportStatusPASS("User clicked Men category on the Home page");

				return true;

			} else if (product.equalsIgnoreCase("Hair")) {
				home_product_hair.click();
				reportStatusPASS("User clicked Hair category on the Home page");

				return true;

			} else {
				System.out.println("Please check category name!. ie : Skincare/Body/Men/Hair");
				reportStatusFAIL("Please check category name!. ie : Skincare/Body/Men/Hair");
				Assert.assertFalse(false);
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
		}
		return false;
	}

	public boolean verify_user_should_navigate_to_PLP_page() throws InterruptedException {
		try {
			webdriverwait(plp_min_price);
			if (plp_min_price.isDisplayed()) {

				reportStatusPASS("User successfully navigate to PLP");

				return true;
			} else {
				return false;

			}

		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
		}
		return false;

	}

	public boolean click_category_from_right_navigation(String product) throws InterruptedException {

		// XCUIElementTypeButton[@name="menubutton"]

		Thread.sleep(3000);
		right_navigation_product_button.click();
		Thread.sleep(2000);

		if (product.equalsIgnoreCase("Skincare")) {
			right_navigation_product_skincare.click();
			reportStatusPASS("User clicked " + product + " category from right navigation");
			return true;

		} else if (product.equalsIgnoreCase("Body")) {
			right_navigation_product_body.click();
			reportStatusPASS("User clicked Body category from right navigation");
			reportStatusPASS("User clicked " + product + " category from right navigation");
			return true;

		} else if (product.equalsIgnoreCase("Men")) {
			right_navigation_product_men.click();
			reportStatusPASS("User clicked " + product + " category from right navigation");

			return true;

		} else if (product.equalsIgnoreCase("Hair")) {
			right_navigation_product_hair.click();
			reportStatusPASS("User clicked " + product + " category from right navigation");

			return true;

		} else if (product.equalsIgnoreCase("Pet")) {
			right_navigation_product_pet.click();
			reportStatusPASS("User clicked " + product + " category from right navigation");

			return true;

		} else if (product.equalsIgnoreCase("Others")) {
			right_navigation_product_others.click();
			reportStatusPASS("User clicked " + product + " category from right navigation");

			return true;

		} else if (product.equalsIgnoreCase("Gift")) {
			right_navigation_product_gift.click();
			reportStatusPASS("User clicked " + product + " category from right navigation");

			return true;

		} else {
			System.out.println("Please check category name!. ie : Skincare/Body/Men/Hair/Pet/Others/Gift");
			reportStatusFAIL("Please check category name!. ie : Skincare/Body/Men/Hair/Pet/Others/Gift");

			return false;
		}
	}

	public boolean verify_plp_small_grid_view() throws InterruptedException {
		plp_small_gird_button.click();
		Thread.sleep(2000);
		if ((plp_add_to_cart_button_1st_position.isDisplayed() || plp_add_to_cart_button_1st_position_2.isDisplayed())
				&& (plp_add_to_cart_button_12th_position.isDisplayed()
						|| plp_add_to_cart_button_12th_position_2.isDisplayed())) {
			reportStatusPASS("User able to see Small grid view on the PLP");

			return true;
		} else {
			reportStatusFAIL("false - Small grid");
			return false;
		}

	}

	public boolean verify_plp_list_view() throws InterruptedException {
		plp_list_view_button.click();
		Thread.sleep(2000);
		if ((plp_add_to_cart_button_1st_position.isDisplayed() || plp_add_to_cart_button_1st_position_2.isDisplayed())
				&& (plp_add_to_cart_button_10th_position.isDisplayed()
						|| plp_add_to_cart_button_10th_position_2.isDisplayed())) {
			reportStatusPASS("User able to see List view on the PLP");

			return true;
		} else {
			reportStatusFAIL("false - List view");

			return false;
		}

	}

	public boolean verify_plp_gird_view() throws InterruptedException {
		plp_gird_button.click();
		Thread.sleep(2000);
		if ((plp_add_to_cart_button_1st_position.isDisplayed() || plp_add_to_cart_button_1st_position_2.isDisplayed())
				&& (plp_add_to_cart_button_10th_position.isDisplayed()
						|| plp_add_to_cart_button_10th_position_2.isDisplayed())) {
			reportStatusPASS("User able to see Grid view on the PLP");

			return true;
		} else {
			reportStatusFAIL("false - Grid");

			return false;
		}

	}

	public boolean verify_search_product_with_price() throws InterruptedException {
		webdriverwait(plp_first_product_name);
		String before_do = plp_first_product_name.getText().toString();
		System.out.println(before_do);
		webdriverwait(plp_min_price_input);

		plp_min_price_input.click();
		plp_min_price_input.clear();
		plp_min_price_input.sendKeys("1");
		reportStatusPASS("User entered Minimum price to search the product on PLP");

		Thread.sleep(1000);
		plp_max_price_input.click();
		plp_max_price_input.clear();
		plp_max_price_input.sendKeys("20");
		reportStatusPASS("User entered Maximum price to search the product on PLP");

		webdriverwait(plp_product_search_result_text);
		if (plp_product_search_result_text.isDisplayed()
				&& !before_do.equals(plp_first_product_name.getText().toString())) {

			reportStatusPASS("Verified user able to search the Product with Min & Max price on the PLP");

			return true;
		}

		else {
			reportStatusFAIL("false - Min and Max Price");
			return false;
		}
	}

	public boolean verify_plp_filter() throws InterruptedException {
		try {
			webdriverwait(plp_filter_button);
			plp_filter_button.click();

			reportStatusPASS("User clicked filter button on the PLP");
			Thread.sleep(2000);
			webdriverwait(plp_filter_by_sub_category_facewash);
			if (plp_filter_by_sub_category_facewash.isDisplayed()) {
				String before_do = plp_first_product_name.getText().toString();
				System.out.println(before_do);
				System.out.println("1copy");
				plp_filter_by_sub_category_facewash.click();
				System.out.println("face wash clicked");

				Thread.sleep(3000);
				if (!before_do.equals(plp_first_product_name.getText().toString())) {
					System.out.println(plp_first_product_name.getText());
					reportStatusPASS("Verified user able to filter the Product on the PLP");
					return true;

				}

			} else {
				reportStatusFAIL("false - filter");
				return false;
			}
			return false;

		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_plp_sort() throws InterruptedException {

		String before_do = plp_first_product_name.getText().toString();

		plp_sort_button.click();
		reportStatusPASS("User clicked Sort button on the PLP");

		Thread.sleep(2000);

		if (!before_do.equals(plp_first_product_name.getText().toString())) {
			reportStatusPASS("Verified user able to Sort the Product on the PLP");

			return true;

		}

		else {
			reportStatusFAIL("false - Sort");

			return false;
		}

	}

}