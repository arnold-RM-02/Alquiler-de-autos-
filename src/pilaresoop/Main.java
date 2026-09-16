package pilaresoop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Toyota", "Corolla", 50.0));
        vehiculos.add(new Moto("Honda", "CB 190R", 30.0));

        int dias = 5;

        System.out.println("===== SISTEMA DE ALQUILER DE VEHÍCULOS =====");
        System.out.println("Días de alquiler: " + dias);
        System.out.println();

        for (Vehiculo vehiculo : vehiculos) {

            double costo = vehiculo.calcularCostoAlquiler(dias);

            System.out.println("Tipo: " + vehiculo.getClass().getSimpleName());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.printf("Tarifa base por día: $%.2f%n",
                    vehiculo.getTarifaBase());
            System.out.printf("Costo total por %d días: $%.2f%n",
                    dias, costo);
            System.out.println("--------------------------------------------");
        }
    }
}