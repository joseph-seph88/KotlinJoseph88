package ko.joseph88.kotlinbasics

data class CoffeeDetails(
    val sugarCount:Int,
    val name:String,
    val size:String,
    val creamAmount:Int
)

fun main(){

    val coffeeForDenis = CoffeeDetails(0, "denis", "xxl", 0)
    makeCoffee(coffeeForDenis)

}

//fun askCoffeeDetails(){
//
//    println("Who is this coffee for? >> ")
//    val name = readln()
//    println("How many pieces of sugar do you want? >> ")
//    val sugarCount = readln()
//    val sugarCountInt = sugarCount.toInt()
//
//    makeCoffee(sugarCountInt, name)
//}

fun makeCoffee(coffeeDetails: CoffeeDetails){

    if(coffeeDetails.sugarCount == 1) {
        println("Coffee with ${coffeeDetails.sugarCount} +" +
                "spoon of sugar for ${coffeeDetails.name} + and cream:" +
                "${coffeeDetails.creamAmount}")
    }else if(coffeeDetails.sugarCount == 0){
        println("Coffee with no sugar for ${coffeeDetails.name} + and cream:" +
                "${coffeeDetails.creamAmount}")
    }else{
        println("Coffee with ${coffeeDetails.sugarCount} " +
                "spoons of sugar for ${coffeeDetails.name}" +
                "+ and cream:\" +\n" +
                "${coffeeDetails.creamAmount}")
    }
}
