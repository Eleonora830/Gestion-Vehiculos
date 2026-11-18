package ar.com.curso.java.centro8.eleonoradiaz.concesionaria.tests;

import ar.com.curso.java.centro8.eleonoradiaz.concesionaria.administracion.Gestion;

public class TestConcesionaria {
        // Inicia la gestión, carga los vehículos y ejecuta las operaciones.
        public static void main(String[] args) {
                Gestion gestion = new Gestion();
                gestion.cargarVehiculos();
                gestion.ejecutar();
        }
}