package src;

public class Elevador {
  private int qtdCapacidade;
  private int totalAndares;
  private int andarAtual;

  public Elevador(int capacidade, int totalAndares) {
    this.qtdCapacidade = capacidade;
    this.totalAndares = totalAndares;
    this.andarAtual = 0;
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
