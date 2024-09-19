package step;

import Base.base;
import Pom.Book_Page;
import Pom.Login_Page;
import Pom.Search_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adactinstep extends base {
    Login_Page login_page;
    Search_Page search_page;
    Book_Page book_page;

    @Given("user logged into the Adactin hotel App")
    public void userLoggedIntoTheAdactinHotelApp() {
        login_page = new Login_Page(base.driver);
        login_page.enterUsername("priyaDinesh");
        login_page.enterPassword("Jennyworld");
        login_page.clickLoginBtn();
    }
   @Then("user verifies the expected url")
    public void userVerifiesTheExpectedUrl() {
        String currentUrl = driver.getCurrentUrl();//ctrl+alt+v
        boolean contains = currentUrl.contains("SearchHotel.php");
        Assert.assertTrue(contains);
      System.out.println("Assertion passed");
    }

    @And("user verifies the expected welcome message")
    public void userVerifiesTheExpectedWelcomeMessage() {
        WebElement usernameShow = driver.findElement(By.xpath("//td[normalize-space()='Welcome to Adactin Group of Hotels']"));
        String text = usernameShow.getText();
        boolean contains= text.contains("Welcome to Adactin Group of Hotels");
        Assert.assertTrue("Expected text to contain 'Welcome to Adactin Group of Hotels', but was: " + text, contains);

    }

    @And("user is on the search hotel page")
    public void userIsOnTheSearchHotelPage() throws InterruptedException {
        search_page = new Search_Page(base.driver);
        Thread.sleep(5000);
    }

    @Then("user select the Location as {string}")
    public void userSelectTheLocationAs(String location) {
        search_page.selectLocation(location);
    }

    @And("user select the Hotels as {string}")
    public void userSelectTheHotelsAs(String hotel) {
        search_page.selectHotel(hotel);
    }

    @And("user select the room type as {string}")
    public void userSelectTheRoomTypeAs(String roomType) {
        search_page.selectRoomType(roomType);
    }

    @And("user select the number of rooms as {string}")
    public void userSelectTheNumberOfRoomsAs(String rooms) {
        search_page.selectNumberOfRoom(rooms);
    }

    @And("user enter the check In Date as {string}")
    public void userEnterTheCheckInDateAs(String InDate) {
        search_page.enterCheckIn(InDate);
    }

    @And("user enter check Out Date as {string}")
    public void userEnterCheckOutDateAs(String outDate) {
        search_page.enterCheckOut(outDate);
    }

    @And("user select Adults per room as {string}")
    public void userSelectAdultsPerRoomAs(String adult) throws InterruptedException {
        search_page.selectAdultPerRoom(adult);
        Thread.sleep(5000);
    }

    @And("user select children per room as {string}")
    public void userSelectChildrenPerRoomAs(String child) throws InterruptedException {
        search_page.selectChildPerRoom(child);
        Thread.sleep(5000);
    }

    @And("user click the search button")
    public void userClickTheSearchButton() throws InterruptedException {
        search_page.clickMyItineryBtn();
        Thread.sleep(5000);
    }

    @And("user enter {string} as the first name")
    public void userEnterAsTheFirstName(String FName) {
        book_page = new Book_Page(base.driver);
        book_page.clickRadBtn();
        book_page.clickContBtn();
        book_page.enterFirstName(FName);
    }

    @And("user enter {string} as the last name")
    public void userEnterAsTheLastName(String LName) {
        book_page.enterLastName(LName);
    }

    @And("user enter {string} as the billing address")
    public void userEnterAsTheBillingAddress(String address) {
        book_page.enterAddress(address);
    }

    @And("user enter {string} as the credit card number")
    public void userEnterAsTheCreditCardNumber(String cerditCardNum) {
        book_page.enterCardNum(cerditCardNum);
    }

    @And("user select {string} as the credit card type")
    public void userSelectAsTheCreditCardType(String cardType) {
        book_page.enterCardType(cardType);
    }

    @And("user select month as {string} and expiry year as {string}")
    public void userSelectAsTheExpiryDate(String expiryMonth,String expiryYr) throws InterruptedException {
       book_page.enterExpiryMonth(expiryMonth);
       book_page.enterExpiryYear(expiryYr);
        Thread.sleep(5000);
    }

    @And("user enter {string} as the CVV number")
    public void userEnterAsTheCVVNumber(String cvv) throws InterruptedException {
        book_page.enterCvv(cvv);
        Thread.sleep(5000);
    }

    @And("user click on the Book Now button")
    public void userClickOnTheBookNowButton() throws InterruptedException {
        book_page.clickBookNowBtn();
        Thread.sleep(30000);
    }

    @Then("user should receive a booking confirmation number")
    public void userShouldReceiveABookingConfirmationNumber() {
    book_page.getBookingOrderNumber();
    }

    @And("user click on the My Itinerary button")
    public void userClickOnTheMyItineraryButton() {
        book_page.clickitineryBtn();
    }
    @And("user enter the retrieve order Number into search orderId")
    public void userEnterTheRetrieveOrderNumberIntoSearchOrderId() throws InterruptedException {
    String orderNo =book_page.enterOrderId();
    book_page.passingOrderId(orderNo);
    Thread.sleep(5000);
    book_page.clickGoBtn();
    waitImplicitly(30000);
    }
    @Then("user verifies the final page and take a screenshot")
    public void userVerifiesTheFinalPageAndTakeAScreenshot() {
      base.takeScreenshot("Booking_Confirmation_Screenshot");
    }
}






