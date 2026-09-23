package temaColecciones.ejercicio14;

import java.util.Date;

public class FichaVehiculo implements Comparable<FichaVehiculo> {
    private String modelo;
    private String matricula;
    private Date instanteEntrada;

    public FichaVehiculo(String modelo, String matricula, Date instanteEntrada) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.instanteEntrada = instanteEntrada;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public Date getInstanteEntrada() {
        return instanteEntrada;
    }

    @Override
    public String toString() {
        return "FichaVehiculo{" +
                "modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", instanteEntrada=" + instanteEntrada +
                '}';
    }

    @Override
    public int compareTo(FichaVehiculo fv) {
        return this.matricula.compareToIgnoreCase(fv.matricula);
    }
}
