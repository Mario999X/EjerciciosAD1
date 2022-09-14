fun main() {
    val patron = "[0-9]{12}".toRegex()

    print("Introduce un numero de tarjeta: ")
    val tarjeta = readln()
    val comprobacion = tarjeta.matches(patron)
    if (comprobacion) {
        print("Tarjeta correcta")
    } else {
        print("Tarjeta incorrecta")
    }
}