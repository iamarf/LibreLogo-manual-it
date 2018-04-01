// Frattale: cespuglio
// Da Chaos and Fractals, Peitgen et al, Springer Verlag, 1992, p. 398 
// Axiom: F
// Production rule: F → FF+[+F-F-F]-[-F+F+F]

val ll = 10
val delta = 25
val iter = 5


def weed(ll: Int, delta: Double, iter: Int) {
    if (iter == 1 ) {
        forward(ll) 
    } else {
        weed(ll, delta, iter-1)
        weed(ll, delta, iter-1)
        right(delta)
        savePosHe()
        right(delta)
        weed(ll, delta, iter-1)
        left(delta)
        weed(ll, delta, iter-1)
        left(delta)
        weed(ll, delta, iter-1)
        restorePosHe()
        left(delta)
        savePosHe()
        left(delta)
        weed(ll, delta, iter-1)
        right(delta)
        weed(ll, delta, iter-1)
        right(delta)
        weed(ll, delta, iter-1)
        restorePosHe()
    }
}

clear()
println(ll)
weed(ll, delta, iter)
