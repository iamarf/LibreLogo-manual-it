//Per chi usa Kojo:

def tree(ll: Int) {
  if (ll >= 2) {
    forward(ll)
    left(50)
    tree(ll/2)
    right(100)
    tree(ll/2)
    left(50)
    back(ll)
  }
}

clear()
// setAnimationDelay(3000)
tree(100)