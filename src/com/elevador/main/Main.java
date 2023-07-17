package com.elevador.main;

import src.Elevador;

public class Main {

  public static void main(String[] args) {
    Elevador elevador = new Elevador(8, 12);

    // Não existe pessoas no elevador, deve retornar a mensagem
    elevador.descerPessoas(2);

  }

}
