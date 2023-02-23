package Jose.set;

import java.util.Objects;

public class Empleado {

    private String name ;
    private int edad;

    public Empleado(String name, int edad) {
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
        Empleado persona = (Empleado) o;
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
}
