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

			if (getApplicationName().equals("Valentino")) {
				product = "Makeup";
			}

			if (product.equalsIgnoreCase("Skincare")) {

				waitUntilElementVisibleAndClick("master_skincare_button");
				return true;

			} else if (product.equalsIgnoreCase("Body")) {

				waitUntilElementVisibleAndClick("master_body_button");
				return true;

			} else if (product.equalsIgnoreCase("Men")) {

				waitUntilElementVisibleAndClick("master_men_button");
				return true;

			} else if (product.equalsIgnoreCase("Hair")) {

				waitUntilElementVisibleAndClick("master_hair_button");
				return true;

			} else if (product.equalsIgnoreCase("Makeup")) {

				waitUntilElementVisibleAndClick("master_home_product_category2");
				return true;

			} else {
				System.out.println("Please check category name!. ie : Skincare/Body/Men/Hair");
				Assert.assertFalse(false);
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();

			return false;

		}
	}

	public boolean verify_user_should_navigate_to_PLP_page() throws InterruptedException {
		try {
			waitUntil("master_plp_small_gird_button");
			return true;
		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}

	}

	public boolean click_category_from_right_navigation(String product) throws InterruptedException, IOException {

		waitUntilElementVisibleAndClick("master_home_products");

		if (getApplicationName().equals("Valentino")) {
			product = "Fragrance";
		}

		if (product.equalsIgnoreCase("Skincare")) {

			String application = ConfigReader.getData("app").toString();

			if (application.equals("Kiehls") || application.equals("Valentino")) {
				waitUntilElementVisibleAndClick("master_right_nav_skincare_button");

				return true;
			} else if (application.equals("Lancome")) {
				waitUntilElementVisibleAndClick("master_right_nav_skincare_button");

				return true;
			} else {
				return false;
			}

		} else if (product.equalsIgnoreCase("Body")) {
			right_navigation_product_body.click();

			return true;

		} else if (product.equalsIgnoreCase("Men")) {
			right_navigation_product_men.click();

			return true;

		} else if (product.equalsIgnoreCase("Hair")) {
			right_navigation_product_hair.click();

			return true;

		} else if (product.equalsIgnoreCase("Pet")) {
			right_navigation_product_pet.click();

			return true;

		} else if (product.equalsIgnoreCase("Others")) {
			right_navigation_product_others.click();

			return true;

		} else if (product.equalsIgnoreCase("Gift")) {
			right_navigation_product_gift.click();

			return true;

		} else if (product.equalsIgnoreCase("Fragrance")) {

			waitUntilElementVisibleAndClick("master_right_nav_fragrance_button");
			return true;

		} else if (product.equalsIgnoreCase("Redemption")) {
			// HK, KR, TW, JP
			String segment = ConfigReader.getData("app_segment").toString();
			if (segment.equals("HK") || segment.equals("KR") || segment.equals("TW") || segment.equals("JP")) {
				waitUntilElementVisibleAndClick("master_right_nav_redemption_button");

				return true;
			} else {
				return true;
			}

		} else {
			System.out.println("Please check category name!. ie : Skincare/Body/Men/Hair/Pet/Others/Gift");

			return false;
		}
	}

	public boolean verify_plp_small_grid_view() throws InterruptedException, IOException {

		waitUntil("master_plp_small_gird_button");
		click("master_plp_small_gird_button");

		if ((plp_add_to_cart_button_1st_position.isDisplayed() || plp_add_to_cart_button_1st_position_2.isDisplayed())
				&& (plp_add_to_cart_button_12th_position.isDisplayed()
						|| plp_add_to_cart_button_12th_position_2.isDisplayed())) {

			return true;
		} else {
			return false;
		}

	}

	public boolean verify_plp_list_view() throws InterruptedException {
		plp_list_view_button.click();
		Thread.sleep(2000);
		if ((plp_add_to_cart_button_1st_position.isDisplayed() || plp_add_to_cart_button_1st_position_2.isDisplayed())
				&& (plp_add_to_cart_button_10th_position.isDisplayed()
						|| plp_add_to_cart_button_10th_position_2.isDisplayed())) {

			return true;
		} else {

			return false;
		}

	}

	public boolean verify_plp_gird_view() throws InterruptedException {
		plp_gird_button.click();
		Thread.sleep(2000);
		if ((plp_add_to_cart_button_1st_position.isDisplayed() || plp_add_to_cart_button_1st_position_2.isDisplayed())
				&& (plp_add_to_cart_button_10th_position.isDisplayed()
						|| plp_add_to_cart_button_10th_position_2.isDisplayed())) {

			return true;
		} else {

			return false;
		}

	}

	public boolean verify_search_product_with_price() throws InterruptedException, IOException {

		String product_name1 = "SP EYE GEL 15ML";

		if (getApplicationName().equals("Valentino")) {
			product_name1 = "VLTN ROSSO MATTE 107A";
		}

		sendkeys("master_plp_search_product_text", product_name1);

		waitUntilElementVisibleAndClick("master_plp_first_product");

		waitUntil("master_pdp_product_name");

		String productname = driver.findElement(By.xpath(locator.getData("master_pdp_product_name"))).getText();

		if (productname.equals(product_name1)) {
			return true;
		} else {
			System.out.println("PLP Search Product - Product not able to search!");
			return false;
		}
		//

	}

	public boolean verify_plp_filter() throws InterruptedException {
		try {

			waitUntilElementVisibleAndClick("master_plp_filter_button");

			waitUntil("master_plp_by_sub_catagory");

			String before_do = driver.findElement(By.xpath(locator.getData("master_plp_filter_first_product_name")))
					.getText();
			waitUntilElementVisibleAndClick("master_plp_sub_catagory_item");

			waitUntil("master_plp_filtered_first_product_name");

			if (!driver.findElement(By.xpath(locator.getData("master_plp_filtered_first_product_name"))).getText()
					.equals(before_do)) {

				return true;

			} else {
				System.out.println("Filter not working or Product not found on sub category!");
				return false;
			}

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

}
