package stepsDefinitions;

import static utils.Utils.aceitarAlerta;
import static utils.Utils.escreverNoAlertaEConfirmar;
import static utils.Utils.recusarAlerta;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.AlertsPage;

public class AlertsSteps {
	
	AlertsPage alertsPage = new AlertsPage();

	@Quando("^clicar no botao confirmar alerta$")
	public void clicarNoBotaoConfirmarAlerta() throws Throwable {
		alertsPage.clicarNoBotaoCornfirm();
	}

	@E("^o usuario confirmar o alerta$")
	public void oUsuarioConfirmarOAlerta() throws Throwable {
		aceitarAlerta();
	}
	
	@Entao("^o sistema apresenta a mensagem \"([^\"]*)\"$")
	public void oSistemaApresentaAMensagem(String msg) throws Throwable {
		alertsPage.validarMsgResult(msg);
	}

	@E("^o usuario recusar o alerta$")
	public void oUsuarioRecusarOAlerta() throws Throwable {
		recusarAlerta();
	}

	@Quando("^clicar no botao alerta texto$")
	public void clicarNoBotaoAlertaTexto() throws Throwable {
		alertsPage.clicarNoBotaoAlertaTexto();
	}

	@E("^o usuario escrever no alerta \"([^\"]*)\"$")
	public void oUsuarioEscreverNoAlerta(String msg) throws Throwable {
		escreverNoAlertaEConfirmar(msg);
	}

	@Entao("^o sistema apresenta a mensagem do alerta com texto \"([^\"]*)\"$")
	public void oSistemaApresentaAMensagemDoAlertaComTexto(String msg) throws Throwable {
		alertsPage.validarMsgAlertaTexto(msg);
	}

}
