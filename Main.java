import com.example.Car;
import com.example.Users;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

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
        long id = users.printId();

        System.out.println("Nome Completo: " + fullname);
        System.out.println("Idade: " + age);
        System.out.println("Token: " + id);

        System.out.println("###############################");

        // Criando o objeto car apartir da classe Car.

        Car car = new Car( // Passando os valores para o construtor da classe Car.
                "Chevrolet",
                2012,
                "Prata",
                "Sedan",
                12555);


        // Inicializando as variaveis com  os methodos da classe Car.
        String brand = car.getBrand();
        int carage = car.getAge();
        String color = car.gtColor();
        String model = car.getModel();
        double miliage = car.getMiliegae();

        // printando os resultados na tela.
        System.out.println("Marca: " + brand);
        System.out.println("Ano: " + carage);
        System.out.println("cor: " + color);
        System.out.println("modelo: " + model);
        System.out.println("Quilometragem: " + miliage);


    }


}