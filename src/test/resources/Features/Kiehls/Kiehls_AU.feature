Feature: Validation of applications in Various segments

  Background: 
    Given User launches the Application
    Then User select the country
    And User click on proceed button

  @smoke @Regression @Login @positive @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify the user able to login the application
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page

  @smoke @Regression @Login @Negative @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify the user able to see the error message in store and BA page.
    When User enter the wrong store credentials
    And User click on login button in storePage
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the wrong ba credentials
    And User click on login button in baPage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page

  @resetPassword @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify the user able to see the error message in store and BA page.
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on Reset Password
    And User enters store Manager userName and passWord
    And User click on close button in Pop Up
    And User click on Reset Password
    And User enters store Manager userName and passWord

  #And  User click on next button
  #And  User enters the newPassword and confirm passWord
  #And  User click on submit button
  @smoke @Regression @PLP @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify user able to navigate PLP from home page product category
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click "Hair" category on the Home page
    Then User should navigate to PLP page successfully

  @smoke @Regression @PLP @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to navigate PLP from Right navigation bar to product category
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click "Skincare" category on product from right navigation
    Then User should navigate to PLP page successfully

  @smoke @Regression @PLP @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify user able view product by Grid, small grid and list view in PLP
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully
    And Verify user able to see grid and small and list view

  @smoke @Regression @PLP @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able filter the products in PLP
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully
    And Verify user able to filter the product in PLP

  @smoke @Regression @PLP @Negative @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify user able Sort the products in PLP
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully
    And Verify user able to sort the product in PLP

  @smoke @Regression @PLP @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able search a product based on price
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click "Skincare" category on the Home page
    Then User should navigate to PLP page successfully
    And Verify user able to search a product base on min and max price

  @smoke @Regression @BACalendar @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify the customer Calendar page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) CALENDAR 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALENDAR" then verify the page

  @smoke @Regression @BACalendar @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify the Day, Week, Month and year tab working properly
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) CALENDAR 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALENDAR" then verify the page
    Then User verfiy the Day tab
    And User verify the Week tab
    And User verify the Month tab
    And User verify the Year tab

  @smoke @Regression @BACalendar @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify user able to create ToDo list in the calendar
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) CALENDAR 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALENDAR" then verify the page
    Then User click the Create Event button
    And User click the ToDo list
    And User enter the title in calender
    And User click Save button in calender
    Then Verify user able to view created ToDo list Event

  #And User click the Delete Event button
  @smoke @Regression @BACalendar @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to create Promotion Activity in the calendar
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) DASHBOARD 2) Notification 3) Callback list 4) CALENDAR 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALENDAR" then verify the page
    Then User click the Create Event button
    And User click the Promotion Activity
    And User select the Promotion in the Service type
    And User enter the Customer name in calender
    And User enther the Phone number in calender
    And User click Save button in calender

  #Then Verify user able to view created Promotion Event
  # And User click the Delete Event button
  @smoke @Regression @BACalendar @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to create Service booking in the calendar
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    #BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) CALENDAR 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALENDAR" then verify the page
    Then User click the Create Event button
    And User click the Service booking
    And User select the Service booking in the Service type
    And User enter the Customer name in calender
    And User enther the Phone number in calender
    And User click Save button in calender

  #Then Verify user able to view created service booking Event
  #And User click the Delete Event button
  @smoke @Regression @BACalendar @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to create Event Reservation in the calendar
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) CALENDAR 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALENDAR" then verify the page
    Then User click the Create Event button
    And User click the event reservaiton
    And User select the Event reservaiton in the Service type
    And User enter the Customer name in calender
    And User enther the Phone number in calender
    And User click Save button in calender

  #Then Verify user able to view created reservation Event
  #And User click the Delete Event button
  @smoke @Regression @BACallbacklist @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify the customer callback list page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALLBACK LIST" then verify the page

  @smoke @Regression @BACallbacklist @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify the callback list title, count, missed call, called, created date, updated date and remainder are present
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) Dash board 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALLBACK LIST" then verify the page
    And Verify the Title in callback list
    And Verify the Count in callback list
    And Verify the called in callback list
    And Verify the missed call in callback list
    And Verify the reminder in callback list
    And Verify the Created date in callback list
    And Verify the Updated date in callback list

  @smoke @Regression @BACallbacklist @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify the customer list page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) Dash board 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALLBACK LIST" then verify the page
    Then User click the first call back history and verfify the customer list page

  @smoke @Regression @BACallbacklist @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify the first customer list details
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) Dash board 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALLBACK LIST" then verify the page
    Then User click the first call back history and verfify the customer list page
    And User click the first customer detials
    And Verify the Member level
    And Verify the Balance points

  @smoke @Regression @BAdashboard @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify the customer dashBoard page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) dashBoard 2) Notification 3) CALLBACK LIST 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then Verify user able see Customer Notification, Callback List, Calender tab in the Dashboard

  @smoke @Regression @BAdashboard @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify the customer notification on dashBoard page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calender 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then User click first notification on the list and user able to navigate Notification page

  @smoke @Regression @BAdashboard @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify the customer calBacklist on dashBoard page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calender 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then User click first calback history on the list and user able to navigate Calback List page

  @smoke @Regression @BAdashboard @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify the customer calendar on dashBoard page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calender 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then User click first calender event on the list and user able to navigate Calender page

  @smoke @Regression @BAdashboard @AU @HK @JP @KR @MY @NZ @SG @TW @TH @master
  Scenario: Verify the customer add new calendar on dashBoard page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then User click Add new button
    And Verify user able to navigate to calender page and see all calender events list popup

  @smoke @Regression @BAtransaction @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify the Transaction and Member history page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "TRANSACTIONS" then verify the page
    Then User click the Member history and verify the page
    And User click the Transaction history and verify the page

  @smoke @Regression @BAtransaction @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify the transaction details in first history
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
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
    And Verify the Customer number in transcation
    And Verify the Total product quantity in transcation
    And Verify the Total transcation price in transcation

  @smoke @Regression @BAtransaction @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify the member details in first history
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "TRANSACTIONS" then verify the page
    And User click the Transaction history and verify the page
    And Verify the Submission date in member
    And Verify the Counter id in member
    And Verify the BA id in member
    And Verify the BA name in member
    And Verify the Customer name in member
    And Verify the Customer number in member

  @smoke @Regression @Cart @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to navigate cart page successfully
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page

  @smoke @Regression @Cart @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to add product from cart page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Add Item button
    And User search the product and add it to cart
    Then Verify user able to view the product in cart

  @smoke @Regression @Cart @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to add sample from cart page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Sample button
    And User search the product and click Add to cart button
    Then Verify user able to view the sample product in cart

  @smoke @Regression @Cart @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to calculate points
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Points calculator button
    And User Add the Bonus value and verify the estimation points

  @smoke @Regression @Cart @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to check the stock
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Add Item button
    And User search the product and add it to cart
    Then Verify user able to view the product in cart
    Then User click the check stock button and verify the stock availablity

  @smoke @Regression @Cart @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to do checkout from cart page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Add Item button
    And User search the product and add it to cart
    Then Verify user able to view the product in cart
    And User click the Checkout button
    Then Verify the Successfull popup with QR code and transaction id and click close button

  @smoke @Regression @Cart @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to change the customer from cart page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Change button
    And User select phone and enter the number
    Then User click search button and verify the changed customer

  @smoke @Regression @C360 @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify customer 360 screen
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And Verify the customer Name
    And Verify the phone number
    And Verify the Edit button
    And Verify the Birthday Date
    And Verity the Gender
    And Verify the R12 Spending
    And Verify the Opt In
    And Verify the Membership Since
    And Verify the Customer type

  @smoke @Regression @C360 @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify customer 360 screen and edit customer profile
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the Edit button and update member page should be displayed
    Then Verify the customer details and click update button

  @smoke @Regression @C360 @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify Membership history
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the membership tab and verify Membership screen should be displayed
    And verify membership date, points, store and type are displayed

  @smoke @Regression @C360 @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Add Products to Wish List
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click "Hair" category on the Home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    And User click add to wishlist icon
    Then User Click Customer 360 button from right navigation
    And User click wishlist tab
    Then User click wishlist product and verify PDP shold be displayed

  @smoke @Regression @C360 @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify if user able to view customer summary
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the summary tab
    Then Verify user general information should be displayed

  @smoke @Regression @C360 @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify if user is able to create customer notes with important message
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the summary tab
    And User click create note button and verify the note popup
    And User enter the title
    And User enter the Description
    And User toogle and mark the message as important
    And User click the save button
    Then Verify the customer note should be displayed in notes section

  @smoke @Regression @C360 @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify if user is able to create customer notes without important message
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    Then tap on customer search dropdown
    And tap on Mobile Number from the dropdown list
    And enter Mobile Number and tap on search button
    Then Customer threeSixty screen should be display
    And User click the summary tab
    And User click create note button and verify the note popup
    And User enter the title
    And User enter the Description
    And User click the save button
    Then Verify the customer note should be displayed in notes section

  ##create customer----------------------------------------------------
  @smoke @Regression @Customercreation @AU @HK @JP @KR @MY @NZ @SG @TW @TH @positive @master @cc
  Scenario: Verify if user is able to create a new customer with only mandatory fields
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Create button on Customer search
    Then User add membership info
    And User add member details
    And User click terms and conditions checkbox
    And User click confirm button
    And User verify the consultation home page

  @smoke @Regression @Customercreation @AU @HK @JP @KR @MY @NZ @SG @TW @TH @positive @master
  Scenario: Verify if user is able to create a new customer with all fields
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Create button on Customer search
    Then User add membership info
    And User add member details
    And User add mailing address
    And User add communicate channals details
    And User click terms and conditions checkbox
    And User click confirm button

  #And User verify the consultation home page
  @smoke @Regression @Customercreation @AU @HK @JP @KR @MY @NZ @SG @TW @TH @negative @master
  Scenario: Verify if user is able to create a new customer with all fields
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click the Create button on Customer search
    And User add mailing address
    And User add communicate channals details
    And User click terms and conditions checkbox
    And User click confirm button
    And User verify mandatory error messages

  @smoke @Regression @PDP @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to navigate PDP from home page category product
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click "Hair" category on the Home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then Validate Product name, price, image, quantity, Buy Now and wishlist button are available in PDP

  @smoke @Regression @PDP @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user can do check stock and Advance check stock
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click "Hair" category on the Home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then Verify user can do check stock and Advance check stock in PDP

  @smoke @Regression @PDP @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user can click buy now button and add to cart in PDP
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click "Hair" category on the Home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then User click BUY NOW button and verify the count increased in cart

  @smoke @Regression @PDP @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify the product description, tips and ingredients tabs in PDP
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click "Hair" category on the Home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then Verify the product description, tips and ingriedients tabs in PDP

  @smoke @Regression @consultation @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to create consultation for survey with generic user
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click start consultation button
    And User verify the consultation home page
    And User click servey button on the consultation page
    And User verify the survey form page
    Then User enter text look and feel of your skin on text field
    And User click save button to save form
    And User verify the consultation home page

  @smoke @Regressionn @consultation @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to create consultation for survey with member
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And enter Email and tap on search button
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click start consultation button
    And User verify the consultation home page
    And User get current status of no fo consultation and date
    Then User click add button and click start consultation
    And User click servey button on the consultation page
    And User verify the survey form page
    Then User enter text look and feel of your skin on text field
    And User click save button to save form
    And User verify the consultation home page

  #Then User verify is survey form created successfully
  @smoke @Regressionn @consultation @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to update consultation for survey with member
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And enter Email and tap on search button
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click start consultation button
    And User verify the consultation home page
    And User click servey button on the consultation page
    Then User click update button on survey
    And User verify the survey form page
    And User click clear all button on survey form
    Then User enter text look and feel of your skin on text field
    And User click save button to save form
    And User verify the consultation home page

  @smoke @Regression @consultation @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to create consultation for Skincare with generic user
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click start consultation button
    And User verify the consultation home page
    Then User click "SkinCare" button and verify the page
    And User select skin options and click save button
    And User verify the consultation home page

  @smoke @Regression @consultation @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify user able to see mandatory errors on create consultation for Skincare with generic user
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And User click start consultation button
    And User verify the consultation home page
    Then User click "SkinCare" button and verify the page
    And Verify mandatory error messages in the form
    And User verify the consultation home page

  @smoke @Regression @consultation @AU @HK @JP @KR @MY @NZ @SG @TW @TH @test_now
  Scenario: Verify build routine
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And enter Email and tap on search button
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click start consultation button
    And User verify the consultation home page
    Then User click add button and click start consultation
    Then User click "SkinCare" button and verify the page
    And User select skin options and click save button
    And User verify the consultation report page
    #Then User click remove from email check box
    Then User click build routine button and verify the routine page
    And User select the daily routine details
    Then Verify user selected products and click product types and notes
    Then Verify the skincare solution page and click summary
    And User verify the consultation report page
    Then User click add all to cart button
    And Verify the cart page
    Then User validate added product on the cart

  @smoke @Regression @consultation @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify edit build routine
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    And enter Email and tap on search button
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click start consultation button
    And User verify the consultation home page
    Then User click add button and click start consultation
    Then User click "SkinCare" button and verify the page
    And User select skin options and click save button
    And User verify the consultation report page
    #Then User click remove from email check box
    Then User click build routine button and verify the routine page
    And User select the daily routine details
    Then Verify user selected products and click product types and notes
    Then Verify the skincare solution page and click summary
    And User verify the consultation report page
    Then User click add all to cart button
    And Verify the cart page
    Then User validate added product on the cart

  @smoke @Regression @home @AU @HK @JP @KR @MY @NZ @SG @TW @TH
  Scenario: Verify the user able see all the components in Home page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on login button in baPage
    Then User is on home page
    Then Verify menu bar items on the home page
    Then Verify category items on the home page
    Then Verify topten items on the home page
    Then Verify members items on the home page
    Then Verify side navigation items on the home page
