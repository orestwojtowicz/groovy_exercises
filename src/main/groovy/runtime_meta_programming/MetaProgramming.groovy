/**
 * Rzeczy ktore mozemy robic, kiedy program dziala
 *
 * Compiling meta programing - zanim klasa zostanie skompilowana
 *
 *
 * Runtime MetaProgramming
 * pisanie programow ktore manipuluja inne programy, lub same siebie
 *
 * MOP - Meta Object Protocol
 * zbior zasad, jak request metody jest przechwycona przez Groovy runtime
 * Jak Groovy wzywa metode, to pyta taka warstwe intermediate layer co ma zrobic z ta metoda
 * plus na postawie pewnych zasad okreslonych, z jakim obiektem pracuje to wie co zrobic
 * Intermediate Layer = MOP
 *
 * Mozemy wzyac z Java do Groovy. Jesli kompiluje java class, to wzywana jest bezposrednio i szuka metody
 *
 * Jesli klase z Groovy, klasa idzie przez MOP czyli te reguly co ma zrobic dalej z tym
 *
 * POJO - a regular Java Object, klasa napisana w Java lub innym jezyku JVM
 *
 * POGO - groovy object, klasa napisana w Groovy. Extenduje java.lang.Object i implementuje
 * groovy.lang.GroovyObject interface by default
 *
 * Groovy Interceptor - Groovy Object ktory implementuje groovy.lang.GroovyInterceptable interface
 * i posiada metode interception capability
 *
 *
 * GroovyObject
 *  -Employee.groovy klasa
 * invokeMethod()
 * get property
 * property missing
 * set property
 * method missing
 *
 *
 *
 * */

// kazda klasa implementuje GroovyObject, kazdy Obiekt
// mamy metody invokedMethod, metacClass
class Employee {

}


// This method is called when the method you called is not present on a Groovy object

class InvokedDemo {

    def invokedMethod(String name, Object args) {
        return "called invokeMethod $name $args"
    }

    def test() {
        return "method exists"
    }
}


def invodeDemo = new InvokedDemo()

assert invodeDemo.test() == "method exists"


// get property method of the object
// method invoke dla kazdej metody mozna wezwac

class PropertyDemo {

    def prop = "prop1"
    def pop2 = "prop2"
    def prop3 = "prop3"

    // overriding default getter method
    def getProperty(String name) {
        println "getProperty() called with argument $name"
        // return
        metaClass.getProperty(this.name)
    }


}

def pd = new PropertyDemo()

println pd.prop
println pd.pop2
println pd.prop3


/**
 * method missing jest wzywana kiedy zadnej metody nie moze znalezc z dana nazwa ia rgumentami
 * moze byc dla metody kiedy jej nie znajdze
 * */




















