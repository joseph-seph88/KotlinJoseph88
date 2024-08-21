package ko.joseph88.rockpaperscissors

fun main(){
    var playerChoice = ""
    var computerChoice = ""

    println("*** Game Start ***")
    while(true){
        println("Enter Your Choice")
        playerChoice = readln()
        if(playerChoice.equals("q", ignoreCase = true)){
            println("Game Over")
            break
        }
        if(playerChoice != "Rock" && playerChoice != "Paper" && playerChoice != "Scissors"){
            println("Again Choice")
            println("")
            continue
        }
        computerChoice = when((1..3).random()) {
            1 -> "Rock"
            2 -> "Paper"
            3 -> "Scissors"
            else -> ""
        }
        println("Computer Choice is >> ${computerChoice}")

        val winner = when{
            playerChoice == computerChoice -> "Tie"
            playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
            playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
            playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
            else -> "Computer"
        }
        println("The Winner is >> ${winner}")
        println("")

    }

}