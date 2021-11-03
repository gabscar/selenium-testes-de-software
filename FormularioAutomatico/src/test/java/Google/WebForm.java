package Google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject {

    private final String BUSCA = "Resposta para a vida, o universo e tudo mais";
    private final String RESPOSTA = "42";

    @FindBy(name = "q")
    private WebElement campo_busca;

    @FindBy(id = "cwos")
    private WebElement campo_resultado;

    @FindBy(name = "btnK")
    private WebElement botao_busca;

    @FindBy(className = "hgKElc")
    private WebElement span;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public String buscar(){
        this.campo_busca.clear();
        this.campo_busca.sendKeys(BUSCA);
        this.campo_busca.sendKeys(Keys.RETURN);

        return this.span.getText();
    }
}
