class ScopeDemo {

    def outerClosure = {
        println 'Outer Closure'
        println this.class.name
        println delegate.class.name

        def nestedClosure = {
            "Nested Closure"
            println owner.class.name
            println delegate.class.name
        }
        nestedClosure()

    }


}

def demo = new ScopeDemo()
demo.outerClosure


// Delegates

def writer = {
    append 'Bigos'
    append 'lives in Cleveland'
}


StringBuffer sb = new StringBuffer()
// przekazujemy dzialanie metody za pomoca delegate do StringBuffera
// on posiada metode append, wiec wie jak to ogarnac
writer.delegate = sb


def append(String s) {
    println "Append in append methods "
}


// jak bym mial jeszcze metode zrobiona def append(String s)...
// to uzyje writera a nie metoda z append
writer.resolveStrategy = Closure.DELEGATE_FIRST












