package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class base {
    public static WebDriver driver;
    public  static void  initializeBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver= new EdgeDriver();
        }
        else{
            throw new IllegalArgumentException("Browser not found");
        }
        driver.manage().window().maximize();
    }
public static void openApplication(String url){
        driver.get(url);
}
public static void winMax(){
        driver.manage().window();
}
public static void waitImplicitly(int sec){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
}
public static void quitBrowser(){
        driver.quit();
}
    public static void takeScreenshot(String fileName) {
        // Cast driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        // Take screenshot and store it as a file
        File source = ts.getScreenshotAs(OutputType.FILE);
        // Define the destination path
        File destination = new File("./screenshots/" + fileName + ".png");
        try {
            // Copy the screenshot to the destination path
            FileHandler.copy(source, destination);
        } catch (IOException e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
}
}
}


