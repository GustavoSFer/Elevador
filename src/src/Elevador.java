package src;

public class Elevador {
  private int qtdCapacidade;
  private int totalAndares;
  private int andarAtual;
  private int qtdPessoaElevador;

  public Elevador(int capacidade, int totalAndares) {
    this.qtdCapacidade = capacidade;
    this.totalAndares = totalAndares;
    this.andarAtual = 0;
  }

  public void subir(int andar) {
    if (andar > 0 && andar <= andarAtual && this.qtdPessoaElevador > 0) {
      System.out.println("Elevador subindo");
      this.andarAtual = andar;
    } else {
      System.out.println("Você ja esta no andar mais alto!");
    }
  }

  public void descer(int andar) {
    if (andar >= 0 && this.andarAtual >= 0 && this.qtdPessoaElevador > 0) {
      System.out.println("Elevador descendo");
      this.andarAtual = andar;
    } else {
      System.out.println("Você ja esta no andar mais baixo!");
    }
  }

  public int getQtdCapacidade() {
    return qtdCapacidade;
  }

  public int getTotalAndares() {
    return totalAndares;
  }

  public int getAndarAtual() {
    return andarAtual;
  }

}
