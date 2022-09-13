fun main() {
    val patron = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}".toRegex()

    print("Introduce un correo: ")
    val correo = readln()
    val comprobacion = correo.matches(patron)
    if (comprobacion) {
        print("Correo correcto")
    } else {
        print("Correo incorrecto")
    }
}