package Jose.set;

import java.util.Objects;

public class Trabajador implements Comparable<Trabajador> {

    private String name;
    private int edad;

    public Trabajador(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador persona = (Trabajador) o;
        return edad == persona.edad && Objects.equals(name, persona.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, edad);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Trabajador o) {
        if (edad < o.getEdad()) {
            return -1;
        } else if (edad == o.getEdad()) {
            return 0;
        } else {
            return 1;
        }

        // return name.compareTo(o.getName());
    }

//    @Override
//    public int compareTo(Trabajador o) {
//        return Integer.compare(edad, o.getEdad());
//
//    }

//    @Override
//    public int compareTo(Trabajador o) {
//        return name.compareTo(o.getName());
//    }
}
