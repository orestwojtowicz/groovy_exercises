import groovy.xml.MarkupBuilder


List courses = [
        [id: 1, name: 'Appache Groovy'],
        [id: 2, name: 'Spring Boot']
]

FileWriter write = new FileWriter("about.html")

// zapisze ta strukture do pliku
MarkupBuilder builder = new MarkupBuilder(write)
builder.html {
    head {
        title 'About Oressto'
        description 'This is about me page'
        keywords 'Oresto, Groovy, Java'
    }
    body {
        h1 'About Me'
        p 'This is a bunch of text about me'
        section {
            h2 'courses'
            table {
                tr {
                    th 'id'
                    th 'name'
                }
                courses.each { course ->
                    tr {
                        td course.id
                        td course.name
                    }
                }

            }
        }
    }
}



