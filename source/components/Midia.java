package components;

import java.util.Scanner;

public abstract class Midia {
  private int codigo;
  private double preco;
  private String nome;

  /**
   * Getters e setters
   */
  public int getCodigo() {
    return this.codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public double getPreco() {
    return this.preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Construtor padrão
   */
  public Midia() {

  }

  /**
   * Construtor completo
   * 
   * @param c Código
   * @param p Preco
   * @param n Nome
   */
  public Midia(int c, double p, String n) {
    codigo = c;
    preco = p;
    nome = n;
  }

  /**
   * Método que retorna uma String com o nome da classe
   * 
   * @return Nome da classe
   */
  public String getTipo() {
    return Midia.class.getSimpleName();
  }

  /**
   * Método que retorna uma String com as informações contidas nos campos
   * 
   * @return Nome, preço e código
   */
  public String getDetalhes() {
    return "Nome: " + nome + "\nPreço: R$" + preco + "\nCodigo: " + codigo;
  }

  /**
   * Método que imprime as informações contidas nos campos
   */
  public void printDados() {
    System.out.println("--------------");
    System.out.println(getTipo());
    System.out.println(getDetalhes());
    System.out.println("--------------");
  }

  /**
   * Método que insere os dados necessários para se preencher os campos de um
   * objeto de uma dada classe
   * 
   */
  public void inserirDados() {
    Scanner sc = new Scanner(System.in);
    int c;
    double p;
    String n;

    /**
     * Lendo os dados do teclado
     */
    System.out.println(getTipo());
    System.out.println("Digite o nome: ");
    n = sc.nextLine();
    System.out.println("Digite o código: ");
    c = sc.nextInt();
    System.out.println("Digite o preço: ");
    p = sc.nextDouble();

    /**
     * Setando os dados lidos paras as funções
     */
    setNome(n);
    setCodigo(c);
    setPreco(p);
  }

}
