package Hotel

var quartos  = MutableList(20) { false }

fun cadastrarQuartos() {
    println("Qual o valor padrão da diária?")
    var valor = readln().toDouble()
    println("Quantas diárias serão necessárias?")
    var dias = readln().toIntOrNull()
    if (valor > 0) {
        println("O valor de $dias dias será: " + (valor * dias!!))
    } else {
    }
    println("Qual o nome do hóspede?")
    val novoHospede = readln()
    println("Qual o quarto para reserva? (1 - 20)?")
    var quarto = readln().toInt()

    if (quarto != 0){
        println("Quarto livre.")
        println("$nome, você confirma a hospedagem para $novoHospede por $dias dias para o quarto $quarto por $valor")
        var resposta = readln()
        if (resposta.uppercase() == "S"){
            quartos[quarto - 1] = true
            println("$nome, reserva efetuada para $novoHospede")
            exibirQuartos ()
        }
    }
}
fun exibirQuartos () {
    println("Lista de quartos e sua ocupações.")
    quartos.forEachIndexed { index, ocupado ->
        val estado = if (ocupado) "ocupado" else "livre"
        println("${index + 1} - $estado")
        iniciar()
    }
}