import java.util.ArrayList;

public class EjercicioUno {
    public static void main(String[] args) {
        //Se crea el Arrays
        ArrayList<String> fruist = new ArrayList<>();

        //elementos
        fruist.add("Apple");
        fruist.add("Banana");
        fruist.add("Cherry");

        //Se imprime
        System.out.println(fruist.size());
        System.out.println(fruist);


        //remover
        fruist.remove("Banana");
    }
}
