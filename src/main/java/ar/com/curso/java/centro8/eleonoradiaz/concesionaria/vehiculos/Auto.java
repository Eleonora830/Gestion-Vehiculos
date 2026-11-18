package ar.com.curso.java.centro8.eleonoradiaz.concesionaria.vehiculos;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class Auto extends Vehiculo {
    private final int puertas;// Es final para que la cantidad de puertas no pueda modificarse posteriormente.

    public Auto(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    // Implementa el método de la interfaz IImprimible
    @Override
    public void imprimir() {
        System.out.print("Marca: " + getMarca());
        System.out.print(" // Modelo: " + getModelo());
        System.out.print(" // Puertas: " + getPuertas());
        System.out.printf(" // Precio: $%,.2f%n", getPrecio());// Muestra el precio con separador de miles y dos
                                                               // decimales.
    }
}
