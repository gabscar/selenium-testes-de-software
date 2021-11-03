package Sac;

import Loteria.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WebForm extends PageObject {

    private final String USUARIO = "tecno00";
    private final String SENHA = "sacrei00";

    @FindBy(name = "login")
    private WebElement login;

    @FindBy(name = "senha")
    private WebElement senha;

    @FindBy(id = "vendas")
    private WebElement vendas;

    @FindBy(id = "cadastrar-venda")
    private WebElement cadastrar_venda;

    @FindBy(id = "form-vendas")
    private WebElement form_vendas;

    @FindBy(name = "ade")
    private WebElement ade;

    @FindBy(name = "promotora")
    private WebElement promotora;

    @FindBy(name = "cpf-cliente")
    private WebElement cpf_cliente;

    @FindBy(name = "nome-cliente")
    private WebElement nome_cliente;

    @FindBy(name = "tel-cliente")
    private WebElement tel_cliente;

    @FindBy(name = "esp-matricula")
    private WebElement esp_matricula;

    @FindBy(name = "parcela-anterior")
    private WebElement parcela_anterior;

    @FindBy(name = "saldo-devedor")
    private WebElement saldo_devedor;

    @FindBy(name = "banco-anterior")
    private WebElement banco_anterior;

    @FindBy(name = "parcela")
    private WebElement parcela;

    @FindBy(name = "valor-liberado")
    private WebElement valor_liberado;

    @FindBy(name = "banco")
    private WebElement banco;

    @FindBy(name = "operador")
    private WebElement operador;

    @FindBy(name = "observacoes")
    private WebElement observacoes;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void login(){
        this.login.sendKeys(USUARIO);
        this.senha.sendKeys(SENHA);
        this.senha.sendKeys(Keys.RETURN);
    }

    public void cadastrarVenda(){
        this.ade.sendKeys("0000");
        Select pr = new Select(promotora);
        pr.selectByIndex(2);
        this.cpf_cliente.sendKeys("012.345.678-90");
        this.nome_cliente.sendKeys("João Silva Santos");
        this.tel_cliente.sendKeys("79991234567");
        this.esp_matricula.sendKeys("42");
        this.parcela_anterior.sendKeys("457.65");
        this.saldo_devedor.sendKeys("45000");
        Select ba = new Select(banco_anterior);
        ba.selectByIndex(4);
        this.parcela.sendKeys("200.00");
        this.valor_liberado.sendKeys("9542.48");
        Select b = new Select(banco);
        b.selectByIndex(3);
        this.operador.sendKeys("Josias Tadeu Silva");
        this.observacoes.sendKeys("Lorem ipsum quam dolor et amet");
        this.form_vendas.submit();
    }

}
