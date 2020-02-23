import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books {
    book {
        title 'The 4 Hour Work Week'
        isbn '3232-1-3545-213-1'

    }
}

// print builder.toPrettyString()

new File('builders/books.json').write(builder.toPrettyString())