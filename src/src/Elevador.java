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
    this.qtdPessoaElevador = 0;
  }

  public void subir(int andar) {
    if (this.qtdPessoaElevador <= 0) {
      System.out.println("Não existe pessoas dentro do elevador!");
    } else if (andar > 0 && andar >= andarAtual) {
      System.out.println("Elevador subindo");
      this.andarAtual += andar;
    } else {
      System.out.println("Você ja esta no andar mais alto!");
    }
  }

  public void descer(int andar) {
    if (this.qtdPessoaElevador <= 0) {
      System.out.println("Não existe pessoas no elevador!");
    } else if (andar >= 0 && this.andarAtual >= andar) {
      System.out.println("Elevador descendo");
      this.andarAtual -= andar;
    } else {
      System.out.println("Você ja esta no andar mais baixo ou o numero informado é não desce mais");
    }
  }

  public void entrarPessoa(int qtd) {
    if (this.qtdPessoaElevador + qtd > this.qtdCapacidade) {
      System.out.println("elevador não suporta essa quantidade de pessoas dentro dele");
    } else {
      System.out.println("Entrando pessoas!");
      this.qtdPessoaElevador += qtd;
    }
  }

  public void descerPessoas(int qtd) {
    if (this.qtdPessoaElevador < qtd) {
      System.out.println("exite menas pessoas dentro do elevador");
    } else {
      System.out.println("Saindo pessoas!");
      this.qtdPessoaElevador -= qtd;
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

  public int getQtdPessoaElevador() {
    return this.qtdPessoaElevador;
  }

}
