
class Person(val name: String , val age: Int){
    fun introduce() {
        println("Hi, I'm $name and i'm $age year olds");
    }
}

tatus
fun main() {
   val p = Person("Issa", 27);

    p.introduce();
}