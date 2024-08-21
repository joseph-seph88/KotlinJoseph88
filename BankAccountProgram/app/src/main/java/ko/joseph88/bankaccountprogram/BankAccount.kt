package ko.joseph88.bankaccountprogram

class BankAccount(
    var accountHolder:String,
    private var balance:Double,
)
{
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount:Double){
        balance += amount
        transactionHistory.add("deposit $$amount for $accountHolder")
    }
    fun withdraw(amount:Double){
        if(balance >= amount){
            balance -= amount
            transactionHistory.add("withdraw $$amount for $accountHolder")
        }else{
            println("Your balance is insufficient")
        }
    }
    fun displayTransactionHistory(){
        for(transaction in transactionHistory){
            println(transaction)
        }
    }
    fun balanceQuery():Double{
        return balance
    }
}



//class BankAccount(
//    var accountHolder:String,
//    private var balance:Double
//){
//    private val transactionHistory = mutableListOf<String>()
//
//    fun deposit(amount:Double){
//        balance += amount
//        transactionHistory.add("${accountHolder} deposited: $${amount}")
//    }
//    fun withdraw(amount:Double){
//        if(balance >= amount){
//            balance -= amount
//            transactionHistory.add("${accountHolder} withdraw: $${amount}")
//        }else{
//            println("You Don't have enough Balance")
//        }
//    }
//    fun displayTransactionHistory(){
//        println("Transaction History for ${accountHolder}")
//        for(transaction in transactionHistory){
//            println(transaction)
//        }
//    }
//    fun accountBalance():Double{
//        return balance
//    }
//}


