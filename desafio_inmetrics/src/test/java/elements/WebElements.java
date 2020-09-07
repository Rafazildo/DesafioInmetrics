package elements;

import java.util.HashMap;
import java.util.Map;

public abstract class WebElements {
	public static Map<String, IBy> _webElements = new HashMap<String, IBy>() {
		private static final long serialVersionUID = 1L;
		{ 
			  //Tela Login
			  put("login_titulo"                         , new ByXpath("/html/body/div/div[2]/div/form/span"));
			  put("login_campo_usuario"                  , new ByXpath("/html/body/div/div[2]/div/form/div[3]/input"));
			  put("login_campo_senha"                    , new ByXpath("/html/body/div/div[2]/div/form/div[5]/input"));
			  put("login_botao_login"                    , new ByXpath("/html/body/div/div[2]/div/form/div[6]/button"));			  
			  
			  //Tela cadastro 
			  put("cadastro_campo_usuario"               , new ByXpath("/html/body/div/div/div/form/div[2]/input"));
			  put("cadastro_campo_senha"                 , new ByXpath("/html/body/div/div/div/form/div[4]/input"));
			  put("cadastro_campo_repetir_senha"         , new ByXpath("/html/body/div/div/div/form/div[6]/input"));
			  put("cadastro_botao_cadastrar"             , new ByXpath("/html/body/div/div/div/form/div[7]/button"));
			  put("cadastro_mensagem_erro"               , new ByXpath("/html/body/div/div/div/form/div[1]/span/div"));
			  
			  //Tela Empregados
			  put("empregados_botao_sair"               , new ByXpath("//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a"));			  
			  put("empregados_botao_novo_funcionario"   , new ByXpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a"));
			  put("empregados_campo_nome"               , new ById("inputNome"));
			  put("empregados_campo_cpf"                , new ById("cpf"));
			  put("empregados_dropdown_sexo"            , new ById("slctSexo"));
			  put("empregados_campo_admissao"           , new ById("inputAdmissao"));			  
			  put("empregados_campo_cargo"              , new ById("inputCargo"));			  
			  put("empregados_campo_salario"            , new ById("dinheiro")); 
			  put("empregados_radio_clt"                , new ById("clt")); 			  
			  put("empregados_botao_enviar"             , new ByXpath("/html/body/div/div[2]/div/form/div[3]/input"));
			  put("empregados_botao_enviar_alteracao"   , new ByXpath("/html/body/div/div/div/form/div[3]/input"));			  
			  put("empregados_mensagem_sucesso"         , new ByXpath("/html/body/div/div[1]/div"));
			  put("empregados_campo_pesquisar"          , new ByXpath("//*[@id=\"tabela_filter\"]/label/input"));
			  put("empregados_botao_editar"             , new ByXpath("//*[@id=\"tabela\"]/tbody/tr[1]/td[6]/a[2]/button"));	
			  put("empregados_botao_excluir"            , new ByXpath("//*[@id=\"tabela\"]/tbody/tr[1]/td[6]/a[1]/button"));			  
			  
			  
			  
			  
		  }
	 };

	public static Map<String, IBy> GetWebElements()
  {
		return _webElements;                                                                                                                                                                                                              
  }
}