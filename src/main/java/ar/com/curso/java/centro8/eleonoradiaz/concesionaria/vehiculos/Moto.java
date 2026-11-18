package ar.com.curso.java.centro8.eleonoradiaz.concesionaria.vehiculos;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class Moto extends Vehiculo {
    private final int cilindrada; // Es final para que la cilindrada no pueda modificarse posteriormente.

    public Moto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    // Implementa el método de la interfaz IImprimible
    @Override
    public void imprimir() {
        System.out.print("Marca: " + getMarca());
        System.out.print(" // Modelo: " + getModelo());
        System.out.print(" // Cilindrada: " + getCilindrada() + "c");
        System.out.printf(" // Precio: $%,.2f%n", getPrecio());// Muestra el precio con separador de miles y dos
                                                               // decimales.
    }
}
