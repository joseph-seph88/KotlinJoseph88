package ko.joseph88.kotlinbasics

fun main(){

    val fruitsList = mutableListOf("apple", "banana", "orange", "melon", "vary")
    fruitsList.add("graph")
    fruitsList.remove("orange")
    println(fruitsList)

    val hasFruit = fruitsList.contains("apple")
    if(hasFruit){
        println("Has Apple is the list")
    }else{
        println("No Apple in the list")
    }


}