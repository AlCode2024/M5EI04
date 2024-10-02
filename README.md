# Sistema de Registro de Usuarios 4.0 M5EI04

Sistema de gestión de usuarios en Kotlin. Permite agregar, consultar y eliminar usuarios, mostrando los datos ingresados de cada usuario registrado.

## Descripción

El sistema permite realizar las siguientes operaciones:

- **Agregar un usuario**: Se requiere el nombre del usuario, mientras que la edad, el trabajo y la referencia son opcionales. Se hace control del null
- **Consultar la lista de usuarios**: Muestra una lista de los usuarios registrados y sus datos.
- **Eliminar un usuario**: Elimina un usuario de la lista utilizando su nombre.
- **Salir del sistema**: Opción para finalizar la ejecución.

### Estructura del código

1. **Clase `Usuario`**: Define los atributos de un usuario: `nombre`, `edad`, `trabajo`, y `referencia`. Incluye la función `mostrarDatos()` que solo muestra los valores no nulos.
   
2. **Clase `ListaUsuarios`**: Maneja una lista de usuarios. Tiene métodos para agregar, eliminar y mostrar la lista de usuarios.

3. **Función `main`**: Punto de entrada al programa. Presenta un menú que permite al usuario interactuar con el sistema.

## Uso

Sigue los pasos a continuación para ejecutar el sistema:

1. Al iniciar el programa, se mostrará un menú con las opciones disponibles.
2. Selecciona la opción deseada:
    - Opción `1` permite agregar un usuario nuevo.
    - Opción `2` muestra todos los usuarios registrados.
    - Opción `3` permite eliminar un usuario utilizando su nombre.
    - Opción `4` finaliza el sistema.
3. Si decides agregar un usuario, se te solicitarán los datos del usuario:
    - Nombre (Obligatorio).
    - Edad (Opcional).
    - Trabajo (Opcional).
    - Referencia (Opcional).

4. Puedes consultar la lista o eliminar usuarios según sea necesario.


