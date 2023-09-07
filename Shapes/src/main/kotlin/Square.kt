class Square(_name : String, _length : Double, _height : Double) : Shape(_name) {

    var length = _length
    var height = _height

    override fun printDimensions(){

        println("Length: $length")
        println("Height: $height")

    }

    fun setDimensions(_len : Double, _hei : Double){

        length = _len
        height = _hei

    }

    override fun getArea() : Double{
        return length * height
    }


}