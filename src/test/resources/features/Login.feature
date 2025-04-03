#language: pt
#encoding: UTF-8
#Autor: Antonio de Sousa Santos

@Login
Funcionalidade: Login

	@LoginSucesso
	Cenario: Cenario login
		Quando informar o campo usuario "antonioSantos"
		E informar o campo senha "Teste0**"
		E clicar no botao login
		Entao o sistema apresenta a mensagem de usuario logado "AntonioSantos"
		
	@LoginInvalido
	Cenario: Cenario login
		Quando informar o campo usuario "adsa"
		E informar o campo senha "sdfsdf"
		E clicar no botao login
		Entao o sistema apresenta a mensagem de erro de login "Invalid username or password!"

		

		