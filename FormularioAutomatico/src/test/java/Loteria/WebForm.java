package Loteria;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject {

    @FindBy(name = "btn-random-game")
    private WebElement btn_random;

    @FindBy(name = "btn-add-cart")
    private WebElement btn_add;

    @FindBy(name = "btn-delete")
    private WebElement btn_delete;

    @FindBy(name = "Mega-Sena")
    private WebElement megasena;

    @FindBy(name = "Lotofácil")
    private WebElement lotofacil;

    @FindBy(name = "Quina")
    private WebElement quina;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void random(){
        this.btn_random.click();
        this.btn_add.click();
        this.btn_delete.click();
    }

    public void megaSena(){
        this.megasena.click();
        this.btn_random.click();
        this.btn_add.click();
    }

    public void lotoFacil(){
        this.lotofacil.click();
        this.btn_random.click();
        this.btn_add.click();
    }

    public void quina(){
        this.quina.click();
        this.btn_random.click();
        this.btn_add.click();
    }

}
