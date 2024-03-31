

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // chama a o method da classe Lopps
      Loops.loopsMethods();



        //##########################

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
                Match.Addition(x, y);
                break;

            case "-":
                Match.Subtration(x, y);
                break;

            case "*":
                Match.Multiplication(x, y);
                break;

            case "/":
                Match.Division(x, y);
                break;

            default:
                String msg = "Operação invalida !";
                System.out.println(msg);
        }


    }

}