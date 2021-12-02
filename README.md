# POO_Cadastro_CD_E_DVD

Considere simular o cadastro de uma loja que vende CD e DVDS 

Considere, ainda, o detalhamento abaixo que fornece uma descrição dos métodos que deverão ser
elaborados para cada uma das classes:

(a) getTipo(): Retorna uma String com o nome da classe.
(b) getDetalhes(): Retorna uma String com as informações contidas nos campos.
(c) printDados(): Imprime as informações contidas nos campos da classe. Para tanto, usa
dois métodos para recuperar estas informações: getTipo() e getDetalhes(). Estas funções
por sua vez são polimórficas, ou seja, seu tipo retorno varia de acordo com a classe
escolhida, tal que este método é sobreposto nas subclasses.
(d) inserirDados(): Insere os dados necessários para se preencher os campos de um objeto
de uma dada classe. Seu comportamento é polimórfico.

Além dos métodos descritos acima, deverão ser criados os métodos get e set correspondentes para
retorna e modificar o conteúdo dos campos, respectivamente, bem como os construtores com e sem
parâmetros de cada classe.
Baseado no que foi apresentado, deseja-se inserir uma nova funcionalidade na qual ao se chamar
o método getDetalhes() das classes. Esta nova funcionalidade consiste em se tocar uma
música ao se chamar o método getDetalhes para um objeto da classe CD (por exemplo a primeira
música do CD) e mostrar uma imagem ao se chamar getDetalhes para um objeto da classe DVD (por
exemplo a capa do DVD). 
