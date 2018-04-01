// Lo stesso corridoio fatto con la spirale, quindi senza mai alzare la penna.

clear()

var lato: Double = 100

repeat (50) {
    forward(lato)
    left()
    forward(lato)
    left()
    lato = lato * 19/20
}

