import java.util.ArrayList;

public class EjercicioCuatro {
    public static void main(String[] args) {
        //Se crea el Arrays
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        //Elementos lista1
        lista1.add("Apple");
        lista1.add("Banana");
        lista1.add("Cherry");
        lista1.add("Date");

        System.out.println(lista1.size());
        System.out.println(lista1);

        //Elementos lista2
        lista2.add("Banana");
        lista2.add("Date");
        lista2.add("Elderberry");
        lista2.add("Fig");


        System.out.println(lista2.size());
        System.out.println(lista2);
    }
}
