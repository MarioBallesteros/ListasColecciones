package Mario.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("el 1",10);
        Empleado e2 = new Empleado("el 2",20);
        Empleado e3 = new Empleado("el 3",30);
        List<Empleado> empleadosArray = new ArrayList<>();
        empleadosArray.add(e2);empleadosArray.add(e2);empleadosArray.add(e3);
        System.out.println(empleadosArray);

        List<Empleado> empleadosLinked = new LinkedList<>();
        empleadosLinked.add(e2);empleadosLinked.add(e1);empleadosLinked.add(e3);
        System.out.println(empleadosLinked);


    }
}
