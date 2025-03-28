package Hotel

val senhaCorreta = 2678
var nome: String = ""

fun main() {
    println("Informe o seu nome: ")
    nome = readln()
    println("Digite a senha: ")
    val senha = readln().toInt()
    if(senha == senhaCorreta ){
        true
    }else {
        println("Senha incorreta")
        main()
    }

    iniciar()
}

fun iniciar() {
    print("Bem vindo ao Hotel Transilvânia, $nome. É um imenso prazer ter você por aqui!\n")
    println("Escolha uma opção:")
    // A varival escolha armazena a opção escolhida pelo usuário.
    // uma variavel local é utilizada apenas dentro da função inicio().
    val escolha = readln().toIntOrNull()
    when (escolha) {
        1 -> cadastrarQuartos()
        2 -> cadastrarHospedes()
        3 -> cadastrarFamilia()
        4 -> AbastecimentoDeAutomoveis()
        5 -> sairDoHotelTransilvania()
        else -> erro()
    }
}


fun AbastecimentoDeAutomoveis() {

}

fun sairDoHotelTransilvania() {
    println("Você deseja sair?\n Informe 1 para \"sim\" e 0 para \"não\"")
    val confirma = readln().toInt() // digite true ou false ou 1 ou 0
    if (confirma == 1) {
        println("Muito obrigado e até logo, $nome")
    } else if (confirma == 0){
        iniciar()
    }
}

fun erro(){
    println("Por favor, informe um número entre 1 e 4.")
    iniciar()
}
