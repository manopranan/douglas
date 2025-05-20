package PageClass;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import static BaseClass.DriverFactory.driver;

public class PageClass {
    static By carmoddd = By.xpath("(//div[@class='flex-row']//*[text()='Model'])/following::select[@class='w-100 forminput'][1]");



    public static void launchurl() throws InterruptedException {
        driver.get("https://www.douglas.de/de");
        Thread.sleep(4000);
    }
    public static void Consnet() throws InterruptedException {
        Actions actions = new Actions(driver);
        for (int i=0; i<8;i++){
            actions.sendKeys(Keys.TAB).perform();
        }
        actions.sendKeys(Keys.ENTER).perform();

    }
    public static void Parfum() throws InterruptedException {
        WebElement perfmenu = driver.findElement(By.xpath("//a[@id='navigation-main-entry-1']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(perfmenu).perform();
        perfmenu.click();
        Thread.sleep(9000);

        WebElement resultheader = driver.findElement(By.xpath("//h1[@class='spacing-reset mXonp2Ah9R9lo8rVDBJq product-overview__headline']"));
        actions.moveToElement(resultheader).perform();
        resultheader.getText();


//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//        WebElement perfmenu = driver.findElement(By.xpath("//a[@id='navigation-main-entry-1']"));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navigation-main-entry-1']")));
//        perfmenu.click();
//
//        WebElement resultheader = driver.findElement(By.xpath("//h1[@class='spacing-reset mXonp2Ah9R9lo8rVDBJq product-overview__headline']"));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='spacing-reset mXonp2Ah9R9lo8rVDBJq product-overview__headline']")));
//        resultheader.getText();

    }
    public static void firstvarient() throws InterruptedException {

    }
    public static void extdropdown() throws InterruptedException {

    }
    public static void enhance() throws InterruptedException {

    }
}
