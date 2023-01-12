/*
* Schreibe hier deine Lösung hin:
*   // Die Ampel leuchtet grÃ¼n, also dürfen die Autos jetzt fahren
    // Die Ampel leuchtet gelb, also dürfen die Autos sich zum Anhalten bereit machen
    // Die Ampel leuchtet rot, also dürfen die Autos warten
* */

fun main() {
    var ampelPhase = "Grün"
    ampelPhase = ampel(ampelPhase)
    ampelPhase = ampel(ampelPhase)
    ampel(ampelPhase)
}

fun ampel(phase: String): String {
    var neuePhase: String = phase
    when (phase) {
        "GrÃ¼n" -> {
            println("Die Ampel leuchtet grÃ¼n, also dürfen die Autos jetzt fahren")
            neuePhase = "Gelb"
        }

        "Gelb" -> {
            println("Die Ampel leuchtet gelb, also müssen die Autos sich zum Anhalten bereit machen")
            neuePhase = "Rot"
        }

        "Rot" -> {
            println("Die Ampel leuchtet rot, also müssen die Autos warten")
            neuePhase = "Grün"
        }
    }
    return neuePhase
}