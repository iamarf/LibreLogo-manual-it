// Questo è il cerchio fatto alla Papert.
// Lo ricordo perché da questo prendiamo le mosse per una delle spirali
// Lo avevamo scritto come REPEAT [ FORWARD 1 RIGHT 1 ]
// Qui ci ho aggiunto un po' di generalità per passare dopo a tale spirale

clear()

def cerchio(angolo: Double, passo: Double){
    repeat(360){
        forward(passo)
        right(angolo)
    }
}

cerchio(1,1)