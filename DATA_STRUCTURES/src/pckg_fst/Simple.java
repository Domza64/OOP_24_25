package pckg_fst;

import java.util.*;

public class Simple {
    private static final Random random = new Random(2565);

    public static void main(String[] args) {
        ArrayList<String> listaStringova = new ArrayList<>();
        listaStringova.add("Neki string");
        listaStringova.add("Jos jedan string");

        ArrayList<Integer> listaBrojeva = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaBrojeva.add(random.nextInt(-100, 101));
        }

        listElements(listaStringova);
        listElements(listaBrojeva);


        listaBrojeva.add(200);
        listaBrojeva.add(200);
        listaBrojeva.add(200);
        System.out.println(listaBrojeva);
        System.out.println(listToSet(listaBrojeva));

    }

    private static <E> void listElements(ArrayList<E> lista) {
        for (E e : lista) {
            System.out.println(e);
        }
    }

    private static <E> Set<E> listToSet(List<E> list) {
        return new HashSet<>(list);
    }

//    private static void listElements(ArrayList<?> listaStringova) {
//        for (Object o : listaStringova) {
//            System.out.println(o);
//        }
//    }
}