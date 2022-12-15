package pages.Lancome.Lancome_AU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;

import io.appium.java_client.AppiumDriver;

public class Lancome_AU_CustomerCreation_Page extends CommonActions {
	AppiumDriver driver;

	public Lancome_AU_CustomerCreation_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// @FindBy(xpath="")
	// public WebElement first_name;
	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"btnCreate\"]")
	public WebElement create_button;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Create New Member\"]")
	public WebElement create_member_page;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField[8]")
	public WebElement first_name;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField[1] ")
	public WebElement last_name;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"downarrow black\"])[2]")
	public WebElement date_of_birth;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"downarrow black\"])[3]")
	public WebElement month_of_birth;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"downarrow black\"])[4]")
	public WebElement year_of_birth;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"downarrow black\"])[1]")
	public WebElement gender;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField[5] ")
	public WebElement email;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField[6]")
	public WebElement phone_number;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"I am an international tourist\"]")
	public WebElement international_tourist_checkbox;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField[6]")
	public WebElement street_number;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField[2]")
	public WebElement street;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Kiehls UAT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField[3]")
	public WebElement city_name;

	@FindBy(xpath = "(//XCUIElementTypeButton[@name=\"downarrow black\"])[6]")
	public WebElement state;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Queensland\"]")
	public WebElement state_value;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Email\"]")
	public WebElement marketing_preference_checkbox;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Join\"]")
	public WebElement join_button;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Healthy Skin Check\"]")
	public WebElement consultation_page;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Start\"]")
	public WebElement consultation_start_button;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please present the iPad to customer for registration to Kiehl's Rewards\"]")
	public WebElement kiehls_rewards_registration_popup;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"btnYes\"]")
	public WebElement kiehls_rewards_registration_popup_close_button;
	
	//
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter first name\"]")
	public WebElement first_name_error_text;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Surname\"]")
	public WebElement last_name_error_text;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Valid Date\"]")
	public WebElement dob_date_error_text;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Valid Month\"]")
	public WebElement dob_month_error_text;
	
	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter Valid Email ID\"]")
	public WebElement email_id_error_text;
	
	//
	
	
	
	public void create_customer() throws InterruptedException {
		create_button.click();

	}

	public boolean verify_customer_creation_page() throws InterruptedException {
		Thread.sleep(2000);
		if (kiehls_rewards_registration_popup.isDisplayed()) {
			kiehls_rewards_registration_popup_close_button.click();
		}

		return create_member_page.isDisplayed();

	}

	public void enter_firstname(String firstname) throws InterruptedException {
		first_name.sendKeys(firstname);
		Thread.sleep(1000);

	}

	public void enter_lastname(String lastname) throws InterruptedException {
		last_name.sendKeys(lastname);
		Thread.sleep(1000);

	}

	public void select_dob(String date, String month, String year) throws InterruptedException {
		// date
		date_of_birth.click();
		String date_of_birth_value = "//XCUIElementTypeStaticText[@name=\"" + date + "\"]";
		Thread.sleep(1000);
		driver.findElement(By.xpath(date_of_birth_value)).click();
		// month
		Thread.sleep(1000);

		month_of_birth.click();
		String month_of_birth_value = "//XCUIElementTypeStaticText[@name=\"" + month + "\"]";
		Thread.sleep(1000);
		driver.findElement(By.xpath(month_of_birth_value)).click();
		// year
		Thread.sleep(1000);

		year_of_birth.click();
		String year_of_birth_value = "//XCUIElementTypeStaticText[@name=\"" + year + "\"]";
		Thread.sleep(1000);
		driver.findElement(By.xpath(year_of_birth_value)).click();
	}

	public void select_gender(String gender_value) throws InterruptedException {
		Thread.sleep(1000);

		gender.click();
		Thread.sleep(1000);

		String gender = "//XCUIElementTypeStaticText[@name=\"" + gender_value + "\"]";
		driver.findElement(By.xpath(gender)).click();
		Thread.sleep(1000);

	}

	public void enter_email(String email_value) throws InterruptedException {
		email.sendKeys(email_value);
		Thread.sleep(1000);

	}

	public void enter_phone_number(String number) throws InterruptedException {
		phone_number.sendKeys(number);
		Thread.sleep(1000);

	}

	public void click_marketing_preference() throws InterruptedException {
		marketing_preference_checkbox.click();
		Thread.sleep(1000);

	}

	public void click_join_button() throws InterruptedException {
		join_button.click();
		Thread.sleep(1000);

	}

	public boolean verify_consultation_page() throws InterruptedException {
		Thread.sleep(5000);
		if (consultation_page.isDisplayed() && consultation_start_button.isDisplayed()) {
			System.out.println("Customer created successfully");
			return true;
		} else {
			return false;
		}
	}
	
	//negative
	public void enter_street_number(String number) throws InterruptedException {
		street_number.sendKeys(number);
		Thread.sleep(1000);

	}
	public void enter_street_name(String name) throws InterruptedException {
		street.sendKeys(name);
		Thread.sleep(1000);

	}
	public void enter_city_name (String city) throws InterruptedException {
		city_name.sendKeys(city);
		Thread.sleep(1000);

	}
	public void select_state_name(String name) throws InterruptedException {
		state.click();
		Thread.sleep(1000);
		String state_feild = "//XCUIElementTypeStaticText[@name=\"" + name + "\"]";
		driver.findElement(By.xpath(state_feild)).click();
		Thread.sleep(1000);

	}
	
	public void verify_mandatory_error_text()
	
	{
		System.out.println(first_name_error_text.getText());
		System.out.println(last_name_error_text.getText());

		System.out.println(dob_date_error_text.getText());

		System.out.println(dob_month_error_text.getText());
		System.out.println(email_id_error_text.getText());


	}
}
	
	
	

