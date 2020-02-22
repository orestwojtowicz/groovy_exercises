/*def t = new Thread()
t.start()

Thread.start {
    *//* do something *//*
}

Thread.start('thread-name') {
    *//* do something there *//*
}*/


List numbers = []

10.times {
    println "push:\t ${it}"
    numbers << it
}

print numbers

for (invokeMethod in 9..0) {
    println "pop:\t ${i}"
}

print numbers