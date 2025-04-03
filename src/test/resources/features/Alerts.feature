#language: pt
#encoding: UTF-8
#Autor: Antonio de Sousa Santos

@Alerts
Funcionalidade: Alerts

	@ConfirmarAlerta
	Cenario: Confirmar Alerta
		Quando clicar no botao confirmar alerta
		E o usuario confirmar o alerta
		Entao o sistema apresenta a mensagem "You selected Ok"
		
	@RecusarAlerta
	Cenario: Recusar Alerta
		Quando clicar no botao confirmar alerta
		E o usuario recusar o alerta
		Entao o sistema apresenta a mensagem "You selected Cancel"
		
	@EscreverNoAlerta
	Cenario: Escrever No Alerta
		Quando clicar no botao alerta texto
		E o usuario escrever no alerta "texto"
		Entao o sistema apresenta a mensagem do alerta com texto "texto"
		


		

		