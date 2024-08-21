package ko.joseph88.inheritanceapp

class Offspring : Secondary(), Archery, Singer {
    override fun archer() {
        super.archer()
        println("Archery skills enhanced by Offspring")
    }

    override fun sing() {
        super.sing()
        println("Singing skills enhanced by Offspring")
    }
}