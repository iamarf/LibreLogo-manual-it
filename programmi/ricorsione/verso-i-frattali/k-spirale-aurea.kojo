// Spirale aurea. 
// Da Chaos and Fractals, Peitgen et al, Springer Verlag, 1992, p. 190 
// Costruita a partire da una successione di quadrati i
// cui lati stanno fra loro nel rapporto della sezione aurea
// La curva è costituita da archi di circonferenza inscritti nei 
// quadrati

def quadrato(lato: Double){
    repeat(4){
        forward(lato)
        right()
   }
}

def item(k: Double){
    val g: Double = (1+math.sqrt(5))/2
    val a: Double = 200./(math.pow(g,(k-1)))
    val sd: Double = a*2.0*3.1415926/720.0
    
    quadrato(a)
    repeat(180){
        forward(sd)
        right(0.5)
    }
    item(k+1)
}

clear()
setSpeed(slow)

item(1)
