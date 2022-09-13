fun main() {
    val numeroTablas = 1..10
    print("Introduzca el numero para mostrar su tabla: ")
    val num: Int = readln().toInt()

    for (i in numeroTablas) {
        val respuesta = num * i
        print("$respuesta \n")
    }

}