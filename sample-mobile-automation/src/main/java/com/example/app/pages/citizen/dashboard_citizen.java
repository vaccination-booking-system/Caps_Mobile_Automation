package com.example.app.pages.citizen;

import com.example.app.base.basePageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class dashboard_citizen extends basePageObject {
    By onDashboardPage(){
        return By.xpath("//android.view.View[@content-desc=\"Booking Vaksin\"]");
    }

    public void verifyOnDashboardPage() throws Exception{
        Thread.sleep(800);
        Assertions.assertTrue(find(onDashboardPage()).isDisplayed());

    }
}
