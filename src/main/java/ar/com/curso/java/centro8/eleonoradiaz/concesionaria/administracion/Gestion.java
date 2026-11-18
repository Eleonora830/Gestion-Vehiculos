package ar.com.curso.java.centro8.eleonoradiaz.concesionaria.administracion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.com.curso.java.centro8.eleonoradiaz.concesionaria.vehiculos.Auto;
import ar.com.curso.java.centro8.eleonoradiaz.concesionaria.vehiculos.Moto;
import ar.com.curso.java.centro8.eleonoradiaz.concesionaria.vehiculos.Vehiculo;

// Administra el inventario de vehículos y las operaciones realizadas sobre él, utilizando Collections Framework.
public class Gestion {
    private List<Vehiculo> inventario;

    public Gestion() {
        this.inventario = new ArrayList<>();
    }

    // Carga los automóviles y las motocicletas en el inventario.
    public void cargarVehiculos() {
        inventario.add(new Auto("Peugeot", "206", 200000, 4));
        inventario.add(new Moto("Honda", "Titan", 60000, 125));
        inventario.add(new Auto("Peugeot", "208", 250000, 5));
        inventario.add(new Moto("Yamaha", "YBR", 80500.50, 160));
    }

    // Recorre el inventario e imprime los datos de cada vehículo.
    public void imprimirVehiculos() {
        for (Vehiculo elemento : inventario) {
            elemento.imprimir();
        }
    }

    // Obtiene el vehículo con el precio más alto Utiliza Stream API.
    public Vehiculo obtenerVehiculoMasCaro() {
        return inventario.stream()
                .max(Comparator.comparingDouble(elemento -> elemento.getPrecio()))
                .get();
    }

    // Obtiene el vehículo con el precio más bajo Utiliza Stream API.
    public Vehiculo obtenerVehiculoMasBarato() {
        return inventario.stream()
                .min(Comparator.comparingDouble(elemento -> elemento.getPrecio()))
                .get();
    }

    // Busca el vehículo cuyo modelo contiene la letra Y.
    public Vehiculo obtenerVehiculoConLetraY() {
        return inventario.stream()
                .filter(elemento -> elemento.getModelo().toUpperCase().contains("Y"))
                .findFirst()
                .get();
    }

    // Ordena los vehículos por precio de mayor a menor y muestra su marca y modelo.
    public void ordenarPorPrecioDescendente() {
        inventario.stream()
                .sorted(Comparator.comparingDouble((Vehiculo elemento) -> elemento.getPrecio()).reversed())
                .forEach(elemento -> System.out.println(elemento.getMarca() + " " + elemento.getModelo()));
    }

    // Ordena los vehículos según el orden natural definido en Comparable e imprime
    // sus datos.
    public void ordenarPorOrdenNatural() {
        inventario.stream()
                .sorted()
                .forEach(elemento -> elemento.imprimir());
    }

    // Organiza la presentación de los resultados por consola.
    public void ejecutar() {
        System.out.println();
        System.out.println();
        imprimirVehiculos();
        
        System.out.println();
        System.out.println("=============================");
        System.out.println();

        System.out.println("Vehículo más caro: "
                + obtenerVehiculoMasCaro().getMarca() + " "
                + obtenerVehiculoMasCaro().getModelo());

        System.out.println("Vehículo más barato: "
                + obtenerVehiculoMasBarato().getMarca() + " "
                + obtenerVehiculoMasBarato().getModelo());

        Vehiculo vehiculo = obtenerVehiculoConLetraY();

        System.out.printf("Vehículo que contiene en el modelo la letra 'Y': %s %s $%,.2f%n",
                vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getPrecio());

        System.out.println();
        System.out.println("=============================");
        System.out.println();

        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        ordenarPorPrecioDescendente();

        System.out.println();
        System.out.println("=============================");
        System.out.println();
      
        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");
        ordenarPorOrdenNatural();

        System.out.println();
        System.out.println();
    }
}
