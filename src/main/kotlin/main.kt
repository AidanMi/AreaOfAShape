fun main() {
    var i = 0
    var x:Double
    var y:Double
    var h:Double

    while(i!=5){
        println("1.) Triangle")
        println("2.) Square")
        println("3.) Rectangle")
        println("4.) Trapezoid")
        println("5.)Exit")
        i = readln().toInt()
        if(i==1){
            println("base length; ")
            x = readln().toDouble()
            println("height")
            y = readln().toDouble()
            findTriangle(x, y)
        }
        else if(i==2){
            println("Side length: ")
            x = readln().toDouble()
            findSquare(x)
        }
        else if(i==3){
            println("Side1 length: ")
            x = readln().toDouble()
            println("Side2 length: ")
            y = readln().toDouble()
            findRectangle(x, y)
        }
        else if(i==4){
            println("Base1 length: ")
            x = readln().toDouble()
            println("Base2 length: ")
            y = readln().toDouble()
            println("height: ")
            h = readln().toDouble()
            findTrapezoid(x, y, h)
        }
        else if(i>5){
            println("out of bounds")
        }
    }

}
fun findTriangle(base:Double, height:Double){
    println((1.0/2.0)*(base*height))

}
fun findSquare(side:Double){
    println(side*side)

}
fun findRectangle(sideOne:Double, sideTwo:Double){
    println(sideOne*sideTwo)
}
fun findTrapezoid(baseOne:Double, baseTwo:Double, height:Double){
    println(((baseOne+baseTwo)/2.0)*height)

}