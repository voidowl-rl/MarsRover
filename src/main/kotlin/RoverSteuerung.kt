import de.hsg.rover.*

public fun act() {
    while (!huegelVorhanden("vorne")) {
        fahre()
        if (!huegelVorhanden("links")) {
            drehe("links")
            analysiereSchlucht()
            drehe("links")
        }
    }

    drehe("links")
    drehe("links")

    while (!huegelVorhanden("vorne")) {
        fahre()
    }

    drehe("links")
    drehe("links")
}

/*
 * Analysiere Schlucht
 *
 * Lässt den Rover in eine Schlucht fahren die gerade vor ihm liegt.
 * Er fährt bis er vor einem Hügel steht. Auf dem Weg dorthin analysiert
 * er alle Gesteine, die er überquert. Dann fährt er zurück.
 */
fun analysiereSchlucht() {
    while (!huegelVorhanden("vorne")) {
        fahre()
        if (gesteinVorhanden()) {
            analysiereGestein()
        }
    }

    drehe("links")
    drehe("links")

    while (!huegelVorhanden("vorne")) {
        fahre()
    }
}
