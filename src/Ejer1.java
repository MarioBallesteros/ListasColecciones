import java.util.*;

public class Ejer1 {

    public static void main(String[] args) {
        Map<String,String> mapa = new TreeMap<>();

        mapa.put("d","ES");
        mapa.put("a","UK");
        mapa.put("c","CZ");
        mapa.put("b","AU");

     //   System.out.println(mapa.keySet()); // mostrar llaves
        System.out.println(mapa.values());// mostrar valores

        List<String> listaTrabajadores = new ArrayList<>();
        listaTrabajadores.addAll(mapa.keySet());
        System.out.println(listaTrabajadores);

        Set<String> treeTrabajadores = new TreeSet<>();
        treeTrabajadores.addAll(mapa.keySet());
        System.out.println(treeTrabajadores);

        Map<String,Integer> mapa2 = new TreeMap<>();

        mapa2.put("d",50);
        mapa2.put("a",60);
        mapa2.put("c",20);
        mapa2.put("b",55);

        Iterator<Integer> iterator = mapa2.values().iterator();

        while (iterator.hasNext()){
        Integer element = iterator.next();
        if (element>50){
            System.out.println(element);
        }

        }


    }

}
