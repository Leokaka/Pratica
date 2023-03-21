// g)Faça um programa que exibe a área de um círculo a partir do perímetro fornecido pelo usuário.

import java.util.Scanner;

public class ExG {

  public static void main(String[] args) {
    double raio, area;
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o raio do seu circulo: ");
    raio = sc.nextDouble();

    area = Math.PI * raio * raio;

    System.out.println("A área do seu circulo é: " + area);

    sc.close();
  }
}
