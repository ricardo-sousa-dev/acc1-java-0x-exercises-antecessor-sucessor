package com.trybe.acc.java;

import java.util.Scanner;

public class AntecessorSucessor {

  /**
   * Método inicial.
   * 
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número:");
    int numero = scan.nextInt(); // lê um inteiro:
                                 // https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
    int antecessor = numero - 1;
    int sucessor = numero + 1;

    String novaString = "O número %s tem %s como seu antecessor e %s como seu sucessor.";
    System.out.format(novaString, numero, antecessor, sucessor); // https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

    scan.close(); // Fecha o Scanner:
                  // https://stackoverflow.com/questions/12519335/resource-leak-in-is-never-closed
  }

}
