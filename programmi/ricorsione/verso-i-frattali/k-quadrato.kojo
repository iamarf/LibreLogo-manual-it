// Un corridoio infinito fatto di quadrati (il corridoio di Borromeo Colmi di Michael Ende...)

clear()

var lato: Double = 100

def quadrato(lato: Double){
    repeat(4){
        forward(lato)
        right()
   }
}

repeat (20) {
    quadrato(lato)
    penUp()
    forward(lato*0.05)
    right()
    forward(lato*0.05)
    left()
    penDown()
    lato = lato * 0.90
}

