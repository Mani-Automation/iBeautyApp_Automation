package pages.Kiehls.Kiehls_AU;

import java.io.IOException;

import org.apache.tools.ant.ExitStatusException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.reusableMethods.CommonActions;
import com.utilities.ConfigReader;
import com.utilities.ExcelData;
import com.utilities.LocatorManager;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_PLP_Page extends CommonActions {
	AppiumDriver driver;
	LocatorManager locator = new LocatorManager();

	public Kiehls_AU_PLP_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

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

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"gridViewButton\"]")
	public WebElement plp_gird_button;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"listViewButton\"]")
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

	public boolean click_category_from_home_page() throws InterruptedException {

		try {

			waitUntilElementVisibleAndClick("master_skincare_button");

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_user_should_navigate_to_PLP_page() throws InterruptedException {
		try {
			waitUntil("master_plp_sort_button");
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean click_category_from_right_navigation() throws InterruptedException, IOException {

		waitUntilElementVisibleAndClick("master_home_products");

		waitUntilElementVisibleAndClick("master_cellvalue_0");
//   //XCUIElementTypeCell[@name="cell_0"]/XCUIElementTypeButton

		return true;
	}

	public boolean verify_plp_small_grid_view() throws InterruptedException, IOException {
		Thread.sleep(3000);
		waitUntil("master_plp_small_gird_button");
		click("master_plp_small_gird_button");
		System.out.println("small :" + plp_add_to_cart_button_1st_position.getSize());
///small :(100, 18)

		return true;

	}

	public boolean verify_plp_list_view() throws InterruptedException {
		plp_list_view_button.click();
		Thread.sleep(2000);
		System.out.println("list :" + plp_add_to_cart_button_1st_position.getSize());
		return true;

	}

	public boolean verify_plp_gird_view() throws InterruptedException {
		plp_gird_button.click();
		Thread.sleep(2000);
		System.out.println("grid :" + plp_add_to_cart_button_1st_position.getSize());
		return true;

	}

	public boolean verify_search_product_with_price() throws InterruptedException, IOException {

		String product_name1 = ExcelData.getExcelData("plp_pdp_testdata", "product1");

		sendkeys("master_plp_search_product_text", product_name1);

		waitUntilElementVisibleAndClick("master_plp_first_product");

		waitUntil("master_pdp_product_name");

		return true;

	}

	public boolean verify_plp_filter() throws InterruptedException {
		try {

			Thread.sleep(3000);

			waitUntilElementVisibleAndClick("master_plp_filter_button");

			waitUntil("master_plp_by_sub_catagory");

			return true;

		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_plp_sort() throws InterruptedException, IOException {

		waitUntil("master_plp_sort_button");

		String before_do = driver.findElement(By.xpath(locator.getData("master_plp_first_product_price_label")))
				.getText();
		click("master_plp_sort_button");

		if (!driver.findElement(By.xpath(locator.getData("master_plp_first_product_price_label"))).getText()
				.equals(before_do)) {

			return true;

		} else {

			System.out.println("Only one product exsist or product not found in PLP");

			return false;
		}

	}

	public boolean user_click_check_other_stores_button_on_plp_and_verfiy_the_popup() {
		try {

			waitUntilElementVisibleAndClick("master_pdp_adv_check_stock_button");

			waitUntil("master_check_stock_popup");

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean user_enter_store_name_to_find_the_store() {
		try {

			String seg = ConfigReader.getData("app_segment").toString();
			String app = ConfigReader.getData("app").toString();

			if (app.equals("Kiehls")) {
				sendkeys("master_check_stock_search_text_field", "KIEHL'S HQ");
				Thread.sleep(2000);
			} else {

			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_the_selected_store_on_the_popup() {
		try {
			String seg = ConfigReader.getData("app_segment").toString();
			String app = ConfigReader.getData("app").toString();

			if (app.equals("Kiehls")) {

				waitUntilElementVisibleAndClick("master_popup_closeicon_button");
			} else {

			}

			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

}
