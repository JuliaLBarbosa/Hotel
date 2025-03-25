package Hotel

fun cadastrarFamilia(){
    var listaHospedes = mutableListOf(
        "")
        var totalHospedagem = 0.0
    println("Qual o valor padrão da diária?")
    val valor = readln(). toDouble()
    do {
        println("Cadastro de Hóspedes.\nPor favor, informe o nome da Hóspede:")
        val novoHospede = readln()

        println("Qual a idade do Hóspede?")
        val idade = readln().toInt()

        if (idade <= 6) {
            println("$novoHospede cadastrada(o) com sucesso. $novoHospede possui gratuidade")
        }else if (idade > 60){
            println("$novoHospede cadastrada(o) com sucesso. $novoHospede paga meia")
            totalHospedagem += valor / 2
        }
        else {
            println("$novoHospede cadastrada(o) com sucesso.")
            totalHospedagem += valor
        }
        listaHospedes.add(novoHospede)
        println("Deseja continuar? S/N ")
        val resposta = readln()
    } while(resposta != "pare")
    println("O programa parou!")
    println("$nome o valor total das hospedagens é: $totalHospedagem")

}
