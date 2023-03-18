// d)Faça um programa que lê o salário base de alguém e exibe o novo salário, considerando 5% de gratificação(mais dinheiro) e 7% de impostos(menos dinheiro)sobre o salário base. Também exiba a gratificação e o imposto.

import javax.swing.JOptionPane;

public class ExD {

  public static void main(String[] args) {
    double salario, imp, gtf, novSala;

    salario =
      Double.parseDouble(
        JOptionPane.showInputDialog("Informe o seu salário base: ")
      );

    imp = salario * 0.07;

    gtf = salario * 0.05;

    novSala = (salario + gtf) - imp;

    JOptionPane.showMessageDialog(
      null,
      "O seu salario base é " +
      salario +
      " , e a sua gratificação é " +
      gtf +
      " , o imposto é " +
      imp +
      " ,  e o seu novo salário é: " +
      novSala
    );
  }
}
