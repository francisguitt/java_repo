import com.example.Users;

public class Main {
    public static void main(String[] args) {

        // chama  o method da classe Lopps
        Loops.loopsMethods();

        // chama o method calculater

        //Calculate.CalculateMethod();

        //instancia da classe
        // objeto criado apartir da classe users

        Users users = new Users();

        System.out.println("------------------------------");
        users.age = 30;
        users.name = "Jonh";
        users.lastName = "Doe";
        System.out.println("------------------------------");

        System.out.println("Nome: " + users.PrintName());
        System.out.println("Sobre Nome: " + users.PrintLastName());
        System.out.println("Idade: " + users.PrintAge());

        System.out.println("------------------------------");

    }

}