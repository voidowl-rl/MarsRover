import de.hsg.rover.ladeWelt
import de.hsg.rover.lwjgl3.starteSimulation
import de.hsg.rover.setzeAusfuehrungsgeschwindigkeit

fun main() {
    setzeAusfuehrungsgeschwindigkeit(500)
    ladeWelt(6)
    starteSimulation()
}