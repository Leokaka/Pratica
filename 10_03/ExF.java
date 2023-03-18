// f)Faça um programa que exibe a área de um triângulo a partir da base e da altura fornecidas pelo usuário.

import javax.swing.JOptionPane;

public class ExF {

  public static void main(String[] args) {
    Double b, a, result;

    b =
      Double.parseDouble(
        JOptionPane.showInputDialog("Informe a base do seu triângulo: ")
      );

    a =
      Double.parseDouble(
        JOptionPane.showInputDialog("Informe a altura do seu triângulo: ")
      );

    result = (a * b) / 2;

    JOptionPane.showMessageDialog(null, "A área do seu triângulo é: " + result);
  }
}
