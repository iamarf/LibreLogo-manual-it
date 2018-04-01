// Frattale: filo d'erba
// Da Chaos and Fractals, Peitgen et al, Springer Verlag, 1992, p. 398 
// Axiom: F
// Production rule: F → F[+F]F[-F]F


val ll = 5
val delta = 25.7
val iter = 5


def weed(ll: Int, delta: Double, iter: Int) {
    if (iter == 1 ) {
        forward(iter) 
    } else {
        println(ll)
        weed(ll, delta, iter-1)
        savePosHe()
        right(delta)
        weed(ll, delta, iter-1)
        restorePosHe()
        weed(ll, delta, iter-1)
        savePosHe()
        left(delta)
        weed(ll, delta, iter-1)
        restorePosHe()
        weed(ll, delta, iter-1)
    }
}

clear()
println(ll)
weed(ll, delta, iter)
