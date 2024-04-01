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

        users.age = 30;
        users.name = "Jonh";
        users.lastName = "Doe";


        String fullname = users.PrintFullName();
        int age = users.PrintAge();

        System.out.println("Nome Completo: " + fullname);
        System.out.println("Idade: " + age);




    }

}