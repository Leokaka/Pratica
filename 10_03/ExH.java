// h)Faça  um  programa  que exibe  quantos  litros  de  combustível  são  gastos  por  um  carro  em  um dado percurso. Serão fornecidos pelo usuário a distância percorrida(em km)e a quantidade de litros gastos por km.

import javax.swing.JOptionPane;

public class ExH {

  public static void main(String[] args) {
    double dist, lit, result;

    dist =
      Double.parseDouble(
        JOptionPane.showInputDialog("Informe a distancia percorrida em km: ")
      );
    JOptionPane.showMessageDialog(null, "Perfeito! ");

    lit =
      Double.parseDouble(
        JOptionPane.showInputDialog(
          "Agora me informe a quantidade de litros gasto por km: "
        )
      );
    JOptionPane.showMessageDialog(null, "Perfeito! ");

    result = dist * lit;

    JOptionPane.showMessageDialog(
      null,
      "O gasto total de litros é de: " + result
    );
  }
}
