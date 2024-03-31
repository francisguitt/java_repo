import javax.swing.*;

public class Match {

    static void Addition(int x, int y) {
        JOptionPane.showMessageDialog(null, "Soma: " + (x + y));
        System.out.println("Soma:" + (x + y));
    }

    static void Subtration(int x, int y) {
        JOptionPane.showMessageDialog(null, "Subtração: " + (x - y));
        System.out.println("Subtração: " + (x - y));
    }

    static void Multiplication(int x, int y) {
        JOptionPane.showMessageDialog(null, "Multiplicação: " + (x * y));
        System.out.println("Multiplicação: " + (x * y));
    }

    static void Division(int x, int y) {
        if (y != 0) {
            JOptionPane.showMessageDialog(null, "Divisão: " + (double) x / y);
            System.out.println("Divisão: " + (double) x / y);
        } else {
            JOptionPane.showMessageDialog(null, "Não pode ser dividido por 0");
        }
    }
}
