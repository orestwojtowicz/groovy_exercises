/**
 *
 *
 * */


// ternary operator (expresion) ? true : false

def name = 'OREST'
def isOrest = (name.toUpperCase() == "OREST") ? true : "boREsT"

print isOrest


// elvis operator

def msg

// jesli msg bedzie true uzyje msg, jesli nie to uzyj default message
def elvisOutput = msg ?: 'default message'

println "Elvis operator $elvisOutput"

// switch statement. Lepiej uzyc switch niz if else, if else

def num = 3

switch (num) {
    case 1:
        println "1"
        break
    case 1..3:
        println "in range 1..3"
        break
    case Integer:
        println "num is an Integer"
        break
    case [1, 2, 13]:
        println "num is in list"
    default:
        println "default..."
}


// in

def validAges = 18..35
def someAge = 19
println someAge in validAges































