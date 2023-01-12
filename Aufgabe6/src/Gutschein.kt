var kunde = "Rainer"
var wert = 11
//  var wert = 67
//  var wert = 150

fun main() {

    println("Hallo $kunde du hast $wert ausgegeben und bekommst dafür einen:")
    gutschein(wert)
}

fun gutschein(duration: Int) {
    when (duration) {
        in 50..99 -> {
            println("10 € Gutschein")
        }
        in 100..1000000 -> {
            println("20 € Gutschein")
        }
        else -> {
            println("Kein Gutschein")
        }
    }
}