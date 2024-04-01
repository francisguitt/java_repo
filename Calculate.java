import javax.swing.*;
import java.util.Scanner;

public class Calculate {

     public static  void CalculateMethod() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("------------Calculadora-----------");

        System.out.println("Digite um número");
        int x = prompt.nextInt();

        prompt.nextLine();
        System.out.println("Digite a operação");
        String operation = prompt.nextLine();

        System.out.println("Digite o proximo  número");
        int y = prompt.nextInt();

        switch (operation) {
            case "+":
                Addition(x, y);
                break;

            case "-":
                Subtration(x, y);
                break;

            case "*":
                Multiplication(x, y);
                break;

            case "/":
                Division(x, y);
                break;

            default:
                String msg = "Operação invalida !";
                System.out.println(msg);
        }

    }

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
