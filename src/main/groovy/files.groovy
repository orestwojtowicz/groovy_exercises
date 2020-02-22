/**
 * @project com.groovy* @author Damian Wójtowicz
 * @date 22.02.20
 */

/*
def file = new File('dummy.txt')
file.write("Write some Text to a File :D\n ")


// new File('dummy.txt).text = "SOME TEXT"

// File odnosie sie do directory i files


file.append("I am some more text...")


List lines = file.readLines()*/
/*

lines.each { line ->
    println line
}
*/


// list all files in a directory

String dir = '/media/damiass/Extreme SSD/com.groovy/src/main/groovy'
/*new File(dir).eachFileRecurse { file ->

    if (file.isFile()) {
        println file.name
    }
}*/

// recursive

new File('.').eachFile { files ->
    if (files.name.endsWith('.groovy')) {
        println files.name
    }
}

















