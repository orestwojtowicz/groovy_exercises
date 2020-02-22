// numst list without any values

List nums = [1, 2, 3, 4, 5, 6, 7, 8, 9]
println nums
println nums.class.name

List linkedList = [1, 2, 3, 4, 5, 6, 7] as LinkedList


// add | remove | get | clear

// na koniec
nums.push(99)
nums.putAt(0, 77)
nums[0] = 69
// na koniec
nums.add(100)

println ""

// stworzy nowa liste i doda te nowe elementy, poprzednia lista zostanie bez zmian
println nums + [3, 4, 6]

// left shift operator
nums << 66

// pop remove last item of the list, removeAt
// minus operator overloader, pozwala uzywac - symbolu, tworzy nowa liste na bazie danej listy

nums.pop() // usuwa ostatni element
nums.pop()


def newList = nums - 3

println "bez 3 $newList"
println ""
// printuje index 4
print "index 4 - $nums[4]"

println ""

// getAt, mozna uzywac z ranges
println nums.getAt(0..5)


// CLEAR

// nums.clear()
// nums = []


// LOOPS

for (x in nums) {
    println "inside loop - $x"
}

// method flaten()
// doda mi do listy druga liste
nums << [50, 60, 70]
nums << [500, 600]

println "dodana druga lista $nums"

println "flatten() usuwa ta druga liste z listy ale zostawia wartosci ${nums.flatten()}"


// unique()

println "Unique elements ${nums.unique()}"


def numbers = [1, 2, 1, 1, 8, 3, 10, 7, 20, 30, 200] as Set

println "list as Set without duplicates (LinkedHashSet) ${numbers}"





























