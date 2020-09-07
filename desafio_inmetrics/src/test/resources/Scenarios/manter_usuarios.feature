#language: pt

Funcionalidade: Cadastrar usuario
  Quero cadastrar um usuário do sistema

  Cenario: Cadastrar um usuario
    Dado   abrir pagina http://www.inmrobo.tk/accounts/signup/
    Quando preencho campo cadastro_campo_usuario de forma aleatoria
		E      preencho campo cadastro_campo_senha com valor 123456
		E      preencho campo cadastro_campo_repetir_senha com valor 123456
    E      clico em cadastro_botao_cadastrar		
		Entao  devo encontrar o valor 'Login' em login_titulo
		E      fechar pagina