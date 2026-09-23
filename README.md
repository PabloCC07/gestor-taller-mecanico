# Gestor de taller mecánico

Aplicación de consola en Java para registrar vehículos que llegan a un taller y organizar su paso a reparación. Proyecto realizado como práctica formativa de Desarrollo de Aplicaciones Multiplataforma.

## Funcionalidades

- Añadir vehículos con modelo, matrícula y fecha de entrada.
- Pasar el siguiente vehículo de la cola de espera a la lista de reparación.
- Consultar los vehículos en espera y en reparación.
- Ordenar los vehículos en espera por matrícula o fecha de entrada.

## Tecnologías y conceptos

- Java
- Programación orientada a objetos
- Colecciones (`LinkedList`)
- Fechas con `java.util.Date`
- Ordenación con `Comparable` y `Comparator`
- Entrada de datos por consola

## Requisitos

JDK 17 o posterior.

## Compilar y ejecutar

Desde la carpeta raíz del proyecto, abre una terminal y ejecuta:

```bash
javac -encoding UTF-8 -d out src/temaColecciones/ejercicio14/*.java
java -cp out temaColecciones.ejercicio14.Principal
```

## Uso

Sigue el menú que aparece en la consola para registrar vehículos, mover el siguiente a reparación o consultar y ordenar las listas.

## Alcance actual

Los datos se mantienen en memoria y se pierden al cerrar el programa. La aplicación es una práctica educativa, no un sistema real de gestión de taller.
