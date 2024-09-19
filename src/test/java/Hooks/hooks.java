package Hooks;


import Base.base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

    @Before
    public void setUp() {
        base.initializeBrowser("Chrome");
        base.openApplication("https://adactinhotelapp.com/");
        base.waitImplicitly(10);
        base.winMax();
    }

    @After
    public void tearDown(){
        base.quitBrowser();
}
}
