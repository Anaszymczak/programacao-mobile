import kotlin.math.pow

fun main() {

    println("\nEscreva um programa que leia o peso e altura de uma pessoa e calcule o seu IMC\n")

    print(">> Informe seu peso: ")
    val peso = readLine()!!.toDouble()

    print(">> Informe sua altura: ")
    val alt = readLine()!!.toDouble()

    val IMC = (peso/alt.pow(2))

    var result = ""

    if (IMC < 18.5){
        result = "Magreza | Desnutrido"
    }else if (IMC < 24.9){
        result = "Normal"
    }else if (IMC < 29.9){
        result = "Sobrepeso | Chega de MC"
    }else if (IMC < 39.9){
        result = "Obesidade | Vai se tratar"
    }else{
        result = "Obesidade Grave"
    }
    println("\nResultado: $result \n")
}