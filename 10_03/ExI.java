// i)Faça um programa que, a partir da idade e o ano atual, calcule e exiba a idade que a pessoa teria na virada do próximo século.

import javax.swing.JOptionPane;

public class ExI {

  public static void main(String[] args) {
    int ida, ano, sec, result;

    ida =
      Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
    JOptionPane.showMessageDialog(null, "Perfeito!");

    ano =
      Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
    JOptionPane.showMessageDialog(null, "Perfeito! ");

    sec = 2100;
    result = (sec - ano) + ida;

    JOptionPane.showMessageDialog(
      null,
      "A sua idade no próximo século será " + result + " anos."
    );
  }
}
