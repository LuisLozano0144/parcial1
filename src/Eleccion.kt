class Eleccion {
    private val candidatos = mutableListOf<Candidato>()
    private var totalVotos = 0

    init {
        candidatos.add(Candidato("Candidato 1"))
        candidatos.add(Candidato("Candidato 2"))
        candidatos.add(Candidato("Candidato 3"))
    }

    fun votar() {
        println("Seleccione un candidato:")
        for ((index, candidato) in candidatos.withIndex()) {
            println("${index + 1}. ${candidato.nombre}")
        }
        val opcion = readLine()?.toIntOrNull() ?: 0

        if (opcion in 1..3) {
            val candidato = candidatos[opcion - 1]
            println("¿Qué medio de publicidad lo influenció?")
            println("1. Internet")
            println("2. Radio")
            println("3. Televisión")
            val medio = readLine()?.toIntOrNull() ?: 0

            when (medio) {
                1 -> candidato.votosInternet++
                2 -> candidato.votosRadio++
                3 -> candidato.votosTelevision++
            }

            totalVotos++
        }
    }

    fun calcularCostoCampana() {
        for (candidato in candidatos) {
            println("${candidato.nombre} - Costo de campaña: ${candidato.calcularCostoCampana()}")
        }
    }

    fun vaciarUrnas() {
        for (candidato in candidatos) {
            candidato.votosInternet = 0
            candidato.votosRadio = 0
            candidato.votosTelevision = 0
        }
        totalVotos = 0
        println("Las urnas se han vaciado.")
    }

    fun verTotalVotos() {
        println("Total de votos: $totalVotos")
    }

    fun porcentajeVotos() {
        for (candidato in candidatos) {
            val porcentaje = (candidato.totalVotos().toDouble() / totalVotos) * 100
            println("${candidato.nombre} - Porcentaje de votos: %.2f".format(porcentaje))
        }
    }

    fun costoPromedioCampana() {
        val totalCosto = candidatos.sumBy { it.calcularCostoCampana() }
        val promedio = totalCosto / candidatos.size
        println("Costo promedio de campaña: $promedio")
    }

    fun verGanador() {
        val ganador = candidatos.maxByOrNull { it.totalVotos() }
        println("El candidato ganador es: ${ganador?.nombre}")
    }

    fun verVotosPorCandidato() {
        for (candidato in candidatos) {
            println("${candidato.nombre} - Total de votos: ${candidato.totalVotos()}")
        }
    }
}
