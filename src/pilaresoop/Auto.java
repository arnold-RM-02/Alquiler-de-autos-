package pilaresoop;

public class Auto extends Vehiculo {

    private static final double SEGURO_POR_DIA = 10.0;

    public Auto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return (getTarifaBase() + SEGURO_POR_DIA) * dias;
    }
}