class BankAccount(private var balance: Double, protected  var accuntId: String){
    fun deposit(amount: Double){
        if(amount > 0){
            balance += amount;
        }
    }

    fun withDraw(amount: Double, targetAccuntId: String) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            println("Withdraw $amount from accunt $accuntId to $targetAccuntId. New balance is $balance")
        } else if(amount > balance){
            println("Insufissant funds for withhdraw")
        } else {
            println("Invalid withdraw amount")
        }
    }

    fun getBalance(): Double{
        return balance;
    }
}

// exo
// Exercise 3:
// Create a bank system using encapsulation.
// The BankAccount class should have methods for depositing, withdrawing, and checking balance.
