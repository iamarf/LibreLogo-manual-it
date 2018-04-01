// Spirale aurea. 
// Da Chaos and Fractals, Peitgen et al, Springer Verlag, 1992, p. 190 
// Costruita a partire da una successione di quadrati i
// cui lati stanno fra loro nel rapporto della sezione aurea
// La curva è costituita da archi di circonferenza inscritti nei 
// quadrati

def koch(ll: Double, iter: Int){
    if (iter == 1) {
        forward(ll/2)
    }
    else {
        koch(ll/3, iter-1)
        left(60)
        koch(ll/3, iter-1)
        right(120)
        koch(ll/3, iter-1)
        left(60)
        koch(ll/3, iter-1)
    }
}

clear()
setHeading(0)

val ll: Double = 600
val iter: Int = 6

koch(ll, iter)
