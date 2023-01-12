fun main() {

    var liste1 : MutableList<String> = mutableListOf(
        "Klaus",
        "Evi",
        "Can",
        "Rainer",
        "Gordon",
        "Fabian",
    )

    var liste2 : MutableList<String> = mutableListOf(
        "Maja",
        "Evi",
        "Lisa",
        "Christian",
        "Felix",
        "Jakob",
    )

}

fun containsFun() {
    var name1 = readln()
    var name2 = readln()
 if (name1 == name2) {
     println("Namen sind gleich")
 } else {
     println("Namen sind nicht gleich")
 }
}