
class BankAccount(private var balance: Double){
    fun deposit(amount: Double){
        if(amount > 0){
            balance += amount;
        }
    }

    fun getBalance(): Double{
        return balance;
    }
}