import groovy.transform.ToString


@ToString(includeNames = true)
class Book {
    String title
    String summary
    List<Section> section = []
}

@ToString(includeNames = true)
class Section {
    String title
    List<Chapters> chapters = []
}

@ToString(includeNames = true)
class Chapters {
    String title
}

// Java style
/*Book createBook() {

    Book book = new Book()
    book.setTitle("My Book")
    book.setSummary("My Summary")

    Section s = new Section()
    s.setTitle("My section 1")

    Chapters c1 = new Chapters()
    c1.setTitle("First Chapter")

    Chapters c2 = new Chapters()
    c2.setTitle("Second Chapter")

    s.addChapters(c1, c2)

    book.getSection().add(s)
    
    return book

}*/


ObjectGraphsBuilder builder = new ObjectGraphsBuilder()

// book root ndoe
def book = builder.book(title: "Groovy In Action 2nd Edition",
        summary: "This long thing") {
    section(title: "Section 1") {
        chapter(title: "Chapter1")
        chapter(title: "Chapter2")
        chapter(title: "Chapter3")
    }

    section(title: "Section 2") {
        chapter(title: "Chapter4")
        chapter(title: "Chapter5")
        chapter(title: "Chapter6")
    }

}


println book























