#language: pt
#encoding: UTF-8
#Autor: Antonio de Sousa Santos

@Checkbox
Funcionalidade: Checkbox

	@SelecionarCheboxes
	Cenario: Cenario selecionar checkboxes
		Quando expandir a pasta home
		E expandir a pasta Downloads
		E clicar no checkbox Word File
		E clicar no checkbox Excel File
		Entao o sistema apresenta a mensagem de arquivos selecionados "You have selected : downloads wordFile excelFile"

		
		

		