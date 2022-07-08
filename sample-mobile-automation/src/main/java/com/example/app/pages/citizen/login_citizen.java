package com.example.app.pages.citizen;

import com.example.app.base.basePageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class login_citizen extends basePageObject {

    By nikField(){
        return By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    By passwordField(){
        return By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    By seePassword(){
        return By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[2]/android.widget.Button");
    }
    By loginButton(){
        return By.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    }
    By errorMessageForNullNIK(){
        return By.xpath("//android.view.View[@content-desc=\"Masukkan NIK anda\"]");
    }
    By errorMessageForNullPassword(){
        return By.xpath("//android.view.View[@content-desc=\"Masukkan password anda\"]");
    }

    By nikLessThan16Chars(){
        return By.xpath("//android.view.View[@content-desc=\"Enter Valid NIK( 16 Character)\"]");
    }

    public void inputNIK(String nik)throws Exception{
        Thread.sleep(800);
        click(nikField());
        Thread.sleep(800);
        type(nikField(),nik);
    }
    public void inputPassword(String pass) throws Exception{
        Thread.sleep(800);
        click(seePassword());
        click(passwordField());
        type(passwordField(),pass);
    }
    public void clickLoginButton() throws Exception{
        Thread.sleep(500);
        click(loginButton());
    }

    public void nullNikDisplayed() throws Exception{
        Thread.sleep(500);
        Assertions.assertTrue(find(errorMessageForNullNIK()).isDisplayed());
    }
    public void nullPasswordDisplayed() throws Exception{
        Thread.sleep(500);
        Assertions.assertTrue(find(errorMessageForNullPassword()).isDisplayed());
    }
    public void nikLessThan16Displayed() throws Exception {
        Thread.sleep(500);
        Assertions.assertTrue(find(nikLessThan16Chars()).isDisplayed());
    }
    public void verifyOnLoginPage(){
        Assertions.assertTrue(find(loginButton()).isDisplayed());
    }



}
