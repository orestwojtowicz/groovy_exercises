/**
 * Groovy truth ->
 *
 * Evaluating Boolean Tests
 *
 * Runtime Type         Evaluation Criteria
 * Boolean              Boolean value is true
 * Matcher              Matcher has Match, Regular Expressions
 * Collection           Collection is non empty true
 * Map                  Map is non empty, jesli ma jakis klucz to bedzie true
 * String               non empty String
 * Number,Character     Number is non zero true
 * None of the above    Object Reference is non null -> true if (object) a w Javie if (object != null)
 * */



if (true) {
    println "true"
}

// Boolean
assert true
assert !false

// Matcher
assert ('a' =~ /a/)
assert !('a' =~ /b/)


// collection
assert [1]
assert ![]

// Map
assert [1: 'one']
assert ![:]

// String
assert 'a'
assert !''

// number
assert 1
assert 3.5
assert 0


// objects
assert new Object()
assert !null
















































