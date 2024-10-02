// Clase Usuario
class Usuario(
    val nombre: String,
    val edad: Int?,
    val trabajo: String?,
    val referencia: String?
) {
    // Función datos
    fun mostrarDatos() {
        // Lista que se llenará solo con los valores no nulos
        val datos = mutableListOf<String>()

        // El nombre es obligatorio, así que siempre lo agregamos
        datos.add(nombre)

        // Solo agregamos edad si no es nula
        if (edad != null) {
            datos.add("$edad años")
        }

        // Solo agregamos trabajo si no es nulo
        if (trabajo != null) {
            datos.add(trabajo)
        }

        // Solo agregamos referencia si no es nula
        if (referencia != null) {
            datos.add("Referenciado por $referencia")
        }

        println(datos.joinToString(" - "))
    }
}

// Lista de Usuarios
class ListaUsuarios {
    private val usuarios = mutableListOf<Usuario>()

    // Agregar un usuario
    fun agregarUsuario(usuario: Usuario) {
        usuarios.add(usuario)
        println("Usuario agregado: ${usuario.nombre}")
    }

    // Eliminar un usuario
    fun eliminarUsuario(nombre: String) {
        val usuarioAEliminar = usuarios.find { it.nombre == nombre }
        if (usuarioAEliminar != null) {
            usuarios.remove(usuarioAEliminar)
            println("Usuario eliminado: $nombre")
        } else {
            println("Usuario no encontrado: $nombre")
        }
    }

    // Datos de Lista de usuarios
    fun mostrarLista() {
        if (usuarios.isNotEmpty()) {
            println("----- Lista de Usuarios Registrados -----")
            for (usuario in usuarios) {
                usuario.mostrarDatos() // Muestra datos
            }
        } else {
            println("No se ha registrado ningún usuario.")
        }
    }
}

fun main() {
    println("Bienvenido al sistema de registro de usuarios 2.0")

    val listaUsuarios = ListaUsuarios()

    // Crear un usuario
    fun crearUsuario(): Usuario? {
        println("Ingrese el nombre del usuario (Obligatorio):")
        val nombre = readLine()?.takeIf { it.isNotBlank() } ?: run {
            println("No ingresó el nombre, no se ha creado ningún usuario.")
            return null
        }

        println("Ingrese la edad del usuario :")
        val edad = readLine()?.toIntOrNull()

        println("Ingrese el trabajo del usuario :")
        val trabajo = readLine().takeIf { it?.isNotBlank() == true }

        println("¿Quién lo referencia? :")
        val referencia = readLine()?.takeIf { it.isNotBlank() }

        return Usuario(nombre, edad, trabajo, referencia)
    }

    // Menu principal para iniciar la operacion
    fun mostrarMenu() {
        println("\nOpciones:")
        println("1. Ingresar usuario")
        println("2. Consultar lista")
        println("3. Eliminar usuario")
        println("4. Salir")
    }

    // Ciclo del menú
    var opcion: String?
    do {
        mostrarMenu()
        opcion = readLine()

        when (opcion) {
            "1" -> {
                val usuario = crearUsuario()
                if (usuario != null) {
                    listaUsuarios.agregarUsuario(usuario)
                }
            }
            "2" -> listaUsuarios.mostrarLista()
            "3" -> {
                println("Ingrese el nombre del usuario a eliminar:")
                val nombreEliminar = readLine()
                if (!nombreEliminar.isNullOrBlank()) {
                    listaUsuarios.eliminarUsuario(nombreEliminar)
                } else {
                    println("No se ha ingresado un nombre válido para eliminar.")
                }
            }
            "4" -> println("Saliendo del sistema. Gracias por su preferencia.")
            else -> println("Opción no válida. Por favor, ingrese una opción válida.")
        }
    } while (opcion != "4")
}
