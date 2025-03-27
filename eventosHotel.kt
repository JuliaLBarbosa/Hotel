package Hotel

fun eventosHotel() {
    val col = 350
    val lar = 220

    println("Qual o número de convidados para o seu evento?")
    var numero = readln().toInt()
    if (220 >= numero) {
        println("Use o auditório Laranja (inclua mais ${lar - numero})")
    } else if (numero > 220 && numero <= 350) {
        println("Use o auditório do Colorado.")
    } else {
        println("Quantidade de convidados superior à capacidade máxima")
        eventosHotel()
     }
    agendaEvento()
    }
    fun agendaEvento() {
        println("Qual o dia do seu evento?")
        var dia = readln()
        println("Qual a hora do seu evento?")
        var horario = readln().toInt()

        val disponivel = when (dia) {
            "segunda", "terca", "quarta", "quinta", "sexta" -> horario in 7..23
            "sabado", "domingo" -> horario in 7..15
            else -> false
        }
        if (disponivel) {
            println("Qual o nome da empresa?")
            var nomeEmpresa = readln()
            println("Auditório reservado para $nomeEmpresa. $dia às $horario hs")
            pessoasClt ()
        } else
            println("Auditório indisponível.")
         agendaEvento()
    }
fun pessoasClt (){
    println("Qual a duração do evento em horas?")
    var hora = readln().toInt()
    println("São necessários ${hora * 10.50}")

}
