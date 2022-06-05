import java.util.Scanner

val scanner = Scanner(System.`in`)
fun main() {

    asosiy()

}

fun asosiy(){
    println("1 -> O'rta arifmetikni topish\n" +
            "2 -> Kvadrat yuzi va perimetrini topish\n" +
            "3 -> O'zgaruvhilarning o'rnini almashtirish")

    when(scanner.nextInt()){
        1-> ortaArifmetik()
        2 -> kvadratPS()
        3 -> convertValues()
        else -> asosiy()
    }
}

fun ortaArifmetik() {
    println("1-sonni kiriting")
    var num1 = scanner.nextDouble()
    println("2-sonni kiriting")
    var num2 = scanner.nextDouble()
    println("3-sonni kiriting")
    var num3 = scanner.nextDouble()

    var ortaArifmetik: Double = (num1 + num2 + num3) / 3

    println("O'rta arifmetik $ortaArifmetik")

    asosiy()
}

fun kvadratPS() {
    println("Kvadrat tomonini yozing")
    var tomon = scanner.nextInt()
    var p = tomon * 4
    var s = tomon * tomon
    println("Kvadrat perimetri $p yuzasi $s")

    asosiy()
}

fun convertValues(){
    println("1-sonni yozing")
    var num1 = scanner.nextInt()
    println("2-sonni yozing")
    var  num2 = scanner.nextInt()

    var num3 = num1
    num1 = num2
    num2 = num3

    println("1-son $num1 2-son $num2")

    asosiy()
}