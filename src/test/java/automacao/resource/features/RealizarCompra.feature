#encoding: iso-8859-1
################################################
########## Scenarios: Automations Tests ################
################################################
@RealizarCompraTestes
Feature: Automation Tests Scenarios

  @001_RealizarCompras_Adicionarumproduto  
  Scenario: Adicionar um produto ao carrinho com sucesso
    Given T001_RealizarLoginComSucesso
    And T001_AdicionarProdutoNocarrinho