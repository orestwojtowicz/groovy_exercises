/**
 *
 * Closures
 * sa to obiekty
 *
 * metoda, dajemy imie, argument i wykonuje akcje
 * w przeciwienstwie jest OBIEKTEM i moze byc uzyta lub przekazana dalej
 *
 * uzyte do :
 * iterators
 * callbacks
 * higher order functions - funkcje ktora wzywa druga funkcje
 * specialized control strucutre -
 * builders - pozwalaja na budowe roznych struktur HTML
 * resource allcoation - otwieranie pliku, czytac, nie trzeba ich zamykac!!
 * threads - statyczna metode maja i przyjmuje closures
 * DSLs - domain specific languages
 * fluent interfaces
 *
 *
 *
 *
 *
 * */


Closure c = {

}

// anonymous function
def sayHello = { name ->
    println "Hello, $name"
}


sayHello("SZTASZEK")


List nums = [1, 4, 7, 4, 30, 2]

nums.each { x ->
    print x
}
println ""

// Jesli nie przekaze zadnego parametru, to moge uzyc it KEYWORD

nums.each {
    print it
}

println ""

def timesTen(num, closure) {
    closure(num * 10)
}

// JESLI CLOSURE JEST OSTATNIM ELEMENTEM, TO MOGE USUNAC NAWIAS i PRZECINEK

// timesTen(10, { println it })
timesTen(10) {
    println it
}

10.times {
    println "BIGOS :D"
}


Random random = new Random()

3.times {
    println random.nextInt()
}


// implicit param, jak nic nie jest passed
def foo = {
    println it
}

foo('bigos')

def noParams = {
    println "no params..."
}

noParams()


def sayBigos = { String first, String last ->
    println "Hello, $first, $last"
}


// default values

def greet = { String name, String greeting = "Howdy" ->
    println "$greeting, $name"
}

// var arg, mozna tez z metodami uzywac

def concant = { String... args ->
    args.join('')
}

println concant('abc', 'dfe', 'asd', 'biczus')


def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = { int x, int y ->
    x + y
}

someMethod { someClosure }


// COLLECTIONS CLOSURES


List favNums = [1, 21, 44, 35, 8, 4]

for (n in favNums) {
    println n
}

favNums.each { print it }

// printuje wartosc z indexem

favNums.eachWithIndex { num, idx ->
    println "$idx:$num"
}


List numbers = [1, 2, 34123, 3, 5, 2, 1, 2, 3, 45, 2, 13]


// robi nowa liste bazujac na poprzedniej
List numbersFind = numbers.findAll {
    it.equals(1)
}


// collect
List nu = [1, 2, 5, 5, 2, 1, 35, 56, 5, 21, 2314]

List numsTimes = []

nu.each { num ->
    numsTimes << num * 10
}

// lepsze roziwazanie, zwroci nowa liste na bazie poprzedniej

List newTimesTen = nu.collect { num ->
    num * 10
}


// CURRY, tworze nowe closure, na bazie istniejacej


def log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}

log("DEBUG", new Date(), "This is my first debug statement")

// podalismy type paremeter i nie musze go podawac caly czas
def debugLog = log.curry("DEBUG")

debugLog(new Date(), "This is another debug statement...")


def todayDebugLog = log.curry("DEBUG", new Date())

todayDebugLog("This is today debug message")


// right curry
// zastapi parametr z prawej strony, wiec teraz brakuje nam daty i String type
def crazyPersonLog = log.rcurry("Where am i Logging this way")

// index based currying
// type = 0, drugio parametr to message, a drugi parameter zastapilismy new Date()
def typeMsgLog = log.ncurry(1, new Date())
typeMsgLog("ERROR", "This is messagee ")


// CLOSURE DELEGATE

/**
 *
 * dostepne sa rozne scopy,
 *
 * Owner - odpowiada do enclosing Object, klasa lub closure/ Jesli zawieram closure, w closure
 *  Moze byc to klasa, lub closure
 *
 * Delegate - 3 parti obiekt
 *
 * This - odpowiada do klasy, lub scripy class
 *
 * */



















