class Candidato(val nombre: String) {
    var votosInternet = 0
    var votosRadio = 0
    var votosTelevision = 0

    fun totalVotos(): Int {
        return votosInternet + votosRadio + votosTelevision
    }
//calcular costo total
    fun calcularCostoCampana(): Int {
        return (votosInternet * 700000) + (votosRadio * 200000) + (votosTelevision * 600000)
    }
}
