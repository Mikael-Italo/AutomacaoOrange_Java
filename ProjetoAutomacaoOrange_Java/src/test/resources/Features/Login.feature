#language: pt
#enconding: UTF-8
@WEB  

Funcionalidade: Login

  Contexto: 
    Dado que o usuario esteja na pagina principal do sistema

	@RealizarLogin 
  Esquema do Cenario: Realizar Login com Sucesso
    Quando informar o campo Username como "<usuario>"
    E informar o campo Password como "<senha>"
    E clicar no botao Login
    Entao o sistema devera autorizar o login, exibindo a pagina contendo o Dashboard

    Exemplos: 
      | usuario | senha    |
      | Admin   | admin123 |