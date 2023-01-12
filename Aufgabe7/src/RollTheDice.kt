//import kotlin.random.Random.Default.nextInt
//
//fun main() {
//    var willkommen = "Willkommen bei unserem Würfelspiel"
//    println(willkommen)
//
//    // Player 1
//    var rollPlayer1: Int = nextInt(1, 7)
//    println("Spieler 1: Du hast eine $rollPlayer1 gewürfelt")
//
//    // Player 2
//    var rollPlayer2: Int = nextInt(1, 7)
//    println("Spieler 2: Du hast eine $rollPlayer2 gewürfelt")
//
//    // Ergebnis
//    if (rollPlayer1 > rollPlayer2){
//        println("Spieler 1 hat gewonnen!")
//    }
//    else if (rollPlayer1 < rollPlayer2) {
//        println("Spieler 2 hat gewonnen!")
//    } else {
//        println("Unentschieden, es wird ein weiteres mal gewürfelt.")
//        main()
//    }
//}

import kotlin.random.Random.Default.nextInt

fun main() {
    var willkommen = "Willkommen bei unserem Würfelspiel 🎲"
    println(willkommen)

    // Player 1
    var rollPlayer1: Int = nextInt(1, 7)

    // Player 2
    var rollPlayer2: Int = nextInt(1, 7)

    // Grafik
    when (rollPlayer1) {
        1 -> println("Spieler 1 hat eine ⚀ Gewürfelt")
        2 -> println("Spieler 1 hat eine ⚁ Gewürfelt")
        3 -> println("Spieler 1 hat eine ⚂ Gewürfelt")
        4 -> println("Spieler 1 hat eine ⚃ Gewürfelt")
        5 -> println("Spieler 1 hat eine ⚄ Gewürfelt")
        6 -> println("Spieler 1 hat eine ⚅ Gewürfelt")
    }

    when (rollPlayer2) {
        1 -> println("Spieler 2 hat eine ⚀ Gewürfelt")
        2 -> println("Spieler 2 hat eine ⚁ Gewürfelt")
        3 -> println("Spieler 2 hat eine ⚃ Gewürfelt")
        4 -> println("Spieler 2 hat eine ⚃ Gewürfelt")
        5 -> println("Spieler 2 hat eine ⚄ Gewürfelt")
        6 -> println("Spieler 2 hat eine ⚅ Gewürfelt")
    }

    // Ergebnis
    if (rollPlayer1 > rollPlayer2){
        println("Spieler 1 hat gewonnen!")
    }
    else if (rollPlayer1 < rollPlayer2) {
        println("Spieler 2 hat gewonnen!")
    } else {
        println("Unentschieden, es wird ein weiteres mal gewürfelt.")
        main()
    }
}
