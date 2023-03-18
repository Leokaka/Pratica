// a)Faça um programa que recebe três números reais e exibe a multiplicação desses números.

import javax.swing.JOptionPane;

public class ExA {

  public static void main(String[] args) {
    int a, b, c;
    int result;

    a =
      Integer.parseInt(
        JOptionPane.showInputDialog("Digite o primeiro número: ")
      );
    b =
      Integer.parseInt(
        JOptionPane.showInputDialog("Digite o segundo número: ")
      );
    c =
      Integer.parseInt(
        JOptionPane.showInputDialog("Digite o terceiro número: ")
      );

    result = a * b * c;

    JOptionPane.showMessageDialog(
      null,
      "A multiplicação dos números " +
      a +
      ", " +
      c +
      " e " +
      b +
      " é: " +
      result
    );
  }
}
