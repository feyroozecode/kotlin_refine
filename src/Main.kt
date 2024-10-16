

fun main() {
   val p = Person("Issa", 27)
    p.introduce()

    val cat = Cat()
    cat.makeSound()

    // bank
    val bankAccount = BankAccount(balance = 120.5)
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

}