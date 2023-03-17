// b)Faça um programa que recebe as notas P1, P2 e P3 e exibe a média considerando que a nota P1 tem peso 3, a nota P2 tem peso 3 e a nota P3 tem peso 4.

import javax.swing.JOptionPane;

public class ExB {

  public static void main(String[] args) {
    double p1, p2, p3, media;

    p1 =
      Double.parseDouble(
        JOptionPane.showInputDialog("Informe a primeira nota: ")
      );
    p2 =
      Double.parseDouble(
        JOptionPane.showInputDialog("Informe a segunda nota: ")
      );
    p3 =
      Double.parseDouble(
        JOptionPane.showInputDialog("Infrome a terceira nota ")
      );

    media = ((p1 * 3) + (p2 * 3) + (p3 * 4)) / 10;

    JOptionPane.showMessageDialog(null, "A sua média é: " + media);
  }
}
