// Altra erba
// Chaos and Fractals, p. 398 
// Axiom: B
// F → FF
// B → F[+B]F[-B]+B


val ll = 100
val delta = 20.0
val iter = 7


def weed(ll: Int, delta: Double, iter: Int) {
    if (iter == 1 ) { 
    } else {
        forward(ll)
        
        savePosHe()
        left(delta)
        weed(ll/2, delta, iter-1)
        restorePosHe()

        forward(ll)

        savePosHe()
        right(delta)
        weed(ll/2, delta, iter-1)
        restorePosHe()

        left(delta)
        weed(ll/2, delta, iter-1)
    }
}

clear()
println(ll)
weed(ll, delta, iter)
