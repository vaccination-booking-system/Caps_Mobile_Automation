package com.example.steps.citizen;

import com.example.app.pages.citizen.dashboard_citizen;
import com.example.app.pages.citizen.login_citizen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class citizen_login {

    login_citizen logcitizen = new login_citizen();
    dashboard_citizen dashcitizen = new dashboard_citizen();

    @Given("I am on Evizy Login page")
    public void iAmOnEvizyLoginPage() {
        logcitizen.verifyOnLoginPage();
    }
    @When("I enter NIK {string} for login")
    public void iEnterNIKForLogin(String arg0) throws Exception {
        logcitizen.inputNIK(arg0);
    }

    @And("I enter Password {string} for login")
    public void iEnterPasswordForLogin(String arg0) throws Exception {
        logcitizen.inputPassword(arg0);
    }

    @And("I click login button")
    public void iClickLoginButton() throws Exception {
        logcitizen.clickLoginButton();
    }

    @Then("I get the login result {string}")
    public void iGetTheLoginResult(String result) throws Exception {
        if (result.equals("dashboard_page")){
            dashcitizen.verifyOnDashboardPage();
        } else if(result.equals("Masukkan NIK Anda")){
            logcitizen.nullNikDisplayed();
        } else if(result.equals("Masukkan Password Anda")){
            logcitizen.nullPasswordDisplayed();
        } else if(result.equals("Both alert for empty field show up")){
            logcitizen.nullPasswordDisplayed();
            logcitizen.nullNikDisplayed();
        } else if(result.equals("Enter Valid NIK")){
            logcitizen.nikLessThan16Displayed();
        } else {
            logcitizen.verifyOnLoginPage();
        }

    }

}
