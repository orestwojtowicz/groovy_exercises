// LinkedHashMap as default Map map, LinkedHashMap map to samo
def map = [:]
println map
println map.getClass().getName()


def person = [first: "Pawel", last: "Orest", email: "borest@borest.pl"]
println "PERSON ${person}"
println person.getClass().getName()
println person.first

// person.cos -> szuka zawsze property, jak nie znajdzie to zwraca null

person.twitter = "@therealOressto"
println person


// defaultowo kazdy klucz jest Stringiem
def emailKey = "EmailAddress"
def twitter = [username: "@therealdanvega", (emailKey): "danvega@gmail.com"]

println person.size()
println person.sort()

// LOOPING THROUGHT PERSON
// key value pair
for (entry in person) {
    println entry
}


for (key in person.keySet()) {
    println "$key:${person[key]}"
}

// each | eachWithIndex












