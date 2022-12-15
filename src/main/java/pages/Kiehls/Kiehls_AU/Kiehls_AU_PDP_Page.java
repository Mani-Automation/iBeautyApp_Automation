package pages.Kiehls.Kiehls_AU;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.utilities.ExtentReport;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_PDP_Page extends CommonActions {
	AppiumDriver driver;

	public Kiehls_AU_PDP_Page(AppiumDriver driver)

	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// XCUIElementTypeImage[@name="btnWishList"]
	// XCUIElementTypeButton[@name="btnBuyNow"]
	// XCUIElementTypeButton[@name="CHECK STOCK"]
	// XCUIElementTypeButton[@name="ADVANCE CHECK STOCK"]

	// XCUIElementTypeStaticText[@name="Out of Stock"]
	// XCUIElementTypeButton[@name="btnSub"]
	// XCUIElementTypeButton[@name="btnAdd"]
//	(//XCUIElementTypeStaticText[@name="1"])[2]
	@FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"1\"])[2]")
	public WebElement pdp_product_buynow_count_text1;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"ADVANCE CHECK STOCK\"]")
	public WebElement pdp_product_advance_check_stock_button;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Out of Stock\"]")
	public WebElement pdp_product_out_of_stock;

	// XCUIElementTypeStaticText[@name="Stock Availability"]
	// XCUIElementTypeApplication[@name="Kiehls
	// UAT"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField
	// XCUIElementTypeButton[@name="Search"]
	// XCUIElementTypeStaticText[@name="IO0 AUS Kiehls MYER Charlestown"]
//searchresultwithcount	//XCUIElementTypeApplication[@name="Kiehls UAT"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeOther

//	(//XCUIElementTypeButton[@name="btnProduct"])[2]
//			(//XCUIElementTypeStaticText[@name="PRODUCT DESCRIPTION"])[2]
//					(//XCUIElementTypeButton[@name="btnTips"])[2]
//							(//XCUIElementTypeStaticText[@name="TIPS"])[2]
//	(//XCUIElementTypeButton[@name="btnIngredient"])[2]
//	(//XCUIElementTypeStaticText[@name="INGRIEDIENTS"])[2]
//ingre text	//XCUIElementTypeApplication[@name="Kiehls UAT"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]

	// XCUIElementTypeButton[@name="upArrow"]
	public boolean verify_user_can_do_check_stock_and_advance_check_stock_in_pdp() throws InterruptedException {
		try {
			Thread.sleep(2000);
			pdp_product_advance_check_stock_button.click();
			reportStatusPASS("User clicked Advance check stock button on PDP");

			Thread.sleep(2000);
			Assert.assertTrue(pdp_product_out_of_stock.isDisplayed());
			reportStatusPASS("Verified user able to see Stock status on PDP");
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}

	}

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"btnProduct\"])[2]")
	public WebElement pdp_product_description_tab;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"btnTips\"])[2]")
	public WebElement pdp_product_tips_tab;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"btnIngredient\"])[2]")
	public WebElement pdp_product_ingridents_tab;

	public boolean user_click_buy_now_button_and_verify_the_count_increased_in_cart() throws InterruptedException {
		try {
			Thread.sleep(3000);
			pdp_product_BuyNow_button.click();
			reportStatusPASS("User clicked Buy Now button on PDP");

			Thread.sleep(1000);

			Assert.assertTrue(pdp_product_buynow_count_text1.isDisplayed());
			reportStatusPASS("Verified user able to see Procuct count displayed on PDP");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	public boolean verify_the_product_description_tips_and_ingriedients_tabs_in_pdp() throws InterruptedException {

		// webdriverwait(pdp_product_check_stock_button);

		try {
			Thread.sleep(3000);

			swipeDown();

			webdriverwait(pdp_product_description_tab);
			Assert.assertTrue(pdp_product_description_tab.isDisplayed());
			reportStatusPASS("Verified user able to see Product Description on PDP");
			Assert.assertTrue(pdp_product_tips_tab.isDisplayed());
			reportStatusPASS("Verified user able to see Product Tips on PDP");
			Assert.assertTrue(pdp_product_ingridents_tab.isDisplayed());
			reportStatusPASS("Verified user able to see Product Ingridents on PDP");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

	// navigate to pdp
	// XCUIElementTypeCell[@name="cell_0"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]
	// XCUIElementTypeCell[@name="cell_0"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeImage[1]
//	@FindBy(xpath = "(//XCUIElementTypeCell[@name=\"cell_0\"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")

	@FindBy(xpath = "// XCUIElementTypeCell[@name=\"cell_0\"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeImage[1]")
	public WebElement first_product_on_plp;

	@FindBy(xpath = "")
	public WebElement pdp_product_name;

	public boolean click_the_first_product_and_navigate_to_PDP() {

		try {
			webdriverwait(first_product_on_plp);
			first_product_on_plp.click();
			reportStatusPASS("User clicked first product on the PLP");
			webdriverwait(pdp_product_name);
			return pdp_product_name.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);

		}
		return false;
	}
	// verify pdp page

	@FindBy(xpath = "")
	public WebElement pdp_product_price;

	@FindBy(xpath = "")
	public WebElement pdp_product_image;

	@FindBy(xpath = "//XCUIElementTypeImage[@name=\"btnWishList\"]")
	public WebElement pdp_product_wishlist_icon;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"btnBuyNow\"]")
	public WebElement pdp_product_BuyNow_button;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"CHECK STOCK\"]")
	public WebElement pdp_product_check_stock_button;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"ADVANCE CHECK STOCK\"]")
	public WebElement pdp_product_image_advance_check_stock_button;

	public boolean validate_product_name_price_image_quantity_buy_now_and_wishlist_button_are_available_in_pdp() {
		try {
			if (pdp_product_wishlist_icon.isDisplayed()) {
				reportStatusPASS("User navigate to PDP and Product wishlist icon is visible successfully");
				return true;

			} else if (pdp_product_BuyNow_button.isDisplayed()) {
				reportStatusPASS("User navigate to PDP and Product BUY NOW button is visible successfully");
				return true;

			} else if (pdp_product_check_stock_button.isDisplayed()) {
				reportStatusPASS("User navigate to PDP and Product Check stock button is visible successfully");
				return true;

			} else if (pdp_product_image_advance_check_stock_button.isDisplayed()) {
				reportStatusPASS("User navigate to PDP and Product Advance Check Stock button is visible successfully");
				return true;

			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			reportStatusException(e);
			return false;

		}
	}

}
