package ko.joseph88.bankaccountprogram

fun main() {
    println("Please Enter Your name >> ")
    val name = readln()
    println("Please Enter Your PWD >> ")
    val pwd = readln().toInt()
    val JosephBankAccount = BankAccount("Joseph", 500.0)
    var i = 0

    while(i <= 5){
        if(i % 2 == 0){
            JosephBankAccount.deposit(300.33)
        }
        if(i % 2 == 1){
            JosephBankAccount.withdraw(200.88)
        }
        i++
    }

    if(name == "Joseph" && pwd == 123){
        JosephBankAccount.displayTransactionHistory()
        println("${JosephBankAccount.accountHolder} balance is >>> ${JosephBankAccount.balanceQuery()}")
    }
}



//fun main(){
//    val JosephBankAccount = BankAccount("Joseph88", 100.0)
//
//    JosephBankAccount.deposit(200.20)
//    JosephBankAccount.deposit(550.20)
//    JosephBankAccount.withdraw(770.10)
//    JosephBankAccount.displayTransactionHistory()
//    println("${JosephBankAccount.accountHolder} >> $${JosephBankAccount.accountBalance()} ")
//