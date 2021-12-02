package components;

import java.util.Scanner;

public class Dvd extends Midia {
  private int nFaixas;

  /**
   * Getters e Setters
   */
  public int getNFaixas() {
    return this.nFaixas;
  }

  public void setNFaixas(int nFaixas) {
    this.nFaixas = nFaixas;
  }

  /**
   * Construtor padrão
   */
  public Dvd() {

  }

  /**
   * Construtor completo
   * 
   * @param c Código
   * @param p Preço
   * @param s Nome
   * @param f Número de faixas
   */
  public Dvd(int c, double p, String s, int f) {
    super(c, p, s);
    nFaixas = f;

  }

  /**
   * Método que retorna uma String com o nome da classe
   * 
   * @return Nome da classe
   */
  @Override
  public String getTipo() {
    return Dvd.class.getSimpleName();
  }

  /**
   * Método que retorna uma String com as informações contidas nos campos
   * 
   * @return Nome, preço, código e número de faixas
   */
  @Override
  public String getDetalhes() {
    return super.getDetalhes() + "\nNúmero de Faixas: " + nFaixas + "\nExibindo capa do DVD!";
  }

  /**
   * Método para atualizar o número de faixas
   * 
   * @param f número de faixas
   */
  public void setFaixas(int f) {
    nFaixas = (f > 0) ? f : 0;
  }

  /**
   * Método que insere os dados necessários para preencher os campos de um objeto
   * de uma dada classe
   */
  @Override
  public void inserirDados() {
    int f;
    Scanner sc = new Scanner(System.in);

    /**
     * Lendo os dados do teclado
     */
    super.inserirDados();
    System.out.println("Digite o número de faixas");
    f = sc.nextInt();

    setFaixas(f);
  }

}
