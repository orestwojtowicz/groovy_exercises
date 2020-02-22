println "Please enter your favourite sports team: "

String team
System.in.withReader { reader ->
    team = reader.readLine()
}

println "Your favourite team is: $team"