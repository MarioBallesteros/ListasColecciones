package Jose.map;

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
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                '}';
    }
}
