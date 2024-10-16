
open class Animal {
    open fun makeSound(){
        println("The aniaml makes sound")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("The cat Miou Miou");
    }
}

