// e)Faça um programa que exibe a área de um retângulo a partir da base e da altura fornecidas pelo usuário.

import javax.swing.JOptionPane;

public class ExE {

  public static void main(String[] args) {
    double a, b, result;

    a =
      Double.parseDouble(
        JOptionPane.showInputDialog("Informe a altura do seu retângulo: ")
      );

    b =
      Double.parseDouble(
        JOptionPane.showInputDialog("Informe a base do seu retângulo: ")
      );

    result = a * b;

    JOptionPane.showMessageDialog(null, "A área do seu retângulo é: " + result);
  }
}
