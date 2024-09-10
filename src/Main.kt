fun main() {
    val eleccion = Eleccion()
    var opcion: Int

    do {
        println("Menú:")
        println("1. Votar por un candidato")
        println("2. Calcular costo de campaña")
        println("3. Vaciar urnas")
        println("4. Conocer total de votos")
        println("5. Ver porcentaje de votos por candidato")
        println("6. Calcular costo promedio de campaña")
        println("7. Conocer candidato ganador")
        println("8. Ver total de votos por candidato")
        println("0. Salir")

        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> eleccion.votar()
            2 -> eleccion.calcularCostoCampana()
            3 -> eleccion.vaciarUrnas()
            4 -> eleccion.verTotalVotos()
            5 -> eleccion.porcentajeVotos()
            6 -> eleccion.costoPromedioCampana()
            7 -> eleccion.verGanador()
            8 -> eleccion.verVotosPorCandidato()
        }
    } while (opcion != 0)
}
