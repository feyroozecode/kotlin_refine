// Exercise 1:
//Create a Car class with properties like brand, model, and year. Write a function that prints the details of the car
// and a subclass ElectricCar that adds a property batteryLife.
open class Car (val brand:String, val model:String, val year: Int){


    open fun getDetails(){
        println("Car $brand model $model, prod year: $year ")
    }
}

open class ElectricCar(brand: String, model: String, year: Int, val battteryLife: Int) : Car(brand, model, year){

    override fun getDetails() {
        println("Car $brand model $model, prod year: $year and Battery life is $battteryLife")
    }
}