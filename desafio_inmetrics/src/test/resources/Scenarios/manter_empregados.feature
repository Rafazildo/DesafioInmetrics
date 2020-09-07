#language: pt

Funcionalidade: Cadastrar usuario
  Quero cadastrar um usu�rio do sistema

  Cenario: Cadastrar um empregado
    Dado   abrir pagina http://www.inmrobo.tk/accounts/login/
    E      preencho campo login_campo_usuario com valor RafaelSantosdeOliveira
		E      preencho campo login_campo_senha com valor 123456
    E      clico em login_botao_login
    E      espero 10000 milisegundos
    E      clico em empregados_botao_novo_funcionario
    Quando preencho campo empregados_campo_nome de forma aleatoria
    E      preencho campo empregados_campo_cpf com CPF
    E      seleciono o valor Indiferente na dropdown empregados_dropdown_sexo
    E      preencho campo empregados_campo_admissao com valor '10102019'  
    E      preencho campo empregados_campo_cargo com valor QA
    E      preencho campo empregados_campo_salario com valor '700000'
    E      clico em empregados_radio_clt
    E      clico em empregados_botao_enviar
    E      espero 10000 milisegundos
		Entao  devo encontrar o valor 'cadastrado com sucesso' em empregados_mensagem_sucesso
    E      fechar pagina
    
  Cenario: Alterar um empregado
    Dado   abrir pagina http://www.inmrobo.tk/accounts/login/
    E      preencho campo login_campo_usuario com valor RafaelSantosdeOliveira
		E      preencho campo login_campo_senha com valor 123456
    E      clico em login_botao_login
    E      espero 10000 milisegundos
    E      clico em empregados_botao_novo_funcionario
    E      preencho campo empregados_campo_nome de forma aleatoria
    E      preencho campo empregados_campo_cpf com CPF
    E      seleciono o valor Indiferente na dropdown empregados_dropdown_sexo
    E      preencho campo empregados_campo_admissao com valor '10/10/2019'  
    E      preencho campo empregados_campo_cargo com valor QA
    E      preencho campo empregados_campo_salario com valor '700000'
    E      clico em empregados_radio_clt
    E      clico em empregados_botao_enviar
    E      espero 10000 milisegundos
		E      devo encontrar o valor 'cadastrado com sucesso' em empregados_mensagem_sucesso
    E      preencho campo empregados_campo_pesquisar com o empregado cadastrado no cenario anterior
    E      clico em empregados_botao_editar    
    Quando limpo o campo empregados_campo_nome
    E      preencho campo empregados_campo_nome com valor FuncionarioAlterado
    E      limpo o campo empregados_campo_admissao
    E      preencho campo empregados_campo_admissao com valor '11/11/2019' 
    E      limpo o campo empregados_campo_cargo 
    E      preencho campo empregados_campo_cargo com valor Cargo alterado
    E      limpo o campo empregados_campo_salario
    E      preencho campo empregados_campo_salario com valor '1000000'
    E      clico em empregados_botao_enviar_alteracao
    E      espero 10000 milisegundos
		Entao  devo encontrar o valor 'atualizadas com sucesso' em empregados_mensagem_sucesso
    E      fechar pagina
    
Cenario: Excluir um empregado
    Dado   abrir pagina http://www.inmrobo.tk/accounts/login/
    E      preencho campo login_campo_usuario com valor RafaelSantosdeOliveira
		E      preencho campo login_campo_senha com valor 123456
    E      clico em login_botao_login
    E      espero 10000 milisegundos
    E      clico em empregados_botao_novo_funcionario
    E      preencho campo empregados_campo_nome de forma aleatoria
    E      preencho campo empregados_campo_cpf com CPF
    E      seleciono o valor Indiferente na dropdown empregados_dropdown_sexo
    E      preencho campo empregados_campo_admissao com valor '10102019'  
    E      preencho campo empregados_campo_cargo com valor QA
    E      preencho campo empregados_campo_salario com valor '700000'
    E      clico em empregados_radio_clt
    E      clico em empregados_botao_enviar
    E      espero 10000 milisegundos
		E      devo encontrar o valor 'cadastrado com sucesso' em empregados_mensagem_sucesso
    Quando preencho campo empregados_campo_pesquisar com o empregado cadastrado no cenario anterior
    E      clico em empregados_botao_excluir
    E      espero 10000 milisegundos
		Entao  devo encontrar o valor 'removido com sucesso' em empregados_mensagem_sucesso
    E      fechar pagina