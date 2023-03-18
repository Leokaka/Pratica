// c)Faça um programa que lê o salário atual de alguém e exibe o novo salário que é o atual com 25% de aumento.

import javax.swing.JOptionPane;

public class ExC {

  public static void main(String[] args) {
    double salario;
    double result;

    salario =
      Double.parseDouble(
        JOptionPane.showInputDialog("Informe o seu salário: ")
      );

    result = salario * 1.25;

    JOptionPane.showMessageDialog(null, "O seu novo salário é:" + result);
  }
}
