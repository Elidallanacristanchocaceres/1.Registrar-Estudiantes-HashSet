# Registro de Estudiantes en Java con HashSet

Este proyecto permite registrar y gestionar una lista de estudiantes, evitando duplicados y permitiendo la búsqueda de un estudiante en la lista.

### 🚀 Funcionalidades

- Permite registrar una cantidad específica de estudiantes.

- Evita la duplicación de nombres.

- Muestra la lista de estudiantes registrados.

- Permite buscar un estudiante en la lista.

### 🛠 Tecnologías utilizadas

- Java

- Colecciones (Set, HashSet)

- Entrada de datos con Scanner

### 📌 Uso

- Ejecuta el programa en un entorno compatible con Java.

- Ingresa la cantidad de estudiantes a registrar.

- Introduce los nombres de los estudiantes.

- Se mostrará la lista de estudiantes registrados.

- Ingresa un nombre para verificar si está en la lista.

### 📂 Estructura del Código
````bash
Set<String> estudiantes = new HashSet<>();
````
Se utiliza HashSet para evitar nombres duplicados.
````bash
if (!estudiantes.add(nombre)) {
    System.out.println("⚠ El estudiante '" + nombre + "' ya está registrado.");
}
````
Verifica si un estudiante ya ha sido registrado.
````bash
if (estudiantes.contains(nombreBuscado)) {
    System.out.println("✅ " + nombreBuscado + " está en la lista.");
} else {
    System.out.println("❌ " + nombreBuscado + " no está registrado.");
}
````
Permite buscar un estudiante en la lista.

### 📝 Notas

- Se debe ingresar un número válido para la cantidad de estudiantes.

- Los nombres ingresados deben evitar espacios innecesarios.
