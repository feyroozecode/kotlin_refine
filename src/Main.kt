

fun main() {
   val p = Person("Issa", 27)
    p.introduce()

    val cat = Cat()
    cat.makeSound()

    // bank
    val bankAccount = BankAccount(balance = 120.5)
    bankAccount.deposit(25.0)

    print("Balance = "+bankAccount.getBalance())

}