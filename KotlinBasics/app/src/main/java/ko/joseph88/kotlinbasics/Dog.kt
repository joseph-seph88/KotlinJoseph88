package ko.joseph88.kotlinbasics

class Dog(val name:String, val breed:String, var age:Int=1){

    init {
        bark(name)
    }

    fun bark(name:String){
        println("$name says Woof Woof")
    }
}