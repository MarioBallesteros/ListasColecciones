import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,String> mapa = new TreeMap<>();

        mapa.put("pp","españa");
        mapa.put("ll","UK");
        mapa.put("NN","USA");
        mapa.put("FF","AU");

        System.out.println(mapa.keySet()); // mostrar llaves
        System.out.println(mapa.values());// mostrar valores

        Set <String> otro = new TreeSet<>();
        Set <String> otro2 = new TreeSet<>();

        otro.addAll(mapa.values());
        System.out.println(otro);


        otro2.addAll(mapa.keySet());
        System.out.println(otro2);

        List<String> una = new ArrayList<>();
        una.addAll(otro);
        una.addAll(otro2);
        System.out.println(una);

// diferencia entre listIterator e iterator
        Iterator<String> iterator = una.listIterator();

        while (iterator.hasNext()){
            String elemento = iterator.next();
            if (elemento.equals("AU")){
                iterator.remove();

            }
        }

        System.out.println(una);





    }
}