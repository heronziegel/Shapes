import java.util.*

fun main(args: Array<String>) {

    // Construct shapes
    var square : Shape? = null
    var circle : Shape? = null
    var triangle : Shape? = null
    var equalTriangle : Shape? = null

    // Get parameters for each shape from user
    val reader = Scanner(System.`in`)
    println("Enter the length of your square:")
    val l:Double = reader.nextDouble()
    println("Enter the height of your square:")
    val h:Double = reader.nextDouble()
    square = Square("My Square",l,h)

    println("Enter the radius of your circle:")
    val r:Double = reader.nextDouble()
    circle = Circle("My Circle",r)

    println("Enter the first side length of your triangle:")
    val s1:Double = reader.nextDouble()
    println("Enter the second side length of your triangle:")
    val s2:Double = reader.nextDouble()
    println("Enter the third side length of your triangle:")
    val s3:Double = reader.nextDouble()
    triangle = Triangle("My Triangle",s1,s2,s3)

    println("Enter the side length of your equilateral triangle:")
    val s:Double = reader.nextDouble()
    equalTriangle = EquilateralTriangle("My Equilateral Triangle",s)

    // Print out shape details
    println("SQUARE name: ${square.name} \nlength: ${square.length} \nheight: ${square.height} \narea: ${square.getArea()}")
    println("CIRCLE name: ${circle.name} \nraidus: ${circle.radius} \narea: ${circle.getArea()}")
    println("TRIANGLE name: ${triangle.name} \nside 1: ${triangle.side1} \nside 2: ${triangle.side2} \nside 3: ${triangle.side3} \narea: ${triangle.getArea()}")
    println("EQUILATERAL TRIANGLE name: ${equalTriangle.name} \nside: ${equalTriangle.side} \narea: ${equalTriangle.getArea()}")

}