import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm
import java.util.*

fun pal_palindromo () {
    println("Palavra:")
    var input = Scanner(System.`in`)
    var palavra = input.next()
    val reverso = palavra.reversed()
    if (palavra == reverso) {
        println("é palindromo")
    } else {
        println("não palindromo")
    }
    println("Cotinuar?")
    var continuar = Scanner(System.`in`)
    println("[true]sim")
    println("[false]não")
    var seleciona = continuar.nextBoolean()

    when (seleciona) {
        true -> println(main())
        false -> println(encerrar())
    }
}


fun media () {
    println("Valor'x':")
    var input = Scanner(System.`in`)
    var x : Float = input.nextFloat()
    println("Valor'y':")
    var y : Float = input.nextFloat()
    var resultado : Float = (x+y)/2
    println(resultado)
    println("Cotinuar?")
    var continuar = Scanner(System.`in`)
    println("[true]sim")
    println("[false]não")
    var seleciona = continuar.nextBoolean()

    when (seleciona) {
            true -> println(main())
            false -> println(encerrar())
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
