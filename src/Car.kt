
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