package Jose;

import java.util.Map;
import java.util.TreeMap;

public class Prueba implements Comparable<String>{

    public static void main(String[] args) {
        Map<String,String> mapa = new TreeMap<>();
        mapa.put("d","ES");
        mapa.put("a","UK");
        mapa.put("c","CZ");
        mapa.put("b","AU");

        System.out.println(mapa);

    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
