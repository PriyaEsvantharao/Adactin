package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Page {
    WebDriver driver;
    private String orderNo;

    @FindBy(id="first_name")
    WebElement fName;

    @FindBy(id = "last_name")
    WebElement lName;

    @FindBy(id = "address")
     WebElement add;

    @FindBy(id="cc_num")
     WebElement ccNum;

    @FindBy(id="cc_type")
     WebElement ccType;

    @FindBy(id="cc_exp_month")
     WebElement expMonth;

    @FindBy(id = "cc_exp_year")
     WebElement expYr;

    @FindBy(id="cc_cvv")
     WebElement cvvNum;

    @FindBy(xpath = "//input[@id='book_now']")
     WebElement bookBtn;

    @FindBy(id = "radiobutton_0")
    WebElement radBtn;

    @FindBy(id="continue")
    WebElement contBtn;

    @FindBy(xpath = "//input[@id='order_no']")
    WebElement BookingNum;

    @FindBy(xpath = "//input[@id='my_itinerary']")
    WebElement itineryBtn;

    @FindBy(xpath = "//input[@id='order_id_text']")
    WebElement seacrhOrderBox;

    @FindBy(id = "search_hotel_id")
    WebElement goBtn;

    public void clickRadBtn() {
        radBtn.click();
    }
    public void clickContBtn() {
        contBtn.click();
    }
    public Book_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void enterFirstName(String firstName) {
        fName.sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        lName.sendKeys(lastName);
    }
    public void enterAddress( String address) {
        add.sendKeys(address);
    }
    public void enterCardNum( String cardNumber) {
        ccNum.sendKeys(cardNumber);
    }
    public void enterCardType(String cardType) {
        ccType.sendKeys(cardType);
    }
    public void enterExpiryMonth(String expiryMonth) {
        expMonth.sendKeys(expiryMonth);
    }
    public void enterExpiryYear(String expiryYr){
        expYr.sendKeys(expiryYr);
    }
    public void enterCvv( String cvv){
        cvvNum.sendKeys(cvv);
    }
    public void clickBookNowBtn() {
        bookBtn.click();
    }
    public void getBookingOrderNumber() {
        orderNo = BookingNum.getAttribute("value");
        System.out.println("Order NO :"+ orderNo);
    }
    public void clickitineryBtn(){
    itineryBtn.click();
    }
    public void passingOrderId(String orderNo){
        seacrhOrderBox.sendKeys(orderNo);
    }
    public String enterOrderId() {
        return orderNo;
    }
    public void clickGoBtn(){
        goBtn.click();
    }
}
