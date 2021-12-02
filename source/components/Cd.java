package components;

import java.util.Scanner;

public class Cd extends Midia {
  private int nMusicas;

  /**
   * Getters e Setters
   */
  public int getNMusicas() {
    return this.nMusicas;
  }

  public void setNMusicas(int nMusicas) {
    this.nMusicas = nMusicas;
  }

  /**
   * Construtor padrão
   */
  public Cd() {

  }

  /**
   * Construtor completo
   * 
   * @param c Código
   * @param p Preço
   * @param s Nome
   * @param m Número de Músicas
   */
  public Cd(int c, double p, String s, int m) {
    super(c, p, s);
    nMusicas = m;
  }

  /**
   * Método que retorna uma String com o nome do objeto
   * 
   * @return Nome do objeto
   */
  @Override
  public String getTipo() {
    return Cd.class.getSimpleName();
  }

  /**
   * Método que retorna uma String com as informações contidas nos campos
   * 
   * @return Nome, preço, código e número de músicas
   */
  @Override
  public String getDetalhes() {
    return super.getDetalhes() + "\nNúmero de Músicas: " + nMusicas + "\nTocando música!";
  }

  /**
   * Método para atualizar o número de músicas
   * 
   * @param m Número de músicas
   */
  public void setMusica(int m) {
    nMusicas = (m > 0) ? m : 0;
  }

  /**
   * Método que insere os dados necessários para se preencher os campos de um
   * objeto de uma dada classe
   * 
   */
  @Override
  public void inserirDados() {
    int m;
    Scanner sc = new Scanner(System.in);

    /**
     * Lendo dados do teclado
     */
    super.inserirDados();
    System.out.println("Digite o número de músicas: ");
    m = sc.nextInt();

    setNMusicas(m);
  }
}
