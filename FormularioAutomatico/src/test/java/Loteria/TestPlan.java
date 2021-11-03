package Loteria;

import Loteria.Utils;
import Loteria.WebForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Loteria.Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Testando a interface da loteria")
    public static void testeInterface(){
        driver.get(Utils.BASE_URL);
        Loteria.WebForm webForm = new WebForm(driver);

        webForm.random();
        webForm.megaSena();
        webForm.lotoFacil();
        webForm.quina();

    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
