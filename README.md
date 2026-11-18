# Gestion-Vehiculos
Sistema de gestión de autos y motos en Java.
# Gestión de Vehículos

## Descripción

Proyecto desarrollado en Java que simula el funcionamiento de una concesionaria de automóviles y motocicletas.

El programa permite gestionar una lista de vehículos, consultar información, identificar el vehículo de mayor y menor precio y realizar diferentes ordenamientos.

La aplicación se ejecuta por consola y genera la salida solicitada en el enunciado del trabajo práctico, finalizando su ejecución una vez mostrados los resultados.

## Funcionalidades

- Carga de automóviles y motocicletas.
- Visualización de los datos de cada vehículo.
- Identificación del vehículo más caro y más barato.
- Búsqueda de vehículos cuyo modelo contiene una letra determinada.
- Ordenamiento por precio de mayor a menor.
- Ordenamiento natural por marca, modelo y precio.

## Estructura del proyecto

El proyecto se organiza en paquetes para separar las responsabilidades:

- **vehiculos:** contiene la clase abstracta Vehiculo y las clases Auto y Moto.
- **administracion:** contiene la clase Gestion, encargada de administrar la lista de vehículos y realizar las operaciones solicitadas.
- **test:** contiene la clase de prueba para ejecutar el programa.

## Conceptos y herramientas utilizados

- Programación Orientada a Objetos (POO).
- Clases abstractas y herencia.
- Encapsulamiento.
- Interfaces.
- Collections Framework.
- API Stream.
- Interfaz Comparable.
- Sobrescritura de métodos (`toString()`).
- Expresiones lambda y Comparator.
- Lombok para reducir código repetitivo.
- Java.
- Spring Boot.
- Maven.
- Visual Studio Code.

## Ejecución del proyecto

El proyecto está desarrollado con Spring Boot y gestionado mediante Maven.

También puede ejecutarse desde Visual Studio Code utilizando la clase principal de la aplicación.

Al iniciar, el programa carga los vehículos y muestra los resultados por consola sin solicitar datos al usuario.

## Autora

Eleonora Diaz
