package ar.com.curso.java.centro8.eleonoradiaz.concesionaria.vehiculos;

import ar.com.curso.java.centro8.eleonoradiaz.concesionaria.interfaces.IImprimible;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
// Clase base que define las características comunes de los vehículos.
public abstract class Vehiculo implements Comparable<Vehiculo>, IImprimible {
    private final String marca;
    private final String modelo;

    @Setter(AccessLevel.PROTECTED)
    private double precio;

    // Define el orden natural de los vehículos por marca, modelo y precio.
    @Override
    public int compareTo(Vehiculo otro) {
        int resultado = this.marca.compareTo(otro.marca);
        if (resultado == 0) {
            resultado = this.modelo.compareTo(otro.modelo);
        }
        if (resultado == 0) {
            resultado = Double.compare(this.precio, otro.precio);
        }
        return resultado;
    }

    // Declara el método que las clases hijas deben implementar.
    public abstract void imprimir();
}
