// Frattale: albero

val ll: Int = 200
val ang: Double = 50

def tree(ll : Int){
    if (ll >= 2) {
        forward(ll)
        left(ang)
        tree(ll/2)
        right(ang*2)
        tree(ll/2)
        left(50)
        back(ll)
    }
}

clear()
tree(ll)
