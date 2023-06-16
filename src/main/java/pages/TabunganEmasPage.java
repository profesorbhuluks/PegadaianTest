package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TabunganEmasPage {
    ChromeDriver driver;
    public TabunganEmasPage(ChromeDriver driver){
        this.driver = driver;
    }

    public void openPage(){
        driver.get("https://digital.pegadaian.co.id/login");
    }

    public void inputPhoneNumberandPassword() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("085891955026");
        Thread.sleep(500);
        driver.findElement(By.id("password")).sendKeys("QaTest1!");
    }

    public void clickCaptcha(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();



//        sitekey 6LfUXuoUAAAAADbof-5kVPAc8FT7QoYtqbQBsAmV"
//        Site key: 6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI
//        Secret key: 6LeIxAcTAAAAAGG-vFI1TnRWxMZNFuojJ4WifJWe


    }

    public void clickMasukBtn() throws InterruptedException {
         WebElement btnMasuk = driver.findElement(By.id("btn_submit_login"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnMasuk);
        Thread.sleep(500);
    }

    public void clickBukaTabungan(){
        driver.findElement(By.xpath("//a[.='Buka Tabungan']")).click();
    }

    public void inputAllPersonalDetails(){
        WebElement domisili = driver.findElement(By.xpath("//button[@data-id='form_control_1']")); //a[.='Dalam negeri']
        WebElement namaKTP = driver.findElement(By.xpath("//label[.='Nama Sesuai KTP']"));
        driver.findElement(By.name("ibu_kandung")).sendKeys("Marian Jola");
        driver.findElement(By.name("tanggal_lahir")).sendKeys("1995-08-07");
        driver.findElement(By.xpath("//a[.='Laki-laki']")).click();
        driver.findElement(By.name("jalan")).sendKeys("Alamat lengkap");
        driver.findElement(By.xpath("//a[.='BANTEN']")).click();
        driver.findElement(By.xpath("//a[.='SERANG']")).click();
        driver.findElement(By.xpath("//span[.='BANDUNG']")).click();
        driver.findElement(By.xpath("//a[.='BABAKAN']")).click();
        driver.findElement(By.xpath("//a[.='Belum Menikah']")).click();
        driver.findElement(By.xpath("//a[.='KTP']")).click();
        driver.findElement(By.name("no_identitas")).sendKeys("1100220708950000");
        driver.findElement(By.xpath("//label[@class='file_upload']")).sendKeys("file dr local");
    }

    public void clickBtnSelanjutnya(){
        driver.findElement(By.id("btn_step_modal")).click();
    }

    public void inputBranchLocation(){
        WebElement pcName = driver.findElement(By.id("pac-input"));
        pcName.sendKeys("CP Serang");
        pcName.sendKeys(Keys.RETURN);
        driver.findElement(By.xpath("//img[@src='https://maps.gstatic.com/mapfiles/transparent.png']")).click();
    }

    public String getAddressIframe(){
        return driver.findElement(By.xpath("//p[contains(.,'JL.DIPONEGORO NO.75 ----- POCIS, KOTABARU, SERANG, SERANG, BANTEN')]")).getText();
    }

    public String getAddressDetails(){
        return driver.findElement(By.name("alamatOutlet")).getText();
    }

    public void clickAgreement(){
        driver.findElement(By.xpath("//div[@class='md-checkbox']//span[@class='box']")).click();
    }


}
