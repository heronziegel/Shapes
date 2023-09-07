open class Triangle(_name : String, _side1 : Double, _side2 : Double, _side3 : Double) : Shape(_name) {

    var side1 = _side1
    var side2 = _side2
    var side3 = _side3

    override fun printDimensions(){
        println("Side 1: $side1 \nSide 2: $side2 \nSide 3: $side3")
    }

    fun setDimensions(_s1 : Double, _s2 : Double, _s3 : Double){
        side1 = _s1
        side2 = _s2
        side3 = _s3
    }

    override fun getArea() : Double{
        var s = 0.5*(side1 + side2 + side3)
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3))
    }

}