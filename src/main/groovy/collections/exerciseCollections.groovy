enum WeekDays {

    MONDAY(0),
    TUESDAY(1),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7)

    private final int value

    int getValue() {
        value
    }

    WeekDays(int value) {
        this.value = value
    }

    static enumSize() {
        WeekDays.values().size()
    }


}

def dayRange = WeekDays.MONDAY..WeekDays.SUNDAY

print "DAY RANGE ${dayRange}"


for (day in dayRange) {
    println "DAY LOOP ${day}"
}

dayRange.each { day ->
    println day
}

def days = [WeekDays.values()]

println "DAYS ${days.flatten()}"









