Feature: iBeauty Regression Test

  Background: 
    Given User launches the Application
    When User select country and login to store then login to ba account

  @master @smoke @Regression @Login @positive @start @pass
  Scenario: Verify user able to login the application
    Then User is on home page

  @master @smoke @Regression @Login @Negative @pass
  Scenario: Verify the user able to see the error message in store and BA page.
    Then User is on home page
    And User click logout button on home page and click switch store button on BA page
    When User enter the wrong store credentials
    And User click on login button in storePage
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the wrong ba credentials
    And User click on login button in baPage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page

  @master @resetPassword @pass
  Scenario: Verify the user able to see the error message in store and BA page.
    Then User is on home page
    And User click logout button on home page and click switch store button on BA page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on Reset Password
    And User enters store Manager userName and passWord
    And User click on close button in Pop Up

  @master @smoke @Regression @PLP @pass
  Scenario: Verify user able to navigate PLP from home page product category
    Then User is on home page
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully

  @master @smoke @Regression @PLP @pass @val
  Scenario: Verify user able to navigate PLP from Right navigation bar to product category
    Then User is on home page
    And User click "Skincare" category on product from right navigation
    Then User should navigate to PLP page successfully

  @master @smoke @Regression @PLP @pass @val
  Scenario: Verify user able view product by Grid, small grid and list view in PLP
    Then User is on home page
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully
    And Verify user able to see grid and small and list view

  @master @smoke @Regression @PLP @pass @valF
  Scenario: Verify user able filter the products in PLP
    Then User is on home page
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully
    And Verify user able to filter the product in PLP

  @master @smoke @Regression @PLP @Negative @pass
  Scenario: Verify user able Sort the products in PLP
    Then User is on home page
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully
    And Verify user able to sort the product in PLP

  @master @smoke @Regression @PLP @pass
  Scenario: Verify user able search a product based on price
    Then User is on home page
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully
    And Verify user able to search a product base on min and max price

  @master @smoke @Regression @BACalendar @pass
  Scenario: Verify the customer Calendar page
    Then User is on home page
    #BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) CALENDAR 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALENDAR" then verify the page

  @master @smoke @Regression @BACalendar @pass
  Scenario: Verify user able to create ToDo list in the calendar
    Then User is on home page
    #BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) CALENDAR 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALENDAR" then verify the page
    Then User click the Create Event button
    And User click the ToDo list
    And User enter the title in calender
    And User click Save button in calender

  #Then Verify user able to view created ToDo list Event
  #And User click the Delete Event button
  @master @smoke @Regression @BACalendar @pass
  Scenario: Verify user able to create Promotion Activity in the calendar
    Then User is on home page
    #BA HOME -> 1) DASHBOARD 2) Notification 3) Callback list 4) CALENDAR 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALENDAR" then verify the page
    Then User click the Create Event button
    And User click the Promotion Activity
    And User select the Promotion in the Service type
    And User enter the Customer name in calender
    And User enter the Phone number in calendar
    And User click Save button in calender

  @master @smoke @Regression @BACalendar @pass
  Scenario: Verify user able to create Service booking in the calendar
    Then User is on home page
    #BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) CALENDAR 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALENDAR" then verify the page
    Then User click the Create Event button
    And User click the Service booking
    And User select the Service booking in the Service type
    And User enter the Customer name in calender
    And User enter the Phone number in calendar
    And User click Save button in calender

  @master @smoke @Regression @BACalendar @pass
  Scenario: Verify user able to create Event Reservation in the calendar
    Then User is on home page
    #BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) CALENDAR 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALENDAR" then verify the page
    Then User click the Create Event button
    And User click the event reservaiton
    And User select the Event reservaiton in the Service type
    And User enter the Customer name in calender
    And User enter the Phone number in calendar
    And User click Save button in calender

  @master @smoke @Regression @BACallbacklist @pass
  Scenario: Verify the customer callback list page
    Then User is on home page
    #BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALLBACK LIST" then verify the page

  @master @smoke @Regression @BACallbacklist @pass
  Scenario: Verify the callback list title, count, missed call, called, created date, updated date and remainder are present
    Then User is on home page
    #BA HOME -> 1) Dash board 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALLBACK LIST" then verify the page
    And Verify the Title in callback list
    And Verify the Count in callback list
    And Verify the called in callback list
    And Verify the missed call in callback list
    And Verify the reminder in callback list
    And Verify the Created date in callback list
    And Verify the Updated date in callback list

  @master @smoke @Regression @BACallbacklist @pass
  Scenario: Verify the customer list page
    Then User is on home page
    #BA HOME -> 1) Dash board 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALLBACK LIST" then verify the page
    Then User click the first call back history and verify the customer list page

  @master @smoke @Regression @BACallbacklist @pass
  Scenario: Verify the first customer list details
    Then User is on home page
    #BA HOME -> 1) Dash board 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALLBACK LIST" then verify the page
    Then User click the first call back history and verify the customer list page
    And User click the first customer detials
    And Verify the Member level
    And Verify the Balance points

  @master @smoke @Regression @BAdashboard @pass
  Scenario: Verify the customer dashBoard page
    Then User is on home page
    #BA HOME -> 1) dashBoard 2) Notification 3) CALLBACK LIST 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then Verify user able see Customer Notification, Callback List, Calender tab in the Dashboard

  @master @smoke @Regression @BAdashboard @pass
  Scenario: Verify the customer notification on dashBoard page
    Then User is on home page
    #BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calender 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then User click first notification on the list and user able to navigate Notification page

  @master @smoke @Regression @BAdashboard @pass
  Scenario: Verify the customer calBacklist on dashBoard page
    Then User is on home page
    # BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calender 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then User click first calback history on the list and user able to navigate Calback List page

  @master @smoke @Regression @BAdashboard @pass
  Scenario: Verify the customer calendar on dashBoard page
    Then User is on home page
    # BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calender 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then User click first calendar event on the list and user able to navigate Calendar page

  @master @smoke @Regression @BAdashboard @pass
  Scenario: Verify the customer add new calendar on dashBoard page
    Then User is on home page
    # BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then User click Add new button
    And Verify user able to navigate to calender page and see all calender events list popup

  @master @smoke @Regression @BAtransaction @pass
  Scenario: Verify the Transaction and Member history page
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "TRANSACTIONS" then verify the page
    Then User click the Member history and verify the page
    And User click the Transaction history and verify the page

  @master @smoke @Regression @BAtransaction @pass
  Scenario: Verify the transaction details in first history
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "TRANSACTIONS" then verify the page
    And User click the Transaction history and verify the page
    And Verify the Transcation id in transcation
    And Verify the Transcation date in transcation
    And Verify the Counter id in transcation
    And Verify the BA id in transcation
    And Verify the BA name in transcation
    And Verify the Mars id in transcation
    And Verify the Customer name in transcation
    And Verify the Total product quantity in transcation
    And Verify the Total transcation price in transcation

  @master @smoke @Regression @BAtransaction @pass
  Scenario: Verify the member details in first history
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "TRANSACTIONS" then verify the page
    Then User click the Member history and verify the page
    And Verify the Submission date in member
    And Verify the Counter id in member
    And Verify the BA id in member
    And Verify the BA name in member
    And Verify the Customer name in member
    And Verify the Customer number in member

  @master @smoke @Regression @Cart @pass
  Scenario: Verify user able to navigate cart page successfully
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page

  @master @smoke @Regression @Cart @pass
  Scenario: Verify user able to add sample from cart page
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Sample button
    And User search the product and click Add to cart button
    Then Verify user able to view the sample product in cart

  @master @smoke @Regression @Cart @pass
  Scenario: Verify user able to calculate points
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Points calculator button
    And User Add the Bonus value and verify the estimation points

  @master @smoke @Regression @Cart @pass
  Scenario: Verify user able to check the stock
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Sample button
    And User search the product and click Add to cart button
    Then Verify user able to view the sample product in cart
    Then User click the check stock button and verify the stock availablity

  @master @smoke @Regression @Cart @pass
  Scenario: Verify user able to do checkout from cart page
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Sample button
    And User search the product and click Add to cart button
    Then Verify user able to view the product in cart
    And User click the Checkout button
    Then Verify the Successfull popup with QR code and transaction id and click close button

  @master @smoke @Regression @Cart @pass
  Scenario: Verify user able to change the customer from cart page
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Change button
    And User select phone and enter the number
    Then User click search button and verify the changed customer

  @master @smoke @Regression @C360 @pass
  Scenario: Verify customer 360 screen
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And Verify the customer Name
    And Verify the phone number
    And Verify the Edit button

  @master @smoke @Regression @C360 @pass
  Scenario: Verify Membership history
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the membership tab and verify Membership screen should be displayed

  @master @smoke @Regression @C360 @pass
  Scenario: Add Products to Wish List
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click "Skincare" category on product from right navigation
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    And User click add to wishlist icon
    Then User Click Customer 360 button from right navigation
    And User click wishlist tab
    Then User click wishlist product and verify PDP shold be displayed

  @master @smoke @Regression @C360 @pass
  Scenario: Verify if user able to view customer summary
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the summary tab
    Then Verify user general information should be displayed

  @master @smoke @Regression @C360 @pass
  Scenario: Verify if user is able to create customer notes with important message
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the summary tab
    And User click create note button and verify the note popup

  #And User enter the title
  # And User enter the Description
  # And User toogle and mark the message as important
  #And User click the save button
  # Then Verify the customer note should be displayed in notes section
  @master @smoke @Regression @C360 @pass
  Scenario: Verify if user is able to create customer notes without important message
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the summary tab
    And User click create note button and verify the note popup

  #And User enter the title
  # And User enter the Description
  #And User click the save button
  #Then Verify the customer note should be displayed in notes section
  @master @smoke @Regression @PDP @pass
  Scenario: Verify user able to navigate PDP from home page category product
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then Validate Product name, price, image, quantity, Buy Now and wishlist button are available in PDP

  @master @smoke @Regression @PDP @pass
  Scenario: Verify user can do check stock in pdp page
    Then User is on home page
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then Verify user can do check stock in pdp page

  @master @smoke @Regression @PDP @pass
  Scenario: Verify user can do check Advance check stock in pdp page
    Then User is on home page
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then Verify user can do check Advance check stock in pdp page

  @master @smoke @Regression @PDP @pass
  Scenario: Verify user can click buy now button and add to cart in PDP
    Then User is on home page
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then User click BUY NOW button and verify the count increased in cart

  @master @smoke @Regression @PDP @pass
  Scenario: Verify the product description, tips and ingredients tabs in PDP
    Then User is on home page
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then Verify the product description, tips and ingriedients tabs in PDP

  @master @Regression @Customercreation @positive @test
  Scenario: Verify if user is able to create a new customer with only mandatory fields
    Then User is on home page
    And User click the Create button on Customer search
    Then User add membership info
    And User add member details
    And User click terms and conditions checkbox
    And User click confirm button
    And User verify the consultation home page

  @master @Regression @Customercreation @positive
  Scenario: Verify if user is able to create a new customer with all fields
    Then User is on home page
    And User click the Create button on Customer search
    Then User add membership info
    And User add member details
    And User add mailing address
    And User add communicate channals details
    And User click terms and conditions checkbox
    And User click confirm button
    And User verify the consultation home page

  @master @Regression @Customercreation @negative
  Scenario: Verify if user is able see mandatory error messages when without any entry
    Then User is on home page
    And User click the Create button on Customer search
    And User click confirm button

  #And User verify mandatory error messages
  @master @Regression @Customercreation @negative
  Scenario: Verify if user is able see error messages when entered all except mandatory
    Then User is on home page
    And User click the Create button on Customer search
    And User add mailing address
    And User add communicate channals details
    And User click terms and conditions checkbox
    And User click confirm button

  #And User verify mandatory error messages
  @master @Regression @consultation @pass
  Scenario: Verify user able to create consultation for survey with generic user
    Then User is on home page
    And User click start consultation button
    And User verify the consultation home page
    And User click servey button on the consultation page
    And User verify the survey form page
    Then User enter text look and feel of your skin on text field
    And User click save button to save form
    And User verify the consultation home page

  @master @Regressionn @consultation @pass
  Scenario: Verify user able to create consultation for survey with member
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click start consultation button
    And User verify the consultation home page
    #And User get current status of no fo consultation and date
    Then User click add button and click start consultation
    And User click servey button on the consultation page
    And User verify the survey form page
    Then User enter text look and feel of your skin on text field
    And User click save button to save form
    And User verify the consultation home page

  @master @Regressionn @consultation @pass
  Scenario: Verify user able to update consultation for survey with member
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click start consultation button
    And User verify the consultation home page
    And User click servey button on the consultation list page
    Then User click update button on survey
    And User verify the survey form page
    And User click clear all button on survey form
    Then User enter text look and feel of your skin on text field
    And User click save button to save form
    And User verify the consultation home page

  @master @Regression @consultation @pass
  Scenario: Verify user able to create consultation for Skincare with generic user
    Then User is on home page
    And User click start consultation button
    And User verify the consultation home page
    Then User click "SkinCare" button and verify the page
    And User select skin options and click save button
    And User verify the consultation home page

  @master @smoke @Regression @consultation @pass
  Scenario: Verify user able to see mandatory errors on create consultation for Skincare with generic user
    Then User is on home page
    And User click start consultation button
    And User verify the consultation home page
    Then User click "SkinCare" button and verify the page
    And Verify mandatory error messages in the form
    And User verify the consultation home page

  @master @Regression @consultation @pass
  Scenario: Verify build routine
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click start consultation button
    And User verify the consultation home page
    Then User click add button and click start consultation
    Then User click "SkinCare" button and verify the page
    And User select skin options and click save button
    And User verify the consultation report page
    Then User click build routine button and verify the routine page
    And User select the daily routine details
    Then Verify user selected products and click product types and notes
    Then Verify the skincare solution page and click summary
    And User verify the consultation report page
    Then User click add all to cart button
    And Verify the cart page
    Then User validate added product on the cart

  @master @Regression @consultation @pass
  Scenario: Verify edit build routine
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click start consultation button
    And User verify the consultation home page
    Then User click add button and click start consultation
    Then User click "SkinCare" button and verify the page
    And User select skin options and click save button
    And User verify the consultation report page
    Then User click build routine button and verify the routine page
    And User select the daily routine details
    And User click add or edit button on build routine page
    Then User edit product on build routine select page
    And User validate edited product on summary page

  @master @smoke @Regression @home @pass
  Scenario: Verify the user able see all the components in Home page
    Then User is on home page
    Then Verify menu bar items on the home page
    Then Verify category items on the home page
    Then Verify topten items on the home page
    Then Verify members items on the home page
    Then Verify side navigation items on the home page

  @master @smoke @Regression @Settings @pass
  Scenario: Verify the user able see all setting options
    Then User is on home page
    And User click setting icon on the right navigation
    Then User click Language Switch and verify the languages
    Then User click Training Manual and verify the document
    Then User click Version Details and verify the details
    Then User click Technical Assistance Helpline and verify the details
    Then User click Delete Cache or Refresh App and verify
    Then User click Password Management and verify
    And User click the change password button in Password management and verify the popup
    Then User enter current password
    Then User enter new password
    Then User enter confirm password
    And User click cancel button

  @master_test @smoke @Regression @EditCustomer @pass
  Scenario: Verify user able to edit customer on C360 page with all field
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the Edit button and update member page should be displayed
    Then User edit membership info
    And User edit member details
    And User edit mailing address
    And User click confirm button
    Then User verify Customer ThreeSixty Screen should be displayed

  @master_test @smoke @Regression @EditCustomer @pass
  Scenario: Verify user able to edit customer on C360 page with only member info
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the Edit button and update member page should be displayed
    Then User edit membership info
    And User click confirm button
    Then User verify Customer ThreeSixty Screen should be displayed

  @master_test @smoke @Regression @Recycle
  Scenario: Verify the user able see all setting options
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the recycle tab
    Then User verify total number of bottles returned column
    And User Select no of bottles to recycle on dropdown
    Then User click Done button
    Then Verify user able to see recent recycled bottles

  @master_test @smoke @Regression @Gift
  Scenario: Verify user able to add gift and verify
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Gift button on cart page
    Then User verify the redemption page
    And User click add to cart button
    Then User click proceed button
    And Verify the gift product on cart page
    And User click the Checkout button
    Then validate redeem points popup

  @master_test @smoke @Regression @Gift
  Scenario: Verify user able to see points label and add more count from redemption page
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Gift button on cart page
    Then User verify the redemption page
    And Verify points label on Product in Redemption page
    Then Verify user can add more gifts from redemption page and validate total and balance points
    And User click the Checkout button
    Then validate total items and total points in cart page

  @master_test @smoke @Regression @Gift
  Scenario: Verify user able to navigate redemption from right side navigation
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click "Redemption" category on product from right navigation
    Then User verify the redemption page
    And Verify points label on Product in Redemption page

  @master_test @smoke @Regression @ServiceBooking
  Scenario: Verify the member details in first history
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS 6) SERVICE BOOKING
    And User click the BA Home button from right navigation and Click "SERVICE BOOKING" then verify the page
    

