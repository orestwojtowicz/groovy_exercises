Range r = 1..10
println r
println r.class.name
println r.from
print r.to


Range second = 1..<10
println second


assert (0..10).contains(1)


Date today = new Date()
Date oneWeekAway = today + 7 // thank the GDK for that simple statement

print "today $today"
print "\noneWeekAway ${oneWeekAway}"


//Range days = today..oneWeekAway
//println days
println ""

Range letters = 'a'..'z'
println letters


/**
 * Ranges to obiekty
 * */