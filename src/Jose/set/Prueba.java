package Jose.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Prueba {

    public static void main(String[] args) {

        //sin el equal y el hashcode NO ORDENA DE NINGUNA FORMA
        Set <Persona>  pruebHash = new HashSet<>();
        Persona a = new Persona("b",20);
        Persona b = new Persona("a",16);
        Persona c = new Persona("c",54);
        pruebHash.add(b);
        pruebHash.add(c);
        pruebHash.add(a);
        System.out.println(pruebHash);
//el treeSet peta sin comparable y el compareTo
        Set <Trabajador>  pruebHash2 = new TreeSet<>();
        Trabajador a2 = new Trabajador("b",20);
        Trabajador b2 = new Trabajador("a",16);
        Trabajador c2 = new Trabajador("c",54);
        pruebHash2.add(b2);
        pruebHash2.add(a2);
        pruebHash2.add(c2);

        Set <String>  pruebHash45 = new TreeSet<>();
        pruebHash45.add("3");
        pruebHash45.add("1");
        pruebHash45.add("2");
        System.out.println("la 45 " + pruebHash45);






        //     System.out.println(pruebHash2);
//LinkedHashSet ordena por insercion
        Set <Empleado>  pruebHash3 = new LinkedHashSet<>();

        Empleado a3 = new Empleado("b",20);
        Empleado b3 = new Empleado("a",16);
        Empleado c3 = new Empleado("c",54);
        pruebHash3.add(b3);
        pruebHash3.add(a3);
        pruebHash3.add(c3);
        System.out.println(pruebHash3);




    }
}
