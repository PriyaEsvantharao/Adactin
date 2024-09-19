Feature: Reservation functionalites for Adactin Hotel


     Scenario: login and Searching Hotel Functionalties
       Given user logged into the Adactin hotel App
       Then user verifies the expected url
       And user verifies the expected welcome message
       And user is on the search hotel page
       Then user select the Location as "London"
       And user select the Hotels as "Hotel Sunshine"
       And user select the room type as "Deluxe"
       And user select the number of rooms as "4 - Four"
       And user enter the check In Date as "20/09/2024"
       And user enter check Out Date as "24/09/2024"
       And user select Adults per room as "4"
       And user select children per room as "2"
       And user click the search button
       And user enter "Priya" as the first name
       And user enter "rao" as the last name
       And user enter "ABC Street,Flower garden,Chennai" as the billing address
       And user enter "1234567890123456" as the credit card number
       And user select "VISA" as the credit card type
       And user select month as "June" and expiry year as "2026"
       And user enter "226" as the CVV number
       And user click on the Book Now button
       Then user should receive a booking confirmation number
       And user click on the My Itinerary button
       And user enter the retrieve order Number into search orderId
       Then user verifies the final page and take a screenshot

