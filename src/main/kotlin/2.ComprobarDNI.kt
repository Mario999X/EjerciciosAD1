fun main() {
    val patron = """[0-9]{8}+[A-Z a-z]""".toRegex()

    print("Introduce un DNI: ")
    val dni = readln()
    var comprobacion = dni.matches(patron)
    if (comprobacion) {
        print("DNI correcto")
    } else {
        print("DNI incorrecto")
    }
}