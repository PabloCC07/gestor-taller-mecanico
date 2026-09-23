package temaColecciones.ejercicio14;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class GestionReparaciones {

    private LinkedList<FichaVehiculo> esperaReparacion = new LinkedList<>();
    private LinkedList<FichaVehiculo> enReparacion = new LinkedList<>();

    public void anadeVehiculo(FichaVehiculo fv) {
        esperaReparacion.add(fv);
    }

    public void reparar() {
        boolean vacia = esperaReparacion.isEmpty();

        if (vacia)
            System.out.println("No hay vehículos en espera para repararse");

        else {
            FichaVehiculo vehiculo = esperaReparacion.removeFirst();
            enReparacion.add(vehiculo);
            System.out.println("Siguiente vehículo de la lista de espera enviado a reparar");
        }
    }

    public void verEnEspera() {
        for (FichaVehiculo fichaVehiculo : esperaReparacion)
            System.out.println(fichaVehiculo);

    }

    public void verEnReparacion() {
        for (FichaVehiculo fichaVehiculo : enReparacion)
            System.out.println(fichaVehiculo);

    }

    public void listarOrdenadasMatricula() {
        LinkedList<FichaVehiculo> copiaEsperaReparacion = new LinkedList<>(esperaReparacion);

        Collections.sort(copiaEsperaReparacion);

        for (FichaVehiculo fv:copiaEsperaReparacion)
            System.out.println(fv);
    }

    public void listarOrdenadasFechaEntrada() {
        LinkedList<FichaVehiculo> copiaEsperaReparacion = new LinkedList<>(esperaReparacion);

        copiaEsperaReparacion.sort((v1,v2) -> v1.getInstanteEntrada().compareTo(v2.getInstanteEntrada()));

        for (FichaVehiculo fv:copiaEsperaReparacion)
            System.out.println(fv);
    }
}
