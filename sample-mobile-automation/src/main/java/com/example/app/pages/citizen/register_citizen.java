package com.example.app.pages.citizen;

import com.example.app.base.basePageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class register_citizen extends basePageObject {

    By daftarDisiniButton(){
        return By.xpath("//android.view.View[@content-desc=\"Daftar disini\"]");
    }
    By namaLengkapField(){
        return By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    By nikField(){
        return By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    By nomorTeleponField(){
        return By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }
    By passwordField(){
        return By.xpath("//android.view.View/android.view.View/android.view.View/android.widget.EditText[4]");
    }
    By daftarButton(){
        return By.xpath("//android.widget.Button[@content-desc=\"Daftar\"]");
    }
    By namaLengkapNull(){
        return By.xpath("//android.view.View[@content-desc=\"Masukkan Nama anda\"]");
    }
    By nikNull(){
        return By.xpath("//android.view.View[@content-desc=\"Masukkan NIK anda\"]");
    }
    By nomorTeleponNull(){
        return By.xpath("//android.view.View[@content-desc=\"Masukkan Nomor Telepon anda\"]");
    }
    By passwordNull(){
        return By.xpath("//android.view.View[@content-desc=\"Masukkan password anda\"]");
    }
    By invalidPassword(){
        return By.xpath("//android.view.View[@content-desc=\"Gunakan huruf kecil, kapital dan angka\"]");
    }
    By invalidnomorTelepon(){
        return By.xpath("//android.view.View[@content-desc=\"Masukkan Nomor Telepon yang Valid\"]");
    }
    By invalidPasswordonRegist(){
        return By.xpath("//android.view.View[@content-desc=\"Enter Valid password(min. 8 Character)\"]");
    }
    public void clickDaftarDisniButton() throws Exception{
        Thread.sleep(500);
        click(daftarDisiniButton());
    }
    public void inputnamaLengkap(String nama) throws Exception{
        click(namaLengkapField());
        Thread.sleep(500);
        type(namaLengkapField(),nama);
    }
    public void inputNIKforRegist(String nik) throws Exception{
        click(nikField());
        type(nikField(),nik);
    }
    public void inputNomorTelepon(String no) throws Exception{
        click(nomorTeleponField());
        Thread.sleep(500);
        type(nomorTeleponField(),no);
    }
    public void inputPasswordForRegist(String password) throws Exception{
        click(passwordField());
        type(passwordField(),password);
    }
    public void clickDaftarButton()throws Exception{
        Thread.sleep(500);
        click(daftarButton());
    }
    public void stayonRegistPage(){
        Assertions.assertTrue(find(daftarButton()).isDisplayed());
    }
    public void namaLengkapNullDisplayed() throws Exception {
        Thread.sleep(500);
        Assertions.assertTrue(find(namaLengkapNull()).isDisplayed());
    }
    public  void nikNullDisplayed() throws Exception {
        Thread.sleep(500);
        Assertions.assertTrue(find(nikNull()).isDisplayed());
    }
    public void nomorTeleponNullDisplayed() throws Exception {
        Thread.sleep(500);
        Assertions.assertTrue(find(nomorTeleponNull()).isDisplayed());
    }
    public void passwordForRegistNull() throws Exception {
        Thread.sleep(500);
        Assertions.assertTrue(find(passwordNull()).isDisplayed());
    }
    public void invalidPasswordDisplayed() throws Exception {
        Thread.sleep(500);
        Assertions.assertTrue(find(invalidPassword()).isDisplayed());
    }
    public void invalidNomorTelepon() throws Exception {
        Thread.sleep(500);
        Assertions.assertTrue(find(invalidnomorTelepon()).isDisplayed());
    }
    public void invalidPasswordOnRegistDisplayed() throws Exception {
        Thread.sleep(500);
        Assertions.assertTrue(find(invalidPasswordonRegist()).isDisplayed());
    }
    public void daftarDisniDisplayed() throws Exception {
        Thread.sleep(500);
        Assertions.assertTrue(find(daftarDisiniButton()).isDisplayed());
    }
    public void allNullErrorsShowUp() throws Exception {
        Thread.sleep(500);
        Assertions.assertTrue(find(namaLengkapNull()).isDisplayed());
        Thread.sleep(500);
        Assertions.assertTrue(find(nikNull()).isDisplayed());
        Thread.sleep(500);
        Assertions.assertTrue(find(nomorTeleponNull()).isDisplayed());
        Thread.sleep(500);
        Assertions.assertTrue(find(passwordNull()).isDisplayed());
    }



}
