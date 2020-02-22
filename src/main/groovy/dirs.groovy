String dir = '/media/damiass/Extreme SSD/com.groovy/src'

List hidden = []

/*new File(dir).eachFile { files ->
    if (files.isFile()) {
        println files.getName()
        hidden << files.name
    }

    if (files.isHidden()) {
        hidden << files.name
    }

}*/


/*new File(dir).eachDir { subfolder ->
    println subfolder
}*/

def myDir = new File(dir)
println myDir.directorySize()

new File('Bigos').mkdir()
new File('one/two').mkdirs()


println hidden
