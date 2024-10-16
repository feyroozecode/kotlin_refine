

fun main() {
   val p = Person("Issa", 27)
    p.introduce()

    val cat = Cat()
    cat.makeSound()

    // bank
    val bankAccount = BankAccount(balance = 120.5,"1234567890")
    bankAccount.deposit(25.0)
    println("Balance = "+bankAccount.getBalance())

   // shapes
  val shapes: Array<Shape> = arrayOf(Circle(), Square())
  for (shape in shapes){
    shape.draw()
  }

  // car
  val toy = ElectricCar("Toyota", "Corrola", 2018, 28)
  print(toy.getDetails())


    // bank
    val accunt = BankAccount(500.0, "1B2B3456BN")
    accunt.deposit(150.5)
    accunt.withDraw(200.5, "1BC23NBC233")

    println("Final balance ${accunt.getBalance()} ")
}