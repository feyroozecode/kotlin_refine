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

// exo
// Exercise 3:
//
// Create a bank system using encapsulation.
// The BankAccount class should have methods for depositing, withdrawing, and checking balance.
