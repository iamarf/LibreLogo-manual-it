// La spirale logaritmica, sudiata da Jacob Bernoulli nel suo trattato Spira Mirabilis. 
// Per epitaffio Bernoulli si fece scrivere Eadem Mutata Resurgo. 

clear()

def spi(angolo: Double, passo: Double){
    forward(passo)
    right(angolo)
    spi(angolo/0.991, passo)
}

spi(1,1)

