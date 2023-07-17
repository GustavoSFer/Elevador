package com.elevador.main;

import src.Elevador;

public class Main {

  public static void main(String[] args) {
    Elevador elevador = new Elevador(8, 12);

    // Não existe pessoas no elevador, deve retornar a mensagem
    elevador.descerPessoas(2);
    // Não deve subir porque nao existe pessoas no elevador.
    elevador.subir(3);
    elevador.entrarPessoa(1);
    elevador.subir(3);
    elevador.subir(3);
    System.out.println(elevador.getAndarAtual());

    elevador.subir(6);
    System.out.println(elevador.getAndarAtual());
    // tentando subir mais. mas ja esta no ultimo andar
    elevador.subir(6);
    System.out.println(elevador.getAndarAtual());

  }

}
