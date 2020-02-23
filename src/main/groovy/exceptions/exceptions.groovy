/**
 * kazdy wyjatek jest OPCJONALNY
 *
 *
 *
 * */

// JAVA
/*
public void foo() throws Exception {
    throw new Exception()
}*/


// GROOVY nie musimy deklarowac wyjatkow w method signature
def foo() {
    throw new Exception("Foo Exception")
}


List log = []

try {
    foo()
} catch (Exception e) {
    log << e.message
} finally {
    log << 'finally'
}

println log

// JAva 7 multi catch syntax

try {
    // do stuff
} catch (FileNotFoundException | NullPointerException e) {
    println e.class.name
    println e.message
}
