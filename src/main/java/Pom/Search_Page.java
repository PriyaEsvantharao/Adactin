package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
    WebDriver driver;

    @FindBy(id = "location")
    WebElement loc;

    @FindBy(id = "hotels")
    WebElement hot;

    @FindBy(id = "room_type")
    WebElement Type;

    @FindBy(id = "room_nos")
    WebElement numOfRooms ;

    @FindBy(id = "datepick_in")
    WebElement CheckIn;

    @FindBy(id = "datepick_out")
    WebElement CheckOut;

    @FindBy(id = "adult_room")
    WebElement AdultPerRoom ;

    @FindBy(id = "child_room")
    WebElement childPerRoom;

    @FindBy(xpath = "//input[@id='Submit']")
    WebElement SrchBtn;

    public Search_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void selectLocation(String location){
        loc.sendKeys(location);
    }
    public void selectHotel(String Hotel){
    hot.sendKeys(Hotel);
    }
    public void selectRoomType(String roomType){
    Type.sendKeys(roomType);
    }
    public void selectNumberOfRoom(String num) {
    numOfRooms.sendKeys(num);
    }
    public void enterCheckIn(String checkIn){
        CheckIn.sendKeys(checkIn);
    }
    public void enterCheckOut(String checkOut){
        CheckOut.sendKeys(checkOut);
    }
    public void selectAdultPerRoom(String AdultNum) {
        AdultPerRoom.sendKeys(AdultNum);
    }
    public void selectChildPerRoom(String childNum){
        childPerRoom.sendKeys(childNum);
    }
    public void clickMyItineryBtn(){
        SrchBtn .click();

    }
}