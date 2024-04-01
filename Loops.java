import java.util.ArrayList;
import java.util.Collections;

public class Loops {

    static void loopsMethods() {
        // Criação de uma lista de strings
        ArrayList<String> list = new ArrayList<>();

        // Adicionando itens à lista
        list.add("item 1");
        list.add("item 2");
        list.add("item 3");
        list.add("item 4");
        list.add("item 5");
        list.add("item 6");
        list.add("item 7");
        list.add("item 8");

        // Criação de uma lista de números inteiros
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);

        //------------Order-------------------------------
        // Ordenação da lista de números
        Collections.sort(numbers);
        //-------------Order------------------------------

        //-----------------For--------------------------
        // Uso do loop for para imprimir todos os itens da lista
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Lista: " + list.get(i));
        }
        //-----------------For--------------------------

        //-----------------For each loop--------------------------
        // Uso do loop for each para imprimir todos os itens da lista
        for (String l : list) {
            System.out.println("Lista: " + l);
        }

        // Uso do loop for each para imprimir todos os números da lista
        for (int n : numbers) {
            System.out.printf("%d%n ", n);
        }
        //-----------------For each loop--------------------------


//-----------------While--------------------------
        // Uso do loop while para imprimir todos os números da lista
        int j = 0;
        while (j < numbers.size()) {
            System.out.printf("%d%n ", numbers.get(j));
            j++;
        }

        // Uso do loop while para imprimir todos os itens da lista
        int k = 0;
        while (k < list.size()) {
            System.out.println(list.get(k));
            k++;
        }
        //-------------------While------------------------


        //------------------do-While------------------------
        // Uso do loop do-while para imprimir todos os números da lista
        int c = 0;
        do {
            System.out.println(numbers.get(c));
            c++;
        } while (c < numbers.size());

        // Uso do loop do-while para imprimir todos os itens da lista
        int d = 0;
        do {
            System.out.println(list.get(d));
            d++;
        } while (d < list.size());
        //------------------do-While------------------------"
    }
}
