
import com.example.Car;
import com.example.GetterSetter;
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
        long id = users.printId();

        System.out.println("Nome Completo: " + fullname);
        System.out.println("Idade: " + age);
        System.out.println("Token: " + id);

        System.out.println("---------------------------------");

        // Criando o objeto car1 apartir da classe Car.

        Car car1 = new Car("Chevrolet", 2012, "Prata", "Sedan", 12555);
//        // Criando o objeto car2 apartir da classe Car.
        Car car2 = new Car("Ford", 2012, "Preto", "Sedan", 1200);

        // sets
        car1.setBrand("Fiat");
        car1.setAge(2010);
        car1.setColor("verde");


        // Inicializando as variaveis com  os methodos da classe Car.
        String brand1 = car1.getBrand();
        int carage1 = car1.getAge();
        String color1 = car1.getColor();
        String model1 = car1.getModel();
        double miliage1 = car1.getMiliegae();

        String brand2 = car2.getBrand();
        int carage2 = car2.getAge();
        String color2 = car2.getColor();
        String model2 = car2.getModel();
        double miliage2 = car2.getMiliegae();


        System.out.println("Marca: " + brand1);
        System.out.println("Ano: " + carage1);

        System.out.println("-----------------------------------");

        System.out.println("Marca: " + brand2);
        System.out.println("Ano: " + carage2);


        System.out.println("----------------GetsSets-------------------");



        GetterSetter gettersSetters = new GetterSetter();

        gettersSetters.setItem("Arroz");
        gettersSetters.setDescription("arroz tio joão o melhor arroz !");
        gettersSetters.setPrice(45.00);

        String item = gettersSetters.getItem();
        String description = gettersSetters.getDescriptions();
        double price = gettersSetters.getPrice();

        System.out.println("Item: " + item);
        System.out.println("Descrição: " + description);
        System.out.println("Preço: " + "R$ " + price);


    }
}