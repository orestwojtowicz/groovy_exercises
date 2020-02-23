import groovy.sql.GroovyRowResult
import groovy.sql.Sql

String username = "root"
String pasasword = "admin"

def sql = Sql.newInstance("jdbc:mysql://localhost:3306/organizer", username, pasasword, "com.mysql.cj.jdbc.Driver")
println "Connected!"


sql.execute("DROP TABLE IF EXISTS users")


sql.execute('''
CREATE TABLE users (
    id INT NOT NULL,
    username VARCHAR(45) NOT NULL,
    bio VARCHAR(45) NULL,
    PRIMARY KEY (id) 
);
''')
println 'Tables created '

def user = [id: 2, username: 'foo', bio: 'biologia']


sql.execute('''
INSERT INTO users (id, username,bio) 
VALUES (1, 'Oresto', 'Uczem siem');
''')

/*sql.execute("""
INSERT INTO users(${user.id}, ${user.username}, ${user.bio});
""")*/

println 'DATA INSERTED!'


List<GroovyRowResult> rows = sql.rows("SELECT * FROM users")

println rows.get(0)

rows.each { row ->
    println "Single row -> ${row}"
}

def userArray = []

rows.each { row ->
    userArray << row
}

println "UserArray ---> ${userArray.get(0)}"


sql.eachRow('select * from users') { row ->
    println "Tweet: @${row.username}"
}


File file = new File("file.csv")
file.write("id, username, bio\n")

rows.each { row ->
    file.append("${row.id}, ${row.username}, ${row.bio}\n")
}


sql.close()




























