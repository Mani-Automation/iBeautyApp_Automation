iBeauty Automation setup and Required Software installation guide

	•	Software Requirements and Installation:

	•	Latest Mac OS (Monterey 12 And above), XCode 13 and above 

NOTE: for XCode version needs specified Mac OS Kindly check the compatible versions with below link. 

	•	XCode version VS MAC OS version 

	•	Step 1: Install Java JDK 

Install the java JDK any latest version Set environment variables JAVA_HOME PATH 

You can check the installation version in terminal command as java –version 

	•	Step 2: Install Homebrew 

Install Homebrew (it’s a package management system that makes it easier to install software on Mac OS machine). Please find Homebrew and follow the instructions on this website: 

https://brew.sh/ 

else go to terminal and run the command (/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)") 

	•	Step 3: Install node js and npm  Installation can be done via terminal command as brew install node else go to the website as mentioned below 

nodejs.org > download LTS version> open .pkg and follow wizard to install node -v  Nom -v 

	•	Step 4: Install Appium :  Installation can be done by terminal via command npm install -g appium else we can Install Appium Desktop (optional) 

	•	Step 5: Install Appium Inspector:  Appium Inspector serves the purpose of taking the locators in the specified application.  Download and install the Appium Inspector with the link below 
Appium Inspector Download Link 



	•	Step 6: Get XCode 

XCode is the development and debugging environment on Mac. Provides required tools, files for dev/automation for Mac and iOS apps 

Download XCode: 

https://developer.apple.com/xcode/ 


	•	Step 7: Install XCode command line tools  Open terminal and run the command as xcode-select --install 

	•	Step 8: Create Apple ID 

Goto XCode - preferences - account Add Apple ID 

	•	Step 9: Install Carthage 

We can install the carthage via terminal using command as brew install Carthage 

In order to launch WebDriverAgent, your macOS will need to have Carthage installed 

(Not needed for automation on android) 

	•	Step 10: Install WebDriverAgent 

WebDriverAgent is a WebDriver version for iOS. It serves for controlling iOS devices and apps remotely. You can find it in the following directories: 

To install: 

If you installed Appium Desktop: /Applications/Appium.app/Contents/Resources/app/ node_modules/appium/node_modules/appium-webdriver 

If you installed Appium via Node.js: /usr/local/lib/node_modules/appium/node_modules/ appium-webdriver 

In the Terminal window, go to the directory specified above and run the following command:
 mkdir –p Resources/WebDriverAgent.bundle./Scripts/bootstra p.sh -d

Open the WebDriverAgent.xcodeproj project in Xcode (you can find the project in one of the directories specified above). 				
For the WebDriverAgentLib and WebDriverAgentRunner targets, go to the General tab and select the Automatically manage signing check box there, and then select your development team. 

Build the project to verify that everything works fine:  Run the command in terminal as  xcodebuild -project WebDriverAgent.xcodeproj - scheme WebDriverAgentRunner -destination 'id=udid' test 

	•	Step 11: Open WebDriverAgent.xcodeproj in Xcode Project Name : WebDriverAgent.xcodeproj  Location: 				
For Appium Desktop : The path is /Applications/Appium.app/Contents/Resources/app/ node_modules/appium/node_modules/appium-xcuitest-driver/ WebDriverAgent 

For Appium Installed through node : 

/usr/local/lib/node_modules/appium/node_modules/appium- xcuitest-driver/WedDriverAgent 	

https://github.com/appium/appium/issues/12586 

For WebDriverAgentLib and WebDriverAgentRunner targets, go to general tab and select "Automatically manage signing", and then select your Development Team 

Xcode may fail to create a provisioning profile for the WebDriverAgentRunner target: 

Failed to create a provisioning profile No profile for ‘.....’ were found 

manually change the bundle id for the target by going into the "Build Settings" tab, and changing the "Product Bundle Identifier" from com.Facebook.WebDriverAgentRunner to something that Xcode will accept: 

Going back to the "General" tab for the WebDriverAgentRunner target, you should now see that it has created a provisioning profile and all is well: 

Clean - Build - Run 

Build the project to verify that everything works fine: 

xcodebuild -project WebDriverAgent.xcodeproj -scheme WebDriverAgentRunner -destination 'id=udid' test 

udid = device UDID 

Example :  Lets say udid = A9F18306-6B22-442B-99F4-F217A5EE8D38 xcodebuild - 				

project WebDriverAgent.xcodeproj -scheme WebDriverAgentRunner - destination 'id=A9F18306-6B22-442B-99F4-F217A5EE8D38' test 

To get the udid of the real device connected 

npm install -g ios-deploy ios-deploy -c OR  instruments -s devices 

Or else Goto window and click “Device and simulators” copy the identifier value (UDID of the connected device) 

	•	Step 11: Create a project and add desired capabilities for automation on iOS 

deviceName platformName platformVersion app 

Open Eclipse  Create a new maven project or use any existing maven project Add maven dependencies like Appium, selenium, etc., 


Note : Once done all above steps and import the project into Eclipse as Maven Project
	•	Run Automation script – Run all master level regression test suite

	•	Step 1 : Put new UAT/QA app in below mention folder with following naming conversion 
	•	Kiehls UAT.ipa (APP name < space> UAT/QA.ipa)
	•	Path - /iBeautyApp_Automation/apps/
	•	


	•	Step 2 : App Configuration setup 
	•	Open the “application_config.properties” file as per below location in the framework
	•	
	•	Add corresponding Application as below Screenshot
	•	Bundle id
	•	Device Details
	•	App Name
	•	Segment Name
	•	
	•	Likewise, you can rename your application properties as you want to run

	•	Step 3: Setup Cucumber tag
	•	Open the “RunCucumberTest.java” file as per below location
	•	/iBeautyApp_Automation/src/test/java/runnerFile/RunCucumberTest.java
	•	
	•	You can rename the tag name to what suite to be run 
	•	

	•	
	•	The tag name liked with cucumber feature file as below mention location
	•	




		
	•	Open the Feature file “iBeautyRegression.feature”
	•	Here, every top of the Scenario, tag names are specified
	•	
	•	Copy that tag name and paste into tags=”@master” in RunCucumberTest.java file as per above Step 3 mentioned.


	•	Run Automation script – Run particular testcase by tag name

	•	The above step by changing tag name you can run particular testcase scenario
	•	Tags = “@Login” or Tags = “@PLP” or mention in the RunCucumberTest.java file
	•	Note: Make sure the Naming convention 

	•	
	•	Run the Script – With all the above property setup

	•	Once done all the property setup,
	•	Goto Run -> Run Configuration -> JUnit -> Arguments -> and add “-Dplatform=iOS”
	•	Then Save and Click Run button
	•	
	•	If not able to see RunCucumberTest file in above Junit, then you can add by clicking Junit and add Runner file.
	•	Once execution completed. You can find report in below mention folder

	•	Get the Execution Report

	•	Once execution completed. You can find report in below mention folder
	•	Find the “Overview-feature.html” file
	•	/iBeautyApp_Automation/reports/Kiehls/KR 14-06-2023 17:40:45/cucumber-html-reports/overview-features.html
	•	
	•	Open into Chrome and there you can see complete html report of your execution
	•	








