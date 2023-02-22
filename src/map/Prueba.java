package map;

import list.Empleado;
import list.Persona;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Prueba {
    public static void main(String[] args) {
        Map <Persona, Empleado> mapaHas = new HashMap<>();
        Empleado a = new Empleado("a",20);
        Empleado b = new Empleado("b",16);
        Empleado c = new Empleado("c",54);

        Persona a2 = new Persona("a2",220);
        Persona b2 = new Persona("b2",216);
        Persona c2 = new Persona("c2",254);

        mapaHas.put(a2,a);
        mapaHas.put(b2,b);
        mapaHas.put(c2,c);
        System.out.println(mapaHas);

        Map <Trabajador, Empleado> mapTree = new TreeMap<>();

        Trabajador a3 = new Trabajador("a",20);
        Trabajador b3= new Trabajador("b",16);
        Trabajador c3 = new Trabajador("c",54);
        mapTree.put(a3,a);
        mapTree.put(b3,b);
        mapTree.put(c3,c);
        System.out.println(mapTree);

        Map <String, Integer> mapTree2 = new TreeMap<>();
        mapTree2.put("b",2);
        mapTree2.put("a",1);
        mapTree2.put("c",3);
        System.out.println("el 2 "+mapTree2);



        Map <Trabajador, Empleado> mapLink = new LinkedHashMap<>();
        mapLink.put(a3,a);
        mapLink.put(b3,b);
        mapLink.put(c3,c);
        System.out.println(mapLink);

    }
}
