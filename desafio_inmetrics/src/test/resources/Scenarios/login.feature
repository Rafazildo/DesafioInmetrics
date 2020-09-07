#language: pt

Funcionalidade: Cadastrar usuario
  Quero cadastrar um usuário do sistema

  Cenario: Cadastrar um usuario
    Dado   abrir pagina http://www.inmrobo.tk/accounts/login/
    Quando preencho campo login_campo_usuario com valor RafaelSantosdeOliveira
		E      preencho campo login_campo_senha com valor 123456
    E      clico em login_botao_login	
		Entao  devo encontrar o valor 'SAIR' em empregados_botao_sair
		E      fechar pagina
