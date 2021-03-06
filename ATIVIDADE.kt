import java.util.*

fun pal_palindromo () {
    println("Palavra:")
    var input = Scanner(System.`in`)
    var palavra = input.next()
    val reverso = palavra.reversed()
    if (palavra == reverso) {
        println("é palindromo")
    }
    else if (palavra != reverso) {
        println("não palindromo")
    }
    println("Cotinuar?")
    var continuar = Scanner(System.`in`)
    var seleciona = continuar.nextLine()

    when (seleciona) {
        ("sim"), ("s"), ("si") , ("yes"), ("y") , ("yeah"), ("okay") , ("okey dokey") , ("okeydokey") , ("continuar") -> println(main())
        ("não") , ("nao") ,("no"), ("n") , ("never") , ("sair") -> println(encerrar())
    }
}


fun media () {
    println("Valor'x':")
    var input = Scanner(System.`in`)
    var x = Integer.valueOf(readLine()).toFloat()
    println("Valor'y':")
    var y= Integer.valueOf(readLine()).toFloat()
    var resultado : Float = (x+y)/2
    println(resultado)
    println("Cotinuar?")
    var continuar = Scanner(System.`in`)
    var seleciona = continuar.nextLine()

    when (seleciona) {
        ("sim"), ("s"), ("si") , ("yes"), ("y") , ("yeah"), ("okay") , ("okey dokey") , ("okeydokey") , ("continuar") -> println(main())
        ("não") , ("nao") ,("no"), ("n") , ("never"), ("sair") -> println(encerrar())
    }
}

fun encerrar (){
    val menu = Scanner(System.`in`)
    println("Adeus! Foi um prazer servi-lo, mestre")
    menu.close()
}

fun main (){
    val menu = Scanner(System.`in`)
    println("Escolha a opção a qual deseja que eu execute, mestre:")
    var input = Scanner(System.`in`)
    println("[1]Verificar uma Média:")
    println("[2]Verificar se uma Palavra é Palindromo:")
    println("[3]Fechar o Programa")
    println("Opção:")
    var seleciona = menu.nextInt()

    when (seleciona) {
        1 -> println(media())
        2 -> println(pal_palindromo())
        3 -> println(encerrar())
    }
}
