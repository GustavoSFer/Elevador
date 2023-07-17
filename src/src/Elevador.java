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

  public void subir(int andar) {
    if (andar <= andarAtual) {
      System.out.println("Elevador subindo");
      this.andarAtual = andar;
    } else {
      System.out.println("Você ja esta no andar mais alto!");
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
