package PageClass;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

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
        Thread.sleep(3000);

    }
    public static void Parfum() throws InterruptedException {
        driver.navigate().to("https://www.douglas.de/de/c/parfum/01");
        Thread.sleep(2000);
//        WebElement perfmenu = driver.findElement(By.xpath("//a[@id='navigation-main-entry-1']"));
//        perfmenu.click();
//        WebElement resultheader = driver.findElement(By.xpath("//h1[@class='spacing-reset mXonp2Ah9R9lo8rVDBJq product-overview__headline']"));
//        resultheader.getText();
//

//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//        WebElement perfmenu = driver.findElement(By.xpath("//a[@id='navigation-main-entry-1']"));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='navigation-main-entry-1']")));
//        perfmenu.click();
//
//        WebElement resultheader = driver.findElement(By.xpath("//h1[@class='spacing-reset mXonp2Ah9R9lo8rVDBJq product-overview__headline']"));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='spacing-reset mXonp2Ah9R9lo8rVDBJq product-overview__headline']")));
//        resultheader.getText();

    }
    public static void producttypeselect(String Producttype) throws InterruptedException {


        WebElement prodtypedd = driver.findElement(By.xpath("//*[text()='Produktart']"));
        prodtypedd.click();

//        WebElement selectprod = driver.findElement(By.xpath("//div[@class='facet-option__label']//div[contains(text(),'Eau de Parfum')]"));
//        selectprod.click();

    }
    public static void selectbrand(String brand) throws InterruptedException {
        WebElement brandpedd = driver.findElement(By.xpath("//*[text()='brand']"));
        brandpedd.click();

        WebElement selectbrand = driver.findElement(By.xpath("//*[text()='27 87 perfumes']"));
        selectbrand.click();

    }
    public static void chooseforwhom(String forWhom) throws InterruptedException {

        WebElement choosefor = driver.findElement(By.xpath("(//div[@class='facet__title'])[4]"));
        choosefor.click();

        WebElement chooseforunisex = driver.findElement(By.xpath("//div[contains(text(),'Unisex')]"));
        chooseforunisex.click();

    }

    public static void actiondd(String Actions) throws InterruptedException {

        WebElement actiondd = driver.findElement(By.xpath("//font[contains(text(),'Actions')]"));
        actiondd.click();

        WebElement newoption = driver.findElement(By.xpath("//font[contains(text(),'NEW')]"));
        newoption.click();

    }

    public static void filterresults(){
        WebElement product = driver.findElement(By.xpath("//div[@class='product-grid-column ui-col-6 ui-col-lg-3 ui-col-xl-3']"));
        product.getText();
    }
}
