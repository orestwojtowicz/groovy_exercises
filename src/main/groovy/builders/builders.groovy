import groovy.xml.MarkupBuilder


/**
 * helper class do kreacji xml i html
 * */
MarkupBuilder builder = new MarkupBuilder()


// metoda sports nie ma zdefiniowanej
// builder. tutaj mgoe wpisac co chce i bedzie to glownan azwa dokumentu XML
builder.sports {
    sport(id: 1) {
        name 'Baseball'
    }
    sport(id: 2) {
        name 'Ironman'
    }
    sport(id: 3) {
        name 'Swimming'
    }
    sport(id: null) {
        name ''
    }
    sport(id: null, foo: '') {
        name: ''
    }
}





