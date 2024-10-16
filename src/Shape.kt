
open class Shape{
    open fun draw(){
        println("Drawing shape")
    }
}

class Circle: Shape(){
    override fun draw() {
        println("Drawing circle")
    }
}

class Square: Shape(){
    override fun draw() {
        println("Drawing Square")
    }
}