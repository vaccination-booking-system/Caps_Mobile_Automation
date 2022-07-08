package com.example.steps.citizen;

import com.example.app.pages.citizen.dashboard_citizen;
import com.example.app.pages.citizen.register_citizen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class citizen_register {

    register_citizen regcitiz = new register_citizen();
    dashboard_citizen dashcitiz = new dashboard_citizen();
    @Given("I am on login page for register")
    public void iAmOnLoginPageForRegister() throws Exception {
        regcitiz.daftarDisniDisplayed();
    }

    @When("I click Daftar disini on login page i directed to register page")
    public void iClickDaftarDisiniOnLoginPageIDirectedToRegisterPage()throws Exception {
        regcitiz.clickDaftarDisniButton();
    }

    @And("I input full name {string} for register")
    public void iInputFullNameForRegister(String arg0) throws Exception {
        regcitiz.inputnamaLengkap(arg0);
    }

    @And("I input NIK {string} for register")
    public void iInputNIKForRegister(String arg0) throws Exception {
        regcitiz.inputNIKforRegist(arg0);
    }

    @And("I input phone number {string} for register")
    public void iInputPhoneNumberForRegister(String arg0) throws Exception {
        regcitiz.inputNomorTelepon(arg0);
    }
    @And("I input Password {string} for register")
    public void iInputPasswordForRegister(String arg0) throws Exception {
        regcitiz.inputPasswordForRegist(arg0);
    }

    @And("I click register button")
    public void iClickRegisterButton() throws Exception {
        regcitiz.clickDaftarButton();
    }
    @Then("I get the register result {string}")
    public void iGetTheRegisterResult(String result) throws Exception {
        if (result.equals("dashboard_page")){
            Thread.sleep(500);
            dashcitiz.verifyOnDashboardPage();
        } else if (result.equals("stay on register page")){
            Thread.sleep(500);
            regcitiz.stayonRegistPage();
        } else if (result.equals("invalid password")){
            Thread.sleep(500);
            regcitiz.invalidPasswordDisplayed();
        } else if (result.equals("invalid phone number")){
            Thread.sleep(500);
            regcitiz.invalidNomorTelepon();
        } else if (result.equals("input your fullname")){
            Thread.sleep(500);
            regcitiz.namaLengkapNullDisplayed();
        } else if (result.equals("input your NIK")){
            Thread.sleep(500);
            regcitiz.nikNullDisplayed();
        } else  if (result.equals("input your password")){
            Thread.sleep(500);
            regcitiz.passwordForRegistNull();
        } else if(result.equals("input your phone number")){
            Thread.sleep(500);
            regcitiz.nomorTeleponNullDisplayed();
        } else if (result.equals("all error messages show up")){
            regcitiz.allNullErrorsShowUp();
        } else if (result.equals("password less than 8 chars")){
            regcitiz.invalidPasswordOnRegistDisplayed();
        }
    }
}
