package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        List <Persona> listEmple = new ArrayList<>();
        Persona a = new Persona("a",20);
        Persona b = new Persona("b",16);
        Persona c = new Persona("c",54);
        //no entiendo el puto addAll
        listEmple.add(b);
        listEmple.add(a);
        listEmple.add(c);

        System.out.println(listEmple);

        List <Persona> linked = new LinkedList<>();
        linked.add(b);
        linked.add(a);
        linked.add(c);
        System.out.println(linked);


    }
}
