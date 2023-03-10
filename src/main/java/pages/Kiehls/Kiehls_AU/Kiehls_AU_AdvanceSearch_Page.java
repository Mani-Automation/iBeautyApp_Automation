package pages.Kiehls.Kiehls_AU;

import org.aspectj.apache.bcel.classfile.Module.Open;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.reusableMethods.CommonActions;
import com.utilities.ConfigReader;
import com.utilities.LocatorManager;

import io.appium.java_client.AppiumDriver;

public class Kiehls_AU_AdvanceSearch_Page extends CommonActions {
	AppiumDriver driver;
	LocatorManager locator = new LocatorManager();

	public Kiehls_AU_AdvanceSearch_Page(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public boolean user_enter_the_customer_details_on_the_popup() {
		try {

			

			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	public boolean user_click_advance_customer_search_button_on_home_page() {
		try {

			String seg = ConfigReader.getData("app_segment").toString();
			String app = ConfigReader.getData("app").toString();

			if (app.equals("Kiehls") && seg.equals("AU")) {

				
		
				
			
			} else {

			}
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean user_click_search_button_on_the_popup() {
		try {
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
