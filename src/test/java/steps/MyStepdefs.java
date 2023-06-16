package steps;

import WebDriver.WebDriverInit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TabunganEmasPage;

import java.io.IOException;

public class MyStepdefs {

    TabunganEmasPage tabunganEmasPage = new TabunganEmasPage(WebDriverInit.driver);
    @Given("Customer on Pegadaian login page")
    public void customerOnPegadaianLoginPage() {
        tabunganEmasPage.openPage();
    }

    @When("Customer input phone number and password")
    public void customerInputPhoneNumberAndPassword() throws InterruptedException {
        tabunganEmasPage.inputPhoneNumberandPassword();
    }

    @And("Customer click chapcha")
    public void customerClickChapcha() {
        tabunganEmasPage.clickCaptcha();
    }

    @And("Customer clic Masuk button")
    public void customerClicMasukButton() throws InterruptedException, IOException {
        tabunganEmasPage.clickMasukBtn();
    }

    @And("Customer click Buka Tabungan button")
    public void customerClickBukaTabunganButton() {
        tabunganEmasPage.clickBukaTabungan();
    }

    @And("Customer input all personal details")
    public void customerInputAllPersonalDetails() {
        tabunganEmasPage.inputAllPersonalDetails();
        tabunganEmasPage.clickBtnSelanjutnya();
    }

    @And("Customer input all branch detail")
    public void customerInputAllBranchDetail() {
        tabunganEmasPage.inputBranchLocation();
        Assert.assertEquals(tabunganEmasPage.getAddressIframe(),tabunganEmasPage.getAddressDetails());
        tabunganEmasPage.clickBtnSelanjutnya();
    }

    @And("Customer click check box agreement")
    public void customerClickCheckBoxAgreement() {
        tabunganEmasPage.clickAgreement();
        tabunganEmasPage.clickBtnSelanjutnya();
    }

    @And("Customer select BRI as payment method")
    public void customerSelectBRIAsPaymentMethod() {
    }

    @Then("Customer able to see the VA")
    public void customerAbleToSeeTheVA() {
    }
}
