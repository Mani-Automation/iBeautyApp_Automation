Feature: iBeauty Regression Test

  Background: 
    Given User launches the Application
    When User select country and login to Store and BA account

  @master @smoke @Regression @Login @positive @start
  Scenario: Verify user able to login the application
    Then User is on home page

  @master @smoke @Regression @Login @Negative
  Scenario: Verify the user able to see the error message in Store and BA page.
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

  @master @resetPassword @Login
  Scenario: Verify the user able to see the error message on reset password
    Then User is on home page
    And User click logout button on home page and click switch store button on BA page
    When User enter the store credentials
    And User click on login button in storePage
    Then User enter the ba credentials
    And User click on Reset Password
    And User enters store Manager userName and password
    And User click on close button in Pop Up

  @master @smoke @Regression @PLP
  Scenario: Verify user able to navigate PLP from home page product category
    Then User is on home page
    Then User click a category on the home page
    Then User should navigate to PLP page successfully

  @master @smoke @Regression @PLP
  Scenario: Verify user able to navigate PLP from Right navigation bar to product category
    Then User is on home page
    And User click category on product from right navigation
    Then User should navigate to PLP page successfully

  @master @smoke @Regression @PLP
  Scenario: Verify user able view product by Grid, small grid and list view in PLP
    Then User is on home page
    Then User click a category on the home page
    Then User should navigate to PLP page successfully
    And Verify user able to see grid and small and list view

  @master @smoke @Regression @PLP
  Scenario: Verify user able filter the products in PLP
    Then User is on home page
    Then User click a category on the home page
    Then User should navigate to PLP page successfully
    And Verify user able to filter the product in PLP

  @master @smoke @Regression @PLP @Negative
  Scenario: Verify user able Sort the products in PLP
    Then User is on home page
    Then User click a category on the home page
    Then User should navigate to PLP page successfully
    And Verify user able to sort the product in PLP

  @master @smoke @Regression @PLP
  Scenario: Verify user able search a product based on price
    Then User is on home page
    Then User click a category on the home page
    Then User should navigate to PLP page successfully
    And Verify user able to search a product base on min and max price

  @master @smoke @Regression @BACalendar @run
  Scenario: Verify the customer Calendar page
    Then User is on home page
    #BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) CALENDAR 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALENDAR" then verify the page

  @master @smoke @Regression @BACallbacklist
  Scenario: Verify the customer callback list page
    Then User is on home page
    #BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALLBACK LIST" then verify the page

  @master @smoke @Regression @BACallbacklist
  Scenario: Verify the callback list title, count, missed call, called, created date, updated date and remainder are present
    Then User is on home page
    #BA HOME -> 1) Dash board 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALLBACK LIST" then verify the page
    And Verify the Title in callback list

  @master @smoke @Regression @BACallbacklist
  Scenario: Verify the customer list page
    Then User is on home page
    #BA HOME -> 1) Dash board 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALLBACK LIST" then verify the page
    Then User click the first call back history and verify the customer list page

  @master @smoke @Regression @BACallbacklist
  Scenario: Verify the first customer list details
    Then User is on home page
    #BA HOME -> 1) Dash board 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "CALLBACK LIST" then verify the page
    Then User click the first call back history and verify the customer list page
    And User click the first customer detials
    And Verify the Member level

  @master @smoke @Regression @BAdashboard
  Scenario: Verify the customer dashBoard page
    Then User is on home page
    #BA HOME -> 1) dashBoard 2) Notification 3) CALLBACK LIST 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then Verify user able see Customer Notification, Callback List, Calender tab in the Dashboard

  @master @smoke @Regression @BAdashboard
  Scenario: Verify the customer notification on dashBoard page
    Then User is on home page
    #BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calender 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then User click first notification on the list and user able to navigate Notification page

  @master @smoke @Regression @BAdashboard
  Scenario: Verify the customer calBacklist on dashBoard page
    Then User is on home page
    # BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calender 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then User click first calback history on the list and user able to navigate Calback List page

  @master @smoke @Regression @BAdashboard
  Scenario: Verify the customer calendar on dashBoard page
    Then User is on home page
    # BA HOME -> 1) DASHBOARD 2) Notification 3) CALLBACK LIST 4) Calender 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "DASHBOARD" then verify the page
    Then User click first calendar event on the list and user able to navigate Calendar page

  @master @smoke @Regression @Cart
  Scenario: Verify user able to navigate cart page successfully
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page

  @master @smoke @Regression @Cart
  Scenario: Verify user able to add sample from cart page
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Sample button
    And User search the product and click Add to cart button
    Then Verify user able to view the sample product in cart

  @master @smoke @Regression @Cart
  Scenario: Verify user able to calculate points
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Points calculator button
    And User Add the Bonus value and verify the estimation points

  @master @smoke @Regression @Cart
  Scenario: Verify user able to check the stock
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Sample button
    And User search the product and click Add to cart button
    Then Verify user able to view the sample product in cart
    Then User click the check stock button and verify the stock availablity

  @master @smoke @Regression @Cart
  Scenario: Verify user able to do checkout from cart page by generic customer
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Add Item button
    And User select a product on the add item pupup
    Then Verify user able to view the product in cart
    And User click the Checkout button
    Then User click proceed button to checkout
    Then Verify the Successfull popup with QR code and transaction id and click close button

  @master @smoke @Regression @Cart
  Scenario: Verify user able to do checkout from cart page
    Then User is on home page
    Then User login to member and verify the C360
    And User click category on product from right navigation
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then User click Buy now button on pdp
    And User click the Cart button from right navigation and verify the cart page
    And User click the Checkout button
    Then Verify the Successfull popup with QR code and transaction id and click close button

  @master @smoke @Regression @Cart
  Scenario: Verify user able to change the customer from cart page
    Then User is on home page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Change button
    And User select phone and enter the number
    Then User click search button and verify the changed customer

  @master @smoke @Regression @C360
  Scenario: Verify customer 360 screen
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    And Verify the customer Name
    And Verify the phone number
    And Verify the Edit button

  @master @smoke @Regression @C360
  Scenario: Verify Membership history
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    And User click the membership tab and verify Membership screen should be displayed

  @master @smoke @Regression @C360
  Scenario: Add Products to Wish List from PLP
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click category on product from right navigation
    Then User should navigate to PLP page successfully
    And User click add to wishlist icon form PLP
    Then User Click Customer 360 button from right navigation
    And User click wishlist tab
    Then User click wishlist product and verify PDP shold be displayed

  @master @smoke @Regression @C360
  Scenario: Add Products to Wish List from PDP
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click category on product from right navigation
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    And User click add to wishlist icon
    Then User Click Customer 360 button from right navigation
    And User click wishlist tab
    Then User click wishlist product and verify PDP shold be displayed

  @master @smoke @Regression @C360
  Scenario: Verify if user able to view customer summary
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    And User click the summary tab
    Then Verify user general information should be displayed

  @master @smoke @Regression @C360
  Scenario: Verify if user is able to create customer notes with important message
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    And User click the summary tab
    And User click create note button and verify the note popup
    And User enter the title
    And User enter the Description
    And User toogle and mark the message as important
    And User click the save button
    Then Verify the customer note should be displayed in notes section

  @master @smoke @Regression @C360
  Scenario: Verify if user is able to create customer notes without important message
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    And User click the summary tab
    And User click create note button and verify the note popup
    And User enter the title
    And User enter the Description
    And User click the save button
    Then Verify the customer note should be displayed in notes section

  @master @smoke @Regression @PDP
  Scenario: Verify user able to navigate PDP from home page category product
    Then User click a category on the home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then Validate Product name, price, image, quantity, Buy Now and wishlist button are available in PDP

  @master @smoke @Regression @PDP
  Scenario: Verify user can do check Advance check stock in pdp page
    Then User is on home page
    Then User click a category on the home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then Verify user can do check Advance check stock in pdp page

  @master @smoke @Regression @PDP
  Scenario: Verify user can click buy now button and add to cart in PDP
    Then User is on home page
    Then User click a category on the home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page

  @master @smoke @Regression @PDP
  Scenario: Verify the product description, tips and ingredients tabs in PDP
    Then User is on home page
    Then User click a category on the home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then Verify the product description, tips and ingriedients tabs in PDP

  @master @Regression @Customercreation @positive
  Scenario: Verify if user is able to create a new customer with only mandatory fields
    Then User is on home page
    And User click the Create button on Customer search
    Then User add membership info
    And User add member details
    And User click terms and conditions checkbox
    And User click confirm button
    Then User verify welcome popup successfully
    And User verify the consultation home page

  @master @smoke @Regression @EditCustomer
  Scenario: Verify user able to edit customer on C360 page with only member info
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display on customer edit
    And User click the Edit button and update member page should be displayed
    Then User edit membership info
    And User click confirm button to update edited changes
    Then User verify Customer ThreeSixty Screen should be displayed

  @master @Regression @consultation
  Scenario: Verify user able to create consultation for survey with generic user
    Then User is on home page
    And User click start consultation button
    And User verify the consultation home page
    And User click servey button on the consultation page
    And User verify the survey form page
    Then User enter text look and feel of your skin on text field
    And User click save button to save form
    And User verify the consultation home page

  @master @Regression @consultation
  Scenario: Verify user able to create consultation for survey with member
    Then User is on home page
    Then User login to member and verify the C360
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

  @master @Regression @consultation
  Scenario: Verify user able to update consultation for survey with member
    Then User is on home page
    Then User login to member and verify the C360
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

  @master @Regression @consultation
  Scenario: Verify user able to create consultation for Skincare with generic user
    Then User is on home page
    And User click start consultation button
    And User verify the consultation home page
    Then User click "SkinCare" button and verify the page
    And User select skin options and click save button
    And User verify the consultation home page

  @master @Regression @consultation
  Scenario: Verify build routine
    Then User is on home page
    Then User login to member and verify the C360
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

  @master @Regression @consultation
  Scenario: Verify edit build routine
    Then User is on home page
    Then User login to member and verify the C360
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

  @master @Regression @consultation
  Scenario: Verify user able to send Email from consultaion
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click start consultation button
    And User verify the consultation home page
    Then User click add button and click start consultation
    Then User click "SkinCare" button and verify the page
    And User select skin options and click save button
    And User verify the consultation report page
    Then User click send Email button and Verify email your consultation popup
    And User enters the message to send
    Then User click send button and verify the popup

  @master @smoke @Regression @home
  Scenario: Verify the user able see all the components in Home page
    Then User is on home page
    Then Verify menu bar items on the home page
    Then Verify category items on the home page
    Then Verify topten items on the home page
    Then Verify members items on the home page
    Then Verify side navigation items on the home page

  @master @smoke @Regression @Settings
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

  @master @smoke @Regression @BAtransaction
  Scenario: Verify the Transaction and Member history page
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "TRANSACTIONS" then verify the page
    Then User click the Member history and verify the page
    And User click the Transaction history and verify the page

  @master @smoke @Regression @BAtransaction
  Scenario: Verify the transaction details in first history
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "TRANSACTIONS" then verify the page
    And User click the Transaction history and verify the page
    And Verify the Transcation id in transcation

  @master @smoke @Regression @BAtransaction
  Scenario: Verify the member details in first history
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS
    And User click the BA Home button from right navigation and Click "TRANSACTIONS" then verify the page
    Then User click the Member history and verify the page

  @master @smoke @Regression @Recycle
  Scenario: Verify the user add recycle
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    And User click the recycle tab
    Then User verify total number of bottles returned column
    And User Select no of bottles to recycle on dropdown
    Then User click Done button
    Then Verify user able to see recent recycled bottles

  @master @smoke @Regression @Gift
  Scenario: Verify user able to add gift and verify
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Gift button on cart page
    Then User verify the redemption page
    And User click add to cart button
    Then User click proceed button
    And Verify the gift product on cart page
    And User click the Checkout button to redeem
    Then validate redeem points popup

  @master @smoke @Regression @Gift
  Scenario: Verify user able to see points label and add more count from redemption page
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    And User click the Cart button from right navigation and verify the cart page
    Then User click the Gift button on cart page
    Then User verify the redemption page
    Then Verify user can add more gifts from redemption page and validate total and balance points
    Then User click proceed button
    And User click the Checkout button to redeem
    Then validate redeem points popup

  @master @smoke @Regression @ServiceBooking
  Scenario: Verify the member details in first history
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS 6) SERVICE BOOKING
    And User click the BA Home button from right navigation and Click "SERVICE BOOKING" then verify the page
    Then Verify the upcoming bookings page
    And User click calendar button on upcoming booking page
    Then User click refresh button and it should navigate to list page

  @master @smoke @Regression @ServiceBooking
  Scenario: Verify the member details in first history and verify the list page
    Then User is on home page
    # BA HOME -> 1) DashBoard 2) Notification 3) Callback list 4) Calendar 5) TRANSACTIONS 6) SERVICE BOOKING
    And User click the BA Home button from right navigation and Click "SERVICE BOOKING" then verify the page
    Then Verify the upcoming bookings page
    Then User click Customers button and validate customer list page
    And User click first customer on the list
    Then Verifty the customer details
    And User click all bookings button and verify the list page

  @master @smoke @Regression @VoucherRedemption
  Scenario: Verify the Voucher Redemption page components
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    And User click the Voucher Redemption button from right navigation and verify the page
    And Verify redeem requst page components

  @master @smoke @Regression @VoucherRedemption
  Scenario: Verify the Voucher Redemption minimum spent limit popup
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    And User click the Voucher Redemption button from right navigation and verify the page
    Then User click add to cart button on first voucher
    And User click reedem button
    Then Validate minimum spent limit popup

  @master @smoke @Regression @VoucherRedemption
  Scenario: Verify the Voucher Redemption cannot combine voucher popup on adding second voucher
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    And User click the Voucher Redemption button from right navigation and verify the page
    Then User click add to cart button on first voucher
    Then User click add to cart button on second voucher
    Then Validate cannot combine voucher popup

  @master @smoke @Regression @VoucherRedemption
  Scenario: Verify the Voucher Redemption collect page
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    And User click the Voucher Redemption button from right navigation and verify the page
    Then User click collect tab on Redemption page and verify

  @master @smoke @Regression @ProductReservation
  Scenario: Verify user able to reserve the product by generic customer
    Then User is on home page
    Then User click a category on the home page
    Then User should navigate to PLP page successfully
    And User click add to cart button from PLP page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the reserve button on cart page
    And Varify the reservation id popup
    Then User enter the reservation id
    Then User click confirm button on product reservation
    Then User validate generic customer popup and click proceed button
    Then Validate product reservation success popup

  @master @smoke @Regression @ProductReservation
  Scenario: Verify user able to reserve the product with customer
    Then User is on home page
    Then User login to member and verify the C360
    And User click category on product from right navigation
    Then User should navigate to PLP page successfully
    And User click add to cart button from PLP page
    And User click the Cart button from right navigation and verify the cart page
    Then User click the reserve button on cart page
    And Varify the reservation id popup
    Then User enter the reservation id
    Then User click confirm button on product reservation
    Then Validate product reservation success popup

  @master @smoke @Regression @home
  Scenario: Verify user able to verify active customer
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User verify active customer on Home page

  @master @smoke @Regression @home
  Scenario: Verify user able to click active customer on Home page and verfiy should navigate to C360
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User verify active customer on Home page
    And User click active customer on home page
    Then Customer threeSixty screen should be display

  @master @smoke @Regression @Enrollment
  Scenario: Verify user able to enrol membership control
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed

  @master @smoke @Regression @AdvanceCustomerSearch
  Scenario: Verify user able to enrol membership control
    Then User is on home page
    And User click Advance Customer Search button on home page
    Then User enter the customer details on the popup
    And User click search button on the popup

  @master @smoke @Regression @home
  Scenario: Verify user able to switch guest mode
    Then User is on home page
    And User click staff button on home page to switch guest mode
    Then User click a category on the home page
    Then User should navigate to PLP page successfully
    Then Verify user able to navigate cart from righ nav after swiched guest mode

  @master @smoke @Regression @home
  Scenario: User able to see product info on the home page
    Then User is on home page
    And User click product info button on the right nav
    Then Verify user able to see brand images

  @master @smoke @Regression @C360
  Scenario: Add Products to Allergies from pdp
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click category on product from right navigation
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    And User click add to allergy icon
    Then User Click Customer 360 button from right navigation
    And User click wishlist tab
    Then User click allergy product and verify PDP shold be displayed

  @master @smoke @Regression @C360
  Scenario: Add Products to Allergies from plp
    Then User is on home page
    Then User login to member and verify the C360
    Then Customer threeSixty screen should be display
    Then User click Home button and verify home page should be displayed
    And User click category on product from right navigation
    Then User should navigate to PLP page successfully
    And User click add to allergy icon from plp
    Then User Click Customer 360 button from right navigation
    And User click wishlist tab
    Then User click allergy product and verify PDP shold be displayed

  #----------------------------Sprint---65------------------------------------------#
  @master @smoke @Regression @PDP @sprint_65 @sprint_67
  Scenario: Verify user able to check other store from PDP
    Then User is on home page
    Then User click a category on the home page
    Then User should navigate to PLP page successfully
    And User click the product and verify user get navigate to PDP page
    Then User click check other stores button on PLP and verfiy the popup
    And User enter store name to find the store
    Then Verify the selected store on the popup

  @master @smoke @Regression @C360 @sprint_65
  Scenario: Verify user able to view Dashboard Note
    Then User is on home page
    Then User login to member and verify the C360 "dashboard"
    Then Customer threeSixty screen should be display
    And Verify the dashboard tab

  #Then Verify dashboard note tile
  #And Verify note header title on dashobard
  #And Verify note body text on dashobard
  #And Verify note date on dashobard
  @master @smoke @Regression @C360 @sprint_65
  Scenario: Verify user able to view create Note button when newly created customer
    Then User is on home page
    Then User login to member and verify the C360 "dashboard"
    Then Customer threeSixty screen should be display
    And Verify the dashboard tab
    Then Verify user able to see Add Note button on dashboard

  @master @smoke @Regression @C360 @sprint_65
  Scenario: Verify user able to view Birthday notification
    Then User is on home page
    Then User login to member and verify the C360 "dashboard"
    Then Customer threeSixty screen should be display
    And Verify the dashboard tab
    Then Verify user able to see Birthday notification

  @master @smoke @Regression @C360 @sprint_65
  Scenario: Verify user able to view Recent purchase on Dashboard
    Then User is on home page
    Then User login to member and verify the C360 "dashboard"
    Then Customer threeSixty screen should be display
    And Verify the dashboard tab
    Then User verify the recent purchases on dashboard
    And User click recent purchase and verify its navigate to PDP

  #----------------------------Sprint---67------------------------------------------#
  @master @smoke @Regression @C360 @sprint_67
  Scenario: Verify user able to validate Last consultation date
    Then User is on home page
    Then User login to member and verify the C360 "dashboard"
    Then Customer threeSixty screen should be display
    And Verify the dashboard tab
    Then Verify user able to see Last consultation widget
    And User validate the date or click to start consultation

  @master @smoke @Regression @C360 @sprint_67
  Scenario: Verify user able to validate YTD spent
    Then User is on home page
    Then User login to member and verify the C360 "dashboard"
    Then Customer threeSixty screen should be display
    And Verify the dashboard tab
    Then Verify user able to see YTD spent

  @master @smoke @Regression @C360 @sprint_67
  Scenario: Verify user able to validate Membership Tier
    Then User is on home page
    Then User login to member and verify the C360 "dashboard"
    Then Customer threeSixty screen should be display
    And Verify the dashboard tab
    Then Verify user able to validate Membership Tier

  @master @smoke @Regression @C360 @sprint_67
  Scenario: Verify user able to validate Purchase History Expand and collapse all
    Then User is on home page
    Then User login to member and verify the C360 "dashboard"
    And User click purchase history tab
    Then Verify user able to validate Purchase History Expand and collapse all

  @master @smoke @Regression @C360 @sprint_67
  Scenario: Verify user able to validate Prefered category
    Then User is on home page
    Then User login to member and verify the C360 "dashboard"
    Then Customer threeSixty screen should be display
    And Verify the dashboard tab
    Then Verify user able to validate Prefered category
